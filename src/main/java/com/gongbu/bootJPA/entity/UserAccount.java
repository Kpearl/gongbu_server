package com.gongbu.bootJPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ACCOUNT")
public class UserAccount {

	@Id
	@Column(name = "USER_ACCOUNT_ID", nullable = false)
	@SequenceGenerator(name = "USER_ACCOUNT_ID", sequenceName = "USER_ACCOUNT_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private Users user;

	@ManyToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;
}