<%@page import="com.javalec.dao.ProductKey"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="com.javalec.dto.brandDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }

        img {
            max-width: 100px;
            height: auto;
        }

        .purchase-button {
            background-color: #4caf50;
            color: white;
            border: none;
            padding: 8px 16px;
            text-align: center;
            text-decoration: none;
            font-size: 14px;
            cursor: pointer;
            border-radius: 5px;
            margin-top: 20px;
        }
    </style>
</head>
<body>
<%
    // 제품 정보를 받아옴
    List<brandDTO> products = (List<brandDTO>) request.getAttribute("products");

    // 중복되지 않는 제품 키를 저장할 Set
    Set<ProductKey> uniqueProductKeys = new HashSet<>();
%>
<table>
    <thead>
        <tr>
            <th>Product Image</th>
            <th>Product Information</th>
        </tr>
    </thead>
    <tbody>
        <form id="purchaseForm" action="purchase.do" method="post">
        <%
            // 받아온 제품 정보를 반복문으로 출력
            for (brandDTO product : products) {
                String productName = product.getProductName();
                List<String> availableColors = product.getAvailableColors();
                double price = product.getProductprice();
                String brand = product.getProductbrand();

                // 중복되지 않는 경우에만 출력
                ProductKey productKey = new ProductKey(brand, productName, null, price);

                if (uniqueProductKeys.add(productKey)) {
                    // DecimalFormat을 사용하여 price를 한국 수학 기호에 맞게 포맷팅
                    java.text.DecimalFormat koreanFormat = new java.text.DecimalFormat("#,###");
                    String formattedPrice = koreanFormat.format(price);
        %>
        <tr>
            <td><img src="${pageContext.request.contextPath}/images/<%= product.getImagename()%>" width="300" height="300"></td>
            <%
           out.print(product.getImagename());
            
            %>
            <td>
                <p>Product brand: <%= brand %></p>
                <p>Product Name: <%= productName %></p>
                <p>Available Colors:</p>
                <!-- 각 색상을 라디오 버튼으로 만듭니다 -->
                <% 
                    for (String colorOption : availableColors) {
                %>
                        <input type="radio" name="color" value="<%= colorOption %>"> <%= colorOption %>
                <%
                    }
                %>
                <!-- 수정 못하도록 readonly 속성 추가 -->
                <p>Quantity: <span readonly>1</span></p>
                <p>Price: <%= formattedPrice %>원</p> <!-- 포맷팅된 가격을 출력 -->
                <!-- 추가적으로 필요한 정보 출력 -->
                <input type="hidden" name="productbrand" value="<%= brand %>">
                <input type="hidden" name="productName" value="<%= productName %>">
                <input type="hidden" name="price" value="<%= price %>">
            </td>
        </tr>
        <%
                }
            }
        %>
        </form>
    </tbody>
</table>
<!-- Purchase 버튼 -->
<input class="purchase-button" type="button" value="Purchase" onclick="confirmPurchase()">
<script>
    // 확인 창을 띄우고 사용자의 응답 값을 hidden 필드에 설정하는 함수
    function confirmPurchase() {
        var userResponse = confirm("구매하시겠습니까?");
        if (userResponse) {
            // form을 submit
            document.getElementById("purchaseForm").submit();
        }
    }
</script>
</body>
</html>