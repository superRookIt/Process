<%@page import="javax.xml.bind.ParseConversionEvent"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

	String emp_name, job_id;
	int employee_id;
	double salary;%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		//jdbc연결은 try-catch문으로

	//★ 한글처리
	request.setCharacterEncoding("utf-8");

	try {

		//jbc 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");

		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle", "ora_user", "1234");

		//Statement 연결
		stmt = con.createStatement();

		//html form에서 데이터 받음 ★★★
		/* int start = Integer.parseInt(request.getParameter("start")); */

		String start = request.getParameter("start");
		String end = request.getParameter("end");

		/* String sql = "select * from ppap where name like '%" + in1 + "%'"; */
		/* String sql = "select * from ppap where id like '%" + in1 + "%' order by id desc"; */

		/*  between , and  띄어쓰기 해줘야 함 !!!!! */
		String sql = "select * from employees where salary between " + start + " and " + end + " order by salary";

		rs = stmt.executeQuery(sql);

		out.println("<h2>회원정보</h2>");

		while (rs.next()) {

			employee_id = rs.getInt("employee_id");
			emp_name = rs.getString("emp_name");
			salary = rs.getDouble("salary");
			job_id = rs.getString("job_id");

			out.println("사원 번호 : " + employee_id + " ㅣ● ");
			out.println("사원 이름 : " + emp_name + " ㅣ● ");
			out.println("월급 : " + salary + " ㅣ● ");
			out.println("부서명 : " + job_id + "<br>");

		}

		//★
		out.println("<a href='form.html'> 다시 검색하기 </a>");

	} catch (Exception e1) {
		e1.printStackTrace();

	} finally {

		try {

			if (!(rs == null))
		rs.close();
			if (!(stmt == null))
		stmt.close();
			if (!(con == null))
		con.close();

		} catch (Exception e2) {
			e2.printStackTrace();

		}

	}
	%>

</body>
</html>