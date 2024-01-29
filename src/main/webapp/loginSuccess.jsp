<%@page import="com.javalec.dto.adminDTO"%>
<%@page import="com.javalec.dto.loginDTO"%>
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
    Object userObject = session.getAttribute("user");

    if (userObject != null && userObject instanceof loginDTO) {
        // Regular user is logged in
        loginDTO user = (loginDTO) userObject;

        // Check if the user's name contains "대표"
%>
        <script type="text/javascript">
            alert('로그인 성공입니다. Welcome, <%= user.getName()+"님" %>!');
            window.location.href = '<%= "main.jsp" %>';
        </script>
<%
    } else {
        // No valid user or admin is logged in, redirect to a default page
        response.sendRedirect("default.jsp");
    }
%>