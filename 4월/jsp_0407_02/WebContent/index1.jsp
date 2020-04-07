<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!String user_id;%>

	<%
		Cookie[] cookies = request.getCookies();

	for (int i = 0; i < cookies.length; i++) {
		String cookie_ch = cookies[i].getName();
		if (cookie_ch.equals("user_id")) {
			user_id = cookies[i].getValue(); // id:admin 저장
		} else {
			user_id = null;
		}

	}

	if (user_id == null) {
	%>

	<!--로그인 안 되었을때  -->

	<p>네이버를 더 안전하고 편리하게 이용하세요.</p>
		<button>
			<a href="login.jsp">로그인</a>
		</button>


	<%
		} else {
	%>

	<!-- 로그인 되었을때  -->

	반갑습니다 	<br>
	로그인에 성공했어요	<br>
	<button>
		<a href="logout.jsp">로그아웃하기</a>
	</button>

	<%
		}
	%>


</body>
</html>