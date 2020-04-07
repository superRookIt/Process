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
		
	session.removeAttribute(request.getParameter("name"));
	String del = request.getParameter("name");

	Enumeration enum2 = session.getAttributeNames();

	String se_n;
	String se_v;

	while (enum2.hasMoreElements()) {
		se_n = enum2.nextElement().toString();
		se_v = session.getAttribute(se_n).toString();
		out.println("섹션 : name - " + se_n + " / ");
		out.println("value - " + se_v + "<br>");
	}

	session.invalidate();
	%>

	<h2>
		입력한 섹션
		<%=del%>을/를 지웠습니다
	</h2>
	<a href="form5.jsp">모두 지우기</a>

</body>
</html>