package com.library.rent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.sesoc.controller.DBManager;

public class Rent_DAO {

	public static void rentBook (HttpServletRequest request) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		BookRent br = null;
		String renttitle = request.getParameter("title");
		
		
		try {
			
			con = DBManager.connect();
			String sql = "update library set l_rent = '대여중' where l_title like '%'||?||'%'";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, renttitle);
			
			if(pstmt.executeUpdate() == 1) {
				System.out.println("대여 성공");
			} else {
				System.out.println("대여 실패");
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println("DB not Connected");
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, null);
		}
	}//end rent
	
	
	public static void showLib(HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BookRent br = null;
		ArrayList<BookRent> books = new ArrayList<BookRent>();
		String title = request.getParameter("title");
		
		try {
			con = DBManager.connect();
			String sql = "select * from library where l_title like '%'||?||'%'";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, title);
			
			if(pstmt.executeUpdate() == 1) {
				
				rs = pstmt.executeQuery();
				while(rs.next()) {
					br = new BookRent();
					br.setNum(rs.getInt("l_num"));
					br.setTitle(rs.getString("l_title"));
					br.setAuthors(rs.getString("l_authors"));
					br.setPublisher(rs.getString("l_publisher"));
					br.setIsbn(rs.getString("l_isbn"));
					br.setThumbnail(rs.getString("l_thumbnail"));
					br.setRent(rs.getString("l_rent"));
					books.add(br);
				}
				System.out.println("true");
				
			} else {
				System.out.println("false");
			}
			request.setAttribute("Books", books);
			
		} catch (Exception e) {
			System.out.println("DB not Connected");
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}// end select
		
		
		
	}
	
	
	
	
}
