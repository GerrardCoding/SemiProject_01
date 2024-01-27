package com.javalec.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.dao.sign_Dao_JM;

public class SsignInsertCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		 String id = request.getParameter("id");
		 String pw = request.getParameter("pw");
		 String name = request.getParameter("name");
		
		 sign_Dao_JM dao = new sign_Dao_JM();
		 dao.write(id, pw, name);
	}

}
