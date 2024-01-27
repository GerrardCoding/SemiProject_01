package com.javalec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class sign_Dao_JM {
	
	
	DataSource dataSource;
	
	
	
	public sign_Dao_JM() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/semi_project"); // context 파일 위치

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void write(String id, String pw, String name) {
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		
		try {
			connection = dataSource.getConnection();
			String query = "INSERT INTO customer (id, pw, name, date) VALUES (?, ?, ?, NOW());";
			preparedStatement =connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pw);
			preparedStatement.setString(3, name);
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
