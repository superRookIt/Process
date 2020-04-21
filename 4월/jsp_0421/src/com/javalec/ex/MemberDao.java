package com.javalec.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {

	private MemberDao() {

	}

	// MemberDao mdao = new MemberDao();
	private static MemberDao instance = new MemberDao();
	// instance ★★★

	public static MemberDao getInstance() {
		return instance;
	}
	
	//객체선언
	
	Context ct = null;
	DataSource ds = null;
	Connection con = null;
	
	PreparedStatement ps = null;
	ResultSet rs = null;

	MemberDto mdto = null;
	String sql;
	
	

	// 아이디 중복 체크
	public int confirmId(String id) {
		
		int check = 0;
		
		sql="select id from b_member where id=?";
		
		
		try {
			
			con=getConnection(); //Context에서 커넥션 가져오기
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			
			
			if(rs.next()) {
				//중복 아이디가 존재
				check=1;
				
				
			}else {
				//중복 아이디가 없음
				
				check=0;
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(rs!=null) rs.close();
				if(con!=null) con.close();
				if(ps!=null) ps.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
		
		

		return check;
	}

	
	
	//커넥션 풀에서 1개의 커넥션 가지고 오는 메소드
	private Connection getConnection() {

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
	}
	
	

	// member 여러개
	public ArrayList<MemberDto> getmembers() {

		ArrayList<MemberDto> list = new ArrayList<MemberDto>();

		/*
		Context ct = null;
		DataSource ds = null;
		Connection con = null;
		
		PreparedStatement ps = null;
		ResultSet rs = null;
        */

		sql = "select * from b_member order by b_date desc";

		try {

			ct = new InitialContext();
			ds = (DataSource) ct.lookup("java:comp/env/jdbc/oracle11g");
			con = ds.getConnection();
			
			// con = getConnection();
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {

				// db에서 데이터 읽어와서 dto에 입력
				mdto = new MemberDto();

				mdto.setId(rs.getString("id"));
				mdto.setPw(rs.getString("pw"));
				mdto.setName(rs.getString("name"));
				mdto.setEmail(rs.getString("email"));
				mdto.setAddress(rs.getString("address"));
				mdto.setB_date(rs.getTimestamp("b_date"));
				list.add(mdto);

			}

		}

		catch (

		Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return list;
	}
	

	// 멤버 1개
	public MemberDto getMember(String id) {

		
		/* 
		Context ct = null; 
		DataSource ds = null;
		Connection con = null;
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		*/
		
		mdto = null;
		sql = "select * from b_member where id=?";

		try {

			ct = new InitialContext();
			ds = (DataSource) ct.lookup("java:comp/env/jdbc/oracle11g");
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {

				// if(rs !=null) -> rs null 리턴값을 돌려줍니다.

				// while (rs.next()) {

				// db에서 데이터 읽어와서 dto에 입력
				mdto = new MemberDto();

				mdto.setId(rs.getString("id"));
				mdto.setPw(rs.getString("pw"));
				mdto.setName(rs.getString("name"));
				mdto.setEmail(rs.getString("email"));
				mdto.setAddress(rs.getString("address"));
				mdto.setB_date(rs.getTimestamp("b_date"));

				// } while

			} else {

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return mdto;
	}
	
	
	//회원 가입 입력 메소드
	public int insertMember(MemberDto mdto) {
		
		int check =0;
		
		sql ="insert into b_member (id, pw, name, email, address) values (?,?,?,?,?)";
		
		
		try {
			
			con=getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, mdto.getId());
			ps.setString(2, mdto.getPw());
			ps.setString(3, mdto.getName());
			ps.setString(4, mdto.getEmail());
			ps.setString(5, mdto.getAddress());
			check = ps.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (con != null) con.close();
				if (ps != null) ps.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return check;
	}
	
	
	

	// 아이디,패스워드 체크 메소드
	public int userCheck(String id, String pw) {

		int check = 0;// db에서 결과 리턴값

		
		/* 
		Context ct = null;
		DataSource ds = null;
		Connection con = null;
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		 */
		
		sql = "select id,pw from b_member where id=?";

		try {

			String ch_id;
			String ch_pw;

			ct = new InitialContext();
			ds = (DataSource) ct.lookup("java:comp/env/jdbc/oracle11g");
			con = ds.getConnection();
			
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {

				// 데이터가 있을 경우
				// while (rs.next()) {

				ch_id = rs.getString("id");
				ch_pw = rs.getString("pw");

				if (ch_pw.equals(pw)) {

					check = 1; // 패스워드 일치

				} else {

					check = 0; // 패스워드 불일치

				}

				// } // while

			} else {
				// 데이터가 없을 경우
				check = -1; // 아이디가 존재하지 않음

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (rs != null) rs.close();
				if (con != null) con.close();
				if (ps != null) ps.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return check; // 일치=1, 불일치=0, 존재하지 않음=-1
	}// userCheck
	
	
	
	//update 메소드
	public int updateMember(MemberDto mdto) {

		int check = 0;
		
		sql="update b_member set pw = ? ,name = ? , email = ?, address = ? , b_date = sysdate where id=?";

		try {

			con = getConnection(); // Context에서 커넥션 가져오기
			ps = con.prepareStatement(sql);
			ps.setString(1, mdto.getPw());
			ps.setString(2, mdto.getName());
			ps.setString(3, mdto.getEmail());
			ps.setString(4, mdto.getAddress());
			ps.setString(5, mdto.getId());
			check=ps.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(con!=null) con.close();
				if(ps!=null) ps.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
		
		
		
		return check;
		
	}
	
	
	//delete 메소드
	public int deleteMember(String id) {
		
		int check=0;
		
		sql="delete b_member where id=?";
		
		try {

			con = getConnection(); // Context에서 커넥션 가져오기
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			check=ps.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(con!=null) con.close();
				if(ps!=null) ps.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
		
		
		return check;
		
	}
	
	
	
	
	

}// class
