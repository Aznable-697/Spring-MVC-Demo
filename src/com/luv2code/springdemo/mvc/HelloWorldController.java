package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//TODO Need a controller method to show the initial HTML form	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//TODO Need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//TODO New controller method to read form data and 
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//TODO Read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//TODO Convert the data to all caps
		theName = theName.toUpperCase();
		
		//TODO Create the message
		String result ="Yo! " + theName;
		
		//TODO Add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}	
	  // Controller
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, 
			Model model) {	
		
		//TODO Convert the data to all caps
		theName = theName.toUpperCase();
		
		//TODO Create the message
		String result ="Lick my Bawlz! " + theName;
		
		//TODO Add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}

}
