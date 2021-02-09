<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 대여 페이지</title>
</head>
<body>





<form action="MemberCon" method = "post">
<table  id="t1">
			<tr>
				<td colspan="2" class = "bodyTdY">대여 완료</td>
			</tr>
			
			<tr><td><h2 class = "tdY">
			${returndate} 까지
			반납해주세요!</h2>
			</td></tr>
			<tr><td colspan="2" align="center">
			<button class = "button">홈으로</button>
			</td></tr>
			
			</table>

</form>


</body>
</html>