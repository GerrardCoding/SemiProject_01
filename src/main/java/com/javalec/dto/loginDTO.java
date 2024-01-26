package com.javalec.dto;

import java.sql.Timestamp;

public class loginDTO {
	String id;
	String password;
	String name;
	
	public loginDTO() {
		
		
	}

	public loginDTO(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public loginDTO(String name) {
		super();
		this.name = name;
	}
	
	



}