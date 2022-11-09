package com.hexaware.policymanagementsystem.service;

import java.util.List;



import com.hexaware.policymanagementsystem.entity.Address;


public interface AddressService {
	public List<Address> findAllAddress();
	public Address saveAddress(Address address);
	public Address updateAddress(Address address);

}
