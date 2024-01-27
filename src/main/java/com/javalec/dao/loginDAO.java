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
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/semiproject_01"); //context.xml위치
			
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
	
	/*public ArrayList<loginDTO> confirm(String id, String pw){
		ArrayList<loginDTO> dtolist1 = new ArrayList<loginDTO>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		
		try {
			String query = "select id,pw,name from customer";
			String query1=" where id='"+id+"' and  pw='"+pw+"'";

			Connection conn_mysql = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				/*SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
	            KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALT.getBytes(), 65536, 256);
	            SecretKey tmp = factory.generateSecret(spec);
	            SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");
	            Cipher cipher = Cipher.getInstance("AES");
	            cipher.init(Cipher.DECRYPT_MODE, secret);

				byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(pw));
				pw =  new String(decryptedBytes);
				String wkid = resultSet.getString(1);
				String wkpw=resultSet.getString(2);
				String wkname = resultSet.getString(3);
				
				loginDTO dto = new loginDTO(wkid,wkpw,wkname);
				dtolist1.add(dto);
				}
			conn_mysql.close();
			
		}catch (Exception e) {
	
		}return dtolist1;}*/
	
	
	   public loginDTO view(String id, String pw) {

	        loginDTO DTO = null;

	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;

	        try {
	            connection = dataSource.getConnection();
	            String query = "SELECT id, pw, name FROM customer WHERE id = ? AND pw = ?";
	            preparedStatement = connection.prepareStatement(query);
	            preparedStatement.setString(1, id);
	            preparedStatement.setString(2, pw);
	            resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                String name = resultSet.getString("name");
	                DTO = new loginDTO(id, pw, name); // Assuming loginDTO constructor takes id, pw, and name
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

