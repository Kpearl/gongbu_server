package com.gongbu.bootJPA.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class CategoryGroup {

	@Id
	@GeneratedValue
	@Column(name = "CATEGORY_GROUP_ID", nullable = false)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;
	
	@OneToMany(mappedBy = "categoryGroup")
	private List<Category> category = new ArrayList<Category>();
	
	public CategoryGroup() {}
	
	public Long getId() {
		return id;
	}

	public Account getAccount() {
		return account;
	}

	public List<Category> getCategory() {
		return category;
	}
}
