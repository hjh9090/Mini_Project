package com.library.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MemberModel {

	
	public static void Logout (HttpServletRequest request) {
		 HttpSession session = request.getSession();
		 //현재 서버 안에 존재 하는 SessionScope 데이터를 모조리 정지.
		session.invalidate();
	}
	
}
