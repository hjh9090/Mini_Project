package com.library.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.sesoc.controller.DBManager;

public class MemberDAO {

	
	public static void memberCheck(HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberBean mb = new MemberBean();
		String id = request.getParameter("userid");
		String pw = request.getParameter("userpw");
		
		try {
			con = DBManager.connect();
			
			String sql = "select m_id from user_lib where m_id = ? and m_pw = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			
			if(pstmt.executeUpdate() == 1) {
				rs = pstmt.executeQuery();
				while (rs.next()) {
					mb.setId(rs.getString("m_id"));
				}
				System.out.println("true");
				HttpSession session = request.getSession();
				session.setAttribute("id", mb.getId());
			} else {
				System.out.println("false");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
		
	}
	
	
}
