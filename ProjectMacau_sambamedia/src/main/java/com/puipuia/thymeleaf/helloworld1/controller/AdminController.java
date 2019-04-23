package com.puipuia.thymeleaf.helloworld1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class AdminController {
	
	
	
	@RequestMapping("profile")
	
	public String AdminProfile(){
		
		
		return "views/admin-profile";
		
		
	}

}
