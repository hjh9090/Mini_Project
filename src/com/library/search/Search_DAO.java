package com.library.search;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.sesoc.controller.DBManager;

public class Search_DAO {
	
	public static ArrayList<Book> SearchLib (HttpServletRequest request) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Book b = null;
		ArrayList<Book> books = new ArrayList<Book>();
		String titlelib = request.getParameter("title");
		
		
		try {
			con = DBManager.connect();
			String sql = "select * from library where l_title like '%'||?||'%'";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, titlelib);
				if(pstmt.executeUpdate() == 1) {
				
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					int num = rs.getInt("l_num");
					String title = rs.getString("l_title");
					String authors = rs.getString("l_authors");
					String publisher = rs.getString("l_publisher");
					String isbn = rs.getString("l_isbn");
					String thumbnail = rs.getString("l_thumbnail");
					String rent = rs.getString("l_rent");
					//select���� �� å���� ��ü�� �־��ִ� ����. 
					
					
					b = new Book(num, title, authors, publisher,isbn,thumbnail, rent);
					//�� ����Ʈ�� å �� �� �� �� �� �־��ִ� ����.
					books.add(b); 
					System.out.println("����");
				}
			}
				return books;
			
		} catch (Exception e) {
			System.out.println("����");
			e.printStackTrace();
			return null;
		} finally {
			DBManager.close(con, pstmt, rs);
		}
	}//end method
	
	
	
}
