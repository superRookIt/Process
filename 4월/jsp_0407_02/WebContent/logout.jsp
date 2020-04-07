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
		//쿠키를 삭제 후 index1.jsp로 이동

	Cookie[] cook_ch = request.getCookies();

	for (int i = 0; i < cook_ch.length; i++) {

		String check = cook_ch[i].getName();

		if (check.equals("user_id")) {
			cook_ch[i].setMaxAge(0);
			response.addCookie(cook_ch[i]);
			response.sendRedirect("index1.jsp");
		}

	} //for 문
	%>
</body>
</html>