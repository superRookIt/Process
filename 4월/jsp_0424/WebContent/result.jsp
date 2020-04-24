<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Arraylist 출력</h2>

	<table border="1">

		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>패스워드</th>
		</tr>

		<c:forEach var="dto" items="${test}">

			<tr>
				<th>${dto.getNum()}</th>
				<th>${dto.getId() }</th>
				<th>${dto.getPw() }</th>
			</tr>

		</c:forEach>
		
	</table>

<hr>

<h2>클래스 1개 출력</h2>
<table border="1">
		<tr>
			<th>번호</th>
			<th>아이디</th>	
			<th>패스워드</th>
		</tr>

			<tr>
				<th>${requestScope.ldto.getNum()}</th>
				<th>${requestScope.ldto.getId()}</th>
				<th>${requestScope.ldto.getPw()}</th>
			</tr>

		
	</table>





<% 


String user_id= (String) request.getAttribute("user_id");
String user_pw = (String) request.getAttribute("user_pw");
String user_name = (String) request.getAttribute("user_name");


%>

아이디 : <%=user_id %><br>
비밀번호 : <%=user_pw %><br>
이름 : <%=user_name %><br>

<hr>


아이디 : ${requestScope.user_id }<br>
비밀번호 : ${requestScope.user_pw }<br>
이름 :  ${requestScope.user_name }<br>

</body>
</html>