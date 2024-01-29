package com.javalec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class ImageDAO {
	DataSource dataSource;
	
	
	
	public ImageDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/semiproject_01"); // context 파일 위치

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void write(String pronum, String brand, String proname, String color, int stock, int price, String imagename) {
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		
		try {
			connection = dataSource.getConnection();
			String query = "INSERT INTO product (pronum, brand, proname, color, stock, price,imagename) VALUES (?, ?, ?, ?, ?, ?,? );";
			preparedStatement =connection.prepareStatement(query);
			preparedStatement.setString(1, pronum);
			preparedStatement.setString(2, brand);
			preparedStatement.setString(3, proname);
			preparedStatement.setString(4, color);
			preparedStatement.setInt(5, stock);
			preparedStatement.setInt(6, price);
			preparedStatement.setString(7, imagename);
			
			preparedStatement.executeUpdate();
			
					
		}catch (Exception e) {
			e.printStackTrace();
		}finally {//메모리 정리용도로 많이 씀(만든거랑 거꾸로)
			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection != null) connection.close();
					
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}//write
}
