package com.javalec.dto;


public class ImageDTO {
	// Field
	String pronum;
	String brand;
	String proname;
	String color;
	int stock;
	int price;
	String imagename;

	public ImageDTO() {
		// TODO Auto-generated constructor stub
	}

	public ImageDTO(String pronum, String brand, String proname, String color, int stock, int price, String imagename) {
		super();
		this.pronum = pronum;
		this.brand = brand;
		this.proname = proname;
		this.color = color;
		this.stock = stock;
		this.price = price;
		this.imagename = imagename;
	}

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
