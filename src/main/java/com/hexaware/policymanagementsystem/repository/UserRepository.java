package com.hexaware.policymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.policymanagementsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
