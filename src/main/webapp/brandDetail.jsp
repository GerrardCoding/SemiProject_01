<%@page import="com.javalec.dto.brandDTO"%>
<%@page import="java.util.List"%>
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
    // 제품 정보를 받아옴
    List<brandDTO> products = (List<brandDTO>) request.getAttribute("products");

    // 첫 번째 제품만 선택되도록 초기화
    boolean isFirstProduct = true;

    // 받아온 제품 정보를 반복문으로 출력
    for (brandDTO product : products) {
%>
    <div>
        <% if (isFirstProduct) { %>
            <p>Product Name: <%= product.getProductName() %></p>
        <% } %>
        
        <!-- 여기에 색상 정보를 받아와서 라디오 버튼으로 출력하는 부분을 추가 -->
        <form action="purchase.do" method="post">
            <label for="color<%= product.getProductName() %>">Color:</label>
            <%
                // brandDTO에서 색상 정보를 가져와서 반복문으로 라디오 버튼 생성
                List<String> availableColors = product.getAvailableColors();
                for (String color : availableColors) {
            %>
                <input type="radio" id="color<%= product.getProductName() %>" name="color" value="<%= color %>" <% if (isFirstProduct) { %>checked<% } %>>
                <label for="color<%= product.getProductName() %>"><%= color %></label>
            <%
                }
            %>
            <!-- 추가적으로 필요한 정보 출력 -->
            <input type="hidden" name="productName" value="<%= product.getProductName() %>">
            <input type="submit" value="Purchase">
        </form>
    </div>
<%
        // 첫 번째 제품 이후에는 이름을 출력하지 않도록 설정
        isFirstProduct = false;
    }
%>
</body>
</html>