package com.library.appoint;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.sesoc.controller.DBManager;

public class Appoint_DAO {
	
	
	public static ArrayList<Book> showRented (HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Book> books = new ArrayList<Book>();
		Book b = null;
		String titlesearch = request.getParameter("title");
		
		try {
			con = DBManager.connect();
			String sql = "select * from library where l_title like '%'||?||'%' and l_rent = '대여중'";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, titlesearch);
			pstmt.executeUpdate();
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int num = rs.getInt("l_num");
				String title = rs.getString("l_title");
				String authors = rs.getString("l_authors");
				String publisher = rs.getString("l_publisher");
				String isbn = rs.getString("l_isbn");
				String thumbnail = rs.getString("l_thumbnail");
				String rent = rs.getString("l_rent");
				b = new Book(num,title, authors,publisher,isbn,thumbnail,rent);
				books.add(b);
			}
			
			return books;
			
		} catch (Exception e) {
			return null;
		} finally {
			DBManager.close(con, pstmt, rs);
		}
	}//end showAll
	
	
	
	public static void appoint (HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String titlesearch = request.getParameter("title");
		int num = Integer.parseInt(request.getParameter("num"));
		
		
		try {
			con = DBManager.connect();
			String sql = "update library set l_rent = '예약' where l_title like '%'||?||'%' and l_num = ?";
			pstmt = con.prepareStatement(sql);
			
			System.out.println(titlesearch);
			System.out.println(num);
			
			pstmt.setString(1, titlesearch);
			pstmt.setInt(2, num);
			
			
			if(pstmt.executeUpdate() == 1) {
				System.out.println("성공적으로 처리 되었습니다.");
			}else {
				System.out.println(titlesearch);
				System.out.println(num);
				System.out.println("처리가 되지 않았습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB not Connected");
		} finally {
			DBManager.close(con, pstmt, null);
		}
	}//end appoint_DAO
	
	
}
