package com.gongbu.bootJPA.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Account {
	
	@Id
	private String account_id;
	
	private String account_g_id;
	private String what;
	private String how;
	private String why;
	private String who;
	private int state;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date buy_when;

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public String getAccount_g_id() {
		return account_g_id;
	}

	public void setAccount_g_id(String account_g_id) {
		this.account_g_id = account_g_id;
	}

	public String getWhat() {
		return what;
	}

	public void setWhat(String what) {
		this.what = what;
	}

	public String getHow() {
		return how;
	}

	public void setHow(String how) {
		this.how = how;
	}

	public String getWhy() {
		return why;
	}

	public void setWhy(String why) {
		this.why = why;
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	public Date getBuy_when() {
		return buy_when;
	}

	public void setBuy_when(Date buy_when) {
		this.buy_when = buy_when;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
