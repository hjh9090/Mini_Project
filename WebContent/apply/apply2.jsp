<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
$(function () {
	$('.backHome').on('click', function(){
	alert('신청이 완료되었습니다.');
	});
});


</script>
<head>
<meta charset="UTF-8">
<title>도서 신청 페이지</title>
</head>
<body>
	<table id="tableSpecialB" border="1">
		<tr>
			<td class="td2B"><h2 id="subtitleB">검색 내역</h2></td>
		</tr>
		<tr>
			<td>
			<c:forEach var="b" items="${books}">
				<form action="ApplyCon" method = "GET">
					<table border="1" class="bookssB">
						<tr>
							<td>
							도서명<br>
							${b.title}<p><br>
							<input type = "hidden" value = "${b.title}" name = "title">
							저자<br>
							${b.authorss}<p><br>
							<input type = "hidden" value = "${b.authorss}" name = "authorss">
							출판사<br>	
							${b.publisher}<p><br>
							<input type = "hidden" value = "${b.publisher}" name = "publisher">
							ISBN코드<br>
							${b.isbn}<p><br>
							<input type = "hidden" value = "${b.isbn}" name = "isbn">
							</td>
						</tr>
							<tr><td><img src="${b.thumbnail}">
							<input type = "hidden" value = "${b.thumbnail}" name = "thumbnail">
							</td>
							</tr>
						<tr>
							<td>
								<button class = "backHome">신청하기</button>
							</td>
						</tr>
					</table>
						</form>
				</c:forEach>
		</td>
		</tr>
	</table>
</body>
</html>