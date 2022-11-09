package com.hexaware.policymanagementsystem.services;

import java.util.List;
import com.hexaware.policymanagementsystem.entity.Admin;
import com.hexaware.policymanagementsystem.exception.ResourceNotFoundException;

public interface AdminServices {
	public List<Admin> findAllAdmin()throws ResourceNotFoundException;
	public Admin findByAdminID(Long admin_Id)throws ResourceNotFoundException;
	public void deleteByAdminId(Long admin_id)throws ResourceNotFoundException;
	public int updateAdmin(Admin admin,Long admin_id);

}