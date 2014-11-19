package com.yanjf.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

	@RequestMapping(value = "/student/ajax")
	public @ResponseBody String student() {
		return "student";
	}
	
	@RequestMapping("/student/jsp")
	public String student_jsp() {
		return "student";
	}
}
