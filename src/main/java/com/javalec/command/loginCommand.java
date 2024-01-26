package com.javalec.command;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.dto.loginDTO;
import com.javalec.dao.loginDAO;

public class loginCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		  try {
	            String id = request.getParameter("id");
	            String pw = request.getParameter("pw");

	            loginDAO dao = new loginDAO();
	            loginDTO user = dao.view(id, pw);

	            if (user != null && user.getPassword().equals(pw)) {
	                // Login successful
	                HttpSession session = request.getSession();
	                session.setAttribute("user", user);

	                // You can set additional attributes or redirect to a specific page
	                request.setAttribute("redirectURL", "dashboard.jsp");
	            } else {
	                // Login failed
	                request.setAttribute("errorMessage", "Invalid login credentials");

	                // Forward back to the login page with an error message
	                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
	                dispatcher.forward(request, response);
	            }
	        } catch (ServletException | IOException e) {
	            e.printStackTrace(); // Handle the exception as appropriate for your application
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