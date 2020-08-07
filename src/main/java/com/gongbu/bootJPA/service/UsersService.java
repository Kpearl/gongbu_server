package com.gongbu.bootJPA.service;

import com.gongbu.bootJPA.entity.Users;

public interface UsersService {
	public Boolean login(String id, String pw);
	public Boolean registerUser(Users user);
	public Users getUser(String id);
}
