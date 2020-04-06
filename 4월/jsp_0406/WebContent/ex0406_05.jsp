<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>쿠키 3개가 저장되었습니다<br> 읽기를 클릭해주세요</h2>

	<%
		
	Cookie cookie = new Cookie("naver_id", "admin"); 
	//Cookie(name,value)
	cookie.setMaxAge(60 * 30); //1800초->30분
	response.addCookie(cookie);

	Cookie co2 = new Cookie("naver_pw", "1234");
	co2.setMaxAge(1800);
	response.addCookie(co2);

	Cookie co3 = new Cookie("nick_name", "koitt");
	co3.setMaxAge(1800);
	response.addCookie(co3);
	%>

	<a href="cookie_get.jsp">쿠키정보 읽기</a>


</body>
</html>