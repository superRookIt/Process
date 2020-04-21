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

	
	// member 여러개
	public ArrayList<MemberDto> getmembers() {

		ArrayList<MemberDto> list = new ArrayList<MemberDto>();

		Context ct = null;
		DataSource ds = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberDto mdto = null;
		String sql = "select * from b_member";

		try {

			ct = new InitialContext();
			ds = (DataSource) ct.lookup("java:comp/env/jdbc/oracle11g");
			con = ds.getConnection();
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

		Context ct = null;
		DataSource ds = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberDto mdto = null;
		String sql = "select * from b_member where id=?";

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

	
	
	// 아이디,패스워드 체크 메소드
	public int userCheck(String id, String pw) {

		int check = 0;// db에서 결과 리턴값

		Context ct = null;
		DataSource ds = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select id,pw from b_member where id=?";

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

				if (rs != null)
					rs.close();
				if (con != null)
					con.close();
				if (ps != null)
					ps.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return check; // 일치=1, 불일치=0, 존재하지 않음=-1
	}// userCheck

}// class
