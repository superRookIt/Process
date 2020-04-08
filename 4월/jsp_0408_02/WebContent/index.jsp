<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%request.setCharacterEncoding("utf-8");%>
<!-- form method="post" 방식은 인코딩 -->

<jsp:useBean id="mem1" class="com.javalec.ex.Member" scope="session" />
<jsp:setProperty name="mem1" property="*"  />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/naver.css">
<title>Insert title here</title>

</head>

<body>

	<%
		
	String s_user = (String) session.getAttribute("auth_user");

	if (s_user == null) {
		
		
	%>

	<!--로그인 안 되었을때  -->

	<div id="account" class="section_login">
		<div class="lg_local">
			<p class="lg_local_text">네이버를 더 안전하고 편리하게 이용하세요.</p>
			<a class="lg_local_btn" href="login.html" role="button"> <i
				class="ico_local_login lang_ko"></i>
			</a>
			<div class="lg_links">
				<a
					href="https://nid.naver.com/nidregister.form?url=https%3A%2F%2Fwww.naver.com"
					class="lg_link_join">회원가입</a> <span class="lg_link_find"><a
					href="https://nid.naver.com/user/help.nhn?todo=idinquiry"
					class="lg_find_text">아이디</a>·<a
					href="https://nid.naver.com/nidreminder.form" class="lg_find_text"
					data-clk="log_off.searchpass">비밀번호 찾기</a></span>
			</div>
		</div>
	</div>

	<%
		} else {
	%>

	<!-- 로그인 되었을때  -->


	<div id="account" class="section_login">
		<div class="lg_local">
			<%=session.getAttribute(mem1.getNick())%>님<br> 안녕하세요
			 <a class="lg_local_btn" href="logout.jsp" role="button"> 
			 <span class= "ico_local_login lang_ko1">로그아웃</span>
			</a>
		</div>
	</div>

	<%
		}
	%>


</body>
</html>