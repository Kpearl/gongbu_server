package com.gongbu.bootJPA.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class CategoryGroup {

	@Id
	@Column(name = "CATEGORY_GROUP_ID", nullable = false)
	@SequenceGenerator(name = "CATEGORY_GROUP_ID", sequenceName = "CATEGORY_GROUP_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@OneToMany(mappedBy = "categoryGroup")
	private List<Category> category = new ArrayList<Category>();
}
