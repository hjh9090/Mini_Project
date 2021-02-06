package com.library.rent;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RentCon2")
public class RentCon2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Rent_DAO.showLib(request);
		request.setAttribute("contentPage", "rent/rent1.jsp");
		request.getRequestDispatcher("indexHome.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RentModel.DateRent(request);
		request.setAttribute("contentPage", "rent/rent2.jsp");
		request.getRequestDispatcher("indexHome.jsp").forward(request, response);
	}

}
