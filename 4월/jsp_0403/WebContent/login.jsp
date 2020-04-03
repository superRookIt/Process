<%@page import="java.net.URLEncoder"%>
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
		
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = URLEncoder.encode(request.getParameter("name"),"utf-8"); /* ★★★ */
	
	
	if (id.equals("admin") && pw.equals("777")) {
		response.sendRedirect("login_ok.jsp?id=" + id + "&pw=" + pw + "&name=" + name);
	} else {
		response.sendRedirect("loginH.jsp?id=" + id);
		/* response.sendRedirect("login_no.jsp"); */
		/* response.sendRedirect("login.html"); */
	}
	
	%>



</body>
</html>