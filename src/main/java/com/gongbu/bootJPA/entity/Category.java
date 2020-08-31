package com.gongbu.bootJPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Category {

	@Id
	@Column(name = "CATEGORY_ID", nullable = false)
	@SequenceGenerator(name = "CATEGORY_ID", sequenceName = "CATEGORY_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORY_GROUP_ID")
	private CategoryGroup categoryGroup;
	
	private String name;
	
	public Category() {}

	public Long getId() {
		return id;
	}

	public CategoryGroup getCategoryGroup() {
		return categoryGroup;
	}

	public String getName() {
		return name;
	}
}
