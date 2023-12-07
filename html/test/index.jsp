<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Theme Made By www.w3schools.com -->
<title>LIST</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
li {
	list-style: none;
	float: left;
	margin-right: 40px;
	font-size: 20px;
}

.header {
	width: 100px;
	height: 100px;
	background-color: pink;
	font-size: 30px;
	text-align: center;
	line-height: 100px;
}

.main {
	flex-grow: 1;
}

.footer {
	width: 100%;
	height: 100px;
	background-color: pink;
	font-size: 30px;
	text-align: center;
	line-height: 100px;
}

.container {
	display: flex;
	flex-direction: column;
}

.btn {
	margin-top: auto;
}

.mycol:nth-child(1) {
	width: 25px;
}

.mycol:nth-child(3) {
	width: 100px;
}

.mycol:nth-child(4) {
	width: 170px;
}

.mycol:nth-child(5) {
	width: 10px;
}

.text-right {
	border: 1px solid red;
}

.btn_write {
	border: 1px solid green;
	float: right;
}

.text-right td {
	background-color: red;
	text-align: right;
}

.number_box {
	margin: 0 auto;
	text-align: center;
}

.navar-header {
	font-size: 30px;
	flex-grow: 1;
}

.navbar-default {
	height: 100px;
}

.navbar-default .top1 {
	display: flex;
	flex-direction: row;
	height: 90px;
}
</style>
</head>
<body>
	<div>
		<header>
			<nav class="navbar navbar-default">
				<div class="container top1">
					<div class="navar-header">
						<a class="navbar boaderList">list.jsp</a>
					</div>
					<div>
						<ul class="navbar ul">
							<li><a href="#">Sign up</a></li>
							<li><a href="naverlogin.html">Login</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</header>
	</div>


	<div class="container panel panel-warning">
		<h3 class="panel-heading">MULTIBOARD</h3>
		<table class="table table-bordered">
			<caption>MULTIBOARD - MVC1</caption>
			<thead>
				<tr>
					<th class="mycol" scope="col">NO</th>
					<th class="mycol" scope="col">TITLE</th>
					<th class="mycol" scope="col">WRITER</th>
					<th class="mycol" scope="col">DATE</th>
					<th class="mycol" scope="col">HIT</th>
				</tr>
			</thead>
			<tbody>
				<%
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rset = null;

				int thisPage = 1;
				int total = 0;
				int lines = 10;

				try {
					/*드라이버 로딩  */
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jwpdev", "jwpdev", "Ogsily121@");
					pstmt = conn.prepareStatement("select count(*) 'count' from mvcboard1");
					rset = pstmt.executeQuery();
					while (rset.next()) {
						total = rset.getInt("count");
					}
					pstmt = conn.prepareStatement("select * from mvcboard1 order by bno desc limit ?");
					pstmt.setInt(1, lines);
					rset = pstmt.executeQuery();

					while (rset.next()) {

						out.print("<tr><td><a href='detail.jsp?bno=" + rset.getInt("bno") + "' title=''>" + rset.getInt("bno")
						+ "</a></td>");
						out.print("<td><a href='detail.jsp?bno=" + rset.getInt("bno") + "' title=''>" + rset.getString("btitle")
						+ "</a></td>");
						out.print("<td>" + rset.getString("bname") + "</td>");
						out.print("<td>" + rset.getString("bdate") + "</td>");
						out.print("<td>" + rset.getInt("bhit") + "</td></tr>");
					}
					if (conn != null) {
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (conn != null) {
						conn.close();
						rset.close();
						pstmt.close();
					}
				}
				%>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="5">
						<div class="number_box">
						<ul>
							<%
							int totalPages = total/lines;
							if(totalPages-thisPage>10){
								
								for(int i=0;i<10;i++){
									int num = thisPage+i;
									out.print("<li><a href='list.jsp?thisPage="+num+"'>["+num+"]</a></li>");
									
								}
								
							}
							%>
							</ul>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div class="write_btn">
							<a href="write.jsp" title="" class="btn btn-danger btn_write">글쓰기</a>
						</div>
					</td>
				</tr>
			</tfoot>
		</table>
	</div>
</body>