package com.puipuia.thymeleaf.helloworld1.Repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.puipuia.thymeleaf.helloworld1.entities.District;
import com.puipuia.thymeleaf.helloworld1.entities.Sumo;

public interface SumoRepository extends Repository<Sumo, String>{
	

		  List<Sumo> findByFromAndToAndDate(District From, District To, String Date);

}
