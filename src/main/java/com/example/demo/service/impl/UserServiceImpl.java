package com.example.demo.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Inject UserDAO dao;
	
	@Override
	public void insertUser(User user) {
		if(searchUser(user.getId())) {
			dao.insertUser(user);
		} else {
			System.out.println("id중복 / 재입력 요구");
		}
	}
	
	@Override
	public Boolean searchUser(String id) {
		return dao.searchUser(id);
	}
	
	@Override
	public Boolean updateUser(User user, User newUser) {
		return dao.updateUser(user, newUser);
	}
}
