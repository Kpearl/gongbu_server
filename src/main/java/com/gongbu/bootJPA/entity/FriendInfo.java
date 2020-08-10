package com.gongbu.bootJPA.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "friend_info")
public class FriendInfo {

	@Id
	private String friend_info_id;
	
	private String user_id;
	private String friend_id;
	private int state;
	
	public String getFriend_info_id() {
		return friend_info_id;
	}
	public void setFriend_info_id(String friend_info_id) {
		this.friend_info_id = friend_info_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getFriend_id() {
		return friend_id;
	}
	public void setFriend_id(String friend_id) {
		this.friend_id = friend_id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
