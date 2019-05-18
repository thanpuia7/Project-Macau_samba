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
	@Autowired
	SumoServices sumoServices;
	
	
	@Autowired
	SumoController(SumoRepository sumoRepository){
		this.sumoRepository=sumoRepository;
		
	}
	
	
	@GetMapping("/sumo") 
	public String showSumoForm(Model model) {

		  Sumo theSumo = new Sumo();
		
			model.addAttribute("sumo", theSumo);
			model.addAttribute("districts",District.values());
	
		return "views/SumoForm";  
	}
	
	
	@PostMapping("/sumoSearch")
	public String searchSumo(@ModelAttribute("sumo") Sumo theSumo, Model model) {
		
		
		 
		 model.addAttribute("sumo", theSumo);
			model.addAttribute("districts",District.values());
		
		if(theSumo.getFrom().equals(theSumo.getTo()))
		{
			model.addAttribute("title","Please select Different Destination");
			
			
			
			
			
			
	
		return "views/SumoForm";  
			
			
		}
	/*	List<Sumo> sumoSearch= new ArrayList<>();
		
	//	sumoSearch=sumoRepository.findByFromAndToAndDate(sumo.getFrom(), sumo.getTo(), sumo.getDate());
		
	//	if(sumoSearch== null ||(sumoSearch!=null)
	//	{
			
			
	//		return "asdf"+sumo.getFrom(); 
	//	}
		
	
	*/	
	
		
		else if((theSumo.getFrom()).toString()=="AIZAWL")
			
		{
			 
				
				
				System.out.println("hslkjdlkfajsdlf");
				
				
				theSumo.setVacancy("7");
				
				
				System.out.println(theSumo.getVacancy());
		
			return "views/SumoForm"; 
		}

Sumo sumo1=(sumoServices.findByFromTo(theSumo.getFrom(),theSumo.getTo()));
		
	    
		 
		 
		 if(sumo1!=null)
	    		
	    		{
	    	
		
	    	
	    //	model.addAttribute("sumo3", sumo1);
	    	
	    	System.out.println("helsdlkfjalskdjflkasjdflkasjdflkj");
	    	return "views/SumoBookingForm";
	    	

	    
	    }
		
		System.out.println("xxxxxxxxxxxxxxxxxxxx"+theSumo.getDate());
		
		return "views/SumoBookingForm";
		
	
}
	
	
	
}

	
	
