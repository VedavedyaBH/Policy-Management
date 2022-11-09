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

import com.hexaware.policymanagementsystem.entity.Address;
import com.hexaware.policymanagementsystem.exception.ResourceNotFoundException;
import com.hexaware.policymanagementsystem.services.AddressServices;

@RestController
@RequestMapping("/api")

public class AddressController {
	@Autowired
	AddressServices addressService;
	
	@GetMapping("/getalladdress")
	public List<Address> findAllAddress() throws ResourceNotFoundException{
		return addressService.findAllAddress();
	}
	
	@PostMapping("/addaddress")
	public String saveAddress(@RequestBody Address employee) {
		return addressService.saveAddress(employee) + "address added Successfully";
	}
	
	@DeleteMapping("/deleteaddress/{addressid}")
	public void deleteByAddressId(@PathVariable("userid") Long addressId) throws ResourceNotFoundException {
		addressService.deleteByAddressId(addressId) ;
	}
	
	@GetMapping("/getaddress{addressid}")
	public Address getAddress(@PathVariable("addressId") Long addressId) throws ResourceNotFoundException {
		return addressService.findByAddressID(addressId);
	}
	
	@PutMapping("/updateaddress/{addressid}")
	public String UpdateUser(@RequestBody Address employee,@PathVariable("addressId") Long addressId) {
		return addressService.updateAddress(employee, addressId) + " address updated successfully";
	}


}