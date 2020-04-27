package com.javalec.ex;

import java.sql.Connection;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {

	String sql;

	private MemberDao() {

	}

	private static MemberDao instance = new MemberDao();

	// 싱글톤 패턴
	public MemberDao getInstance() {
		return instance;
	}
	

	// select 전체
	public ArrayList<MemberDto> getMembers() {

		ArrayList<MemberDto> list = new ArrayList<MemberDto>();

		sql = "select * from b_member order by b_date desc";

		try {
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return list;

	}// getMembers
	
	
	//insert
	public int insertMember(MemberDto mdto) {
		
		int check=0;
		
		
		
		
		return check;
		
	}//insert
	
	
	
	
	//update
	public int updateMember(String id) {
		
		int check=0;
		
		
		return check;
		
	}//update
	
	
	//delete
	public int deleteMember(String id) {
		
		int check=0;
		
		
		
	
		return check;
		
	}//delete
	
	
	
	

	public Connection getConnection() {

		Context context = null;
		DataSource ds = null;
		Connection con = null;

		try {

			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle11g");
			con = ds.getConnection();

		} catch (Exception e) {

			e.printStackTrace();

		}

		return con;

	}// getConnection

}
