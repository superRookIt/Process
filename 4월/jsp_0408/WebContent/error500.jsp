<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page isErrorPage="true" %>
<%response.setStatus(200); %> 	
<!-- response.setStatus(200) : 정상 페이지라는 뜻 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	margin: 0;
	padding: 0;
}

div {
	width: 1200px;
	margin: 50px auto;
}
</style>
</head>
<body>

	<div>
		<img alt="에러500페이지" src="img/error500.jpg">
		<%=exception.getMessage() %>
	</div>



</body>
</html>