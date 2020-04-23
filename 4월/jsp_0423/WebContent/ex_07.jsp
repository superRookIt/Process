<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<!DOCTYPE html>
<html>
<head>
<style>
th,td {width:100px;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<table border="1">
		<tr>
			<th>j</th>
			<th>i</th>
			<th>i*j</th>
		</tr>

		<c:set var="gu" value="0"></c:set>



		<c:forEach var="j" begin="1" end="9" step="1">
			<c:forEach var="i" begin="1" end="9" step="1">
				<tr>
					<td>${j}</td>
					<td>${i}</td>
					<td>${gu=i*j}</td>
				</tr>
			</c:forEach>
		</c:forEach>
		
		
		<c:forEach var="j" begin="1" end="9" step="2">
			<c:forEach var="i" begin="1" end="9" step="1">
				<tr>
					<td>${j}</td>
					<td>${i}</td>
					<td>${gu=i*j}</td>
				</tr>
			</c:forEach>
		</c:forEach>
		
		
		
		<c:forEach var="j" begin="1" end="9" step="1">
			<c:forEach var="i" begin="1" end="9" step="2">
				<tr>
					<td>${j}</td>
					<td>${i}</td>
					<td>${gu=i*j}</td>
				</tr>
			</c:forEach>
		</c:forEach>
		
		


	</table>



</body>
</html>