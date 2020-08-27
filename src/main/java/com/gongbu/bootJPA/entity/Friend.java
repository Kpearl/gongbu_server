package com.gongbu.bootJPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private Users user;

	private Long frend;
	
	@Enumerated(EnumType.STRING)
	private FriendState state;

	public Friend() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Long getFrend() {
		return frend;
	}

	public void setFrend(Long frend) {
		this.frend = frend;
	}

	public FriendState getState() {
		return state;
	}

	public void setState(FriendState state) {
		this.state = state;
	}
}
