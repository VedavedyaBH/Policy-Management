package com.hexaware.policymanagementsystem.services;

import java.util.List;

import com.hexaware.policymanagementsystem.entity.Policy;
import com.hexaware.policymanagementsystem.exception.ResourceNotFoundException;

public interface PolicyServices {
	
	public List<Policy> findAllPolicy() throws ResourceNotFoundException;
	public Policy findByPolicyID(Long policy_id)throws ResourceNotFoundException;
	public void deleteByPolicyId(Long policy_id)throws ResourceNotFoundException;
	public Policy savePolicy(Policy policy);
	public int updatePolicy(Policy policy,Long policy_id);

}