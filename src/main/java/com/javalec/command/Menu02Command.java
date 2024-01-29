package com.javalec.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.dao.ProductDao;
import com.javalec.dto.ProductDto;

public class Menu02Command implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		ProductDao dao = new ProductDao();
		// DAO 메서드 호출하여 데이터 가져오기
		ArrayList<ProductDto> dtos =  dao.listMenu2(); // 1개의 값을 가져온다
		
		request.setAttribute("list02", dtos);
		 
		}
}