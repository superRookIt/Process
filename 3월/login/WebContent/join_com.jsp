<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>회원가입 확인</h1>
<span>아이디 : </span><%= request.getParameter("j_id") %><br> <!-- name을 봐야 -->
<span>이름 : </span><%= request.getParameter("j_name") %>


</body>
</html>