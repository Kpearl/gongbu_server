package com.gongbu.bootJPA.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Post {

	@Id
	@Column(name = "POST_ID", nullable = false)
	@SequenceGenerator(name = "POST_ID", sequenceName = "POST_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;

	private String title;
	private String content;
	private String cost;
	private String consumer;

	@OneToOne
	@JoinColumn(name = "CATEGORY_ID")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;

	@Temporal(TemporalType.TIMESTAMP)
	private Date purchaseDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date CreatedDate;

	public Post() {
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;

		if (this.account != null) {
			this.account.getPost().remove(this);
		}
		this.account = account;
		account.getPost().add(this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;

	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}
}
