package com.gongbu.bootJPA.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.model.User;
import com.gongbu.bootJPA.service.UserService;

@RestController
public class UserController {

	@Inject UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	// 기존 페이지
	@GetMapping
	public String getAllUser() {
		return "viewtest";
	}
	
	// 회원가입 페이지
	@PostMapping
	public void insertUser(User user) {
		userService.insertUser(user);
	}
	
	@GetMapping("/test")
	public String test() {
		return "test test test";
	}
}
