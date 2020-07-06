package com.gongbu.bootJPA.User;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gongbu.bootJPA.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
