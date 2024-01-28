<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>회원가입</title>
    <!-- 부트스트랩 CSS 링크 -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <!-- Roboto 폰트 -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap" rel="stylesheet">
    <!-- Font Awesome 아이콘 폰트 -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Roboto', sans-serif;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            margin-top: 50px;
            width: 100%; /* 전체 길이를 100%로 조절 */
            max-width: 800px;
            height: 100%; /* 세로 크기를 100%로 조절 */
        }

        .card {
            border: none;
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease-in-out;
            overflow: hidden;
        }

        .card:hover {
            transform: scale(1.03);
        }

        .card-header {
            background: linear-gradient(to right, #3498db, #6c5ce7);
            color: #fff;
            text-align: center;
            padding: 2rem;
            border-top-left-radius: 15px;
            border-top-right-radius: 15px;
        }

        .btn-primary {
            background: linear-gradient(to right, #3498db, #6c5ce7);
            border: none;
            padding: 15px;
            font-size: 18px;
            border-radius: 10px;
            transition: background 0.3s;
        }

        .btn-primary:hover {
            background: linear-gradient(to right, #6c5ce7, #3498db);
        }

        .form-group {
            margin-bottom: 1.5rem;
        }

        label {
            font-weight: bold;
            color: #555;
            display: flex;
            align-items: center;
            height: 100%;
            white-space: nowrap;
            margin-bottom: 0;
        }

        input.form-control {
            border: none;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .icon {
            margin-right: 10px;
        }
    </style>
    <script type="text/javascript">
        function checkLogin() {
            let form = document.loginForm;
            form.submit();
            return true;
        }
    </script>
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">
                        <h2 style="margin-bottom: 0; font-size: 24px;">회원가입</h2>
                    </div>
                    <div class="card-body">
                        <form name="loginForm" action="signInsert.do" method="post">
                            <table class="table">
                                <tr>
                                    <th><label for="id"><i class="fas fa-user icon"></i>아이디:</label></th>
                                    <td><input type="text" class="form-control" id="id" name="id" required></td>
                                </tr>
                                <tr>
                                    <th><label for="passwd"><i class="fas fa-lock icon"></i>패스워드:</label></th>
                                    <td><input type="password" class="form-control" id="passwd" name="pw" required></td>
                                </tr>
                                <tr>
                                    <th><label for="name"><i class="fas fa-user icon"></i>성명:</label></th>
                                    <td><input type="text" class="form-control" id="name" name="name" required></td>
                                </tr>
                            </table>
                            <button type="button" class="btn btn-primary btn-block" onclick="checkLogin()">회원가입</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- 부트스트랩 JS 및 Popper.js, jQuery 스크립트 링크 -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>

</html>
