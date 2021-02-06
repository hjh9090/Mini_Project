<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
$(function () {
	$('#backLogin').on('click', function() {
	location.href = "MemberCon";
	});
});

</script>
<title>로그인 결과 창</title>
</head>
<body>


<c:if test="${sessionScope.id != null}">
<table class = "bodyTable">
<tr>
	<td><h1 class = "h1Head">${sessionScope.id}님 환영합니다.</h1></td>
</tr>
</table>
</c:if>

<c:if test="${sessionScope.id == null}">
<table class = "bodyTable">
<tr>
	<td><h1 class = "h1Head">다시 로그인 해 주세요.</h1></td>
</tr>
<tr>
	<td><button id = backLogin class = "btn">다시 로그인</button></td>
</tr>
</table>

</c:if>



</body>
</html>