package com.hexaware.policymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.policymanagementsystem.entity.User;



public interface UserService {
	public List<User> findAllUsers();
	public Optional<User> getUserById(Long userId);
	public void deleteUserById(Long userId);
	public User saveUser(User user);
	public User updateUser(User user, Long userId);
	
	List<User> getuserByuserName(String userName);
	
	
}
