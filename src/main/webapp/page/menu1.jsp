<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%// ServletContext를 사용하여 업로드 경로를 가져옴
   request.setCharacterEncoding("UTF-8");
   ServletContext context = request.getServletContext();
   String uploadPath = context.getRealPath("/images"); 
	%>
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
<body>
	<div class="container">
		<h1>전체 상품</h1>
		<hr>
		<h2>Nike</h2>
		<hr>
		<div class="brand-list">
			<c:forEach items="${list}" var="dto">
				<div class="brand-card">
					<img class="brand-image"
						src="${pageContext.request.contextPath}/images/${dto.imagename}"
						alt="Brand Image">
					<div class="brand-info">
						<div class="brand-name">${dto.brand}</div>
						<div class="brand-description">${dto.proname}</div>
						<div class="brand-price" style="color: red;">${dto.price}원</div>
					</div>
				</div>
			</c:forEach>
		</div>
		<hr>
		<h2>Adidas</h2>
		<hr>
		<div class="brand-list">
			<%-- 브랜드 목록을 동적으로 생성하는 부분 (예제에서는 간단한 정적 데이터 사용) --%>
			<div class="brand-card">
				<img class="brand-image" src="./images/adidas01.jpg"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">아디다스</div>
					<div class="brand-description">퍼피렛</div>
					<div class="brand-price" style="color: red;">69,000원</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">나이키</div>
					<div class="brand-description">Impossible is Nothing.</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">조던</div>
					<div class="brand-description">Impossible is Nothing.</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">조던</div>
					<div class="brand-description">Impossible is Nothing.</div>
				</div>
			</div>
		</div>
		<hr>
		<h2>Mschf</h2>
		<hr>
		<div class="brand-list">
			<%-- 브랜드 목록을 동적으로 생성하는 부분 (예제에서는 간단한 정적 데이터 사용) --%>
			<div class="brand-card">
				<img class="brand-image" src="./images/adidas01.jpg"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">아디다스</div>
					<div class="brand-description">퍼피렛</div>
					<div class="brand-price">69,000원</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">나이키</div>
					<div class="brand-description">Impossible is Nothing.</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">조던</div>
					<div class="brand-description">Impossible is Nothing.</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">조던</div>
					<div class="brand-description">Impossible is Nothing.</div>
				</div>
			</div>
		</div>
		<br> <br>
	</div>
