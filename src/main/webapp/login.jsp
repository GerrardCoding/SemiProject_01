<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login and Registration</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f0f0;
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
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            overflow: hidden;
            max-width: 400px;
            width: 100%;
        }

        .form-header {
            background-color: #4285f4;
            color: #ffffff;
            padding: 20px;
            text-align: center;
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
            padding: 10px;
            border-bottom: 1px solid #ddd;
        }

        input[type="text"],
        input[type="password"] {
            width: calc(100% - 20px);
            padding: 10px;
            margin: 5px 0;
            box-sizing: border-box;
        }

        input[type="button"] {
            background-color: #4caf50;
            color: white;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="button"]:hover {
            background-color: #45a049;
        }

        .form-switch {
            text-align: center;
            padding: 10px;
            background-color: #f0f0f0;
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
                    <td><input type="text" id="ID" name="ID"></td>
                </tr>
                <tr>
                    <td><label for="PW">비밀번호:</label></td>
                    <td><input type="password" id="PW" name="PW"></td>
                </tr>
            </table>
            <input type="submit" value="로그인">
        </form>
        <div class="form-switch">
            <span>아직 회원이 아니신가요? </span>
            <input type="submit" value="회원가입">
        </div>
    </div>
</body>
</html>