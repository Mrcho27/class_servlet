<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Output Page!</h1>
	<p>LoginId : <%= request.getAttribute("loginId") %></p>
	<p>Email : <%= request.getAttribute("email") %></p>
</body>
</html>