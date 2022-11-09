package com.hexaware.policymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hexaware.policymanagementsystem.entity.User;
import com.hexaware.policymanagementsystem.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepo;

	
	@Override
	public List<User> findAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getUserById(Long userId) {
		return userRepo.findById(userId);
	}

	@Override
	public void deleteUserById(Long userId) {
		userRepo.deleteById(userId);		

	}

	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User updateUser(User user, Long userId) {
		return null;
	}

	
	@Override
	public List<User> getuserByuserName(String userName) {
		// TODO Auto-generated method stub
		return userRepo.findUserByuserName(userName);
	}

	
	
	}

	


