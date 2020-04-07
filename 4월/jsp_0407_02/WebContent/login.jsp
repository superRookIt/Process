<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form id="Login" name="Login" action="login_ok.jsp" method="get">

		아이디<input type="text" id="id" name="id" placeholder="아이디" maxlength="41"><br> 
			
		비밀번호 <input type="password" id="pw" name="pw" placeholder="비밀번호" maxlength="16"> <br> 
			
		<input type="submit" value="로그인" id="log">

	</form>


</body>
</html>