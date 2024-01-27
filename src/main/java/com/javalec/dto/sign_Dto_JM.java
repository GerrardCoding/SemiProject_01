package com.javalec.dto;

import java.sql.Timestamp;

public class sign_Dto_JM {
	String id;
	String pw;
	String name;
	Timestamp date;
	
	
	public sign_Dto_JM() {
		
	}


	public sign_Dto_JM(String id, String pw, String name, Timestamp date) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.date = date;
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Timestamp getDate() {
		return date;
	}


	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	
	
}
