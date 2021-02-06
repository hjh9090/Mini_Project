package com.library.apply;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.sesoc.controller.DBManager;

public class Apply_DAO {

	public static String ApplyBook (Book2 b) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBManager.connect();
			String sql = "insert into apply values (apply_seq.nextval,?,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getAuthorss());
			pstmt.setString(3, b.getPublisher());
			pstmt.setString(4, b.getIsbn());
			pstmt.setString(5, b.getThumbnail());
			
			if(pstmt.executeUpdate() == 1) {
				System.out.println("신청 성공");
				return "true";
			}
			System.out.println("신청 실패");
			return "false";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Not DB Connected";
		} finally {
			DBManager.close(con, pstmt, null);
		}
	}
	
	
	
	
	
}
