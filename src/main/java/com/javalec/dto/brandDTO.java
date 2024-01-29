package com.javalec.dto;

import java.util.List;

public class brandDTO {
	
	private String productName;
	private String productCol;
	private List<String> availableColors;
	
	
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
		
		
	    
	    
	}