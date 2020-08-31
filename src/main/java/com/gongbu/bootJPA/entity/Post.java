package com.gongbu.bootJPA.entity;

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
	private String cost;
	private String consumer;

	@Temporal(TemporalType.TIMESTAMP)
	private Date purchaseDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date CreatedDate;

	public Post() {}

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

	public String getCost() {
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
}
