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
 <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #F8F9FA;
            padding: 20px;
        }
        h1 {
            color: #343A40;
            text-align: center;
        }
        .brand-list {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 20px;
        }
        .brand-card {
            border: 1px solid #DEE2E6;
            border-radius: 8px;
            overflow: hidden;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            background-color: #FFFFFF;
            transition: transform 0.3s ease-in-out;
            width: 200px;
        }
        .brand-card:hover {
            transform: scale(1.05);
        }
        .brand-image {
            width: 100%;
            height: 150px;
            object-fit: cover;
        }
        .brand-info {
            padding: 15px;
        }
        .brand-name {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 10px;
        }
        .brand-description {
            font-size: 14px;
            color: #495057;
        }
    </style>
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