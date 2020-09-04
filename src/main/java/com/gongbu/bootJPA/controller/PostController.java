package com.gongbu.bootJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.domain.Post;
import com.gongbu.bootJPA.service.PostService;

@RestController
@RequestMapping("/post/*")
public class PostController {

	@Autowired
	private PostService postService;
	
	@PostMapping("/savePost")
	public void savePost(Long accountId, Post post) {
		postService.savePost(accountId, post);
	}
	
	@PostMapping("/getPostList")
	public List<Post> getPostList(Long accountId) {
		return postService.getPostList(accountId);
	}
	
	@PostMapping("/getPost")
	public Post getPost(Long postId) {
		return postService.getPost(postId);
	}
	
	@PostMapping("/deletePost")
	public void deletePost(Long accountId, Post post) {
		postService.deletePost(accountId, post);
	}
}
