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

	<%!
	
	int sum = 0;
	double mul = 1;
	
	%>
	
	<%!
	
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

	<h1>구구단 출력</h1>

	<table>
	
		<tr>
			<td>범위</td>
			<td>더하기</td>
			<td>곱하기</td>
		</tr>


		<tr>
			<td>1~10</td>
			<td><%=sum(1,10) %></td>
			<td><%=mul(1,10) %></td>
		</tr>
		
		<tr>
			<td>1~50</td>
			<td><%=sum(1,50) %></td>
			<td><%=mul(1,50) %></td>
		</tr>
		
		<tr>
			<td>1~100</td>
			<td><%=sum(1,100) %></td>
			<td><%=mul(1,100) %></td>
		</tr>


	</table>


</body>
</html>