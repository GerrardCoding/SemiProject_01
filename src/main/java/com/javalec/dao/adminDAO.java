package com.javalec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.dto.adminDTO;
import com.javalec.dto.loginDTO;



public class adminDAO {
	
	DataSource datasource;
	
	public adminDAO() {
		try {
			Context context = new InitialContext();
			datasource = (DataSource)context.lookup("java:comp/env/jdbc/semiproject_01"); //context.xml위치
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public adminDTO view(String id, String pw) {

        adminDTO DTO = null;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = datasource.getConnection();
            String query = "SELECT adminid, adminpw, name FROM admin WHERE adminid = ? AND adminpw = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, pw);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                DTO = new adminDTO(id, pw, name); // Assuming loginDTO constructor takes id, pw, and name
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return DTO;
    }
}

	
	

	
	
	
	
	
	
	
	
	
	
	

