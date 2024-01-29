package com.javalec.dao;

import java.util.Objects;

public class ProductKey {
	
	
	private String productbrand;
	private String productName;
	private String color;
	private double price;

// 생성자, getter, setter 등 필요한 메서드 추가

	public ProductKey(String productbrand, String productName, String color, double price) {
		super();
		this.productbrand = productbrand;
		this.productName = productName;
		this.color = color;
		this.price = price;
	}
	
	
@Override
public int hashCode() {
    return Objects.hash(productbrand,productName, color, price);
}








@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ProductKey that = (ProductKey) obj;
    return Double.compare(that.price, price) == 0 &&
            Objects.equals(productbrand, that.productbrand) &&
            Objects.equals(productName, that.productName) &&
            Objects.equals(color, that.color);
}


}



