package com.hexaware.policymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.policymanagementsystem.entity.Policy;
import com.hexaware.policymanagementsystem.repository.PolicyRepository;
@Service
public class PolicyServiceImpl implements PolicyService{
	@Autowired
	
	private PolicyRepository policyRepo;

	@Override
	public List<Policy> findAllPolicy() {
		return policyRepo.findAll();
	}

	@Override
	public Optional<Policy> getPolicyById(Long policy_id) {
		return policyRepo.findById(policy_id);
		
	}

	@Override
	public void deletePolicyById(Long policy_id) {
		policyRepo.deleteById(policy_id);		
		
	}

	@Override
	public Policy savePolicy(Policy policy) {
		return policyRepo.save(policy);
	}

	@Override
	public Policy updatePolicy(Policy policy, Long policy_id) {
		return null;
	}

	
	

}
