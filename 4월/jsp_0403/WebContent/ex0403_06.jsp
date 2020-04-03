<%@page import="java.util.Arrays"%> <!-- ★  -->

<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table{width:600px;border:1px solid black;border-collapse: collapse;}
tr{width:100px;text-align: center;}
td{border:1px solid black;}

</style>
<title>Insert title here</title>
</head>
<body>

	<%
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		
		/* int b=Integer.parseInt(kor); */
		int b1=Integer.parseInt(request.getParameter("kor"));
		int b2=Integer.parseInt(eng);
		int b3=Integer.parseInt(math);
		
		int total = b1 + b2 + b3;
		double avg = total / 3;
		
		int[] arr = { 1, 2, 3 };
		out.println(Arrays.toString(arr)); 
	%>

	<table>
	
		<tr>
			<td>학번</td>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
			<td>합계</td>
			<td>평균</td>
		</tr>

		<tr>
			<td><%= request.getParameter("hak") %></td>
			<td><%= request.getParameter("name") %></td>

			<td><%= kor%></td>
			<td><%= eng %></td>
			<td><%= math %></td>

			<td><%= total %></td>
			<td><%= avg %></td>
		</tr>

	</table>
	
	<!-- <p>학번 : <%-- <%= name %> --%> </p> -->
	

</body>
</html>