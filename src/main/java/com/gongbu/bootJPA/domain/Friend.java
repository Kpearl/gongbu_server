package com.gongbu.bootJPA.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Friend {

	@Id
	@Column(name = "FRIEND_ID", nullable = false)
	@SequenceGenerator(name = "FRIEND_ID", sequenceName = "FRIEND_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	private Users user;

	@Enumerated(EnumType.STRING)
	private FriendState state;

	public Friend() {}

	public Long getId() {
		return id;
	}

	public Users getUser() {
		return user;
	}

	public FriendState getState() {
		return state;
	}
}
