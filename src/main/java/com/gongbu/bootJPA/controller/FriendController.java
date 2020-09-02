package com.gongbu.bootJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.domain.Friend;
import com.gongbu.bootJPA.service.FriendService;

@RestController
@RequestMapping("/friend/*")

public class FriendController {

	@Autowired FriendService friendService;
	
	@PostMapping("/follow")
	public Friend follow(String user, String target) {		
		return friendService.followFriend(user, target);
	}
	
	@PostMapping("/unfollow")
	public void unFollow(String user, String target) {		
		friendService.unFollowFriend(user, target);
	}

	@PostMapping("/getList")
	public List<Friend> getList(String id) {
		return friendService.getFriendList(id);
	}
}
