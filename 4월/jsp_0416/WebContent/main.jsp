<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String authUser = (String) session.getAttribute("authUser");

if (authUser == null) {

	/* response.setCharacterEncoding("utf-8");
	response.setContentType("text/html; charset=utf-8"); */

	PrintWriter writer = response.getWriter();

	writer.println("<html><head>");
	writer.println("<meta charset='utf-8'></head>");
	writer.println("<body>");
	writer.println("<script>");
	writer.println("alert('데이터가 없습니다 로그인 페이지로 이동합니다.');");
	writer.println("location.href('login.jsp');");
	writer.println("</script>");
	writer.println("</body></html>");
	writer.close();

}
%>


<%!Connection c = null;
	Statement s = null;
	ResultSet r = null;

	String id, pw, name, email, address, phone, gender, news, sms;
	Timestamp birth;
	String sql;%>


<!DOCTYPE html>
<html>
<head>
<style>
table{text-align: center;}
th{background-color: green;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원전체리스트</h2>
	<p><a href="join.jsp">회원정보 추가</a></p>
	<table border="1">
		<tr>
			<th>회원 아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>이메일</th>
			<th>주소</th>
			<th>휴대전화</th>
			<th>생년월일</th>
			<th>성별</th>
			<th>뉴스레터 수신여부</th>
			<th>SMS 수신여부</th>
		</tr>

		<%
			try {

			sql = "select * from lms_member order by id";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle", "ora_user", "1234");
			s = c.createStatement();
			r = s.executeQuery(sql);

			while (r.next()) {
				id = r.getString("id");
				pw = r.getString("pw");
				name = r.getString("name");
				email = r.getString("email");
				address = r.getString("address");
				phone = r.getString("phone");
				birth = r.getTimestamp("birth"); //★★
				gender = r.getString("gender");
				news = r.getString("news");
				sms = r.getString("sms");
		%>

		<tr>
			<td><a href="modify.jsp?id=<%=id%>"><%=id%></a></td>
			<td><%=pw %></td>
			<td><%=name %></td>
			<td><%=email %></td>
			<td><%=address %></td>
			<td><%=phone %></td>
			<td><%=birth %></td>
			<td><%=gender %></td>
			<td><%=news %></td>
			<td><%=sms %></td>
		</tr>

	<% 	

		} //while

	} catch (Exception e) {
		e.printStackTrace();
	} finally {

		try {
			if (s != null) s.close();
			if (c != null) c.close();
			if (r != null) r.close();
		}

		catch (Exception e2) {
			e2.printStackTrace();
		}

	}
	%>
	
	</table>

</body>
</html>