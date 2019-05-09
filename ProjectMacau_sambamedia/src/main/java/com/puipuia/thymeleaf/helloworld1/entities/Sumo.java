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
	
	@Column(name="seatNo")
	private SeatNo seatNo;

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

	public SeatNo getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(SeatNo seatNo) {
		this.seatNo = seatNo;
	}

	public Sumo() {
		
	}

	public Sumo(String id, District from, District to, SeatNo seatNo) {
		
		this.id = id;
		From = from;
		To = to;
		this.seatNo = seatNo;
	}

	public Sumo(District from, District to, SeatNo seatNo) {
		
		From = from;
		To = to;
		this.seatNo = seatNo;
	}

	@Override
	public String toString() {
		return "Sumo [id=" + id + ", From=" + From + ", To=" + To + ", seatNo=" + seatNo + "]";
	}
	
	
	
	
	//sdfsdfsdf
	
	
}
