package com.puipuia.thymeleaf.helloworld1.Repositories;




import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.puipuia.thymeleaf.helloworld1.entities.District;
import com.puipuia.thymeleaf.helloworld1.entities.Sumo;

public interface SumoRepository extends CrudRepository<Sumo, String>{
	
        @Query(value="SELECT *FROM `Sumo` WHERE `From`=?1 AND `To`=?2",nativeQuery=true)
  
        Sumo findByFromAndTo(District From,District To);

}
