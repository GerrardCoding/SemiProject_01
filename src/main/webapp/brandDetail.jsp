<%@page import="com.javalec.dao.ProductKey"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
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

    // 중복되지 않는 제품 키를 저장할 Set
    Set<ProductKey> uniqueProductKeys = new HashSet<>();

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
    <div>
        <p>Product brand: <%= brand %></p>
        <p>Product Name: <%= productName %></p>
        <p>Available Colors:</p>
        <form action="purchase.do" method="post">
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
             <input type="button" value="Purchase" onclick="confirmPurchase()">
        </form>
    </div>
    <script>
    // 추가된 부분: 확인 창을 띄우고 사용자의 응답 값을 hidden 필드에 설정하는 함수
    function confirmPurchase() {
        var userResponse = confirm("구매하시겠습니까?");
        document.getElementById("userResponse").value = userResponse ? "yes" : "no";
        // form을 submit
        document.forms[0].submit();
    }
</script>
<%
        }
    }
%>

</body>
</html>