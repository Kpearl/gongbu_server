package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	private String name; //이름
	private String id;   //아이디
	private String phone; //휴대폰 번호
	private String email; //이메일

	public User(@JsonProperty("name") String name, @JsonProperty("id") String id, @JsonProperty("phone") String phone, @JsonProperty("email") String email) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.email = email;
	}
	
	public String pintUser() {
		return this.name + " " + this.id + " " + this.phone + " " + this.email;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
