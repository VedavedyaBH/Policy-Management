package com.hexaware.policymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.policymanagementsystem.entity.User;
import com.hexaware.policymanagementsystem.exception.ResourceNotFoundException;
import com.hexaware.policymanagementsystem.services.UserServices;


@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserServices userService;
	
	@GetMapping("/getallusers")
	public List<User> findAllUser() throws ResourceNotFoundException{
		return userService.findAllUser();
	}
	
	@PostMapping("/adduser")
	public String saveUser(@RequestBody User user) {
		return userService.saveUser(user) + "User added Successfully";
	}
	
	@DeleteMapping("/deleteuser/{userid}")
	public void deleteByUserId(@PathVariable("userid") Long userId) throws ResourceNotFoundException {
		userService.deleteByUserId(userId) ;
	}
	
	@GetMapping("/getuser{userid}")
	public User getUser(@PathVariable("userId") Long userId) throws ResourceNotFoundException {
		return userService.findByUserId(userId);
	}
	
	@PutMapping("/updateuser/{userid}")
	public String UpdateUser(@RequestBody User user,@PathVariable("userId") Long userId) {
		return userService.updateUser(user, userId) + " User updated successfully";
	}

}
