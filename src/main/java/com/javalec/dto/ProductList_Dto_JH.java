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
	String filepath;
	//구매현황
	
	// Constructor
	public ProductList_Dto_JH() {
		// TODO Auto-generated constructor stub
	}
	//byte[] image가 배열 형태로 저장되있기 때문에 이 배열값을 문자로 반환하는 매소
	 public String getBase64Image() {
	        return Base64.getEncoder().encodeToString(image);
	    }
	
	 byte[] image;  // 새로 추가한 필드
	//상품현황에서 사용하는 dto
	public ProductList_Dto_JH(String pronum, String brand, String proname, String color, int stock, int price, byte[] image) {
		super();
		this.pronum = pronum;
		this.brand = brand;
		this.proname = proname;
		this.color = color;
		this.stock = stock;
		this.price = price;
		this.image = image; 
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

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
}
