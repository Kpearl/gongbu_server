package com.example.demo.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Inject UserDAO dao;
	
	@Override
	public User insertUser(User user) {
		return user;
	}
}
