package com.javalec.dto;

import java.util.List;

public class brandDTO {
	
	private String productName;
	private String productCol;
	private List<String> availableColors;
	private String productbrand;
	private double productprice;
	private String productnum;
	
	
	public brandDTO() {
		
	}
	
	   public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

		public String getProductCol() {
			return productCol;
		}

		public void setProductCol(String productCol) {
			this.productCol = productCol;
		}

		public List<String> getAvailableColors() {
			return availableColors;
		}

		public void setAvailableColors(List<String> availableColors) {
			this.availableColors = availableColors;
		}

		public String getProductbrand() {
			return productbrand;
		}

		public void setProductbrand(String productbrand) {
			this.productbrand = productbrand;
		}

		public double getProductprice() {
			return productprice;
		}

		public void setProductprice(double productprice) {
			this.productprice = productprice;
		}

		public String getProductnum() {
			return productnum;
		}

		public void setProductnum(String productnum) {
			this.productnum = productnum;
		}

		public brandDTO(String productName, String productCol, List<String> availableColors, String productbrand,
				double productprice, String productnum) {
			super();
			this.productName = productName;
			this.productCol = productCol;
			this.availableColors = availableColors;
			this.productbrand = productbrand;
			this.productprice = productprice;
			this.productnum = productnum;
		}
		
		
		
		
		
	    
	    
	}