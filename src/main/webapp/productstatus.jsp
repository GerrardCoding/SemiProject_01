<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>상품 현황</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        .container {
            display: flex;
            justify-content: space-between;
            margin: 20px;
        }

        .product-info {
            width: 60%;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
        }

        .product-info table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        .product-info table, th, td {
            border: 1px solid #ddd;
        }

        .product-info th, .product-info td {
            padding: 10px;
            text-align: left;
        }

        .additional-info {
            width: 40%;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
        }

        .additional-info h2 {
            color: #333;
        }

        .additional-info form {
            margin-top: 20px;
        }

        .additional-info label {
            display: block;
            margin-bottom: 5px;
        }

        .additional-info input {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            box-sizing: border-box;
        }

        .additional-info input[type="submit"] {
            background-color: #007bff;
            color: white;
            cursor: pointer;
        }

        .additional-info input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h1>상품 현황</h1>
    <div class="container">
        <!-- 상품 정보 표시 테이블 -->
        <div class="product-info">
            <table border="1">
                <tr>
                    <th>제품번호</th>
                    <th>브렌드</th>
                    <th>상품명</th>
                    <th>수량</th>
                    <th>색상</th>
                    <th>가격</th>
                    <th>사진</th>
                    
                </tr>
                <c:forEach items="${list}" var="dto">
                <tr>
                  <td>${dto.pronum}</td>
                <td>${dto.brand}</td>
                <td>${dto.proname}</td>
                <td>${dto.stock}</td>
                <td>${dto.color}</td>
                <td>${dto.price}</td>
                <td><img src="data:image/jpeg;base64,${dto.base64Image}" style="max-width: 200px; max-height: 150px;"/></td>
                 </tr>
                 </c:forEach>
            </table>
        </div>

        <!-- 추가 정보 입력을 위한 텍스트 필드 -->
        <div class="additional-info">
            <h2>상품 등록</h2>
            <form action="" method="post">
                <label>제품번호</label>
                <input type="text" name="productNum" />

                <label>브렌드</label>
                <input type="text" name="brand" />

                <label>상품명</label>
                <input type="text" name="productName" />

                <label>수량</label>
                <input type="text" name="quantity" />

                <label>색상</label>
                <input type="text" name="color" />

                <label>가격</label>
                <input type="text" name="price" />

                <label>제품사진</label>
                <input type="text" name="productImage" />

                <input type="submit" value="등록" />
            </form>
        </div>
    </div>
</body>
</html>
