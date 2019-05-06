package com.puipuia.thymeleaf.helloworld1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sumo {

	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="seatNo")
	private String seatNo;
	
	
}
