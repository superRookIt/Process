<%@page import="com.javalec.ex.MemberDTO"%>

<%@page import="java.util.ArrayList"%>

<%@page import="com.javalec.ex.MemberDAO"%>

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
			<th>회원 아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>휴대전화</th>
			<th>성별</th>
		</tr>
		
	<%
		
	MemberDAO mda = new MemberDAO();
	ArrayList list = mda.member_select();
	MemberDTO mdt;
	String id, pw, name, phone1, phone2, phone3, gender;
	
	for(int i=0;i<list.size();i++){
		
		mdt = (MemberDTO) list.get(i);
		
		id=mdt.getId();
		pw=mdt.getPw();
		name=mdt.getName();
		phone1=mdt.getPhone1();
		phone2=mdt.getPhone2();
		phone3=mdt.getPhone3();
		gender=mdt.getGender();
		
		
     %>
		<tr>
			<td><a href="#"><%=id%></a></td>
			<td><%=pw %></td>
			<td><%=name %></td>
			<td><%=phone1 %>-<%=phone2 %>-<%=phone3 %></td>
			<td><%=gender %></td>
		</tr>
		
		
	<% 
	
	} //for
	
	%>

</table>

</body>
</html>