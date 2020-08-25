package com.gongbu.bootJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gongbu.bootJPA.entity.Category;
import com.gongbu.bootJPA.repository.CategoryRepository;

@Service("CategoryServie")
public class CategoryService{

	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getCategoryList(String id) {
		return null;//(List<Category>) categoryRepository.findById(id).orElse(new Category());
	}

	public Boolean setCategory(Category cat) {
//		if(categoryRepository.findById(cat.getId()).orElse(new Category()) != null) {
//			categoryRepository.save(cat);
//			return true;
//		} else {
//			return null;
//		}
		return null;
	}
}
