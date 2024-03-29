package com.javalec.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.command.ImageUploadCommand;
import com.javalec.command.Menu01Command;
import com.javalec.command.Menu02Command;
import com.javalec.command.Menu03Command;
import com.javalec.command.Menu04Command;
import com.javalec.command.SCommand;
import com.javalec.command.SProductSearchCommand;
import com.javalec.command.SPurchaseSearchCommand;
import com.javalec.command.SelectInsertCommand;
import com.javalec.command.SsignInsertCommand;
import com.javalec.command.brandCommand;
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
		case("/login.do"): // 로그인 페이지
			session.invalidate();
//			command = new BListCommand();
//			command.execute(request, response);
			viewPage ="login.jsp";
			break;
		case("/sign.do"): // 회원 가입 페이지
			viewPage ="sign.jsp";
			break;
		case("/signInsert.do"):
			command = new SsignInsertCommand();
			command.execute(request, response);
			viewPage = "login.do";
			break;
		case("/admin.do"): // 관리자 페이지
//			command.execute(request, response);
			viewPage ="admin.jsp";
			break;
		case("/main.do"): // 메인 페이지
//			command.execute(request, response);
			viewPage ="main.jsp";
			break;
		case ("/logintest.do"):
            command = new loginCommand();
            command.execute(request, response);
            viewPage = (String) request.getAttribute("redirectURL"); // Check if redirectURL is set
            break;
		case("/productstatus.do"): // 상품 정보 페이지(관리자)
			command = new SProductSearchCommand();
			command.execute(request, response);
			viewPage ="productstatus.jsp";
			break;
		case("/purchasestatus.do"): // 구매현황 페이지(관리자)
			command = new SPurchaseSearchCommand();
			command.execute(request, response);
			viewPage ="purchasestatus.jsp";
			break;
		case("/uploadImage.do"):
		    command = new ImageUploadCommand(); // 새로운 커맨드 클래스를 만들어야 함
		    command.execute(request, response);
		    viewPage = "productstatus.do"; // 이미지 업로드 후 다시 상품 정보 페이지로 이동
		    break;
		case("/brandDetail.do"): // 구매현황 페이지(관리자)
			command = new brandCommand();
			command.execute(request, response);
			viewPage ="brandDetail.jsp";
			break;
		case("/menu1.do"): // 전체 상품
			command = new Menu01Command();
			command.execute(request, response);
			viewPage ="./page/menu1.jsp";
			break;
		case("/menu2.do"): // 나이키 상품
			command = new Menu02Command();
			command.execute(request, response);
			viewPage ="./page/menu2.jsp";
			break;
		case("/menu3.do"): // 아이다스 상품
			command = new Menu03Command();
			command.execute(request, response);
			viewPage ="./page/menu3.jsp";
		break;
		case("/menu4.do"): // 미스치프 상품
			command = new Menu04Command();
			command.execute(request, response);
			viewPage ="./page/menu4.jsp";
		break;
		case("/purchase.do"): // 미스치프 상품
			System.out.println("1");
			command = new SelectInsertCommand();
			command.execute(request, response);
			viewPage = (String) request.getAttribute("redirectURL");
			System.out.println(viewPage);
		break;
		default:
			break;
		
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}//actiondo

}