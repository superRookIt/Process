<!----------------------------------------- 
	
	     이것만 붙이면 jsp파일이 됨  
	     
------------------------------------------->
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>

<style>
table {
	width: 500px;
	border: 1px solid black;
	border-collapse: collapse;
}

td {
	border: solid 1px black;
	width: 100px;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% request.setCharacterEncoding("utf-8"); %>

	<table>
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("name")%></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%=request.getParameter("id")%></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><%=request.getParameter("pw")%></td>
		</tr>
		<tr>
			<td>취미</td>
			<td><%=Arrays.toString(request.getParameterValues("hobby"))%></td>
			<!-- ★★★  -->

		</tr>
		<tr>
			<td>전공</td>
			<td><%=request.getParameter("major")%></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><%=request.getParameter("address")%></td>
		</tr>

	</table>


</body>
</html>