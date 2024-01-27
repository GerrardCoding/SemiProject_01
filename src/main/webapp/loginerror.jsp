<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
    // JSP 코드 내에서 직접 JavaScript 코드를 출력
    out.println("<script type=\"text/javascript\">");
    out.println("alert('로그인 실패입니다.');");
    out.println("window.location.href = 'login.do';"); // list.do 페이지로 이동
    out.println("</script>");
%>

</body>
</html>