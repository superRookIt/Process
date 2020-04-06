<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>저장된 쿠키</h2>

	<%
		
	//쿠키 저장하기
	String id = request.getParameter("id");
	String value = request.getParameter("value");

	Cookie cookie = new Cookie(id, value);
	//Cookie(name,value)
	cookie.setMaxAge(60 * 30); //1800초->30분
	response.addCookie(cookie);

	//쿠키 읽어오기
    Cookie[] cook_read = request.getCookies();
	for(int i=0;i<cook_read.length;i++){
		out.println("쿠키 이름 : "+cook_read[i].getName()+"<br>");
		out.println("쿠키 값 : "+cook_read[i].getValue()+"<br>");
	}
	
	
	%>

	<a href="form3.jsp">쿠키 삭제</a>

</body>
</html>