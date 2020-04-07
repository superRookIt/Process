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
		String auth_user = (String) session.getAttribute("auth_user");
	if (auth_user == null) {
		out.println("auth_user 섹션이 없습니다");
	} else {
		out.println(auth_user + "섹션이 있습니다");
	}
	
	session.invalidate();
	/* 모두 지우기 */
	
	
	%>
	
	<a href="session_alldel.jsp">섹션 모두 지우기</a>


</body>
</html>