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
	
	Object obj1 = session.getAttribute("id");
	String auth_user = (String) obj1;

	if (auth_user == null) {
	%>

	<!--로그인 안 되었을때  -->

	<p>네이버를 더 안전하고 편리하게 이용하세요.</p>
		<button>
			<a href="login.html">로그인</a>
		</button>


	<%
		} else {
	%>

	<!-- 로그인 되었을때  -->

	반갑습니다 <%=session.getAttribute("id") %>님!!	<br>
	로그인에 성공했어요	<br>
	<button>
		<a href="logout.jsp">로그아웃하기</a>
	</button>

	<%
		}
	%>


</body>
</html>