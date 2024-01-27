package com.javalec.command;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.dto.adminDTO;
import com.javalec.dto.loginDTO;
import com.javalec.dao.adminDAO;
import com.javalec.dao.loginDAO;

public class loginCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
	            String id = request.getParameter("ID");
	            String pw = request.getParameter("PW");

	            loginDAO userdao = new loginDAO();
	            adminDAO admindao = new adminDAO();
	           
	            loginDTO user = userdao.view(id, pw);
	            com.javalec.dto.adminDTO admin = admindao.view(id, pw);
	            
	            
	            if (user != null && user.getPassword().equals(pw)) {
	                // Login successful
	                HttpSession session = request.getSession();
	                session.setAttribute("user", user);
	                // You can set additional attributes or redirect to a specific page
	                request.setAttribute("redirectURL", "loginSuccess.jsp");
	                System.out.println(user.getName());
	            } else if (admin != null && admin.getPassword().equals(pw)) {
	                // Administrator login successful
	                HttpSession session = request.getSession();
	                session.setAttribute("admin", admin);
	                System.out.println(admin.getName());

	                // You can set additional attributes or redirect to a specific admin page
	                request.setAttribute("redirectURL", "loginSuccess.jsp");
	            }
	                // Display a success message using JavaScript alert
	           
	            else {
	                // Login failed
	                request.setAttribute("redirectURL", "loginerror.jsp");

	                // Forward back to the login page with an error message
	            }
	        } 
	    }
	
	     
	     /*loginDAO dao = new loginDAO();
	     ArrayList<loginDTO> dtoList = dao.confirm(id, pw);
	     
	     response.setCharacterEncoding("UTF-8");
	     try(PrintWriter out=response.getWriter()){
	    	 if(!dtoList.isEmpty()) {
	    		 out.print("<script>alert('Login successful');</script>");
	    		 
	    	 }else {
	    		 out.print("<script>alert('Login failed');</script>");
	    		 response.sendRedirect("login.do");
	    	 }
	     }catch(IOException e) {
	    	 e.printStackTrace();
	     }
	}
}*/