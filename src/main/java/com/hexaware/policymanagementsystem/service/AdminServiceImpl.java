package com.hexaware.policymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.policymanagementsystem.entity.Admin;
import com.hexaware.policymanagementsystem.repository.AdminRepository;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
    private AdminRepository adminRepo;
	
	@Override
	public List<Admin> findAllAdmin() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}


	@Override
	public Optional<Admin> getAdminById(Long admin_id) {
		// TODO Auto-generated method stub
		return adminRepo.findById(admin_id);

	}

}
