package com.javalec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
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
	
	
	
	public List<brandDTO> getProductsByName(String productName) {
        List<brandDTO> products = new ArrayList<>();

        adminDTO DTO = null;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = datasource.getConnection();
            String query = "SELECT proname,color FROM product WHERE proname = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, productName );
            

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    brandDTO product = new brandDTO();
                    product.setProductName(resultSet.getString("proname"));
                    product.setProductCol(resultSet.getString("color"));
                    
                    
                    List<String> availableColors = getAvailableColorsForProduct(productName);
                    product.setAvailableColors(availableColors);
                    
                    products.add(product);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;}
        
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
	
	

        