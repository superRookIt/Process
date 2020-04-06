<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>네이버페이지에서 로그아웃을 하였습니다.</h2>

	<%
		
	Cookie[] cookies = request.getCookies();
	for (int i = 0; i < cookies.length; i++) {
		String str = cookies[i].getName();
		
		if (str.equals("naver_id")) {
			out.println("naver_id 쿠키 삭제 <br>");
			cookies[i].setMaxAge(0); // 0초->쿠키삭제와 같음
			response.addCookie(cookies[i]);
		}
		/* cookies[i].setMaxAge(0); */
	}
	%>

<a href="cookie_test.jsp">쿠키 확인</a>


</body>
</html>