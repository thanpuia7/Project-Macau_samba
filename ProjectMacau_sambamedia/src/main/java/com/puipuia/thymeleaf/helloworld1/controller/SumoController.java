package com.puipuia.thymeleaf.helloworld1.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.puipuia.thymeleaf.helloworld1.Repositories.SumoRepository;
import com.puipuia.thymeleaf.helloworld1.Services.SumoServices;
import com.puipuia.thymeleaf.helloworld1.entities.District;
import com.puipuia.thymeleaf.helloworld1.entities.Sumo;


@Controller

@RequestMapping("/")
public class SumoController {
	
	@Autowired
	SumoRepository sumoRepository;
	SumoServices sumoServices;
	
	
	@GetMapping("/sumo") 
	public String showSumoForm(Model model) {

		  Sumo theSumo = new Sumo();
		
			model.addAttribute("sumo", theSumo);
			model.addAttribute("districts",District.values());
	
		return "views/SumoForm";  
	}
	
	
	@PostMapping("/sumoSearch")
	public String searchSumo(@ModelAttribute Sumo sumo, Model model) {
		
		if(sumo.getFrom().equals(sumo.getTo()))
		{
			model.addAttribute("title","Please select Different Destination");
			
			Sumo theSumo = new Sumo();
			
			model.addAttribute("sumo", theSumo);
			model.addAttribute("districts",District.values());
			
			
	
		return "views/SumoForm";  
			
			
		}
	/*	List<Sumo> sumoSearch= new ArrayList<>();
		
	//	sumoSearch=sumoRepository.findByFromAndToAndDate(sumo.getFrom(), sumo.getTo(), sumo.getDate());
		
	//	if(sumoSearch== null ||(sumoSearch!=null)
	//	{
			
			
	//		return "asdf"+sumo.getFrom(); 
	//	}
		
	
	*/	
	
		
		else if((sumo.getFrom()).toString()=="AIZAWL")
			
		{
			 Sumo theSumo = new Sumo();
				
				model.addAttribute("sumo", theSumo);
				model.addAttribute("districts",District.values());
				
				
				System.out.println("hslkjdlkfajsdlf");
				
				
				sumo.setVacancy("7");
				
				
				System.out.println(sumo.getVacancy());
		
			return "views/SumoForm"; 
		}
		
		
		String F,T,D;
		
		F=sumo.getFrom().toString();
		T=sumo.getTo().toString();
		D=sumo.getDate().toString();
		
		
		List<Sumo> sumo1=(sumoServices.findByDateFromTo(F,T,D));
		

		
		if(sumo1.isEmpty())
		{
			Sumo theSumo = new Sumo();
			
			model.addAttribute("sumo", theSumo);
			model.addAttribute("districts",District.values());
			
			
		System.out.println("Ka ti dik thei ta eeee");
		return "views/SumoForm";
		
		}
		
		
		Sumo theSumo = new Sumo();
		
		model.addAttribute("sumo", theSumo);
		model.addAttribute("districts",District.values());
		
		return "views/SumoForm";
		
	
}
	
	
	
}

	
	
