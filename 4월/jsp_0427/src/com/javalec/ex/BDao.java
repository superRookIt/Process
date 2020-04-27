package com.javalec.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BDao {

	// 객체선언

	Connection con = null;
	Context context = null;
	DataSource ds = null;

	// 객체선언
	ArrayList<BDto> list = new ArrayList<BDto>();
	BDto bdto = new BDto();
	
	
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	String sql = "";
	
	
	
	int bId, bHit, bGroup, bStep, bIndent;
	String bName,bTitle,bContent;
	Timestamp bDate;

	
	
	
	public BDao() {

		try {

			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle11g");

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // 생성자
	

	// 전체 select
	public ArrayList<BDto> list() {

		sql = "select * from mvc_board";

		try {
			
			con=ds.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				bId=rs.getInt("bId");
				bName=rs.getString("bName");
				bTitle=rs.getString("bTitle");
				bContent=rs.getString("bContent");
				bDate=rs.getTimestamp("bDate");
				bHit=rs.getInt("bHit");
				bGroup=rs.getInt("bGroup");
				bStep=rs.getInt("bStep");
				bIndent=rs.getInt("bIndent");
				
				bdto = new BDto(bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent);
				
				list.add(bdto);
				
			}
			
			

		} catch (Exception e) {
		} finally {
			try {
				if(rs!=null) rs.close();
				if(con!=null) con.close();
				if(ps!=null) ps.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return list;
	}
	
	
	

//	private BDao() {
//
//	}
//
//	private static BDao instance = new BDao();
//
//	// 싱글톤 패턴
//	public static BDao getInstance() {
//		return instance;
//	}
//	
//
//	public Connection getConnection() {
//
//		Connection con = null;
//		Context context = null;
//		DataSource ds = null;
//
//		try {
//
//			context = new InitialContext();
//			ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle11g");
//			con = ds.getConnection();
	
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return con;
//		
//		
//	} //getConnetion

}
