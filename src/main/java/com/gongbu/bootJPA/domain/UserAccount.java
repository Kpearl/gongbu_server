package com.gongbu.bootJPA.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ACCOUNT")
public class UserAccount {

	@Id	@GeneratedValue
	@Column(name = "USER_ACCOUNT_ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private Users user;

	@ManyToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;
}