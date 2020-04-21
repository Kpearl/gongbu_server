package com.example.demo.model;

public class Page {
	private int count; //화면 출력 갯수
	private int period; //기간 조회
	private int page; //페이지
	private int total; //전체 갯수

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotla(int total) {
		this.total = total;
	}
}
