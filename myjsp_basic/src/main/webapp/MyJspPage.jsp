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
	<div class="container panel pnel-info">
		<h3 class="panel-heading">FORM BASIC</h3>
		<pre>
http://www.google.com/search?q=APPLE<br>
1. 처리컨테이너 : https://www.google.com/search <br>
2. 처리방식 : get <br>
3. 보관용기 : q <br>
</pre>

		<form action="https://www.google.com/search" method="get">
			<fieldset>
				<legend>SEARCH</legend>
				<div class="form-group">
					<label for="search"> GOOGLE SEARCH</label>
					<input type="search" id="search" name="q" placeholder="구글에게 물어봐요" class="form-control"> 
					
				</div>
				<div class="form-group">
					<input type="submit" value="검색" class="form-control bt btn-danger" title="검색을 시작합니다.">
				</div>
			</fieldset>

		</form>


	</div>

</body>
</html>