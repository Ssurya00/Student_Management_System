package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method to handle list of students and return mode and view
	@GetMapping("/students")
	public String listOfAllStudents(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
		
	}

}
