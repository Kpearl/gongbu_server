package com.gongbu.bootJPA;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.gongbu.bootJPA.domain.Users;
import com.gongbu.bootJPA.service.UserService;

@RunWith(SpringRunner.class) 
@ContextConfiguration(classes=Application.class)
@SpringBootTest(classes=Application.class)
class UserTests {

	@Autowired
	private UserService userService;

	//@Test
	public void registerTest() throws Exception {
		Users user = new Users();
		user.setUserId("Test");
		user.setName("name");
		user.setPassword("test");
		user.setNickName("test");
		user.setPhone("010-0000-0000");
		user.setBirth(new Date());
		user.setEmail("test@test.com");
		
		String result = userService.registerUser(user);
		
		System.out.println(result);
	}
	
	//@Test
	public void LoginTest() throws Exception {
		//정상동작
		String result1 = userService.login("root", "root");
		//아이디 에러
		//String result2 = userService.login("test", "root");
		//비밀번호 에러
		//String result3 = userService.login("root", "1234");
	}

	@Test
	public void getTest() throws Exception {
		Users user = new Users();
		user = userService.getInfo("Test");

		System.out.println(user.toString());
	}
}
