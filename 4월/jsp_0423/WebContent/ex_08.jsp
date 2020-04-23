<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!int check1 = 1;%>

	<c:set var="check" value="1"></c:set>

	<c:choose>

		<c:when test="<%=check1 == 1%>">
			<p>풀옵션의 차량을 선택</p>
			<%-- 
			<c:param name="user_id" value="admin"></c:param>
			<c:redirect url="ex_05.jsp"></c:redirect> 
			--%>
		</c:when>

		<c:when test="${check==2}">
			<p>5개의 옵션을 선택</p>
		</c:when>

		<c:when test="${check==3}">
			<p>3개의 옵션 차량 선택</p>
		</c:when>

		<c:otherwise>
			<p>선택한 옵션이 없습니다</p>
		</c:otherwise>

	</c:choose>



</body>
</html>