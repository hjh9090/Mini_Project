function checkThis() {
	//도서 신청 유효성
	let applyName = document.apply.bookName;
	//도서 예약 유효성
	let appointName = document.appoint.title;
	//도서 대여 유효성
	let rentName = document.rent.title;
	//도서 검색 유효성
	let searchName = document.search.title;
	//로그인 유효성
	let loginName = document.login.userid;
	let loginPw = document.login.userpw;
	
	
	if(isEmpty(applyName)) {
		alert('빈 칸 없이 입력 해 주세요.');
		applyName.value = '';
		applyName.focus();
		return false;
	}
	if(isEmpty(appointName)) {
		alert('빈 칸 없이 입력 해 주세요.');
		appointName.value = '';
		appointName.focus();
		return false;
	}
	if(isEmpty(rentName)) {
		alert('빈 칸 없이 입력 해 주세요.');
		rentName.value = '';
		rentName.focus();
		return false;
	}
	if(isEmpty(searchName)) {
		alert('빈 칸 없이 입력 해 주세요.');
		searchName.value = '';
		searchName.focus();
		return false;
	}
	
	if(isEmpty(loginName)) {
		alert('아이디는 빈 칸 없이 입력 해 주세요.');
		loginName.value = '';
		loginName.focus();
		return false;
	}
	
	if(isEmpty(loginPw)) {
		alert('비밀번호는 빈 칸 없이 입력 해 주세요.');
		loginPw.value = '';
		loginPw.focus();
		return false;
	}
	
	
	
	
	
	
}