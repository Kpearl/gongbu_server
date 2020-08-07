package com.gongbu.bootJPA.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.entity.Users;
import com.gongbu.bootJPA.service.UsersService;

@RestController
@RequestMapping("/users/*")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@PostMapping("/login")
	public Boolean loginUser(String id, String pw) {
		return usersService.login(id, pw);
	}
	
	@PostMapping("/register")
	public Boolean registerUser(Users user) {
		System.out.println(user.getId());
		Users users = new Users();
		users.setId(user.getId());
		users.setPw(user.getPw());
		users.setName(user.getName());
		users.setPhone(user.getPhone());
		users.setBirth(user.getBirth());
		users.setCreated(new Date());
		
		return usersService.registerUser(users);
	}
	
	@PostMapping("/get")
	public Users getUser(String id) {
		return usersService.getUser(id);
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
