package com.sesoc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	
	
	public static Connection connect() throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		return DriverManager.getConnection(url,"oracle","oracle");
	}
	
	//-Dlog4jdbc.drivers=com.tmax.tibero.jdbc.TbDriver


	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		
		try {
			rs.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
}
