<%@page import="java.sql.Timestamp"%>
<%@page import="jsp_0417_02.DT"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jsp_0417_02.DA"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원정보 리스트</h2>
	<table border="1">
		<tr>
			<th>회원아이디</th>
			
			<%
		
	DA mda = new DA();
	ArrayList list = mda.member_select();
	DT mdt;
	String id;
	
	for(int i=0;i<list.size();i++){
		
		mdt = (DT) list.get(i);
		
		id = mdt.getId();
		
		
     %>
		<tr>
			<td><%=id%></td>
		</tr>
		
	<% 
	
	} //for
	
	%>
			
	</TABLE>
</body>
</html>