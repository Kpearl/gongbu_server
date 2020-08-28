package com.gongbu.bootJPA.entity;

import java.io.Serializable;

public class UserAccountId implements Serializable{
	private String user;
	private String account;
	
	public UserAccountId() {}
	
	public UserAccountId(String user, String account) {
		this.user = user;
		this.account = account;
	}
	
	@Override
	public boolean equals(Object o) {
		return true;
	}
	
	@Override
	public int hashCode() {
		return 0;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
}
