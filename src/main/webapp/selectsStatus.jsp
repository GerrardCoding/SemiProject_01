<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현황관리</title>
</head>
<style>
        body {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            text-align: center;
        }

        .button {
            padding: 10px 20px;
            font-size: 16px;
            margin: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>구매현황 및 회원조회</h1>
        
        <a href="productstatus.jsp" class="button">구매현황</a>
        <button class="button">회원조회</button>
    </div>
</body>
</html>