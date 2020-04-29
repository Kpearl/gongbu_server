package com.example.demo.dao;

import com.example.demo.model.User;

public interface UserDAO {
	public void insertUser(User user);
	public Boolean searchUser(String id);
	public Boolean updateUser(User user, User newUser);
}
