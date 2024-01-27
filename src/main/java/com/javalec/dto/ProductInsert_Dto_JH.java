package com.javalec.dto;

public class ProductInsert_Dto_JH {
	
	// Field
	String pronum;
	String brand;
	String proname;
	String color;
	int stock;
	int price;
	
	// Constructor
	public ProductInsert_Dto_JH() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductInsert_Dto_JH(String pronum, String brand, String proname, String color, int stock, int price) {
		super();
		this.pronum = pronum;
		this.brand = brand;
		this.proname = proname;
		this.color = color;
		this.stock = stock;
		this.price = price;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
