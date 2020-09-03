package com.gongbu.bootJPA.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Sharer {
	
	@Id
	@GeneratedValue
	@Column(name = "SHARER_ID", nullable = false)
	private Long id;
	
	@JsonBackReference
	@OneToMany(mappedBy = "sharer", fetch = FetchType.LAZY)
	private List<Users> user;
	
	@OneToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;
	
	public Sharer() {}

	public void setUser(Users user) {
		this.user.add(user);
		if(user.getSharer() != this) {
			user.setSharer(this);
		}
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Long getId() {
		return id;
	}

	public List<Users> getUser() {
		return user;
	}

	public Account getAccount() {
		return account;
	}
}
