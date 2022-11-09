package com.hexaware.policymanagementsystem.services;

import java.util.List;

import com.hexaware.policymanagementsystem.entity.Address;
import com.hexaware.policymanagementsystem.exception.ResourceNotFoundException;

public interface AddressServices {
	public List<Address> findAllAddress()throws ResourceNotFoundException;
	public Address findByAddressID(Long address_id)throws ResourceNotFoundException;
	public void deleteByAddressId(Long address_id)throws ResourceNotFoundException;
	public Address saveAddress(Address address);
	public int updateAddress(Address address,Long address_id);


}