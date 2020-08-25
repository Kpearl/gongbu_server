package com.gongbu.bootJPA.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Post {
	
	
	@Id @GeneratedValue
	@Column(name = "POST_ID")
	private Long id;
	
	private String title;
	private String content;
	private String cost;
	private String consumer;
	
//	private Category category;
//	public Category getCategory() {
//		return category;
//	}
//	
//	public void setCategory(Category category) {
//		this.category = category;
//	}
	
//	@ManyToOne
//	@JoinColumn(name="USER_ID")
//	private Account account;
//	public Account getAccount() {
//		return account;
//	}
//	
//	public void setAccount(Account account) {
//		this.account = account;
//	}
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date purchaseDate;

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

}
