package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.dto.loginDTO;

public class loginDAO {
	
	DataSource dataSource;
	
	public loginDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/mvc"); //context.xml위치
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void write(String bName,String bTitle, String bContent) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = dataSource.getConnection();
			String query="insert into mvc_board (bName,bTitle,bContent,bDate) values (?,?,?,now())";
			
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bName);
			preparedStatement.setString(2, bTitle);
			preparedStatement.setString(3, bContent);
			
			preparedStatement.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
					if(preparedStatement !=null) preparedStatement.close();
					if(connection !=null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
	}
		
		
	}
	
	public loginDTO view(String bld) {
		
		loginDTO dto_viewContent =null;
		int bld_int = Integer.parseInt(bld);
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query="select bName,bTitle,bContent,bDate from mvc_board where bld= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bld);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String view_bName=resultSet.getString("bName");
				String view_bTitle=resultSet.getString("bTitle");
				String view_bContent=resultSet.getString("bContent");
				Timestamp bDate=resultSet.getTimestamp("bDate");
				
				dto_viewContent = new loginDTO(view_bName, view_bTitle, view_bContent,bDate);}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
						if(preparedStatement !=null) preparedStatement.close();
						if(connection !=null) connection.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				
		}
			
			
		return dto_viewContent;
	
}}
