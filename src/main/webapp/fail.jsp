<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Fail Page</title>
</head>
<body>
    <script>
        // JavaScript alert를 사용하여 안내 메시지를 표시
        alert("구매에 실패했습니다. 다시 시도해주세요. 3초 후에 메인화면으로 돌아갑니다");
        // 리다이렉트할 페이지 URL
        var redirectURL = "${redirectURL}";
        
        // 3초 후에 지정된 URL로 리다이렉트
        setTimeout(function() {
            window.location.href = "main.jsp";
        }, 3000);
    </script>
</body>
</html>