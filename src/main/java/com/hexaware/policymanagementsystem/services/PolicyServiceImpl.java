package com.hexaware.policymanagementsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.policymanagementsystem.entity.Policy;
import com.hexaware.policymanagementsystem.exception.ResourceNotFoundException;
import com.hexaware.policymanagementsystem.repository.PolicyRepository;
@Service
public class PolicyServiceImpl implements PolicyServices{
	@Autowired
	PolicyRepository policyrepo;
	@Override
	public List<Policy> findAllPolicy()throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return policyrepo.findAll();
	}

	@Override
	public Policy findByPolicyID(Long policy_id) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		return policyrepo.findById(policy_id).get();
	}

	@Override
	public void deleteByPolicyId(Long policy_id) throws ResourceNotFoundException{
		policyrepo.deleteById(policy_id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Policy savePolicy(Policy policy) {
		// TODO Auto-generated method stub
		return policyrepo.save(policy);
	}

	@Override
	public int updatePolicy(Policy policy, Long policy_id) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	

}
