package com.puipuia.thymeleaf.helloworld1.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puipuia.thymeleaf.helloworld1.Repositories.SumoRepository;
import com.puipuia.thymeleaf.helloworld1.entities.District;
import com.puipuia.thymeleaf.helloworld1.entities.Sumo;



@Service
public class SumoServices {
	
	@Autowired
	
	SumoRepository sumoRepository;
	
	
	
	public List<Sumo> findByFromToDate(District From, District To,String Date){ 

		
		 
		
	
	return sumoRepository.findByFromAndToAndDate(From,To,Date);
				
				
				
				
				
			
	}
}