package com.entity;

import java.sql.Date;

public class News {

	public News(){
		super();
	}
	//获取新闻
	public News(int id, String title, String content,Date time) {
		super();
		this.id=id;
		this.title=title;
		this.content=content;
		this.time=time;
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	private String title;
	private String content;
	private Date time;
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
