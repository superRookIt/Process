<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:forward page="param.jsp">
<%-- 	<jsp:forward page="param.jsp?id=admin&pw=1234&name=홍길동"> --%>
		<jsp:param name="id" value="admin" />
		<jsp:param name="pw" value="1234" />
		<jsp:param name="name" value="홍길동" />
	</jsp:forward>

</body>
</html>