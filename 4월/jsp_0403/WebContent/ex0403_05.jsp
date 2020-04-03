<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table{width:600px;border:1px solid black;}
tr{width:100px;text-align: center;}

</style>
<title>Insert title here</title>
</head>
<body>

	<%
		
	String start = request.getParameter("start");
	String end = request.getParameter("end");
	
	int b1=Integer.parseInt(start);
	int b2=Integer.parseInt(end);
	
	%>


<%!int sum = 0;
	double mul = 1;

	public int sum(int a, int b) {
		for (int i = a; i <= b; i++) {
			sum += i;
		}

		return sum;
	}

	public double mul(int a, int b) {
		for (int i = a; i <= b; i++) {
			mul *= i;
		}

		return mul;
	}%> 


	<table>
		<tr>
			<td>입력값</td>
			<td>더하기(두 수)</td>
			<td>곱하기(두 수)</td>
			<td>더하기(누적)</td>
			<td>곱하기(누적)</td>
		</tr>
		
		<tr>
			<td><%= start +" ~ "+ end %></td>
			
			<td><%= b1+b2 %></td>
			<td><%= b1*b2 %></td>
			
			<td><%= sum(b1,b2) %></td>
			<td><%= mul(b1,b2) %></td> 
			
			
			<td></td>
			
		</tr>

	</table>


</body>
</html>