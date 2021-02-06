<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src = "js/check.js"></script>
<script type="text/javascript" src = "js/validCheck.js"></script>
<title>도서 대여 페이지</title>
</head>
<body>

<form action="RentCon2" name="rent" onsubmit="return checkThis()">
		<table id="t1" border="1">
			<tr>
				<td colspan = "2"><h1 class="h1Head">도서 대여</h1></td>
			</tr>
			<tr>
				<td><h2 class = "h2Y">책 검색</h2> </td>
				<td><input name="title" id="inputY" placeholder="검색어를 입력 해 주세요." size="30"></td>
			</tr>
			<tr>
				<td colspan = "2"><button class = "button">조회</button></td>
			</tr>
		</table>
	</form>
</body>
</html>