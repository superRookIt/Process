<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table,td,td{font-size:20px;border:1px solid black;border-collapse: collapse;}
td:nth-child(1){width:100px;}
td:nth-child(2){width:300px;}
</style>
<title>Insert title here</title>
</head>
<body>

<h1>구구단 출력</h1>

	<table>
		<tr>
			<td>단</td>
			<td>계산식</td>
		</tr>

		<%
			int i = 0;
		for (i = 2; i <= 3; i++) {
			for (int j = 1; j <= 9; j++) {
				out.println("<tr>");
				out.print("<td>" + i + " 단 </td>");
				out.print("<td>" + i + " * " + j + " = " +  (i * j)  + "</td>");
				out.println("</tr>");
			}
		}
		%>
	</table>


</body>
</html>