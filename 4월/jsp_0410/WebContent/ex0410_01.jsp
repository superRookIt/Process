<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.Connection"%>

<%@page import="java.sql.ResultSet"%>

<%@page import="java.sql.Statement"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%! Connection conn;

	Statement stmt;
	
	ResultSet rs;
	
	/* java.sql 구문들 import 해줌  */

	String driver = "oracle.jdbc.driver.OracleDriver";

	String url = "jdbc:oracle:thin:@localhost:1521:orcle";
	/* drive properties -> connetcion url에 있는 정보 */

	String uid = "ora_user";
	String upw = "1234";
	
	String query = "select * from member";
	
	%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>db연결</title>
</head>
<body>

	<%
		try {

		//jdbc 드라이버 연결 - oracle 프로그램 실행
		Class.forName(driver);
		/* Class.forName("oracle:jdbc:driver:OracleDrive"); */

		//Connection 연결 - oracle 로그인
		conn = DriverManager.getConnection(url, uid, upw);
		/* conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle", "ora_user", "1234"); */

		//statement 객체 - sql구문 입력
		stmt = conn.createStatement();

		//resultSet 데이터 받음
		rs = stmt.executeQuery(query);

		//next()는 읽어올 데이터가 있는지
		while (rs.next()) {
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String phone = rs.getString("phone");

			out.println("아이디 : " + id + "<br>");
			out.println("패스워드 : " + pw + "<br>");
			out.println("이름 : " + name + "<br>");
			out.println("전화번호 : " + phone + "<br>");
		}

	} catch (Exception e) {
		e.printStackTrace();
		

	} finally {
		try{
			if(rs!=null){
				rs.close();
			}
			
			if(stmt!=null){
				stmt.close();
			}
			if(conn!=null){
				conn.close();
			}
			
		}catch(Exception e2){
			e2.printStackTrace();
		}
		
	}
	%>
</body>
</html>