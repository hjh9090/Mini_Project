<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src = "js/check.js"></script>
<script type="text/javascript" src = "js/validCheck.js"></script>
<title>로그인 결과</title>
</head>
<body>

<form action="MemberCon" method="post" name = "login" onsubmit="return checkThis()">
	<table id="tableH">
			<tr>
				<td colspan="2" id="loginH">로그인</td>
			</tr>
			<tr>
				<td id="idH"><input type="text" name="userid" placeholder="아이디"
					id="id2H"></td>
			</tr>
			<tr>
				<td id="pwH"><input type="password" name="userpw"
					placeholder="비밀번호" id="pw2H"></td>
			</tr>
			<tr>
				<td colspan="2" id="btnH"><input type="submit" value="확인"
					id="btn2H"></td>
			</tr>
		</table>
	</form>

</body>
</html>