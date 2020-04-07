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
		/* 유효한 값이 있느냐 */
	if (request.isRequestedSessionIdValid()) {
		out.println("섹션이 있습니다.");
	} else {
		out.println("섹션이 없습니다.");
	}
	%>

	<a href="form1.jsp">처음으로</a>

</body>
</html>