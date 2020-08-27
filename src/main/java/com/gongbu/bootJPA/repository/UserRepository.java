package com.gongbu.bootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gongbu.bootJPA.entity.Users;

public interface UserRepository extends JpaRepository<Users, String>{
}
