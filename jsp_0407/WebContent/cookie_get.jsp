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
		Cookie[] co_all = request.getCookies(); //저장된 쿠키를 모두 읽어오기

	for (int i = 0; i < co_all.length; i++) {
		String c_name = co_all[i].getName();
		if (c_name.equals("authUser")) {
			out.println("아이디 : " + co_all[i].getValue() + "님! 안녕하세요.");
			/* response.sendRedirect("main.jsp"); */
		} else {
			/* response.sendRedirect("login.html"); */
		}
	}
	%>

	<p>------------------------------</p>

	<%
		for (int i = 0; i < co_all.length; i++) {
		out.println((i+1)+"번째 Cookie 정보 : "+co_all[i].getName()+" ");
		out.println(co_all[i].getValue()+"<br>");
	}
	%>
	
	<a href="cookie_del.jsp">쿠키 정보 지우기</a>
	





</body>
</html>