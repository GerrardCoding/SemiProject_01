package com.javalec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.dto.purchaseList_Dto_JH;

public class purchaseList_Dao_JH {
	DataSource dataSource;
	
	
	
	public purchaseList_Dao_JH() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/semiproject_01"); // context 파일 위치

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	//전체검색
		public ArrayList<purchaseList_Dto_JH> list(){
			ArrayList<purchaseList_Dto_JH> dtos= new ArrayList<purchaseList_Dto_JH>();
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			
			try {
				connection = dataSource.getConnection();
				String query="SELECT p.purseq, p.pronumber, pr.brand,pr.proname, pr.color, p.purqty, p.purprice, p.purdate\n"
						+ "FROM purchase p\n"
						+ "JOIN product pr ON p.pronumber = pr.pronum;";
				
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					int purseq = resultSet.getInt("purseq");
					String pronumber=resultSet.getString("pronumber");
					String brand=resultSet.getString("brand");
					String proname=resultSet.getString("proname");
					String color=resultSet.getString("color");
					int purqty=resultSet.getInt("purqty");
					int purprice=resultSet.getInt("purprice");
					String purdate=resultSet.getString("purdate");
					
					purchaseList_Dto_JH dto = new purchaseList_Dto_JH(pronumber, brand, proname, color, purdate, purseq, purqty, purprice);
					
					
					
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
