package com.javalec.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.dao.brandDAO;
import com.javalec.dto.brandDTO;

public class brandCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		 String brandName = request.getParameter("proname");
		 HttpSession session = request.getSession();

		 brandDAO dao = new brandDAO();

		    // DAO 메서드 호출하여 데이터 가져오기
		 List<brandDTO> products = dao.getProductsByName(brandName, session);

		    // 가져온 데이터를 request에 저장
		    request.setAttribute("selectedBrand", brandName);
		    request.setAttribute("products", products);
		}}