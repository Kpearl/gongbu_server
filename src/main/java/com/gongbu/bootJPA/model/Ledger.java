package com.gongbu.bootJPA.model;

import java.sql.Date;

public class Ledger {
	private Date day; //사용 연월일
	private String id; //가계부 아이디
	private String saver; //저장자
	private String cost; //비용
	private String note; //지출 내용
	private String spender; //사용한 사람
	private String category; //카테고리
	
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSaver() {
		return saver;
	}
	public void setSaver(String saver) {
		this.saver = saver;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getSpender() {
		return spender;
	}
	public void setSpender(String spender) {
		this.spender = spender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
