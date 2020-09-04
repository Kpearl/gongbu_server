package com.gongbu.bootJPA;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gongbu.bootJPA.domain.Post;
import com.gongbu.bootJPA.service.PostService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
@SpringBootTest(classes = Application.class)
public class PostTest {

	@Autowired
	private PostService postService;

	@Test
	public void savePostTest() throws Exception {
		Post post = new Post();
		post.setTitle("title");
		post.setContent("content");
		post.setPurchaseDate(new Date(20200903));
		post.setCost(1000);
		post.setConsumer("root");
		postService.savePost((long) 6, post);

		System.out.println(post.toString());
	}

	// @Test
	public void getPostListTest() throws Exception {
		List<Post> postList = postService.getPostList((long) 5);

		for (Post p : postList) {
			System.out.println(p.toString());
		}
	}

	// @Test
	public void getPostTest() throws Exception {
		System.out.println(postService.getPost((long) 13).toString());
	}

	// @Test
	public void updatePostTest() throws Exception {
		Post post = postService.getPost((long) 13);
		post.setContent("testContent");
		postService.updatePost((long) 5, post);
	}

	//@Test
	public void deletePostTest() throws Exception {
		Post post = postService.getPost((long) 13);
		postService.deletePost((long) 5, post);
	}
}
