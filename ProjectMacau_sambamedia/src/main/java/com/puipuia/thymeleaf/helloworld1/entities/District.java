package com.puipuia.thymeleaf.helloworld1.entities;

public enum District {
	
	
AIZAWL("Aizawl"),
LUNGLEI("Lunglei"),
CHAMPHAI("Champhai"),
KOLASIB("Kolasib");
	
	
private String name;

District(String name){
	this.name=name;
}

public String getName() {
	return name;
}
	
	

}
