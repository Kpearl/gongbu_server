package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
	public void insertUser(User user);
	public Boolean searchUser(String id);
	public Boolean updateUser(User user, User newUser);
}
