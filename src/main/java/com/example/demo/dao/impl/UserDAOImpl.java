package com.example.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Override
	public Boolean insertUser(User user) {
		Boolean bool = false;
		return bool;
	}

}
