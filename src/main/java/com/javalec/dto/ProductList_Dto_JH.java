package com.javalec.dto;

import java.util.Base64;

public class ProductList_Dto_JH {
	
	// Field
	String pronum;
	String brand;
	String proname;
	String color;
	int stock;
	int price;
	String imagename;
	//구매현황
	
	// Constructor
	public ProductList_Dto_JH() {
		// TODO Auto-generated constructor stub
	}
	//byte[] imagename가 배열 형태로 저장되있기 때문에 이 배열값을 문자로 반환하는 매소
	
	//상품현황에서 사용하는 dto
	public ProductList_Dto_JH(String pronum, String brand, String proname, String color, int stock, int price, String imagename) {
		super();
		this.pronum = pronum;
		this.brand = brand;
		this.proname = proname;
		this.color = color;
		this.stock = stock;
		this.price = price;
		this.imagename = imagename; 
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

	public String getImagename() {
		return imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}


	
}
