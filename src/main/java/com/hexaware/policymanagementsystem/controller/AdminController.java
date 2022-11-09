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

import com.hexaware.policymanagementsystem.entity.Admin;
import com.hexaware.policymanagementsystem.exception.ResourceNotFoundException;
import com.hexaware.policymanagementsystem.services.AdminServices;

@RestController
@RequestMapping("/api")
public class AdminController {
	@Autowired
	AdminServices adminServices;
	
	@GetMapping("/getalladmin")
	public List<Admin> findAllAdmin() throws ResourceNotFoundException{
		return adminServices.findAllAdmin();
	}

	@DeleteMapping("/deleteadmin/{adminid}")
	public void deleteByAdminId(@PathVariable("adminid") Long adminId) throws ResourceNotFoundException {
		adminServices.deleteByAdminId(adminId) ;
	}
	
	@PutMapping("/updateadmin/{userid}")
	public String UpdateAdmin(@RequestBody Admin admin,@PathVariable("adminId") Long adminId) {
		return adminServices.updateAdmin(admin, adminId) + " Admin updated successfully";
	}
	

}