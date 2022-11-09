package com.hexaware.policymanagementsystem.services;

import java.util.List;

import com.hexaware.policymanagementsystem.entity.User;
import com.hexaware.policymanagementsystem.exception.ResourceNotFoundException;


public interface UserServices {
	public List<User> findAllUser();
	public User findByUserId(Long userId);
	public void deleteByUserId(Long userId);
	public User saveUser(User user);
	public int updateUser(User user, Long userId);
	

}