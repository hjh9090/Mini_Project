

//일반적으로 유효성 검사를 하는 매서드
//함수 형태로 정리해서 쓰기위해 만듬

//.jar(lib)
//범용적으로 사용 해야 하기 때문에 문제가 있을 때 반환 값을 true로 해야한다.

function isEmpty(input) {
	return !input.value; // 값이 없음을 나타냄
}

// <input>, 글자 수(최소 글자수보다 적으면 true)
function lessThan(input, len){
	return input.value.length < len;
}

//<input>을 넣으면 : a12ㅋb23
//한글 / 특수 문자를 들어 있으면 true, 아니면 false;
//허용하지 않는 값이 들어오면 -1을 반환 하는 원리를 이용한 유효성 검사
function containKR(input) {
	let no = "qwertyuiopasdfghjklzxcvbnm" +
			"QWERTYUIOPASDFGHJKLZXCVBNM1234567890" +
			"@_.";
	
	for(let i = 0; i < input.value.length;i++ ){
		if(no.indexOf(input.value[i]) == -1){
			return true;
		}
	}
	
}

//<input>이 두개 들어가는 경우(비밀번호 확인 등)
//내용이 다르면 true를 반환 하게

function match(input, input2) {
	if(input.value != input2.value){
		return true;
	}
}

//<input>, 문자열 에 글자가 포함 안 되어 있으면 true

function notContains(input, set) {
	//-1은 포함이 안 되어 있을 때 출력되는 숫자.
	
	for(let i = 0; i < set.length; i++) {
		if(input.value.indexOf(set[i]) != -1) {
			return false;
		}
	}
	return true;
}

//<input>안에 숫자가 아니면 true를 반환 하게 한다.(숫자 유효성)
function inNotNumber(input) {
	return isNaN(input.value);
}


