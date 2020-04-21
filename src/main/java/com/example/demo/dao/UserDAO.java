package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository("userDAO")
public interface UserDAO {
	public Boolean insertUser(User user);
}
