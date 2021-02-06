package com.library.appoint;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.rent.BookRent;
import com.library.rent.RentModel;


@WebServlet("/AppoinCon")
public class AppoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("contentPage", "appoint/appoint1.jsp");
		request.getRequestDispatcher("indexHome.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Appoint_DAO.appoint(request);
		request.setAttribute("contentPage", "member/member2.jsp");
		request.getRequestDispatcher("indexHome.jsp").forward(request, response);
	}

}
