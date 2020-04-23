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


	<table border="1">
		<tr>
			<th>변수 i 순서</th>
			<th>변수 sum</th>
			<th>합계</th>
		</tr>


		<c:set var="sum" value="0"></c:set>
		<c:forEach var="i" begin="1" end="100" step="1">
			<tr>
				<td>${i}</td>
				<td>${sum }</td>
				<td>${sum=sum+i }</td>
			</tr>
		</c:forEach>

	</table>






</body>
</html>