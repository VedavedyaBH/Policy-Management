package com.hexaware.policymanagementsystem.services;

import java.util.List;
import com.hexaware.policymanagementsystem.exception.ResourceNotFoundException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.policymanagementsystem.entity.User;
import com.hexaware.policymanagementsystem.repository.UserRepository;

@Service
public class UserServicesImpl implements UserServices {
	@Autowired
	UserRepository userRepo;

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User findByUserId(Long userId)  {
		// TODO Auto-generated method stub
		return userRepo.findById(userId).get();
	}

	@Override
	public void deleteByUserId(Long userId)  {
		userRepo.deleteById(userId);
		// TODO Auto-generated method stub
		
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public int updateUser(User user, Long userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	}
