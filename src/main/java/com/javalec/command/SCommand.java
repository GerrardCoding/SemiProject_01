package com.javalec.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SCommand {
	
	// 인터페이스는 메소드 이름만 만들어줌 (메소드 이름 통일) - 개조 시방서
		public void execute(HttpServletRequest request, HttpServletResponse response);
}
