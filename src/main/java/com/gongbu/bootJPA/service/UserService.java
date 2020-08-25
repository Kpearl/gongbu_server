package com.gongbu.bootJPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gongbu.bootJPA.entity.Users;
import com.gongbu.bootJPA.repository.UserRepository;

@Service("UserService")
public class UserService{
	
	@Autowired
	UserRepository userRepository;
	
	public Boolean login(String id, String password) {
		Users user = userRepository.findById(id).orElse(new Users());
		if(user != null && user.getId().equals(id) && user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}
	
	public Boolean registerUser(Users user) {
//		if(userRepository.findById(user.getId()).orElse(null) == null) {
//			userRepository.save(user);
//		} else {
//			return false;
//		}
		return true;
	}

	public Users getUser(String id) {
        return userRepository.findById(id).orElse(new Users());
	}
}
