package com.gongbu.bootJPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gongbu.bootJPA.domain.Users;
import com.gongbu.bootJPA.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public Users login(String id, String password) {
		Users user = userRepository.findByUserId(id);
		return null;
	}

	public String registerUser(Users user) {
		Users findUser = userRepository.findByUserId(user.getUserId());
		if(findUser == null) {
			userRepository.save(user);
		}
		return user.getUserId();
	}

	public Users getUser(String id) {
		return null;//userRepository.getOne(id);
	}
}
