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
	public Boolean login(String id, String pw) {
		try {
			Users user = userRepository.findById(id).orElse(new Users());
			return user.getId().equals(id) && user.getPw().equals(pw);
		} catch(NullPointerException e) {
			return false;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	@Override
	public String registerUser(Users user) {
		userRepository.save(user);
		return "index";
	}

	@Override
	public Users getUser(String id) {
        return userRepository.findById(id).orElse(new Users());
	}
}
