package com.puipuia.thymeleaf.helloworld1.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.puipuia.thymeleaf.helloworld1.Services.UserService;
import com.puipuia.thymeleaf.helloworld1.entities.User;


@Controller

@RequestMapping("/")
public class DemoController {
	
	// create a mapping for "/hello"
	@Autowired
	private UserService userService;
	
	@GetMapping("/hello")
	public String sayHello() {
		
		
		
		return "/views/sourcecode";
	}
	
	@GetMapping("/login") 
	public String showLoginForm() {
		
		return "views/Login";  
	}
	
	@GetMapping("/hello1")
	public String sayHello1() {
		
		
		
		return "views/helloworld";
	}
	
	@GetMapping("/electric") 
	public String showElectricForm() {
		
		return "views/ElectricForm";  
	}
	
	@GetMapping("/sumo") 
	public String showSumoForm(Model model) {

		  User theUser = new User();
		
			model.addAttribute("users", theUser);
	
		return "views/SumoForm";  
	}
	
	
	@PostMapping("/sumo")
    public String registerUser(@Valid User users, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "views/SumoForm";
		}
		if(userService.isUserPresent(users.getEmail())) {
			model.addAttribute("exist",true);

			return "views/SumoForm";

		}
		
		
		return "/views/sourcecode";

	}
	
	
	@GetMapping("/success") 
	public String showPage() {
		
		return "views/success"; 
	
	
}
	
}








