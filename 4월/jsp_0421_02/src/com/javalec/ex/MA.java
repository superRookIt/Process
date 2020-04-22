package com.javalec.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MA {

	private MA() {

	}

	// MA ma = new MA();
	private static MA instance = new MA();
	// instance ★★★

	public static MA getInstance() {
		return instance;
	}
	
	
	
	

	Context ct = null;
	DataSource ds = null;
	Connection con = null;

	PreparedStatement ps = null;
	ResultSet rs = null;

	MT mt = null;
	String sql;

	
	
	
	
	
	// 커넥션 풀에서 1개의 커넥션 가지고 오는 메소드
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

	} // getConnection()

	
	
	
	
	
	
	public int confirm(String id) {

		int check = 0;

		sql = "select id from bs where id=?";

		try {

			con = getConnection(); // Context에서 커넥션 가져오기
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {
				// 중복 아이디가 존재
				check = 1;

			} else {
				// 중복 아이디가 없음
				check = 0;

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

		return check;

	} // confirm

	
	
	
	// 회원가입정보 등록
	public int insert(MT mt) {

		int check = 0;

		sql = "insert into bs (id, pw, name, email, address1, address2, address3) values (?,?,?,?,?,?,?)";

		try {

			con = getConnection();

			ps = con.prepareStatement(sql);
			ps.setString(1, mt.getId());
			ps.setString(2, mt.getPw());
			ps.setString(3, mt.getName());
			ps.setString(4, mt.getEmail());
			ps.setString(5, mt.getAddress1());
			ps.setString(6, mt.getAddress2());
			ps.setString(7, mt.getAddress3());

			check = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (con != null)
					con.close();
				if (ps != null)
					ps.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return check;

	}// insert

	
	
	
	
	// 아이디,패스워드 체크 메소드
	public int userCheck(String id, String pw) {

		int check = 0;// db에서 결과 리턴값

		sql = "select id,pw from bs where id=?";

		try {

			String ch_id;
			String ch_pw;

			con = getConnection();

			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {

				ch_id = rs.getString("id");
				ch_pw = rs.getString("pw");

				if (ch_pw.equals(pw)) {

					check = 1; // 패스워드 일치

				} else {

					check = 0; // 패스워드 불일치

				}

			} else {

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

	
	
	
	
	
	// 멤버 1개
	public MT getMember(String id) {

		mt = null;
		sql = "select * from bs where id=?";

		try {

			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {

				// db에서 데이터 읽어와서 dto에 입력
				mt = new MT();

				mt.setId(rs.getString("id"));
				mt.setPw(rs.getString("pw"));
				mt.setName(rs.getString("name"));
				mt.setEmail(rs.getString("email"));
				mt.setAddress1(rs.getString("address1"));
				mt.setAddress2(rs.getString("address2"));
				mt.setAddress3(rs.getString("address3"));

				mt.setB_date(rs.getTimestamp("b_date"));

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

		return mt;

	}// member1

	
	
	
	
	
	// member 여러개
	public ArrayList<MT> getmembers() {

		ArrayList<MT> list = new ArrayList<MT>();

		sql = "select * from bs order by b_date desc";

		try {

			con = getConnection();

			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {

				// db에서 데이터 읽어와서 입력
				mt = new MT();

				mt.setId(rs.getString("id"));
				mt.setPw(rs.getString("pw"));
				mt.setName(rs.getString("name"));
				mt.setEmail(rs.getString("email"));
				mt.setAddress1(rs.getString("address1"));
				mt.setAddress2(rs.getString("address2"));
				mt.setAddress3(rs.getString("address3"));

				mt.setB_date(rs.getTimestamp("b_date"));

				list.add(mt);

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

	}// members

	
	
	
	
	// update 메소드
	public int updateMember(MT mt) {

		int check = 0;

		sql = "update bs set pw = ? ,name = ? , email = ?, address1 = ? , address2= ?, address3=? , u_date = sysdate where id=?";

		try {

			con = getConnection(); // Context에서 커넥션 가져오기
			ps = con.prepareStatement(sql);
			ps.setString(1, mt.getPw());
			ps.setString(2, mt.getName());
			ps.setString(3, mt.getEmail());
			ps.setString(4, mt.getAddress1());
			ps.setString(5, mt.getAddress2());
			ps.setString(6, mt.getAddress3());
			ps.setString(7, mt.getId());
			
			check = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (con != null)
					con.close();
				if (ps != null)
					ps.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return check;

	}//update
	
	
	
	
	
	
	// delete 메소드
	public int deleteMember(String id) {

		int check = 0;

		sql = "delete bs where id=?";

		try {

			con = getConnection(); 
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			check = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (con != null)
					con.close();
				if (ps != null)
					ps.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return check;

	}//delete
	
	
	

}
