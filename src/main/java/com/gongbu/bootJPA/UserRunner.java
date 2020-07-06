package com.gongbu.bootJPA;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.gongbu.bootJPA.User.User;
import com.gongbu.bootJPA.User.UserRepository;

@Component
public class UserRunner implements ApplicationRunner{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		User user = new User();
		user.setId("test");
		user.setCreated(new Date());
		
		userRepository.save(user);
	}
}
