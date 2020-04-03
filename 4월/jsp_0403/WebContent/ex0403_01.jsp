<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table{font-size:20px;}
tr,td{border-bottom:1px solid black;}
</style>
<title>Insert title here</title>
</head>
<body>

	<%-- jsp 주석 : html 소스보기에서 나타나지 않음--%>

	<!-- html 주석 : html 소스보기에서 나타남-->

<h1>구구단 출력</h1>

	<table>
			<%
				int i = 0;
			for (i = 1; i <= 9; i++) {
				out.println("<tr>");
				out.print("<td>2 * " + i + " = " + "</td>");
				out.print("<td>" + (2 * i) + "</td>");
				out.println("</tr>");
			}
			%>
	</table>

	<%-- 
	<%
		int i = 0;
	while (true) {
		i++;
		out.println("<구구단 출력><br>");
		out.println("2 * " + i + " = " + (2 * i) + " <br>");
	%> 
	--%>

	<!-- <p>================</p> -->

	<%-- 
	<%
		if (i >= 9) {
		break;
	}

	}
	%> 
	--%>



</body>
</html>