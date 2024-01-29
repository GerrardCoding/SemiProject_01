package com.javalec.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.dao.purDAO;
import com.javalec.dto.purDTO;

public class purCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		 String color = request.getParameter("color");
	        double price = Double.parseDouble(request.getParameter("price"));
	        String productBrand = request.getParameter("productbrand");

	        // 구매 수량은 1로 고정
	        int quantity = 1;

	        // HttpSession에서 현재 로그인한 사용자의 ID를 가져옴
	        HttpSession session = request.getSession();
	        String userId = (String) session.getAttribute("userId");
	        
	        // HttpSession에서 현재 선택한 제품의 pronum을 가져옴
	        String pronum = (String)   session.getAttribute("pronum");

	        // 구매 정보를 purDTO 객체에 담음
	        purDTO purchaseInfo = new purDTO();
	        purchaseInfo.setQuantity(quantity);
	        purchaseInfo.setPrice(price);
	        purchaseInfo.setColor(color);
	        purchaseInfo.setProductBrand(productBrand);

	        // 데이터베이스에 구매 정보를 삽입
	        purDAO purchaseDAO = new purDAO();
	        boolean success = purchaseDAO.insertPurchase(purchaseInfo, session);

	        if (success) {
	            // 성공적으로 구매 정보가 삽입되었을 경우의 처리
	            // 여기에 성공 메시지를 설정하거나, 다른 페이지로 리다이렉트하는 등의 작업을 수행할 수 있음
	            // 예: request.setAttribute("successMessage", "구매가 완료되었습니다.");
	            // forward 또는 redirect 등의 작업 추가
	        	 request.setAttribute("redirectURL", "succenss.jsp");
	        } else {
	            // 구매 정보 삽입 실패 시의 처리
	            // 여기에 실패 메시지를 설정하거나, 에러 페이지로 리다이렉트하는 등의 작업을 수행할 수 있음
	            // 예: request.setAttribute("errorMessage", "구매 정보 삽입에 실패했습니다.");
	            // forward 또는 redirect 등의 작업 추가
	        	 request.setAttribute("redirectURL", "erroe.jsp");
	        }
	    }
	}