package com.entity;

public class Company {

	public Company(){
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	private int id;
	private String content;
	public Company(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
}
