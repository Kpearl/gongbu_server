package com.gongbu.bootJPA.service;

import com.gongbu.bootJPA.model.User;

public interface UserService {
	public void insertUser(User user);
	public Boolean searchUser(String id);
	public Boolean updateUser(User user, User newUser);
}
