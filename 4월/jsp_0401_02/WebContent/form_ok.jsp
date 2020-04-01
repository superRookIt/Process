<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{width:600px; font-size:20px; border:1px solid black;border-collapse: collapse;}
tr,td{border:1px solid black;}
td:nth-child(1){width:200px;height:20px;text-align:center;}
td:nth-child(2){width:200px;height:20px;}

</style>


<% request.setCharacterEncoding("utf-8"); %> 
<!-- =가 없어서 ;붙여줘야  -->

</head>
<body>

<h1>로그인 정보</h1>
	<table>
		<tr>
			<td>아이디</td>
			<td><%= request.getParameter("id") %></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><%= request.getParameter("pw") %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%= request.getParameter("name") %></td>
		</tr>

	</table>

</body>
</html>