<%@page import="java.util.Enumeration"%>
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

	//db와 연동해서 id,pw를 비교함
	if (id.equals("admin") && pw.equals("1234")) {

		//섹션추가
		session.setAttribute("auth_user", id);
		session.setAttribute("nick_name", "hicchup츄");

		response.sendRedirect("index.jsp");
	}

	else {
	%>
	<script type="text/javascript">
		alert("아이디, 패스워드가 잘못 입력되었습니다. 다시 입력해주세요");
		history.back(-1);
	</script>
	<%
		response.sendRedirect("login.html");

	}
	%>



</body>
</html>