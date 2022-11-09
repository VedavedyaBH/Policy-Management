package com.hexaware.policymanagementsystem.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Policy {
	public Policy(Long policy_id) {
		super();
		this.policy_id = policy_id;
	}
	public Policy(Long policy_id, String policy_name, String policy_type, String term_account, LocalDate start_date,
			String company_name, int duration, int intial_deposit, char user_type) {
		super();
		this.policy_id = policy_id;
		this.policy_name = policy_name;
		this.policy_type = policy_type;
		this.term_account = term_account;
		this.start_date = start_date;
		this.company_name = company_name;
		this.duration = duration;
		this.intial_deposit = intial_deposit;
		this.user_type = user_type;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long  policy_id;
	private String policy_name ;
	private String policy_type ;
	private String term_account ;
	private LocalDate start_date ;
	private String company_name; 
	private int duration ;
	private int intial_deposit; 
	private char user_type ;
	public Long getPolicy_number() {
		return policy_id;
	}
	public void setPolicy_number(Long policy_id) {
		this.policy_id = policy_id;
	}
	public String getPolicy_name() {
		return policy_name;
	}
	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}
	public String getPolicy_type() {
		return policy_type;
	}
	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}
	public String getTerm_account() {
		return term_account;
	}
	public void setTerm_account(String term_account) {
		this.term_account = term_account;
	}
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getIntial_deposit() {
		return intial_deposit;
	}
	public void setIntial_deposit(int intial_deposit) {
		this.intial_deposit = intial_deposit;
	}
	public char getUser_type() {
		return user_type;
	}
	public void setUser_type(char user_type) {
		this.user_type = user_type;
	}

}
