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
		Cookie[] co_all = request.getCookies();
	for (int i = 0; i < co_all.length; i++) {
		String c_name = co_all[i].getName();

		if (c_name.equals("authUser")) {
			co_all[i].setMaxAge(0);
			response.addCookie(co_all[i]);
		}
		
		if (c_name.equals("nick_name")) {
			co_all[i].setMaxAge(0);
			response.addCookie(co_all[i]);
		}
		
		if (c_name.equals("user_id")) {
			co_all[i].setMaxAge(0);
			response.addCookie(co_all[i]);
		}
		

	} //for
	
		/* response.sendRedirect("login.html"); */
			
	
	%>
	
	<h2>쿠키가 삭제되었습니다. </h2>
	<a href="cookie_get.jsp">쿠키 정보 읽기</a>


</body>
</html>