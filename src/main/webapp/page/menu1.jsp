<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 상품 정보</title>
</head>
<body>
	<div class="container">
	<h2>전체</h2>
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