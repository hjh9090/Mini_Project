package com.library.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MemberModel {

	
	public static void Logout (HttpServletRequest request) {
		 HttpSession session = request.getSession();
		 //���� ���� �ȿ� ���� �ϴ� SessionScope �����͸� ������ ����.
		session.invalidate();
	}
	
}
