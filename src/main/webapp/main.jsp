<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String s_id = (String)session.getAttribute("s_id");
	String menu = request.getParameter("menu");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
</head>
<body>
    <!-- ============================== [[ NavBar section]] ==============================-->
    
	<%@ include file="./include/navbar.jsp" %>
	
    <!-- ============================== [[ NavBar section]] ============================== -->
    <%
    	if(menu == null){
    %>
    <%
    	}
    	else if("menu1".equals(menu)){
    %>
    <jsp:include page="./page/menu1.jsp" />
    <%
    	}
    	else if("menu2".equals(menu)){
    %>
    <jsp:include page="./page/menu2.jsp" />
 	<%
    	}
    	else if("menu3".equals(menu)){
 	%>
 	<jsp:include page="./page/menu3.jsp" />
 	<%
    	}
 	%>
    <!-- =============================  [[ Footer section ]]  ============================= -->

	<%@ include file="./include/footer.jsp" %>

    <!-- =============================  [[ Footer section ]]  ============================= -->
</body>
</html>