<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1팀 도서관 입니다</title>
<link rel="stylesheet" href="css/appoint1.css">
<link rel="stylesheet" href="css/appoint2.css">
<link rel="stylesheet" href="css/rent.css">
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/login.css">
<link rel="stylesheet" href="css/apply1.css">
<link rel="stylesheet" href="css/apply2.css">
<link rel="stylesheet" href="css/search.css">
<link rel="stylesheet" href="css/main.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src = "js/check.js"></script>
<script type="text/javascript" src = "js/validCheck.js"></script>
<script type="text/javascript">
$(function () {
	$('.noClick').on('click', function(){
	alert('로그인 후 이용해 주세요');
	});
});

</script>
</head>
<body>
	<div class="inputH">
		<p class="ttH">
			<img alt="" src="./img/pp.png"> 1조도서관
		</p>
	</div>
	<c:if test="${sessionScope.id == null}">
	<header>
		<div class="container">
			<ul class="nav">
				<li><a href="SearchCon">도서조회</a></li>
				<li><a href="" class = "noClick">도서대여</a></li>
				<li><a href="" class = "noClick">도서예약</a></li>
				<li><a href="" class = "noClick">도서신청</a></li>
				<li><a href="HomeCon">로그인</a></li>
			</ul>
		</div>
	</header>
	</c:if>
	
	<c:if test="${sessionScope.id != null}">
	<header>
		<div class="container">
			<ul class="nav">
				<li><a href="SearchCon">도서조회</a></li>
				<li><a href="RentCon">도서대여</a></li>
				<li><a href="AppoinCon">도서예약</a></li>
				<li><a href="ApplyCon">도서신청</a></li>
				<li><a href="MemberCon">로그아웃</a></li>
			</ul>
		</div>
	</header>
	</c:if>
	
	<jsp:include page="${contentPage}"></jsp:include>
	
</body>
</html>