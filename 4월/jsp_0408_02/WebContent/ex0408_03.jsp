<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%request.setCharacterEncoding("utf-8");%>
<!-- form method="post" 방식은 인코딩 -->

<jsp:useBean id="join1" class="com.javalec.ex.Person" scope="page" />

<jsp:setProperty property="*" name="join1"  />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>회원 정보</h2> 
<!-- 앞으로 이렇게 씀 -->


이름 : <%=join1.getName() %><br>
아이디 : <%=join1.getId() %><br>
패스워드 : <%=join1.getPw() %><br>
성별 : <%=join1.getGender() %><br>
주소 : <%=join1.getAddress() %><br>

</body>
</html>