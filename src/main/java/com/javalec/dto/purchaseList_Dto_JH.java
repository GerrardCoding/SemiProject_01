package com.javalec.dto;


public class purchaseList_Dto_JH {
	
	// Field
	String pronum;
	String brand;
	String proname;
	String color;
	//구매현황
	String purdate;
	int purseq;
	int purqty;
	int purprice;
	
	// Constructor
	public purchaseList_Dto_JH() {
		// TODO Auto-generated constructor stub
	}
	
	//구매현황에서 사용하는 dto
	public purchaseList_Dto_JH(String pronum, String brand, String proname, String color, String purdate, int purseq,
			int purqty, int purprice) {
		super();
		this.pronum = pronum;
		this.brand = brand;
		this.proname = proname;
		this.color = color;
		this.purdate = purdate;
		this.purseq = purseq;
		this.purqty = purqty;
		this.purprice = purprice;
	}
	

	// Method
	public String getPronum() {
		return pronum;
	}

	public void setPronum(String pronum) {
		this.pronum = pronum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPurdate() {
		return purdate;
	}
	public void setPurdate(String purdate) {
		this.purdate = purdate;
	}

	public int getPurseq() {
		return purseq;
	}

	public void setPurseq(int purseq) {
		this.purseq = purseq;
	}

	public int getPurqty() {
		return purqty;
	}

	public void setPurqty(int purqty) {
		this.purqty = purqty;
	}

	public int getPurprice() {
		return purprice;
	}

	public void setPurprice(int purprice) {
		this.purprice = purprice;
	}
	
}
