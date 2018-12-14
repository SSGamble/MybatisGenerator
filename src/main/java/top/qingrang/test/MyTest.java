package top.qingrang.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.qingrang.pojo.Student;
import top.qingrang.service.IStudentService;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyTest {

	@Autowired
	IStudentService studentService;

	@Test
	public void testListStudent(){
		List<Student> studentList = studentService.listStudent();
		for (Student s:studentList){
			System.out.println(s);
		}
	}

	@Test
	public void testAddStudent(){
		Student student = new Student("zs",45);
		studentService.addStudent(student);
	}

	@Test
	public void test(){
		List<Student> studentList = studentService.selectStudentList("z");
		for (Student s:studentList){
			System.out.println(s);
		}
	}
}
