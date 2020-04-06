<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Arrays"%>

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
	
	/* 인코딩은 맨 위에 적어야 함! */
	request.setCharacterEncoding("utf-8");
		
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String[] hobby = request.getParameterValues("hobby");
	String gender = request.getParameter("gender");
	Enumeration enumer = request.getParameterNames(); /* ★  */
	
	
	%>

	<h1>회원정보</h1>
	<p>
		아이디 :
		<%=id%></p>
	<p>
		패스워드 :
		<%=pw%></p>
	<p>
		이름 :
		<%=name%></p>
	<p>
		취미 :
		<%=Arrays.toString(hobby)%></p>
	<p>
		성별 :
		<%=gender%></p>

	==================================<br>
	
	<%-- jsp 주석 --%>
	
	<% 
	
	while(enumer.hasMoreElements()){
		String e_name = enumer.nextElement().toString();
		out.println(e_name);
	}
	
	
	%>

</body>
</html>