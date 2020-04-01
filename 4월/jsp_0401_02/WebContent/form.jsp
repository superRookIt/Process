<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="form_ok.jsp" name="login" method="post">
	
		<label>아이디</label> 
		<input type="text" name="id"><br>
		<label>패스워드</label> 
		<input type="text" name="pw"><br>
		<label>이름</label> 
		<input type="text" name="name"><br>
		<input type="submit" value="전송">
		<input type="reset" value="취소">

	</form>

</body>
</html>