package com.gongbu.bootJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.domain.Post;
import com.gongbu.bootJPA.repository.AccountRepository;
import com.gongbu.bootJPA.repository.PostRepository;

@Service
@Transactional
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	public void savePost(Long accountId, Post post) {
		Account account = accountRepository.findById(accountId).get();
		post.setAccount(account);
		postRepository.save(post);
	}
	
	public List<Post> getPostList(Long accountId) {
		Account account = accountRepository.findById(accountId).get();
		List<Post> postList = account.getPost();
		return postList;
	}
	
	public void updatePost(Long accountId, Post post) {
		postRepository.save(post);
	}
	
	public Post getPost(Long postId) {
		return postRepository.findById(postId).get();
	}

	public void deletePost(Long accountId, Post post) {
		postRepository.delete(post);
	}
}
