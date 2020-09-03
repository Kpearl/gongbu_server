package com.gongbu.bootJPA.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Post {

	@Id
	@GeneratedValue
	@Column(name = "POST_ID", nullable = false)
	private Long id;

	@JsonBackReference
	@JoinColumn(name = "ACCOUNT_ID")
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Account account;

	private String category;
	private String title;
	private String content;
	private int cost;
	private String consumer;

	@Temporal(TemporalType.TIMESTAMP)
	private Date purchaseDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date CreatedDate = new Date();

	public Post() {}
	
	public Post(Post post) {
		this.account = post.getAccount();
		this.category = post.getCategory();
		this.title = post.getTitle();
		this.content = post.getContent();
		this.cost = post.getCost();
		this.consumer = post.getConsumer();
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setAccount(Account account) {
		this.account = account;
		if(!account.getPost().contains(this)) {
			account.getPost().add(this);
		}
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Long getId() {
		return id;
	}

	public Account getAccount() {
		return account;
	}

	public String getCategory() {
		return category;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public int getCost() {
		return cost;
	}

	public String getConsumer() {
		return consumer;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}
	
	@Override
	public String toString() {
		return "title : " + title + ", content : " + content + ", cost : " + cost + ", consumer : " + consumer;
	}
}
