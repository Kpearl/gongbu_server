package com.gongbu.bootJPA.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sharer {
	
	@Id
	@GeneratedValue
	@Column(name = "SHARER_ID", nullable = false)
	private Long id;
	
	private Long userId;
	
	@JoinColumn(name = "ACCOUNT_ID")
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Account account;
	
	public Sharer() {}
	
	public Sharer(Account account) {
		this.account = account;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAccount(Account account) {
		this.account = account;
		if (!account.getSharer().contains(this)) {
			account.getSharer().add(this);
		}
	}

	public Long getId() {
		return id;
	}

	public Account getAccount() {
		return account;
	}
	
	@Override
	public String toString() {
		return "userId: " + userId + ", account : " + account.toString();
	}
}
