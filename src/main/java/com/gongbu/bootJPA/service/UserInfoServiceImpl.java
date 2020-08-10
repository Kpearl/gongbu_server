package com.gongbu.bootJPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gongbu.bootJPA.entity.UserInfo;
import com.gongbu.bootJPA.repository.UserInfoRepository;

@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	UserInfoRepository userRepository;
	
	@Override
	public Boolean login(String id, String password) {
		UserInfo user = userRepository.findById(id).orElse(new UserInfo());
		if(user != null && user.getId().equals(id) && user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}
	
	@Override
	public Boolean registerUser(UserInfo user) {
		if(userRepository.findById(user.getId()).orElse(null) == null) {
			userRepository.save(user);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public UserInfo getUser(String id) {
        return userRepository.findById(id).orElse(new UserInfo());
	}
}
