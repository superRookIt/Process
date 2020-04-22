package com.javalec.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BDAO {
	
	
	private BDAO() {

	}

	
	// MA ma = new MA(); 시작하자마자 클래스 객체 1개 생성
	private static BDAO instance = new BDAO();
	// instance ★★★

	
	
	//싱글톤 패턴
	public static BDAO getInstance() {
		return instance;
	}
	
	
	
	
	Context ct = null;
	DataSource ds = null;
	Connection con = null;

	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	
	BDTO bt = null;
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
		
		
		
	
	
		
		//등록
		public int insert(BDTO bt) {

			int check = 0;

			sql = "insert into b_board values (bs_0.nextval,?,?,?,?)";

			try {

				con = getConnection();

				ps = con.prepareStatement(sql);
				
				ps.setString(1, bt.getB_title());
				ps.setString(2, bt.getB_content());
				ps.setString(3, bt.getB_user());
				ps.setString(4, bt.getB_file());
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
			
		}// insert
		

		
		
		
		// member 여러개
		public ArrayList<BDTO> getmembers() {

			ArrayList<BDTO> list = new ArrayList<BDTO>();

			sql = "select * from b_board order by b_num desc";

			try {

				con = getConnection();

				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();

				while (rs.next()) {

					bt = new BDTO();
					
					
					bt.setB_num(rs.getInt("b_num"));
					bt.setB_title(rs.getString("b_title"));
					bt.setB_content(rs.getString("b_content"));
					bt.setB_user(rs.getString("b_user"));
					bt.setB_file(rs.getString("b_file"));
					
					list.add(bt);

				}

			}

			catch (

			Exception e) {
				e.printStackTrace();
			} finally {
				try {

					if (rs != null) rs.close();
					if (ps != null) ps.close();
					if (con != null) con.close();

				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

			return list;

		}// members
		
		
		
		
		
		// 멤버 1개
		public BDTO getMember(int b_num) {

			sql = "select * from b_board where b_num=?";
			

			try {
				
				con = getConnection();
				
				ps = con.prepareStatement(sql);
				ps.setInt(1, b_num);
				rs = ps.executeQuery();

				if (rs.next()) {

					bt = new BDTO();
					
					bt.setB_num(rs.getInt("b_num"));
					bt.setB_title(rs.getString("b_title"));
					bt.setB_content(rs.getString("b_content"));
					bt.setB_user(rs.getString("b_user"));
					bt.setB_file(rs.getString("b_file"));


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

			return bt;
		}
		
		
		
		
		//update 메소드
		public int update(BDTO bt) {

			int check = 0;
			
			sql="update b_board set b_title = ? , b_content = ? , b_file = ? , b_user=? where b_num=?";

			try {

				con = getConnection(); 
				
				ps = con.prepareStatement(sql);
				
				ps.setString(1, bt.getB_title());
				ps.setString(2, bt.getB_content());
				ps.setString(3, bt.getB_file());
				ps.setString(4, bt.getB_user());
				ps.setInt(5, bt.getB_num());
				
				check = ps.executeUpdate();
				

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
		public int delete(int b_num) {
			
			int check=0;
			
			sql="delete b_board where b_num=?";
			
			try {

				con = getConnection(); // Context에서 커넥션 가져오기
				ps = con.prepareStatement(sql);
				ps.setInt(1, b_num);
				check = ps.executeUpdate();
				

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
		
		
		
		
		
		
		
		
		
		
		
		
		
}
