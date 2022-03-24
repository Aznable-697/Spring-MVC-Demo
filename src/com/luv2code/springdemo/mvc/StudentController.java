package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//TODO Create a Student object
		Student theStudent = new Student();
		
		//TODO ADD student object to the mode
		theModel.addAttribute("student", theStudent);	
		
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//TODO Log the input Data
		System.out.println("theStudent: " + theStudent.getFirstName()
		                      + " " + theStudent.getLastName());
		
		return "student-confirmation";
	}

}
