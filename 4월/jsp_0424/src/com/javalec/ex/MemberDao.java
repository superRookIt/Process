package com.javalec.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {

	public MemberDao() {

	}

	private static MemberDao instance = new MemberDao();

	public static MemberDao getinstance() {
		return instance;
	}

	// 선언부

	Connection con = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	MemberDao mdao = null;
	MemberDto mdto = null;
	String sql = null;
	
	
	
	
	
	public ArrayList<MemberDto> getMembers(){
		
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		
		sql="select * from b_member order by b_date desc";
		
		try {
			
			con=getConnection();
			psmt=con.prepareStatement(sql);
			rs=psmt.executeQuery();
			
			while(rs.next()) {
				
				mdto=new MemberDto();
				mdto.setId(rs.getString("id"));
				mdto.setPw(rs.getString("pw"));
				mdto.setName(rs.getString("name"));
				mdto.setEmail(rs.getString("email"));
				mdto.setAddress(rs.getString("address"));
				mdto.setB_date(rs.getTimestamp("b_date"));
				
				list.add(mdto);
				
				
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(con!=null) con.close();
				if(rs!=null) rs.close();
				if(psmt!=null) psmt.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return list;
		
	}//select 전체
	
	
	
	
	//커넥션풀
	public Connection getConnection() {
		 
		
		Context context = null;
		DataSource ds=null;
		Connection con=null;
		
		try {
			
			context=new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle11g");
			con= ds.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	
	

}//class
