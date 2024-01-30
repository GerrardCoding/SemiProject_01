<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%// ServletContext를 사용하여 업로드 경로를 가져옴
   request.setCharacterEncoding("UTF-8");
   ServletContext context = request.getServletContext();
   String uploadPath = context.getRealPath("/images"); 
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아디다스</title>
<link rel="stylesheet" href="./css/main.css">
<%@ include file="/common/bootstrap_common.jsp"%>
</head>
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
<body>
	<!-- ============================== [[ NavBar section]] ==============================-->

	<%@ include file="../include/navbar.jsp"%>

	<!-- ============================== [[ NavBar section]] ==============================-->
	<hr>
	<div class="container">
		<h1>아디다스</h1>
		<hr>
		<div class="brand-list">
			<c:forEach items="${list03}" var="dto">
				<a href="brandDetail.do?proname=${dto.proname}" class="brand-card">
					<img class="brand-image"
					src="${pageContext.request.contextPath}/images/${dto.imagename}"
					alt="Brand Image">
					<div class="brand-info">
						<div class="brand-description">${dto.proname}</div>
					</div>
				</a>
			</c:forEach>
		</div>
		<hr>
		<hr>
	</div>
	<hr>
	<!-- =============================  [[ Footer section ]]  ============================= -->
	<%@ include file="../include/footer.jsp"%>
	<!-- =============================  [[ Footer section ]]  ============================= -->
</body>
</html>