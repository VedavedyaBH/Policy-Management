package com.hexaware.policymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.policymanagementsystem.entity.Policy;

public interface PolicyService {
	
	public List<Policy> findAllPolicy() ;
	public Optional<Policy> getPolicyById(Long policy_id);
	public void deletePolicyById(Long policy_id) ;
	public Policy savePolicy(Policy policy);
	public Policy updatePolicy(Policy policy,Long policy_id);
}
