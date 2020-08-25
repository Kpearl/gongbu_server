package com.gongbu.bootJPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Category {

	@Id	@GeneratedValue
	@Column(name = "CATEGORY_ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;
	
	@OneToOne(mappedBy = "category")
	private Post post;

	private String name;

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
