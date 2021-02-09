package com.sesoc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBManager {
	
	
	public static Connection connect() throws NamingException, SQLException {
		Context ctx = new InitialContext();
		
		//data소스로 캐스트
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/library");
		
		//Connection 다양 한 곳에서 사용 가능
		return ds.getConnection();
		
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
