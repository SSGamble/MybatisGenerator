package top.qingrang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.qingrang.service.IStudentService;

@Controller
@RequestMapping("")
public class StudentController {

	@Autowired
	IStudentService studentService;

	/**
	 * 加载登录页面
	 */
	@RequestMapping("index")
	public String index(){
		return "index";
	}
}
