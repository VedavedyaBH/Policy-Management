package com.hexaware.policymanagementsystem.services;
import com.hexaware.policymanagementsystem.entity.Admin;
import com.hexaware.policymanagementsystem.exception.ResourceNotFoundException;
import com.hexaware.policymanagementsystem.repository.AdminRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminServicesImpl implements AdminServices{
	@Autowired
	private AdminRepository adminrepo;

	@Override
	public List<Admin> findAllAdmin() throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		return adminrepo.findAll() ;
	}

	@Override
	public Admin findByAdminID(Long admin_id) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		return adminrepo.findById(admin_id).get();
		
	}

	@Override
	public void deleteByAdminId(Long admin_id) throws ResourceNotFoundException{
		adminrepo.deleteById(admin_id);
		
		
	}

	
	@Override
	public int updateAdmin(Admin admin, Long admin_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}