package com.gongbu.bootJPA.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS")
public class Account {

	@Id
	@Column(name = "ACCOUNT_ID", nullable = false)
	@SequenceGenerator(name = "ACCOUNT_ID", sequenceName = "ACCOUNT_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	private Users user;

	@OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
	private List<Post> post = new ArrayList<>();

	@OneToOne
	@JoinColumn(name = "SHARER_ID")
	private Sharer sharer;

	@OneToOne
	@JoinColumn(name = "CATEGORY_GROUP_ID")
	private CategoryGroup categoryGroup;

	private String name;

	public Account() {}

	public Account(Account account) {
		this.name = account.getName();
	}

	public Long getId() {
		return id;
	}

	public Users getUser() {
		return user;
	}

	public List<Post> getPost() {
		return post;
	}

	public Sharer getSharer() {
		return sharer;
	}

	public String getName() {
		return name;
	}

	public CategoryGroup getCategoryGroup() {
		return categoryGroup;
	}
}
