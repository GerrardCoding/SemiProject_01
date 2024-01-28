<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>신발 가게 - 구매 현황</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            padding-top: 50px;
        }

        h1 {
            text-align: center;
            color: #343a40;
            margin-bottom: 40px;
        }

        table {
            width: 80%;
            margin: auto;
        }

        table, th, td {
            border: 1px solid #dee2e6;
            text-align: center;
        }

        th, td {
            padding: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>구매 현황</h1>
        <table class="table table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">주문번호</th>
                    <th scope="col">제품번호</th>
                    <th scope="col">브렌드</th>
                    <th scope="col">상품명</th>
                    <th scope="col">색상</th>
                    <th scope="col">수량</th>
                    <th scope="col">총 가격</th>
                    <th scope="col">주문일자</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="dto">
                <tr>
                    <td>${dto.purseq}</td>
                    <td>${dto.pronum}</td>
                    <td>${dto.brand}</td>
                    <td>${dto.proname}</td>
                    <td>${dto.color}</td>
                    <td>${dto.purqty}</td>
                    <td>${dto.purprice}</td>
                    <td>${dto.purdate}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"></script>
</body>
</html>
