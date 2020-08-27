package com.gongbu.bootJPA.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ACCOUNT")
@SequenceGenerator(name = "USER_ACCOUNT_ID", sequenceName = "USER_ACCOUNT_SEQ", initialValue = 1, allocationSize = 1)
public class UserAccount {

	@Id
	@Column(name = "USER_ACCOUNT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private Users user;

	@ManyToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;
}