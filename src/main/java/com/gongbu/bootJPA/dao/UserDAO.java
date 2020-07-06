package com.gongbu.bootJPA.dao;

import com.gongbu.bootJPA.model.User;

public interface UserDAO {
	public void insertUser(User user);
	public Boolean searchUser(String id);
	public Boolean updateUser(User user, User newUser);
}
