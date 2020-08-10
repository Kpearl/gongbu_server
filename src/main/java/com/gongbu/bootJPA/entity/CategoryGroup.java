package com.gongbu.bootJPA.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category_group")
public class CategoryGroup {

	@Id
	private String category_g_id;
	
	private String account_g_id;

	public String getCategory_g_id() {
		return category_g_id;
	}

	public void setCategory_g_id(String category_g_id) {
		this.category_g_id = category_g_id;
	}

	public String getAccount_g_id() {
		return account_g_id;
	}

	public void setAccount_g_id(String account_g_id) {
		this.account_g_id = account_g_id;
	}
}
