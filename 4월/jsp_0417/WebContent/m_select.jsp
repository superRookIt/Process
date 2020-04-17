<%@page import="java.sql.Timestamp"%>
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
			<th>회원 번호</th>
			<th>회원 아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>이메일</th>
			<th>주소</th>
			<th>휴대폰번호</th>
			<th>성별</th>
			<th>이메일수신여부</th>
			<th>문자수신여부</th>
			<th>생일</th>
		</tr>
		
	<%
		
	MemberDAO mda = new MemberDAO();
	ArrayList list = mda.member_select();
	MemberDTO mdt;
	int num;
	String id, pw, name, email, address, phone, gender, news, sms;
	Timestamp birth;
	
	for(int i=0;i<list.size();i++){
		
		mdt = (MemberDTO) list.get(i);
		
		num = mdt.getNum();
		id = mdt.getId();
		pw = mdt.getPw();
		name = mdt.getName();
		email = mdt.getEmail();
		address = mdt.getAddress();
		phone = mdt.getPhone();
		gender = mdt.getGender();
		news = mdt.getNews();
		sms = mdt.getSms();
		birth = mdt.getBirth();
		
		
     %>
		<tr>
			<td><%=num%></td>
			<td><%=id%></td>
			<td><%=pw%></td>
			<td><%=name%></td>
			<td><%=email%></td>
			<td><%=address%></td>
			<td><%=phone%></td>
			<td><%=gender%></td>
			<td><%=news%></td>
			<td><%=sms%></td>
			<td><%=birth%></td>
		</tr>
		
		
	<% 
	
	} //for
	
	%>

</table>

</body>
</html>