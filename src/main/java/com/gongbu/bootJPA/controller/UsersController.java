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
	
	@Autowired
	private UserService usersInfoService;
	
	@PostMapping("/login")
	public Boolean loginUser(String id, String password) {
		return usersInfoService.login(id, password);
	}
	
	@PostMapping("/register")
	public Boolean registerUser(Users user) {
		Users users = new Users();
		users.setId(user.getId());
		users.setPassword(user.getPassword());
		users.setName(user.getName());
		users.setPhone(user.getPhone());
		users.setEmail(user.getEmail());
		users.setBirth(user.getBirth());
		
		return usersInfoService.registerUser(users);
	}
	
	@PostMapping("/get")
	public Users getUser(String user_id) {
		return usersInfoService.getUser(user_id);
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
