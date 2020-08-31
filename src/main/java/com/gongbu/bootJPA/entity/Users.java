package com.gongbu.bootJPA.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Users {

	@Id
	@Column(name = "USER_ID", nullable = false)
	@SequenceGenerator(name = "USER_ID", sequenceName = "USER_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column(name = "LOGIN_ID", nullable = false)
	private String userId;
	private String name;
	private String password;
	private String nickName;
	private String phone;
	private String email;

	@Temporal(TemporalType.DATE)
	private Date birth;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Account> account;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Friend> friend;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SHARER_ID")
	private Sharer sharer;

	public Users() {}

	public Users(Users user) {
		this.userId = user.getUserId();
		this.name = user.getName();
		this.password = user.getPassword();
		this.nickName = user.getNickName();
		this.phone = user.getPhone();
		this.email = user.getEmail();
		this.birth = user.getBirth();
	}

	public Long getId() {
		return id;
	}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getNickName() {
		return nickName;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public Date getBirth() {
		return birth;
	}

	public List<Account> getAccount() {
		return account;
	}

	public List<Friend> getFriend() {
		return friend;
	}
}
