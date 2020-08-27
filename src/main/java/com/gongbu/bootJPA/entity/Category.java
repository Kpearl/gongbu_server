package com.gongbu.bootJPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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

	@ManyToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;
	
	@OneToOne(mappedBy = "category")
	private Post post;

	private String name;

	public Category() {}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
