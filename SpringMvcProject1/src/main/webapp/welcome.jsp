<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>

<%
String first_name=request.getParameter("first_name");
String last_name=request.getParameter("last_name");
%>
<p>Hello ,<%=first_name %> <%= last_name %>!</p>
</body>
</html>