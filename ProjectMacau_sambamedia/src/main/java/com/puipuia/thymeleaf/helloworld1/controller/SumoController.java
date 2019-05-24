package com.puipuia.thymeleaf.helloworld1.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.puipuia.thymeleaf.helloworld1.Repositories.DistrictRepository;
import com.puipuia.thymeleaf.helloworld1.Repositories.SumoRepository;
import com.puipuia.thymeleaf.helloworld1.Services.SumoServices;

import com.puipuia.thymeleaf.helloworld1.entities.Sumo;


@Controller

@RequestMapping("/")
public class SumoController {
	
	@Autowired
	SumoRepository sumoRepository;
	@Autowired
	SumoServices sumoServices;
	@Autowired
	DistrictRepository districtRepository;
	
	
	@Autowired
	SumoController(SumoRepository sumoRepository, DistrictRepository districtRepository){
		this.sumoRepository=sumoRepository;
		this.districtRepository=districtRepository;
	}
	
	
	@GetMapping("/sumo") 
	public String showSumoForm(Model model) {

		  Sumo theSumo = new Sumo();
		
			model.addAttribute("sumo", theSumo);
			model.addAttribute("districts",districtRepository.findAll());
	
		return "views/SumoForm";  
	}
	
	
	@PostMapping("/sumoSearch")
	public String searchSumo(@ModelAttribute("sumo") Sumo theSumo, Model model) {
		
		
		 
		 model.addAttribute("sumo", theSumo);
			model.addAttribute("districts",districtRepository.findAll());
		
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
	
		
	
	
	
  List <Sumo> sumo1=(sumoServices.findByFromToDate(theSumo.getFrom(),theSumo.getTo(),theSumo.getDate()));
		
	    
		 
		 
		 if(sumo1.isEmpty())
	    		
	    		{
	    	
		
	    	sumoRepository.save(theSumo);
	    //	model.addAttribute("sumo3", sumo1);
			 
			 model.addAttribute("things",sumoRepository.findAll());
	    	
	    	System.out.println("helsdlkfjalskdjflkasjdflkasjdflkj");
	    	return "views/SumoBookingForm";
	    	

	    
	    }
		
	
		System.out.println("xxxxxxxxxxxxxxxxxxxx"+theSumo.getDate());
		
		model.addAttribute("things",sumo1);
		
		return "views/SumoBookingForm";
		
	
}
	
	
	
}

	
	
