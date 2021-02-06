<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src = "js/check.js"></script>
<script type="text/javascript" src = "js/validCheck.js"></script>
<title>예약 페이지</title>
</head>


<body>
		<form action="AppoinCon2" method="get" onsubmit="return checkThis()" name="appoint">
		<table class="bodyTable" border = 1>
		<tr>	
	 	<td colspan = "2"><h1 class="h1Head">도서 예약</h1></td>
			</tr>	
				<tr>
				<td><h2 class = "h2B">책 검색</h2></td>
					<td><input id="name" name="title" placeholder="검색어를 입력 해 주세요."></td>
				</tr>
				<tr>
					<td colspan = "2"><button id="search" class = "btn">조회</button></td>
				</tr>
			</table>
		</form>

</body>
</html>