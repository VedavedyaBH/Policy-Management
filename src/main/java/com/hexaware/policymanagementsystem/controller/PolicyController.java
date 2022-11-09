package com.hexaware.policymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.policymanagementsystem.entity.Policy;
import com.hexaware.policymanagementsystem.exception.ResourceNotFoundException;
import com.hexaware.policymanagementsystem.services.PolicyServices;


@RestController
@RequestMapping("/api")
public class PolicyController {
	@Autowired
    PolicyServices policyServices;
	
	@GetMapping("/getallpolicy")
	public List<Policy> findAllPolicy() throws ResourceNotFoundException{
		return policyServices.findAllPolicy();
	}
	
	@PostMapping("/addpolicy")
	public String savePolicy(@RequestBody Policy policy) {
		return policyServices.savePolicy(policy) + "policy added Successfully";
	}
	
	@DeleteMapping("/deletepolicy/{policy_id}")
	public void deleteByPolicyId(@PathVariable("policy_id") Long policy_id) throws ResourceNotFoundException {
		policyServices.deleteByPolicyId(policy_id) ;
	}
	
	@GetMapping("/getpolicy/{policy_id}")
	public Policy getPolicy(@PathVariable("policy_id") Long policy_id) throws ResourceNotFoundException {
		return policyServices.findByPolicyID(policy_id);
	}
	
	@PutMapping("/updatepolicy/{policy_id}")
	public String UpdatePolicy(@RequestBody Policy policy,@PathVariable("policy_id") Long policy_id) {
		return policyServices.updatePolicy(policy, policy_id) + " policy updated successfully";
	}

}