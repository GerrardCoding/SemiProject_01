package com.javalec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.dto.ProductList_Dto_JH;

public class ProductList_Dao_JH {
	DataSource dataSource;
	
	
	
	public ProductList_Dao_JH() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/semiproject_01"); // context 파일 위치

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	//전체검색
		public ArrayList<ProductList_Dto_JH> list(){
			ArrayList<ProductList_Dto_JH> dtos= new ArrayList<ProductList_Dto_JH>();
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			
			try {
				connection = dataSource.getConnection();
				String query="select pronum, brand, proname, color, stock, price, image from product";
				
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					String pronum = resultSet.getString("pronum");
					String brand=resultSet.getString("brand");
					String proname=resultSet.getString("proname");
					String color=resultSet.getString("color");
					int stock=resultSet.getInt("stock");
					int price=resultSet.getInt("price");
					byte[] image = resultSet.getBytes("image");  // image 추가					
					
					ProductList_Dto_JH dto = new ProductList_Dto_JH(pronum, brand, proname, color, stock, price, image);
					
					
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
		}
	
}
