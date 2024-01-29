package com.javalec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.dto.ProductDto;

public class ProductDao {
	DataSource dataSource;
	
	// Field
	String pronum;
	String brand;
	String proname;
	String color;
	int stock;
	int price;
	String imagename;
	
	// Constructor
	public ProductDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/semiproject_01"); // context 파일 위치

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<ProductDto> listMenu1() {
		ArrayList<ProductDto> dtos = new ArrayList<ProductDto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pronum, brand, proname, price, imagename from product";
			
			
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				pronum = resultSet.getString("pronum");
				brand = resultSet.getString("brand");
				proname = resultSet.getString("proname");
				price = resultSet.getInt("price");
				imagename = resultSet.getString("imagename");  // image 추가					
				
				
				ProductDto dto = new ProductDto(pronum, brand, proname, price, imagename);
				
				dtos.add(dto);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
					if(resultSet != null) resultSet.close();
					if(preparedStatement !=null) preparedStatement.close();
					if(connection !=null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return dtos;
	} // listMenu1
	
	public ArrayList<ProductDto> listMenu2() {
		ArrayList<ProductDto> dtos = new ArrayList<ProductDto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pronum, brand, proname, price, imagename from product ";
			String query1 = " where brand = 'nike'";
			
			preparedStatement = connection.prepareStatement(query + query1);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				pronum = resultSet.getString("pronum");
				brand = resultSet.getString("brand");
				proname = resultSet.getString("proname");
				price = resultSet.getInt("price");
				imagename = resultSet.getString("imagename");  // image 추가					
				
				
				ProductDto dto = new ProductDto(pronum, brand, proname, price, imagename);
				
				dtos.add(dto);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
					if(resultSet != null) resultSet.close();
					if(preparedStatement !=null) preparedStatement.close();
					if(connection !=null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return dtos;
	} // listMenu2
	
	public ArrayList<ProductDto> listMenu3() {
		ArrayList<ProductDto> dtos = new ArrayList<ProductDto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pronum, brand, proname, price, imagename from product ";
			String query1 = " where brand = 'adidas'";
			
			preparedStatement = connection.prepareStatement(query + query1);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				pronum = resultSet.getString("pronum");
				brand = resultSet.getString("brand");
				proname = resultSet.getString("proname");
				price = resultSet.getInt("price");
				imagename = resultSet.getString("imagename");  // image 추가					
				
				
				ProductDto dto = new ProductDto(pronum, brand, proname, price, imagename);
				
				dtos.add(dto);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
					if(resultSet != null) resultSet.close();
					if(preparedStatement !=null) preparedStatement.close();
					if(connection !=null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return dtos;
	} // listMenu3
	
	public ArrayList<ProductDto> listMenu4() {
		ArrayList<ProductDto> dtos = new ArrayList<ProductDto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pronum, brand, proname, price, imagename from product ";
			String query1 = " where brand = 'mischief'";
			
			preparedStatement = connection.prepareStatement(query + query1);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				pronum = resultSet.getString("pronum");
				brand = resultSet.getString("brand");
				proname = resultSet.getString("proname");
				price = resultSet.getInt("price");
				imagename = resultSet.getString("imagename");  // image 추가					
				
				
				ProductDto dto = new ProductDto(pronum, brand, proname, price, imagename);
				
				dtos.add(dto);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
					if(resultSet != null) resultSet.close();
					if(preparedStatement !=null) preparedStatement.close();
					if(connection !=null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return dtos;
	} // listMenu4
}
