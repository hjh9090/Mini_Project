package com.library.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemberCon")
public class MemberCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberModel.Logout(request);
		request.setAttribute("contentPage", "member/member.jsp");
		request.getRequestDispatcher("indexHome.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO.memberCheck(request);
		request.setAttribute("contentPage", "member/member2.jsp");
		request.getRequestDispatcher("indexHome.jsp").forward(request, response);
	}

}
