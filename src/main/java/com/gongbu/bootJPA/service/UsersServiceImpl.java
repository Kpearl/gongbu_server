package com.gongbu.bootJPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gongbu.bootJPA.entity.Users;
import com.gongbu.bootJPA.repository.UsersRepository;

@Service("UsersService")
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	UsersRepository userRepository;
	
	@Override
	public String joinUser(Users user) {
		userRepository.save(user);
		return "index";
	}

	@Override
	public Users getUser(String id) {
        return userRepository.findById(id).orElse(null);
	}
}
