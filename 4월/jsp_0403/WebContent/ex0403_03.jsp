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
			<td>범위</td>
			<td>더하기</td>
			<td>곱하기</td>
		</tr>


		<%
		
		/* 변수 선언 */
			
		int i = 0;
		int sum = 0;
		double mul = 1;

		/* 더하기 */

		out.println("<tr>");
		out.print("<td> 1~10 </td>");

		for (i = 1; i <= 10; i++) {
			sum += i;
			mul *= i;
		}
		out.print("<td>" + sum + "</td>");
		out.print("<td>" + mul + "</td>");
		out.println("</tr>");

		/* 곱하기 */

		out.println("<tr>");
		out.print("<td> 1~100 </td>");

		i = 0;
		sum = 0;
		mul = 1;

		for (i = 1; i <= 100; i++) {
			sum += i;
			mul *= i;
		}
		out.print("<td>" + sum + "</td>");
		out.print("<td>" + mul + "</td>");
		out.println("</tr>");
		%>

	</table>


</body>
</html>