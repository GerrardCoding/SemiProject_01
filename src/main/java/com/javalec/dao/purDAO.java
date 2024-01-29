package com.javalec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.javalec.dto.adminDTO;
import com.javalec.dto.purDTO;
import com.mysql.cj.Session;

public class purDAO {
	
DataSource dataSource;
	
	public purDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/semiproject_01"); //context.xml위치
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public boolean insertPurchase(purDTO product, HttpSession session) {

        purDTO DTO = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        boolean success = false;

        try {
            connection = dataSource.getConnection();
            String query ="INSERT INTO purchase ( id, pronum , purqty ,purprice, purdate,purcol,purbrand) VALUES ('"+session.getAttribute("userid")+"','"+session.getAttribute("pronum")+"', ? , ?, now(),?,?)";
            		
            preparedStatement = connection.prepareStatement(query);
            String userID = (String)session.getAttribute("userid");
            String pronum = (String)session.getAttribute("minpronum");
            //preparedStatement.setString(1, userID);
            //preparedStatement.setInt(2, pronum);
            preparedStatement.setInt(1, product.getQuantity());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getColor());
            preparedStatement.setString(4, product.getProductBrand());
            System.out.println(query);

            // 쿼리 실행
            int rowsAffected = preparedStatement.executeUpdate();

            // 삽입 성공 여부 확인
            success = (rowsAffected > 0);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 리소스 해제 코드 추가
        }

        return success;
    }
} 
	
	


