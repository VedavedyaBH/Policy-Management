package com.hexaware.policymanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	public Address(String state) {
		super();
		this.state = state;
	}
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	private String city;
	private  String state;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
