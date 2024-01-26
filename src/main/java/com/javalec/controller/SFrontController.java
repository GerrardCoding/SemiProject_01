package com.javalec.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.command.SCommand;
import com.javalec.command.loginCommand;

/**
 * Servlet implementation class SFrontController
 */
@WebServlet("*.do")
public class SFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SFrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("dopost");
		actionDo(request, response);// 유지보수때문에
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("actionDo");
		request.setCharacterEncoding("utf-8");

		// session
		HttpSession session = request.getSession();// 세션정의 (컨트롤러)
		
		
		SCommand command = null;
		String viewPage =null;
		
		
		String uri= request.getRequestURI();//uri=> 뒤에 쓴것만 가져오
		System.out.println(uri);
		String conPath = request.getContextPath();///MVCBoard
		System.out.println(conPath);
		String com = uri.substring(conPath.length());
		System.out.println(com);
		switch(com) {
		case("/login.do"):
//			session.setAttribute("test", "aaa");//세션 사용은 이렇
			//command.execute(request, response);
			viewPage ="login.jsp";
			break;
		case("/logintest.do"):
			 command = new loginCommand();
        	command.execute(request, response);

        // The loginCommand has set attributes or forwarded appropriately
        // No need to forward again here

        // If you want to redirect after a successful login, you can do it here
        String redirectURL = (String) request.getAttribute("redirectURL");
        if (redirectURL != null) {
            response.sendRedirect(redirectURL);
            return; // Important to avoid forwarding after redirect
        }
        break;
    default:
        break;
}

RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
dispatcher.forward(request, response);
}
}