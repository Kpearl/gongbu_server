package com.gongbu.bootJPA.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	private String category_id;
	
	private String category_g_id;
	private String name;
	
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getCategory_g_id() {
		return category_g_id;
	}
	public void setCategory_g_id(String category_g_id) {
		this.category_g_id = category_g_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
