package top.qingrang.service;

import top.qingrang.pojo.Student;
import java.util.List;

public interface IStudentService {
	List<Student> listStudent();
	void addStudent(Student student);
	void deleteStudent(int id);
	Student getStudent(int id);
	void updateStudent(Student student);
	List<Student> selectStudent(String name);

	List<Student> selectStudentList(String name);
}
