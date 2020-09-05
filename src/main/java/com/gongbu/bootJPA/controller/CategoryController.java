package com.gongbu.bootJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.domain.Category;
import com.gongbu.bootJPA.service.CategoryService;

@RestController
@RequestMapping("/category/*")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@PostMapping("/setCategory")
	public void setCategory(Long accountId, Category category) {
		categoryService.addCategory(accountId, category);
	}
	
	@PostMapping("/getCategoryList")
	public List<Category> getCategoryList(Account account) {
		return categoryService.getCategoryList(account);
	}
	
	@PostMapping("/deleteCategory")
	public void deleteCategory(Category category) {
		categoryService.deleteCategory(category);
	}
	
	@PostMapping("/getCategory")
	public Category getCategory(Long categoryId) {
		return categoryService.getCategory(categoryId);
	}
}
