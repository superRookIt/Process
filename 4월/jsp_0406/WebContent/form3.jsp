<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>쿠키 삭제</h2>

	<%
		
	Cookie[] cookies = request.getCookies();
	for (int i = 0; i < cookies.length; i++) {
		cookies[i].setMaxAge(0); // 0초->쿠키삭제와 같음
		response.addCookie(cookies[i]);
	}
	/* cookies[i].setMaxAge(0); */
	%>


	<%
	
	//쿠키 다시 읽어오기
	
	Cookie[] cook_read = request.getCookies();
	
	if(cook_read !=null){
		for (int i = 0; i < cook_read.length; i++) {
			out.println("쿠키 이름 : " + cook_read[i].getName() + "<br>");
			out.println("쿠키 값 : " + cook_read[i].getValue() + "<br>");
		}
	}
	else{
		out.println("쿠키 정보가 없습니다");
	}
	
	
	%>



</body>
</html>