package com.gongbu.bootJPA.service;

import com.gongbu.bootJPA.entity.Users;

public interface UsersService {
	public String joinUser(Users user);
	public Users getUser(String id);
}
