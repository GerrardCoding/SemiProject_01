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
    %>
    <!-- ============================== [[ Body  section]] ==============================-->
   		<hr>
    <!-- =============================  [[ Footer section ]]  ============================= -->
	<%@ include file="./include/footer.jsp" %>
    <!-- =============================  [[ Footer section ]]  ============================= -->
</body>
</html>