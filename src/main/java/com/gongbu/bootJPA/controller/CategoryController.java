package com.gongbu.bootJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gongbu.bootJPA.entity.Category;
import com.gongbu.bootJPA.service.CategoryService;

@RestController
@RequestMapping("/category/*")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@PostMapping("/set")
	public Boolean setCategory(Category cat) {
		return categoryService.setCategory(cat);
	}
	
	@PostMapping("/get")
	public List<Category> getCategory(String id) {
		return categoryService.getCategoryList(id);
	}
}