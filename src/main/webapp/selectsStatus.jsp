<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>현황관리</title>
    <!-- 부트스트랩 CSS 링크 -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
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
            margin-bottom: 100px; /* 수정된 부분: 페이지 하단에 여백 추가 */
        }

        .button {
            padding: 10px 20px;
            font-size: 16px;
            margin: 10px;
        }

        .logout-button {
            padding: 10px 20px;
            font-size: 16px;
            margin: 10px;
            position: absolute;
            top: 10px;
            right: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <!-- 로그아웃 버튼 -->
        <button class="btn btn-danger logout-button" onclick="location.href='login.do';">로그아웃</button>

        <h1 style="margin-bottom: 30px;">구매현황 및 상품현황</h1>
        
        <div class="row">
            <div class="col-md-6">
                <button class="btn btn-primary btn-lg btn-block" onclick="location.href='purchasestatus.do';">구매현황</button>
            </div>
            <div class="col-md-6">
                <button class="btn btn-secondary btn-lg btn-block" onclick="location.href='productstatus.do';">상품현황</button>
            </div>
        </div>
    </div>

    <!-- 부트스트랩 JS 및 Popper.js, jQuery 스크립트 링크 -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
