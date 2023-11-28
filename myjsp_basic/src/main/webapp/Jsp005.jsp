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
<div>
<pre>
         https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=apple  <br>
         1. 처리컨테이너 :  https://search.naver.com/search.naver  <br>
         2. 처리방식    :  get <br>
         3. 보관용기    : query  <br>
</pre>
</div>
<div>
<form action="MyJspPage_result.jsp" method="get">
<fieldset>
<legend>SEARCH</legend>
<div class = "form-group">
<label for="search"> NAVER SEARCH</label>
<input type="search" name="query" placeholder="네이버에 검색" id="search" class="form-control">
</div>
<div class = "form-group">
<input type="submit" value="꼼색" class="form-control bt btn-danger" title="검색을 시작합니다.">
</div>

</fieldset>





</form>


</div>

</body>
</html>