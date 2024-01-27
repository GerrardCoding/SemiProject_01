<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <!-- ============================= [[ Carousel section]] ============================= -->

	<%-- <jsp:include page="./main/carousel.jsp" /> --%>

    <!-- ============================= [[ Carousel section]] ============================= -->
    <!-- =============================  [[ Card section ]]  ============================= -->

	<%-- <jsp:include page="./main/card.jsp" /> --%>

    <!-- =============================  [[ Card section ]]  ============================= -->
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

	<%@ include file="./main/footer.jsp" %>

    <!-- =============================  [[ Footer section ]]  ============================= -->
</body>
</html>