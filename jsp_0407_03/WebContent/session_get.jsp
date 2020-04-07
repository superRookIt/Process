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
		Object obj1 = session.getAttribute("auth_user");
	String auth_user = (String) obj1;
	out.println("session 값 : " + auth_user + "<br>");

	Object obj2 = session.getAttribute("naver_id");
	String naver_id = (String) obj2;
	out.println("session 값 : " + naver_id + "<br>");

	Object obj3 = session.getAttribute("pw");
	/* Integer pw = (Integer) obj3; */
	int pw = (int) obj3;
	out.println("session 값 : " + pw + "<br>");

	Object obj4 = session.getAttribute("nick_name");
	String nick_name = (String) obj4;
	out.println("session 값 : " + nick_name + "<br>");

	out.println("----------------------------<br>");

	String se_n;
	String se_v;

	Enumeration enum1 = session.getAttributeNames();

	while (enum1.hasMoreElements()) {
		se_n = enum1.nextElement().toString();
		se_v = session.getAttribute(se_n).toString();
		out.println("섹션 : name - " + se_n + " / ");
		out.println("value - " + se_v + "<br>");
	}
	
	out.println("----------------------------<br>");
	
	String se_id = session.getId();
	out.println("섹션 고유번호 : " + se_id+"<br>");
	
	out.println("----------------------------<br>");
	
	int inter = session.getMaxInactiveInterval();
	out.println("섹션 유효시간 : "+inter+"<br>");
	
	out.println("----------------------------<br>");
	
	session.removeAttribute("auth_user"); 
	
	
	%>

	<a href="session_del.jsp">섹션 지우기</a>


</body>
</html>