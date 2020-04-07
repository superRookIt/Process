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
		session.setAttribute(request.getParameter("name"), request.getParameter("value"));
	%>

	<h2>섹션이 등록되었습니다</h2>
	<a href="form3.jsp">섹션 보기</a>


</body>
</html>