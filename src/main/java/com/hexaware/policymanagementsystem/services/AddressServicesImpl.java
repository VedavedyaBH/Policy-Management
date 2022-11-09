package com.hexaware.policymanagementsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.policymanagementsystem.entity.Address;
import com.hexaware.policymanagementsystem.exception.ResourceNotFoundException;
import com.hexaware.policymanagementsystem.repository.AddressRepository;
@Service

public class AddressServicesImpl implements AddressServices {
	@Autowired
	AddressRepository addressRepo;

	@Override
	public List<Address> findAllAddress()throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return addressRepo.findAll() ;
	}

	@Override
	public Address findByAddressID(Long address_id) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		return addressRepo.findById(address_id).get();
	}

	@Override
	public void deleteByAddressId(Long address_id) throws ResourceNotFoundException{
		addressRepo.deleteById(address_id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Address saveAddress(Address address) {
		// TODO Auto-generated method stub
		return addressRepo.save(address);
	}

	@Override
	public int updateAddress(Address address, Long address_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

	
}