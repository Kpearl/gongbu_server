package com.gongbu.bootJPA.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Friend {

	@Id
	@GeneratedValue
	@Column(name = "FRIEND_ID", nullable = false)
	private Long id;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private FriendState state;

	@Column(nullable = false)
	private Long userId;
	
	@Column(nullable = false)
	private Long targetId;

	public Friend() {}
	
	public Friend(Long userId, FriendState state, Long targetId) {}

	public Long getId() {
		return id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getTargetId() {
		return targetId;
	}

	public void setTargetId(Long targetId) {
		this.targetId = targetId;
	}

	public FriendState getState() {
		return state;
	}

	public void setState(FriendState state) {
		this.state = state;
	}
}
