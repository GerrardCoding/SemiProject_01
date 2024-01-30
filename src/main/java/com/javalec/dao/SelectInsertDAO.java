package com.javalec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

public class SelectInsertDAO {
    private DataSource dataSource;

    public SelectInsertDAO() {
        try {
            Context context = new InitialContext();
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/semiproject_01");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    // 선택된 color와 productName을 조건으로 product 테이블을 조회하고, Purchase 테이블에 데이터를 삽입하는 메서드
    public boolean processSelectInsert(String color, String proname, double price, String brand,HttpSession session) {
        Connection conn = null;
        PreparedStatement pstmtSelect = null;
        PreparedStatement pstmtInsert = null;
        ResultSet rs = null;
        boolean success = false;

        try {
            conn = dataSource.getConnection();

            // product 테이블 조회를 위한 쿼리 (product_num만 조회)
            String selectQuery = "SELECT pronum FROM product " +
                                 "WHERE color = ? AND proname = ?";
            pstmtSelect = conn.prepareStatement(selectQuery);
            pstmtSelect.setString(1, color);
            pstmtSelect.setString(2, proname);
            rs = pstmtSelect.executeQuery();
            System.out.println(selectQuery);

            // product_num이 조회되면 Purchase 테이블에 데이터를 삽입하는 쿼리
            if (rs.next()) {
                String pronum = rs.getString("pronum");

                String insertQuery = "INSERT INTO purchase (id, pronumber, purqty,purprice, purdate,purcol,purbrand) " +
                                     "VALUES ('"+session.getAttribute("userid")+"', ?, 1, ?, now(),?,?)";
                pstmtInsert = conn.prepareStatement(insertQuery);
                pstmtInsert.setString(1, pronum);
                pstmtInsert.setDouble(2, price);
                pstmtInsert.setString(3, color);
                pstmtInsert.setString(4, brand);
                int rowsAffected = pstmtInsert.executeUpdate();
                System.out.println(insertQuery);

                // 삽입 성공 여부 확인
                success = (rowsAffected > 0);}
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // 리소스 해제 코드 추가
            }

            return success;
        
    } }