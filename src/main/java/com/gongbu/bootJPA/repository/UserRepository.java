package com.gongbu.bootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gongbu.bootJPA.domain.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	Users findByUserId(String id);
}