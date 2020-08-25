package com.gongbu.bootJPA.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS")
public class Account {

	@Id	@GeneratedValue
	@Column(name = "ACCOUNT_ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private Users user;
	
	private String name;

	@OneToMany
	private List<UserAccount> join = new ArrayList<>();
	
	public List<UserAccount> getJoin() {
		return join;
	}
	
	public void setJoin(List<UserAccount> join) {
		this.join = join;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
