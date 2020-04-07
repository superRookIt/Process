<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!String naver_user;%>

	<%
		
	/* user가 naver_index2.jsp에 바로 접근해도 페이지가 열리지 않도록 함 */
	Cookie[] cookies = request.getCookies();
	
	for (int i = 0; i < cookies.length; i++) {
		String c_check = cookies[i].getName();
		if (c_check.equals("user_id")) {
			naver_user = cookies[i].getValue();
		}

	} //for

	if (naver_user == null) {
		response.sendRedirect("login.html");
	}
	
	
	%>

	<%=naver_user%>
	님
	<br> 반갑습니다
	<br>
	<a href="logout.jsp">로그아웃하기</a>


</body>
</html>