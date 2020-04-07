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

	<h2>입력된 세션 보기</h2>

	<%
		
	Enumeration enum1 = session.getAttributeNames();

	String se_n;
	String se_v;

	while (enum1.hasMoreElements()) {
		se_n = enum1.nextElement().toString();
		se_v = session.getAttribute(se_n).toString();
		out.println("섹션 : name - " + se_n + " / ");
		out.println("value - " + se_v + "<br>");
	}
	%>


	<form action="form4.jsp" name="">
		name<input type="text" name="name"> 
		<input type="submit" value="지우기">
	</form>


</body>
</html>