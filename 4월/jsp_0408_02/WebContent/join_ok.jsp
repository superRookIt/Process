<%@page import="java.util.Arrays"%>
<%@page import="java.lang.reflect.Array"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%request.setCharacterEncoding("utf-8");%>
<!-- form method="post" 방식은 인코딩 -->

<jsp:useBean id="mem1" class="com.javalec.ex.Member" scope="session" />

<jsp:setProperty name="mem1" property="*"  />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 확인</title>
</head>
<body>

<h2>회원 정보</h2> 

이름  : <%= mem1.getName() %><br>
닉네임  : <%= mem1.getNick() %><br>
아이디 : <%= mem1.getId() %><br>
패스워드 : <%= mem1.getPw() %><br>
성별  : <%= mem1.getGender() %><br>
직업  : <%= mem1.getJob() %><br>
취미 : <%= Arrays.toString(mem1.getHobby()) %><br>
취미 :	<%
		String[] job = mem1.getHobby();
	for (int i = 0; i < job.length; i++) {
		out.println(job[i]+" , ");
	}
	%><br>
	
	<a href="index.jsp">메인으로</a>


</body>
</html>