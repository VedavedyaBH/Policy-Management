package com.hexaware.policymanagementsystem.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class User {
	
    public User(String userName, Long userId) {
		super();
		this.userName = userName;
		this.userId = userId;
	}

	public User(Long userId) {
		super();
		this.userId = userId;
	}



	
	public User(String pan, String userName, String email) {
		super();
		this.pan = pan;
		this.userName = userName;
		this.email = email;
	}

	
	
	public User(String pan, String fName, String lName, String userName, String email, LocalDate dob, int pNumber,
			int salary) {
		super();
		this.pan = pan;
		this.fName = fName;
		this.lName = lName;
		this.userName = userName;
		this.email = email;
		this.dob = dob;
		this.pNumber = pNumber;
		this.salary = salary;
	}
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String pan; 
	private String fName ;
	private String lName ;
	private String userName;
	private String email ;
	private LocalDate dob; 
	private int pNumber ;
	private int salary ;
	 private Long userId; 
	



		
	

	public String getPan() {
		return pan;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getpNumber() {
		return pNumber;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
