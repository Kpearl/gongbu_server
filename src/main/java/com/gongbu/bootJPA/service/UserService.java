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
		
	public String registerUser(Users user) {
		Users findUser = userRepository.findByUserId(user.getUserId());
		if(findUser == null) {
			userRepository.save(user);
		}
		return user.getUserId();
	}
	
	public String login(String id, String password) {
		Users findUser = userRepository.findByUserId(id);
		if(findUser == null) {
			throw new IllegalStateException("존재하지 않는 아이디");
		} 
		if(!findUser.getPassword().equals(password)) {
			throw new IllegalStateException("비밀번호 오류");
		}
		return id;
	}

	public Users getInfo(String id) {
		Users findUser =userRepository.findByUserId(id);
		if(findUser == null) {
			throw new IllegalStateException("존재하지 않는 아이디");
		} 
		return findUser;
	}
}
