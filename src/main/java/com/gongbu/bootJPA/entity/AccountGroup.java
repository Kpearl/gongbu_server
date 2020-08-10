package com.gongbu.bootJPA.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_group")
public class AccountGroup {
	
	@Id
	private String accout_g_id;
	
	private String account_id;
	private String user_id;
	private String partner_id;
	
	public String getAccout_g_id() {
		return accout_g_id;
	}
	public void setAccout_g_id(String accout_g_id) {
		this.accout_g_id = accout_g_id;
	}
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPartner_id() {
		return partner_id;
	}
	public void setPartner_id(String partner_id) {
		this.partner_id = partner_id;
	}
}
