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
		
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String[] hobby = request.getParameterValues("hobby");
	String major = request.getParameter("major");
	String address = request.getParameter("name");
	
	%>

	<table>
		<tr>
			<td>이름</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%=id %></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><%=pw %></td>
		</tr>
		<tr>
			<td>취미</td>
			<td><%=Arrays.toString(hobby) %></td>
		</tr>
		<tr>
			<td>전공</td>
			<td><%=major %></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><%=address %></td>
		</tr>
	</table>


	<%
		
	/* Enumeration은 Iterator의 구버전 */
	Enumeration e = request.getParameterNames();

	int i=0;
	/* 현재 읽어올 name값이 있는지 확인 [input의 name 같은] */
	while (e.hasMoreElements()) {
		i++;
		String ename = e.nextElement().toString();
		out.println("form "+i+"번째 이름 : "+ename+"<br>");
	}
	
	%>



</body>
</html>