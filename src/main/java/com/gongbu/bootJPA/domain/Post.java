package com.gongbu.bootJPA.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Post {

	@Id
	@Column(name = "POST_ID", nullable = false)
	@SequenceGenerator(name = "POST_ID", sequenceName = "POST_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;

	private String category;
	private String title;
	private String content;
	private int cost;
	private String consumer;

	@Temporal(TemporalType.TIMESTAMP)
	private Date purchaseDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date CreatedDate;

	public Post() {}
	
	public Post(Post post) {
		this.account = post.getAccount();
		this.category = post.getCategory();
		this.title = post.getTitle();
		this.content = post.getContent();
		this.cost = post.getCost();
		this.consumer = post.getConsumer();
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
		return new Date();
	}

	public Date getCreatedDate() {
		return new Date();
	}
}
