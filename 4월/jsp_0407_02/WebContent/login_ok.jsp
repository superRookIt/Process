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
		//id,pw를 비교해서 쿠키에 저장
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	//db와 연동해서 id,pw를 비교함
	if (id.equals("admin") && pw.equals("1234")) {

		Cookie co1 = new Cookie("user_id", id);
		co1.setMaxAge(1800);
		response.addCookie(co1);

		response.sendRedirect("index1.jsp");
	}

	else {
		response.sendRedirect("login.jsp");
	}
	%>



</body>
</html>