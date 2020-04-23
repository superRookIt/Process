<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- prefix 변수명 -->



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<c:set var="id" value="admin"></c:set>
	<c:set var="pw" value="1234"></c:set>
	<%-- <c:remove var="pw"></c:remove> --%>
	<c:set var="str" value="^a&"></c:set>
	
	
	
	<h2>jstl core 태그</h2>

	아이디 :
	<c:out value="${id}"></c:out><br> 비밀번호 :
	<c:out value="${pw}" /><br> 문자 :
	<c:out value="${str}" /><br> 
	------------------------------- <br>

	<c:catch var="error"><%=2 / 0%></c:catch>
	
	<c:out value="${error }"></c:out><br>

	<hr>
	
	<c:if test="${pw==1234}">
	패스워드가 일치합니다. 패스워드는
		<c:out value="${pw }"></c:out>
		<br>
	</c:if>

	
	<c:if test="${pw!=1234}">
	패스워드가 불일치합니다. 
		<c:out value="${pw }"></c:out>
		<br>
	</c:if>
	
	
	<c:if test="${id=='admin'}">
		<c:out value="${id }"></c:out>
		<br>
	</c:if>
	
	



	




</body>
</html>
