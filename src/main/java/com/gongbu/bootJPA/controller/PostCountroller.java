package com.gongbu.bootJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.entity.Post;
import com.gongbu.bootJPA.service.AccountService;

@RestController
@RequestMapping("/post/*")
public class PostCountroller {

	@Autowired
	private AccountService accountService;
	
	@PostMapping("/write")
	public Boolean write(Post account) {
		return null;
	}
	
	@PostMapping("/list")
	public List<Post> read(String id, String g_id) {
		return null;
	}
}
