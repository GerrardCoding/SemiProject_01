<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login and Registration</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-image: url('file:///C:/Users/qazxd/Desktop/Image.png'); /* Replace with your local file path */
            background-size: cover;
            background-position: center;
        }

        .container {
            background-color: #ffffff;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            overflow: hidden;
            max-width: 500px;
            width: 100%;
            margin: 20px;
            animation: fadeIn 0.5s ease-in-out;
        }

        .form-header {
            background-color: #3498db;
            color: #ffffff;
            padding: 20px;
            text-align: center;
            border-radius: 10px 10px 0 0;
        }

        form {
            padding: 20px;
            box-sizing: border-box;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        td {
            padding: 15px;
            border-bottom: 1px solid #ddd;
        }

        input[type="text"],
        input[type="password"] {
            width: calc(100% - 30px);
            padding: 15px;
            margin: 10px 0;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #f9f9f9;
        }

        input[type="submit"] {
            background-color: #3498db;
            color: #ffffff;
            border: none;
            padding: 15px 30px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #2980b9;
        }

        .form-switch {
            text-align: center;
            padding: 15px;
            background-color: #ecf0f1;
            border-radius: 0 0 10px 10px;
        }

        span {
            display: block;
            margin-bottom: 10px;
            color: #666;
        }

        span a {
            color: #3498db;
            text-decoration: none;
            font-weight: bold;
        }

        span a:hover {
            text-decoration: underline;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="form-header">
            <h2>Login and Registration</h2>
        </div>
        <form action="logintest.do" method="post">
            <table>
                <tr>
                    <td><label for="ID">아이디:</label></td>
                    <td><input type="text" id="ID" name="ID" required></td>
                </tr>
                <tr>
                    <td><label for="PW">비밀번호:</label></td>
                    <td><input type="password" id="PW" name="PW" required></td>
                </tr>
            </table>
            <input type="submit" value="로그인">
        </form>
        
        <form action="sign.do" method="post" class="form-switch">
            <span>아직 회원이 아니신가요? <a href="#">회원가입</a></span>
            <input type="submit" value="회원가입">
        </form>
    </div>
</body>
</html>
