package com.gongbu.bootJPA;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.domain.Category;
import com.gongbu.bootJPA.service.AccountService;
import com.gongbu.bootJPA.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(classes=Application.class)
@SpringBootTest(classes=Application.class)
public class CategoryTest {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private AccountService accountService;

	//@Test
	public void saveCategoryTest() throws Exception {
		Account account = accountService.getAccount((long) 6);
		Category cateogry = new Category();
		cateogry.setAccount(account);
		cateogry.setName("categoryTest");
		
		categoryService.addCategory((long) 6, cateogry);
	}

	@Test
	public void getCategoryList() throws Exception {
		Account account = accountService.getAccount((long) 6);
		List<Category> result = categoryService.getCategoryList(account);
		
		for(Category c : result ) {
			System.out.println(c.toString());
		}
	}
	
	//@Test
	public void getAccountTest() throws Exception {
		Category category = categoryService.getCategory((long) 10);
		System.out.println(category.toString());
	}
	
	//@Test
	public void updateAccountTest() throws Exception {
		Category category = categoryService.getCategory((long) 13);
		category.setName("testCate");
		categoryService.updateCategory(category);
	}
}
