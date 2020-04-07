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
		
	Cookie cook1 = new Cookie("user_id", "admin");
	//new Cookie(name,value)
	cook1.setMaxAge(1800);//60*30 -> 30분
	response.addCookie(cook1);

	Cookie cook2 = new Cookie("nick_name", "goldstar");
	cook2.setMaxAge(1800);//60*30 -> 30분
	response.addCookie(cook2);
	
	Cookie cook3 = new Cookie("authUser", "admin");
	cook3.setMaxAge(1800);//60*30 -> 30분
	response.addCookie(cook3);
	
	%>
	
	<h2>쿠키 세개가 저장되었습니다.</h2>
	<a href="cookie_get.jsp">쿠키 보기</a>


</body>
</html>