package com.javalec.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.sql.DataSource;

public class MemberDAO {

	ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();

	// db접속에 필요한 객체 선언

	DataSource datasource;
	Connection c = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int num;
	String id, pw, name, email, address, phone, gender, news, sms;
	Timestamp birth;
	String sql;


	public MemberDAO() {

		// 생성자

		try {
			// jdbc 로딩
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Context context = new InitialContext();
			datasource = (DataSource) context.lookup("java:comp/env/jdbc/oracle11g");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 전체 리스트 출력
	public ArrayList<MemberDTO> member_select() {

		// db연결
		try {

			sql = "select * from member3";
			//c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle","ora_user", "1234");
            c = datasource.getConnection();
			ps = c.prepareStatement(sql);
			rs = ps.executeQuery();

			// 데이터 담기
			while (rs.next()) {

				num = rs.getInt("turn");
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				email = rs.getString("email");
				address = rs.getString("address");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				news = rs.getString("news");
				sms = rs.getString("sms");
				birth = rs.getTimestamp("birth");
				// number는 rs.getInt();
				// 날짜는 rs.getTimestamp();

				MemberDTO mdto = new MemberDTO(num, id, pw, name, email, address, phone, gender, news, sms, birth);

				dtos.add(mdto);

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {

				if (ps != null)
					ps.close();
				if (rs != null)
					rs.close();
				if (c != null)
					c.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// 리턴 값으로 돌려줌
		return dtos;

	}

}
