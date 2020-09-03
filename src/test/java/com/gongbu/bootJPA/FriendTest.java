package com.gongbu.bootJPA;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gongbu.bootJPA.domain.Friend;
import com.gongbu.bootJPA.service.FriendService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(classes=Application.class)
@SpringBootTest(classes=Application.class)
public class FriendTest {

	@Autowired
	private FriendService friendService;

	@Test
	public void followTest() throws Exception {
		Friend f = friendService.followFriend("root", "Test");
		System.out.println(f.getId() + " " + f.getUserId() + " " + f.getState() + " " + f.getTargetId());
	}
	
	//@Test
	public void unFollowTest() throws Exception {
		friendService.unFollowFriend("root", "Test");
	}
	
	//@Test
	public void friendList() throws Exception {
		List<Friend> result = friendService.getFriendList("Test");
	}
}
