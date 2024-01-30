package com.javalec.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.dao.SelectInsertDAO;

public class SelectInsertCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		System.out.println("1");
		 String color = request.getParameter("color");
	        String productName = request.getParameter("productName");
	        double price = Double.parseDouble(request.getParameter("price"));
	        String productBrand = request.getParameter("productbrand");

	        // 현재 세션을 가져와서 사용자 ID를 추출
	        HttpSession session = request.getSession();
	        String userId = (String) session.getAttribute("userid");

	        // SelectInsertDAO 인스턴스 생성
	        SelectInsertDAO selectInsertDAO = new SelectInsertDAO();

	        // 데이터 삽입 성공 여부 확인
	        boolean success = selectInsertDAO.processSelectInsert(color, productName, price, productBrand, session);

	        // 성공 여부에 따라 적절한 페이지 경로 반환
	        if (success) {
	        	 request.setAttribute("redirectURL", "success.jsp");
	        } else {
	        	 request.setAttribute("redirectURL", "fail.jsp");
	        }
	    }
	}