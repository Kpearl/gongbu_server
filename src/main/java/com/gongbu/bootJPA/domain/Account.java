package com.gongbu.bootJPA.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "ACCOUNTS")
public class Account {

	@Id
	@GeneratedValue
	@Column(name = "ACCOUNT_ID", nullable = false)
	private Long id;

	@JsonBackReference
	@JoinColumn(name = "USER_ID")
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Users user;

	@JsonManagedReference
	@OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
	private List<Post> post = new ArrayList<>();

	@JsonBackReference
	@OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
	private List<Sharer> sharer = new ArrayList<>();

	@OneToOne
	@JoinColumn(name = "CATEGORY_GROUP_ID")
	private CategoryGroup categoryGroup;

	private String name;

	public Account() {}

	public Account(String name) {
		this.name = name;
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

	public List<Sharer> getSharer() {
		return sharer;
	}

	public String getName() {
		return name;
	}

	public CategoryGroup getCategoryGroup() {
		return categoryGroup;
	}

	public void setUser(Users user) {
		this.user = user;
		if (!user.getAccount().contains(this)) {
			user.getAccount().add(this);
		}
	}

	public void setPost(Post post) {
		this.post.add(post);
		if(post.getAccount() != this) {
			post.setAccount(this);
		}
	}

	public void setSharer(Sharer sharer) {
		this.sharer.add(sharer);
		if(sharer.getAccount() != this) {
			sharer.setAccount(this);
		}
	}

	public void setCategoryGroup(CategoryGroup categoryGroup) {
		this.categoryGroup = categoryGroup;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "userId : " + user.getId() + ", accountName : " + name;
	}
}
