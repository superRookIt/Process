<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<!-- java sql import  -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	width: 1000px;
	margin: 10px auto;
	border-collapse: collapse;
	text-align: center;
	font-size: 20px;
}

tr, td, th {
	border: 1px solid black;
}
</style>

</head>

<%!String name;
	String code;
	String s_n;
	String lender;
	int grantee;
	String phone;%>

<body>
	<table>

		<tr>
			<th>상품구분</th>
			<th>상품코드</th>
			<th>상품명</th>
			<th>임대연</th>
			<th>보증여부</th>
			<th>연락처</th>
		</tr>


		<%
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle", "ora_user", "1234");
		Statement s = c.createStatement();
		String sql = "select * from instrument";
		ResultSet rs = s.executeQuery(sql);
		//Connection->Statement->ResultSet

		try {

			while (rs.next()) {
				name = rs.getString("name");
				code = rs.getString("code");
				s_n = rs.getString("s_n");
				lender = rs.getString("lender");
				grantee = rs.getInt("grantee");
				phone = rs.getString("phone");

				String g_c = "";
				
				if (grantee == 1) {
			         g_c = "예";
				} else {
			         g_c = "아니요";
				}

				out.println("<tr>");
				out.println("<td>" + name + "</td>");
				out.println("<td>" + code + "</td>");
				out.println("<td>" + s_n + "</td>");
				out.println("<td>" + lender + "</td>");
				out.println("<td>" + g_c + "</td>");
				out.println("<td>" + phone + "</td>");
				out.println("</tr>");

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {

				if (s != null)
			        s.close();
				if (c != null)
		           	c.close();
				if (rs != null)
			        rs.close();

			}

			catch (Exception e2) {
				e2.printStackTrace();

			}

		}
		%>

	</table>



</body>
</html>