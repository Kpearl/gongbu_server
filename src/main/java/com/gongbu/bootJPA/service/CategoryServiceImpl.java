package com.gongbu.bootJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gongbu.bootJPA.entity.Category;
import com.gongbu.bootJPA.repository.CategoryRepository;

@Service("CategoryServie")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
//	@Override
//	public List<Category> getCategoryList(String id) {
//		return (List<Category>) categoryRepository.findById(id).orElse(new Category());
//	}

//	@Override
//	public Boolean setCategory(Category cat) {
//		if(categoryRepository.findById(cat.getKey()).orElse(new Category()) != null) {
//			categoryRepository.save(cat);
//			return true;
//		} else {
//			return null;
//		}
//	}

}
