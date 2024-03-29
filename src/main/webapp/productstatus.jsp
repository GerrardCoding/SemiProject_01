<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
   <%// ServletContext를 사용하여 업로드 경로를 가져옴
   request.setCharacterEncoding("UTF-8");
   ServletContext context = request.getServletContext();
   String uploadPath = context.getRealPath("/images"); 
	%> 
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
 <script type="text/javascript">
    function insertPro() {
        let form = document.form1;

        if (!validateInput(form.pronum, /^[a-zA-Z0-9]+$/)) {
            alert("유효한 제품번호를 입력하세요.");
            return false;
        }

        if (!validateInput(form.brand, /^[a-zA-Z]+$/)) {
            alert("유효한 브랜드를 입력하세요.");
            return false;
        }

        if (!validateInput(form.proname, /^[가-힣]+$|^[a-zA-Z]+$|^[가-힣a-zA-Z]+$/)) {
            alert("유효한 상품명을 입력하세요.");
            return false;
        }

        if (!validateInput(form.stock, /^\d+$/)) {
            alert("유효한 수량을 입력하세요.");
            return false;
        }

        if (!validateInput(form.color, /^[a-zA-Z]+$/)) {
            alert("유효한 색상을 입력하세요.");
            return false;
        }

        if (!validateInput(form.price, /^\d+$/)) {
            alert("유효한 가격을 입력하세요.");
            return false;
        }

        form.submit();
        return true;
    }

    function validateInput(input, regex) {
        return regex.test(input.value);
    }
</script>
</head>
<body>
    <h1>상품 현황</h1>
    <div class="container">
        <!-- 상품 정보 표시 테이블 -->
        <div class="product-info">
            <form method="post">
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
                            <td><img src="${pageContext.request.contextPath}/images/${dto.imagename}" width="100" height="100"></td>

                        </tr>
                    </c:forEach>
                </table>
            </form>
        </div>

        <!-- 추가 정보 입력을 위한 텍스트 필드 -->
        <div class="additional-info">
    <form name="form1" method="post" enctype="multipart/form-data" action="uploadImage.do">
                <h2>상품 등록</h2>
                <label>제품번호</label>
                <input type="text" name="pronum" />

                <label>브렌드</label>
                <input type="text" name="brand" />

                <label>상품명</label>
                <input type="text" name="proname" />

                <label>수량</label>
                <input type="text" name="stock" />

                <label>색상</label>
                <input type="text" name="color" />

                <label>가격</label>
                <input type="text" name="price" />
                
                <label>사진명</label>
                <input type="file" name="imagename" value="imagename" />
                <input type="submit" value="등록" name="productImage" onclick="insertPro()"/>

            </form>
        </div>
    </div>
</body>
</html>