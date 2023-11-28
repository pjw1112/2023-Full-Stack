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
	<script src="https://kit.fontawesome.com/5081dee0c3.js" crossorigin="anonymous"></script>
	<style type="text/css">
	.fa-person{
	
	display: block;
	}
	.human{
	width : 150px;
	margin : 30px;
	}
	.container{
	display: flex;
	flex-direction : column;
	align-items: center;
	
	}
	</style>
</head>
<body>
	<div class="container panel pnel-info">
		<h3 class="panel-heading">FORM BASIC - LOGIN</h3>
		
		<img alt="" src="images/LOGIN_USER.png" class="human">
		<form action="Jsp007.jsp" method="post" id="loginForm">
			<fieldset>
				<legend>SEARCH</legend>
				<div class="form-group">
					<label for="email"> email</label> <input type="text" id="email"
						name="email" placeholder="Enter email" class="form-control">

				</div>
				<div class="form-group">
					<label for="password"> password</label> <input type="text"
						id="password" name="password" placeholder="Enter password"
						class="form-control">
				</div>
				<div class="form-group">
					<label for="check"> Remember</label> <input type="checkbox"
						id="check" name="checkbox" placeholder="Enter password">
				</div>
				<div class="form-group">
					<label for="check"> 숫자 두개 더하기</label> <input type="text"
						id="num1" name="num1" placeholder="숫자입력">
						<input type="text"
						id="num2" name="num2" placeholder="숫자입력">
				</div>
				<div class="form-group">
					<input type="submit" value="login"
						class="form-control bt btn-danger" title="로그인">
				</div>
				
				
				
				
			</fieldset>

		</form>
	</div>
	<script type="text/javascript">
		$(function() {
			$("#loginForm").on("submit", function() {
				if ($("#email").val() == "") {
					alert("빈칸입니다. \n 확인해주세요!");
					$("#email").focus();
					return false;
				}
				if ($("#password").val() == "") {
					alert("빈칸입니다. \n 확인해주세요!");
					$("#password").focus();
					return false;
				}
				if ($("#check:checked").val() == null) {
					alert("remember를 체크해야합니다. \n 확인해주세요!");
					$("#rememeber").focus();
					return false;
				}

			});

		});
	</script>

</body>
</html>