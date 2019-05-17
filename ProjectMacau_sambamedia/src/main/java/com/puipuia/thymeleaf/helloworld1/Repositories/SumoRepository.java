package com.puipuia.thymeleaf.helloworld1.Repositories;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.puipuia.thymeleaf.helloworld1.entities.District;
import com.puipuia.thymeleaf.helloworld1.entities.Sumo;

public interface SumoRepository extends CrudRepository<Sumo, String>{
	
        @Query(value="SELECT p FROM Sumo p WHERE p.From=?1 AND p.To=?2 AND p.Date=?3")
		
        
        List <Sumo> findByFromAndToAndDate(District From,District To,String Date);

}
