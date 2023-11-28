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
<div class="container panel panel-info">
<h3 class="panel-heading">SEARCH RESULT</h3>
<%
request.setCharacterEncoding("UTF-8");
String result = request.getParameter("query");
					//form 태그 안에 name
%>
<p>검색어 <%=result %></p>
<p><a href="" title="다시 검색어를 확인해보세요" class="btn btn-danger">HOME</a></p>


</div>
</body>
</html>