package com.puipuia.thymeleaf.helloworld1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puipuia.thymeleaf.helloworld1.entities.District;

public interface DistrictRepository extends JpaRepository<District, String> {

}
