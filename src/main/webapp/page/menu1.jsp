<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<div class="container">
		<h1>전체 상품</h1>
		<hr>
		<h2>Nike</h2>
		<hr>
		<div class="brand-list">

            <%-- 브랜드 목록을 동적으로 생성하는 부분 (예제에서는 간단한 정적 데이터 사용) --%>
           <form id="aaa" action="aaa.do" method="post">
            <div class="brand-card">
                <img class="brand-image" src="https://via.placeholder.com/200" alt="Brand Image">
                <div class="brand-info">
                    <div class="brand-name">에어포스</div>
                    <div class="brand-description">Impossible is Nothing.</div>
                </div>
            </div>
            
            </form>
            <div class="brand-card">
                <img class="brand-image" src="https://via.placeholder.com/200" alt="Brand Image">
                <div class="brand-info">
                    <div class="brand-name">조던</div>
                    <div class="brand-description">Impossible is Nothing.</div>
                </div>
            </div>
            <%-- 추가 브랜드 카드들을 원하는 만큼 추가할 수 있습니다. --%>
        </div>
   		<br><br>
	</div>
</body>
</html>
=======
			<%-- 브랜드 목록을 동적으로 생성하는 부분 (예제에서는 간단한 정적 데이터 사용) --%>
			<div class="brand-card">
				<img class="brand-image" src="./images/adidas01.jpg" alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">에어맥스</div>
					<div class="brand-description">Nike</div>
					<div class="brand-price">100,000원</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">에어포스</div>
					<div class="brand-description">Nike</div>
					<div class="brand-price">80,000원</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">페가수스</div>
					<div class="brand-description">Nike</div>
					<div class="brand-price">110,000원</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">레볼루션</div>
					<div class="brand-description">Nike</div>
					<div class="brand-price">110,000원</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">레볼루션</div>
					<div class="brand-description">Nike</div>
					<div class="brand-price">110,000원</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">레볼루션</div>
					<div class="brand-description">Nike</div>
					<div class="brand-price">110,000원</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">레볼루션</div>
					<div class="brand-description">Nike</div>
					<div class="brand-price">110,000원</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">레볼루션</div>
					<div class="brand-description">Nike</div>
					<div class="brand-price">110,000원</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">레볼루션</div>
					<div class="brand-description">Nike</div>
					<div class="brand-price">110,000원</div>
				</div>
			</div>
			<div class="brand-card">
				<img class="brand-image" src="https://via.placeholder.com/200"
					alt="Brand Image">
				<div class="brand-info">
					<div class="brand-name">레볼루션</div>
					<div class="brand-description">Nike</div>
					<div class="brand-price">110,000원</div>
				</div>
			</div>
		</div>
		<hr>
		<h2>Adidas</h2>
		<hr>
				<div class="brand-list">
			<%-- 브랜드 목록을 동적으로 생성하는 부분 (예제에서는 간단한 정적 데이터 사용) --%>
			<div class="brand-card">
				<img class="brand-image" src="./images/adidas01.jpg" alt="Brand Image">
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
		<hr>
		<h2>Mschf</h2>
		<hr>
				<div class="brand-list">
			<%-- 브랜드 목록을 동적으로 생성하는 부분 (예제에서는 간단한 정적 데이터 사용) --%>
			<div class="brand-card">
				<img class="brand-image" src="./images/adidas01.jpg" alt="Brand Image">
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

