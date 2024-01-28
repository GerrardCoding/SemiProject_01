package com.javalec.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.dao.ProductList_Dao_JH;
import com.javalec.dto.ProductList_Dto_JH;

public class SProductSearchCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	//Dao로 요청해서 dto를 생성한다.
		
		//
		ProductList_Dao_JH dao = new ProductList_Dao_JH();
		ArrayList<ProductList_Dto_JH> dtos = dao.list();
		request.setAttribute("list", dtos);
		
	}

}
