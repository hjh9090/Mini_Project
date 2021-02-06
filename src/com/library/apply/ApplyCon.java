package com.library.apply;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ApplyCon")
public class ApplyCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(!request.getParameterNames().hasMoreElements()) {
		request.setAttribute("contentPage", "apply/apply1.jsp");
		request.getRequestDispatcher("indexHome.jsp").forward(request, response);
		
		} else {
			Apply_DAO.ApplyBook(ApplyModel.ApplyBean(request));
			request.setAttribute("contentPage", "member/member3.jsp");
			request.getRequestDispatcher("indexHome.jsp").forward(request, response);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplyModel.searchBook(request);
		request.setAttribute("contentPage", "apply/apply2.jsp");
		request.getRequestDispatcher("indexHome.jsp").forward(request, response);
	}

}
