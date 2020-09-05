package com.gongbu.bootJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.domain.Category;
import com.gongbu.bootJPA.repository.AccountRepository;
import com.gongbu.bootJPA.repository.CategoryRepository;

@Service
@Transactional
public class CategoryService{

	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	AccountRepository accountRepository;

	public void addCategory(Long accountId, Category category) {
		Account account = accountRepository.findById(accountId).get();
		category.setAccount(account);
		categoryRepository.save(category);
	}
	
	public List<Category> getCategoryList(Account account) {
		return categoryRepository.findByAccount(account);
	}
	
	public void deleteCategory(Category category) {
		categoryRepository.delete(category);
	}
	
	public Category getCategory(Long categoryId) {
		return categoryRepository.findById(categoryId).get();
	}
	
	public void updateCategory(Category category) {
		categoryRepository.save(category);
	}

}
