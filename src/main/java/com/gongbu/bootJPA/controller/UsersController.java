package com.gongbu.bootJPA.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.entity.UserInfo;
import com.gongbu.bootJPA.service.UserInfoService;

@RestController
@RequestMapping("/users/*")
public class UsersController {
	
	@Autowired
	private UserInfoService usersInfoService;
	
	@PostMapping("/login")
	public Boolean loginUser(String id, String password) {
		return usersInfoService.login(id, password);
	}
	
	@PostMapping("/register")
	public Boolean registerUser(UserInfo user) {
		UserInfo users = new UserInfo();
		users.setId(user.getId());
		users.setPassword(user.getPassword());
		users.setName(user.getName());
		users.setPhone(user.getPhone());
		users.setEmail(user.getEmail());
		users.setBirth(user.getBirth());
		users.setCreated(new Date());
		
		return usersInfoService.registerUser(users);
	}
	
	@PostMapping("/get")
	public UserInfo getUser(String user_id) {
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
