package com.javalec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.javalec.dto.adminDTO;
import com.javalec.dto.brandDTO;

public class brandDAO {
	
	DataSource datasource;
	
	public brandDAO() {
		try {
			Context context = new InitialContext();
			datasource = (DataSource)context.lookup("java:comp/env/jdbc/semiproject_01"); //context.xml위치
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public List<brandDTO> getProductsByName(String productName, HttpSession session) {
	    List<brandDTO> products = new ArrayList<>();

	    Connection connection = null;
	    PreparedStatement preparedStatement = null;

	    try {
	        connection = datasource.getConnection();
	        String query = "SELECT pronum, brand, proname, color, price,imagename FROM product WHERE proname = ?";
	        preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setString(1, productName);

	        try (ResultSet resultSet = preparedStatement.executeQuery()) {
	            while (resultSet.next()) {
	                brandDTO product = new brandDTO();
	                //String pronum = resultSet.getString("pronum");

	                // 최소 pronum을 세션에 저장 (처음에 한 번만 저장됨)
	              //  if (session.getAttribute("Pronum") == null) {
	               //     session.setAttribute("Pronum", pronum);
	               // }

	               // product.setProductnum(pronum);
	                product.setProductbrand(resultSet.getString("brand"));
	                product.setProductName(resultSet.getString("proname"));
	                product.setProductCol(resultSet.getString("color"));
	                product.setProductprice(resultSet.getInt("price"));
	                product.setImagename(resultSet.getString("imagename"));

	                List<String> availableColors = getAvailableColorsForProduct(productName);
	                product.setAvailableColors(availableColors);
	                System.out.println(resultSet.getString("imagename"));
	                products.add(product);
	            }
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return products;
	}
	
	
	private List<String> getAvailableColorsForProduct(String productName) {
	    List<String> colors = new ArrayList<>();

	    Connection connection = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;

	    try {
	        connection = datasource.getConnection();
	        String query = "SELECT DISTINCT color FROM product WHERE proname = ?";
	        preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setString(1, productName);

	        resultSet = preparedStatement.executeQuery();

	        while (resultSet.next()) {
	            String color = resultSet.getString("color");
	            colors.add(color);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        // 리소스 정리
	        try {
	            if (resultSet != null) resultSet.close();
	            if (preparedStatement != null) preparedStatement.close();
	            if (connection != null) connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return colors;
	}
    }
	
	
