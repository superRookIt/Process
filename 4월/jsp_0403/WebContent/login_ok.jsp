<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
	<h2>로그인에 성공하셨습니다</h2>

	<p>
	
		<%=request.getParameter("name")%>님 환영합니다 
		아이디는 <%=request.getParameter("id")%>이고 
		비밀번호는 <%=request.getParameter("pw")%>입니다
	</p>


</body>
</html>