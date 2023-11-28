<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>000.</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String email = request.getParameter("email");
String password = request.getParameter("password");
String check = request.getParameter("checkbox");
String num1 = request.getParameter("num1");
String num2 = request.getParameter("num2");
%>
<div class="container panel pnel-info">
		<h3 class="panel-heading">FORM BASIC - RESULT</h3>
<p>E - mail : <%=email %> </p><br>
<p>password : <%=password %> </p>
<p>remember : <%=check %> </p>
<p>숫자 두개 더한 값 : <%=Integer.parseInt(num1)+Integer.parseInt(num2) %> </p>
</div>
</body>
</html>