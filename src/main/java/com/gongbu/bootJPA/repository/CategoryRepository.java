package com.gongbu.bootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gongbu.bootJPA.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, String>{
}
