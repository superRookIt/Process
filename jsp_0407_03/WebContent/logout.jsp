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
		//쿠키를 삭제 후 index1.jsp로 이동
	session.invalidate();
	response.sendRedirect("index.jsp");
	
	%>
</body>
</html>