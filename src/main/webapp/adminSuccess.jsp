<%@page import="com.javalec.dto.adminDTO"%>
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
    Object adminObject = session.getAttribute("admin");

   if (adminObject != null && adminObject instanceof adminDTO) {
        // Admin is logged in
        adminDTO admin = (adminDTO) adminObject;
%>
       <script type="text/javascript">
            alert('로그인 성공입니다. Welcome, <%= admin.getName()+"님" %>!');
            window.location.href = 'selectsStatus.jsp';
            </script>
            </body>
        </html>
        <%
            } else {
                // No valid user or admin is logged in, redirect to a default page
                response.sendRedirect("default.jsp");
            }
        %>

</body>
</html>