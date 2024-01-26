package com.javalec.dto;

import java.sql.Timestamp;

public class loginDTO {
	int bId;
	String bName;
	String bTitle;
	String bContent;
	Timestamp bDate;
	
	public loginDTO(String retrievedBName, String retrievedBTitle, String retrievedBContent, int bld1) {
		
	}
	
	
	
	

	public loginDTO(String bName, String bTitle, String bContent, Timestamp bDate) {
		super();
		this.bName = bName;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
	}





	public loginDTO(int bId, String bName, String bTitle, String bContent) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bTitle = bTitle;
		this.bContent = bContent;
	}





	public loginDTO(int bId, String bName, String bTitle, String bContent, Timestamp bDate) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public Timestamp getbDate() {
		return bDate;
	}

	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}
	

}
