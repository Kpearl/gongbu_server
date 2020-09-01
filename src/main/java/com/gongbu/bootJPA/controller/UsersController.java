package com.gongbu.bootJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.domain.Users;
import com.gongbu.bootJPA.repository.UserRepository;
import com.gongbu.bootJPA.service.UserService;

@RestController
@RequestMapping("/users/*")
public class UsersController {
	
	@Autowired UserService usersService;
	@Autowired UserRepository userRepository;
	
	@PostMapping("/login")
	public Users loginUser(String id, String password) {
		return usersService.login(id, password);
	}
	
	@PostMapping("/register")
	public String registerUser(Users user) {		
		return usersService.registerUser(user);
	}
	
	@PostMapping("/get")
	public Users getUser(String user_id) {
		return usersService.getUser(user_id);
	}
	
	@GetMapping("/check")
	public Boolean check() {
		return true;
	}
	
	@PostMapping("/logout")
	public Boolean logout() {
		return null;
	}
}
