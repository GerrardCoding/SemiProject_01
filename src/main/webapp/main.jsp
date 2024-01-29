<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)session.getAttribute("id");
	String menu = request.getParameter("menu");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
<link rel="stylesheet" href="./css/main.css">
<%@ include file="/common/bootstrap_common.jsp"%>
</head>
<body>
    <!-- ============================== [[ NavBar section]] ==============================-->
    
	<%@ include file="./include/navbar.jsp" %>
	
    <!-- ============================== [[ NavBar section]] ==============================-->
    
    <!-- ============================== [[ Body  section]] ==============================-->
    <hr>
    <%
    	if(menu == null){
    %>
    <!-- ============================= [[ Carousel section]] ============================= -->
    
	<jsp:include page="./include/carousel.jsp" />
	
    <!-- ============================= [[ Carousel section]] ============================= -->
    		
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
    	else if("menu4".equals(menu)){
 	%>
 	<jsp:include page="./page/menu4.jsp" />
 	<%
    	}
 	%>
    <!-- ============================== [[ Body  section]] ==============================-->
   		<hr>
    <!-- =============================  [[ Footer section ]]  ============================= -->
	<%@ include file="./include/footer.jsp" %>
    <!-- =============================  [[ Footer section ]]  ============================= -->
</body>
</html>