package com.javalec.dto;

import com.javalec.dao.ProductDao;

public class purDTO {
	private String UserID;
	private int Pronum;
	private String productBrand;
    private String color;
    private int quantity;
    private double price;
    
    public purDTO() {
    	
    }

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		this.UserID = userID;
	}

	public int getPronum() {
		return Pronum;
	}

	public void setPronum(int pronum) {
		this.Pronum = pronum;
	}

	public purDTO(String productBrand, String color, int quantity, double price) {
		super();
		this.productBrand = productBrand;
		this.color = color;
		this.quantity = quantity;
		this.price = price;
	}

	public purDTO(String userID, int pronum, String productBrand, String color, int quantity, double price) {
		super();
		this.UserID = userID;
		this.Pronum = pronum;
		this.productBrand = productBrand;
		this.color = color;
		this.quantity = quantity;
		this.price = price;
	}
	
	
    
    

}
