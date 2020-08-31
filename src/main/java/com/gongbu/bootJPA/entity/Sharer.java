package com.gongbu.bootJPA.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Sharer {
	
	@Id
	@Column(name = "SHARER_ID", nullable = false)
	@SequenceGenerator(name = "SHARER_ID", sequenceName = "SHARER_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@OneToMany(mappedBy = "sharer", fetch = FetchType.LAZY)
	private List<Users> user;
	
	@OneToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;
	
	public Sharer() {}

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
