package com.gongbu.bootJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.domain.Users;
import com.gongbu.bootJPA.service.UserService;

@RestController
@RequestMapping("/users/*")
public class UsersController {
	
	@Autowired UserService usersService;
	
	@PostMapping("/register")
	public String register(Users user) {		
		return usersService.registerUser(user);
	}

	@PostMapping("/login")
	public String login(String id, String password) {
		return usersService.login(id, password);
	}
	
	@PostMapping("/getInfo")
	public Users getInfo(String user_id) {
		return usersService.getInfo(user_id);
	}
	
	@GetMapping("/check")
	public Boolean check() {
		return true;
	}
	
	@GetMapping("/logout")
	public Boolean logout() {
		return null;
	}
}
