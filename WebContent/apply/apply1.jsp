<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src = "js/check.js"></script>
<script type="text/javascript" src = "js/validCheck.js"></script>
<title>도서 신청 페이지</title>
</head>
<body>
<form action="ApplyCon" name="apply" onsubmit="return checkThis();" method = "post">
		<table id="tableB" border="1">
			<tr>
				<td colspan="2">
					<h1 class = "h1B">도서 신청</h1>
				</td>
			</tr>
			<tr>
				<td>
					<h2 class="h2B">책 검색</h2>
				</td>
				<td><input id="inputB" name="bookName"
					placeholder="검색어를 입력 해 주세요."></td>
			</tr>
			<tr>
				<td colspan="2">
					<button id="btnB">조회</button>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>