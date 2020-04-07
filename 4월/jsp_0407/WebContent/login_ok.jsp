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
		
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	//db에서 id,pw를 체크하게 됨. 결과값을 리턴
	if (id.equals("admin") && pw.equals("1234")) {
		Cookie co1 = new Cookie("user_id", "admin");
		co1.setMaxAge(1800);
		response.addCookie(co1);
		
		Cookie co2 = new Cookie("password", "1234");
		co1.setMaxAge(1800);
		response.addCookie(co2);
		
		Cookie co3 = new Cookie("nick_name", "goldstar");
		co1.setMaxAge(1800);
		response.addCookie(co3);
		
		response.sendRedirect("naver_index2.jsp");
	} else {
	%>

	<script>
		alert('아이디/패스워드가 일치하지 않습니다. \n 다시 로그인 해주세요') 
		/* /n :  엔터  */
	</script>

	<%
		response.sendRedirect("login.html");

	}
	%>


</body>
</html>