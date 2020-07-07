package com.gongbu.bootJPA.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gongbu.bootJPA.entity.Users;
import com.gongbu.bootJPA.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/join")
	public String joinUser(Users user) {
		Users users = new Users();
		users.setId(user.getId());
		users.setName(user.getName());
		users.setCreated(new Date());
		
		usersService.joinUser(users);
		
		return "join-Users";
	}
	
	@GetMapping("/get")
	public Users getUser(String id) {
		return usersService.getUser(id);
	}
}
