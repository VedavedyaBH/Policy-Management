package com.hexaware.policymanagementsystem.entity;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	

	public Long adminId;
	public String password;
	

	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(Long adminId, String password) {
		super();
		this.adminId = adminId;
		this.password = password;
	}

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}