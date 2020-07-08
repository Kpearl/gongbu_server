package com.gongbu.bootJPA;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.gongbu.bootJPA.entity.Users;
import com.gongbu.bootJPA.service.UsersService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=Application.class)
@SpringBootTest
@AutoConfigureMockMvc
class ApplicationTests {
	
	@Autowired
	private ApplicationContext context;
	
	@Before
	public static void before() {
		
	}
	
	@Test
	public void joinTest() throws Exception {
		UsersService service = context.getBean("UsersService", UsersService.class);
		Users user = new Users();
		
		user.setId("junit");
		user.setName("name");
		
		service.joinUser(user);
		
		assertThat(user.getId(), is(user.getId()));
		assertThat(user.getName(), is(user.getName()));
	}
	
	
	public void getTest() throws Exception {
		UsersService service = context.getBean("UsersService", UsersService.class);
		Users user = new Users();
		
		user = service.getUser("21");
		assertEquals(user.getName(), "test");
	}
}
