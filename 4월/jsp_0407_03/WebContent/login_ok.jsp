<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		//id,pw를 비교해서 쿠키에 저장
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	//db와 연동해서 id,pw를 비교함
	if (id.equals("admin") && pw.equals("1234")) {
		
		session.setAttribute("id", id);
		/* session.setAttribute("pw", pw); */
		
		/* Enumeration enum2 = session.getAttributeNames();

		String se_n;
		String se_v;

		while (enum2.hasMoreElements()) {
			se_n = enum2.nextElement().toString();
			se_v = session.getAttribute(se_n).toString();
			out.println("섹션 : id - " + se_n + " / ");
			out.println("pw - " + se_v + "<br>");
		} */
		
		 response.sendRedirect("index.jsp");
	}

	else {
		response.sendRedirect("login.html");
	}
	%>



</body>
</html>