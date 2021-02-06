<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src = "./js/check.js"></script>
<script type="text/javascript" src = "./js/validCheck.js"></script>
<title>도서 조회</title>
</head>
<body>

<form action="SearchCon" method = "post" name = "search" onsubmit="return checkThis();">
	
		<table class="searchH" border = "1">
		<tr>
			<td colspan = "2"><h1 class = "h1Head">도서 조회</h1></td>	
		</tr>
		<tr>
			<td><h2 class = "h2H">책 검색</h2></td>
			<td><input name = "title" id = "name" placeholder="검색어를 입력 해 주세요."></td>
		</tr>
		<tr>
			<td colspan = "2"><button class="sbH">조회</button></td>
		</tr>
		</table>
	</form>
</body>
</html>