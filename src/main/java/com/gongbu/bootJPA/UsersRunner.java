package com.gongbu.bootJPA;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.gongbu.bootJPA.Users.Users;
import com.gongbu.bootJPA.Users.UsersRepository;

@Component
public class UsersRunner implements ApplicationRunner{

	@Autowired
	UsersRepository userRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Users users = new Users();
		users.setName("test");
		users.setCreated(new Date());
		
		userRepository.save(users);
	}
}
