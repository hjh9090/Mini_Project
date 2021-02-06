<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
$(document).ready(function () {
	$('#backPage').on('click', function() {
		location.href = "RentCon";
		
		$('#appoint').on('click', function() {
		alert('해당 도서가 예약 되었습니다.');
		location.href = "indexHome.jsp";
		});
	});
	
});
</script>
<title></title>
</head>
<body>

<c:forEach var = "books" items = "${Books}">
<table id="t1" border="1">
			<tr>
				<td colspan="2"><h1 class = "h1Head">도서 대여</h1></td>
			</tr>
			
			<tr>
				<td class = "bodyTdY" colspan = "2">검색어 : ${param.title} </td>
			</tr>
			<c:if test="${books.rent != null}">
			<tr>
		<td class = "bodyTdY" colspan = "2"> 현재 상태 : ${books.rent}</td>
			</tr>
			</c:if>
			<tr>
	<td class = "bodyTdY" colspan="2">
	책 제목 :	${books.title}
	</td>
	</tr>
	<tr>
	<c:if test="${books.authors != ''}">
		<td class = "bodyTdY" colspan="2">저자 : ${books.authors}</td>
	</c:if>
	</tr>
	<tr>
	<c:if test="${books.publisher != ''}">
		<td class = "bodyTdY" colspan="2">출판사 :	${books.publisher}</td>
	</c:if>
	</tr>
	<tr>
	<c:if test="${books.isbn != ''}">
		<td class = "bodyTdY" colspan="2">책 번호 : ${books.isbn}</td>
	</c:if>
	</tr>
	<tr>
	<c:if test="${books.thumbnail != ''}">
	<td colspan="2">
		<img src = "${books.thumbnail}">
	</td>
	</c:if>
	</tr>
	<tr>
	<c:if test="${books.rent == null}">
		<td class = "bodyTdY">
	<form action="ApplyCon" method = "GET">
			<button class = "button">신청하기</button>
	</form>
	<button id = "backPage" class = "button">돌아가기</button>
		</td>
	</c:if>
	
	
	<c:if test="${books.rent == '대여중'}">
		<td>
	<form action="AppoinCon" method = "get">
			<button class = "button">예약</button>
	</form>
		</td>
		<td>
			<button id = "backPage" class = "button">돌아가기</button>
		</td>
	</c:if>
	
	<c:if test="${books.rent == '대여가능'}">
		<td>
	<form action="RentCon2" method = "post">
			<button class = "button">대여 신청</button>
	</form>
		</td>
		<td>
		<button id = "backPage" class = "button">돌아가기</button>
		</td>
	</c:if>
	</tr>
</table>
</c:forEach>

</body>
</html>