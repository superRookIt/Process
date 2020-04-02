<%@page import="org.apache.catalina.tribes.util.Arrays"%>

<%@page
	import="com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array"%>
	
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
<!DOCTYPE html>
<html>
<head>
<style>

table {width: 600px;border-collapse: collapse;border: 1px solid black;}
td {border: 1px solid black;text-align: center;}
td:nth-child(1) {width: 200px;}
td:nth-child(2) {width: 400px;}


</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		request.setCharacterEncoding("utf-8");
	%>

	<h1>회원가입</h1>

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
			<td><%=request.getParameter("pw1")%></td>
		</tr>
		
		<tr>
			<td>휴대전화</td>
			<td><%=request.getParameter("phone")%></td>
		</tr>
		
		<tr>
			<td>결혼여부</td>
			<td><%=request.getParameter("marry")%></td>
		</tr>
		
		<tr>
			<td>직업</td>
			<td><%=request.getParameter("job")%></td>
		</tr>
		
		<tr>
			<td>관심사</td>
			<td><%=Arrays.toString(request.getParameterValues("hobby"))%></td>
		</tr>

	</table>

</body>
</html>