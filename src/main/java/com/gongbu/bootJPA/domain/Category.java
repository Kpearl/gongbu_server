package com.gongbu.bootJPA.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Category {

	@Id
	@GeneratedValue
	@Column(name = "CATEGORY_ID", nullable = false)
	private Long id;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;
	
	private String name;
	
	public Category() {}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Account getAccount() {
		return account;
		
	}

	public void setAccount(Account account) {
		this.account = account;
		if (!account.getCategory().contains(this)) {
			account.getCategory().add(this);
		}
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "name : " + name + ", accountId : " + account.getId();
	}
}
