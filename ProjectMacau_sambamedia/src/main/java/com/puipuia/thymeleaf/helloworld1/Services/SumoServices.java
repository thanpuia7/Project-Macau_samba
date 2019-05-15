package com.puipuia.thymeleaf.helloworld1.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.puipuia.thymeleaf.helloworld1.Repositories.SumoRepository;
import com.puipuia.thymeleaf.helloworld1.entities.Sumo;

public class SumoServices {
	
	@Autowired
	
	SumoRepository sumoRepository;
	
	
	
	public List<Sumo> findByDateFromTo(String From, String To, String Date){ 
		
		
		
		return sumoRepository.findByFromAndToAndDate(From, To, Date);
			
	}
}