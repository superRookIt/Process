<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<%
	response.setStatus(200);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지 오류</title>
<style>
div {
	width: 1200px;
	margin: 50px auto;
}
</style>
</head>

<body>
	<p>에러 메시지 넘어옴</p>
	<%=exception.getMessage()%>

</body>
</html>