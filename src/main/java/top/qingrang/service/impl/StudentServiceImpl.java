package top.qingrang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.qingrang.dao.StudentMapper;
import top.qingrang.pojo.Student;
import top.qingrang.pojo.StudentExample;
import top.qingrang.service.IStudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	StudentMapper studentMapper;

	@Override
	public List<Student> listStudent() {
		StudentExample example = new StudentExample();
		example.setOrderByClause("id desc");
		return studentMapper.selectByExample(example);
	}

	@Override
	public void addStudent(Student student) {
		studentMapper.insert(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Student getStudent(int id) {
		return studentMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateStudent(Student student) {
		studentMapper.updateByPrimaryKeySelective(student);
	}

	/**
	 * 利用 Example 实现模糊查询
	 * select * from student where name like '%z%'
	 */
	@Override
	public List<Student> selectStudent(String name) {
		StudentExample example = new StudentExample();
		example.createCriteria().andNameLike('%' + name + '%');
		List<Student> studentList = studentMapper.selectByExample(example);
		return studentList;
	}

	/**
	 * 多个 and 和 or 查询
	 * select * from student where name like '%z%' and age = 20 or age = 50
	 */
	@Override
	public List<Student> selectStudentList(String name) {
		StudentExample example = new StudentExample();
		// 链式表达
		example.or().andNameLike('%' + name + '%').andAgeEqualTo(20);
		example.or().andAgeEqualTo(50);
		List<Student> studentList = studentMapper.selectByExample(example);
		return studentList;
	}
}
