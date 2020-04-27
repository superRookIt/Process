package com.javalec.ex.BDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.BDto.BDto;

public class Bdao {

	// 객체 선언 (커넥션풀, db접속, 데이터 담는데 필요한 변수)

	Context context = null;
	DataSource ds = null;

	Connection con = null;

	PreparedStatement ps = null;
	ResultSet rs = null;

	// select 전체
	ArrayList<BDto> dtos = new ArrayList<BDto>();
	BDto dto = new BDto();

	// 데이터 담을때
	int bId, bHit, bGroup, bStep, bIndent;
	String bName, bTitle, bContent;
	Timestamp bDate;

	String sql;

	
	
	// 생성자 - 커넥션풀 연결(객체선언)
	public Bdao() {

		try {

			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle11g");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// 생성자

	
	
	// 전체 list를 가져옴 (select - con,ps,rs)
	public ArrayList<BDto> list() {

		sql = "select * from mvc_board";

		try {

			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {

				bId = rs.getInt("bId");
				bName = rs.getString("bName");
				bTitle = rs.getString("bTitle");
				bContent = rs.getString("bContent");
				bDate = rs.getTimestamp("bDate");
				bHit = rs.getInt("bHit");
				bGroup = rs.getInt("bGroup");
				bStep = rs.getInt("bStep");
				bIndent = rs.getInt("bIndent");

				dto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);

				dtos.add(dto);

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

		return dtos;

	}
	
	
	
	//1개 select - contentView
	public BDto contentView(int bId) {
		
		
		upHit(bId);
		
		
		sql="select * from mvc_board where bId=?";
		
		try {
			
			
			con=ds.getConnection();
			ps=con.prepareStatement(sql);
			ps.setInt(1, bId);
			rs=ps.executeQuery();
			
			//1개는 if
			
			if(rs.next()) {
				
				bId= rs.getInt("bId");
				bName=rs.getString("bName");
				bTitle=rs.getString("bTitle");
				bContent =rs.getString("bContent");
				bDate=rs.getTimestamp("bDate");
				bHit=rs.getInt("bHit");
				bGroup=rs.getInt("bGroup");
				bStep=rs.getInt("bStep");
				bIndent=rs.getInt("bIndent");
				
				dto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		finally {
			
			try {
				
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(con!=null) con.close();
				
			} 
			
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dto;
		
		
	}//1개 select - contentView
	
	
	
	
	//조회수 1 증가 - update
	public int upHit(int bId) {
		
		//조회수 1증가
		//update mvc_board set bHit=? where bId=?
		
		int check=0;
		
		sql="update mvc_board set bHit=bHit+1 where bId=?";
		
		try {
			
			con=ds.getConnection();
			ps=con.prepareStatement(sql);
			ps.setInt(1, bId);
			check = ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(ps!=null) ps.close();
				if(con!=null) con.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return check;
	}//조회수 1증가 - update
	
	
	
	
	
	
	

}// class
