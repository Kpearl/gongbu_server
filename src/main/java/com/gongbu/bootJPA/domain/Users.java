package com.gongbu.bootJPA.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Users {

	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
	private Long id;
	
	private String userId;
	private String name;
	private String password;
	private String nickName;
	private String phone;
	private String email;

	@Temporal(TemporalType.DATE)
	private Date birth;

	@JsonManagedReference
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<Account> account = new ArrayList<Account>();

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "SHARER_ID")
	private Sharer sharer = new Sharer();
	
	@Transient
	private List<Friend> friend = new ArrayList<Friend>();

	public Users() {
	}

	public Users(Users user) {
		this.userId = user.getUserId();
		this.name = user.getName();
		this.password = user.getPassword();
		this.nickName = user.getNickName();
		this.phone = user.getPhone();
		this.email = user.getEmail();
		this.birth = user.getBirth();
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public void setAccount(Account account) {
		this.account.add(account);
		if(account.getUser() != this) {
			account.setUser(this);
		}
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
	
	public Sharer getSharer() {
		return sharer;
	}

	public void setSharer(Sharer sharer) {
		this.sharer = sharer;
		if (!sharer.getUser().contains(this)) {
			sharer.getUser().add(this);
		}
	}

	public List<Friend> getFriend() {
		return friend;
	}

	public void setFriend(List<Friend> friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "id = " + id + ", name = " + name + ", password = " + password + ", nickName = " + nickName
				+ ", phone = " + phone + ", email = " + email + ", birth = " + birth;
	}
}
