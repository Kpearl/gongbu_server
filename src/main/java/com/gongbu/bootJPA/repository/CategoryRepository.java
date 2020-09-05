package com.gongbu.bootJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gongbu.bootJPA.domain.Account;
import com.gongbu.bootJPA.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	List<Category> findByAccount(Account account);
}
