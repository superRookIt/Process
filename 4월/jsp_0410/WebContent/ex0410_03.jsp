<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<!-- java sql import  -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<%!Connection c;
	Statement s;
	ResultSet rs;

	/* try문에서 선언하면 안됌 */

	int hak;
	int grade;
	String name;
	int fpay;
	String subject;
	int pay;
	String kindpay;%>

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
<body>
	<table>

		<tr>
			<th>번호</th>
			<th>학년</th>
			<th>이름</th>
			<th>납부여부</th>
			<th>과목</th>
			<th>금액</th>
			<th>납부유형</th>
		</tr>


		<%
			try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle", "ora_user", "1234");

			s = c.createStatement();

			String sql = "select * from member3";

			rs = s.executeQuery(sql);

			/* try문 안이라서 지역변수라서 try문 벗어나면 사라짐!
			그래서 connction, statement, resultset 다 
			@!로 선언해줘야 함 */

			while (rs.next()) {

				hak = rs.getInt("hak");
				grade = rs.getInt("grade");
				name = rs.getString("name");
				fpay = rs.getInt("fpay");
				subject = rs.getString("subject");
				pay = rs.getInt("pay");
				kindpay = rs.getString("kindpay");

				String fp = "";

				if (fpay == 1) {
			fp = "예";
				} else {
			fp = "아니요";
				}

				out.println("<tr>");
				out.println("<td>" + hak + "</td>");
				out.println("<td>" + grade + "</td>");
				out.println("<td>" + name + "</td>");
				out.println("<td>" + fp + "</td>");
				out.println("<td>" + subject + "</td>");
				out.println("<td>" + pay + "</td>");
				out.println("<td>" + kindpay + "</td>");
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