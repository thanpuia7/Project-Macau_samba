package com.puipuia.thymeleaf.helloworld1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sumo {

	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="Date")
	private String Date;
	
	@Column(name="From")
	private District From;
	
	@Column(name="To")
	private District To;
	
	

	@Column(name="Vacancy")
	private String Vacancy;
	
	@Column(name="Seat1")
	private String Seat1;
	
	@Column(name="Seat2")
	private String Seat2;
	
	@Column(name="Seat3")
	private String Seat3;
	
	@Column(name="Seat4")
	private String Seat4;
	
	@Column(name="Seat5")
	private String Seat5;
	
	@Column(name="Seat6")
	private String Seat6;
	
	@Column(name="Seat7")
	private String Seat7;
	
	@Column(name="Seat8")
	private String Seat8;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public District getFrom() {
		return From;
	}

	public void setFrom(District from) {
		From = from;
	}

	public District getTo() {
		return To;
	}

	public void setTo(District to) {
		To = to;
	}

	public String getVacancy() {
		return Vacancy;
	}

	public void setVacancy(String vacancy) {
		Vacancy = vacancy;
	}

	public String getSeat1() {
		return Seat1;
	}

	public void setSeat1(String seat1) {
		Seat1 = seat1;
	}

	public String getSeat2() {
		return Seat2;
	}

	public void setSeat2(String seat2) {
		Seat2 = seat2;
	}

	public String getSeat3() {
		return Seat3;
	}

	public void setSeat3(String seat3) {
		Seat3 = seat3;
	}

	public String getSeat4() {
		return Seat4;
	}

	public void setSeat4(String seat4) {
		Seat4 = seat4;
	}

	public String getSeat5() {
		return Seat5;
	}

	public void setSeat5(String seat5) {
		Seat5 = seat5;
	}

	public String getSeat6() {
		return Seat6;
	}

	public void setSeat6(String seat6) {
		Seat6 = seat6;
	}

	public String getSeat7() {
		return Seat7;
	}

	public void setSeat7(String seat7) {
		Seat7 = seat7;
	}

	public String getSeat8() {
		return Seat8;
	}

	public void setSeat8(String seat8) {
		Seat8 = seat8;
	}

	public Sumo(String date, String vacancy, String seat1, String seat2, String seat3,
			String seat4, String seat5, String seat6, String seat7, String seat8) {
		
		Date = date;
	
		Vacancy = vacancy;
		Seat1 = seat1;
		Seat2 = seat2;
		Seat3 = seat3;
		Seat4 = seat4;
		Seat5 = seat5;
		Seat6 = seat6;
		Seat7 = seat7;
		Seat8 = seat8;
	}

	public Sumo(String id, String date,String vacancy, String seat1, String seat2,
			String seat3, String seat4, String seat5, String seat6, String seat7, String seat8) {
		
		this.id = id;
		Date = date;
		//From = from;
		//To = to;
		Vacancy = vacancy;
		Seat1 = seat1;
		Seat2 = seat2;
		Seat3 = seat3;
		Seat4 = seat4;
		Seat5 = seat5;
		Seat6 = seat6;
		Seat7 = seat7;
		Seat8 = seat8;
	}
	
	
	
	

	public Sumo() {
		
	}

	@Override
	public String toString() {
		return "Sumo [id=" + id + ", Date=" + Date + ", From=" + From + ", To=" + To + ", Vacancy=" + Vacancy
				+ ", Seat1=" + Seat1 + ", Seat2=" + Seat2 + ", Seat3=" + Seat3 + ", Seat4=" + Seat4 + ", Seat5=" + Seat5
				+ ", Seat6=" + Seat6 + ", Seat7=" + Seat7 + ", Seat8=" + Seat8 + "]";
	}
	
	
	
}
