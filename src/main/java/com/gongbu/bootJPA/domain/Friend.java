package com.gongbu.bootJPA.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Friend {

	@Id	@GeneratedValue
	@Column(name = "FRIEND_ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private Users user;
	
	private Long frend;
	private int state;
	
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
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
