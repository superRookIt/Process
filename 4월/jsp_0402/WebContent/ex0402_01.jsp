<%@page import="org.apache.catalina.tribes.util.Arrays"%>
<!-- array.toString import -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- [JSP] : html소스에 자바를 넣음 -->
<!-- [Servlet] : 자바소스에 html을 넣음 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table {
	width: 600px;
	text-align: center;
	font-size: 20px;
	border-color: collapse;
}

tr, td {
	border: 1px solid black;
}

td:nth-child(1) {
	width: 200px;
}

td:nth-child(2) {
	width: 400px;
}
</style>
<body>

	<%
		request.setCharacterEncoding("utf-8");
	%>

	<h1>회원가입</h1>
	<table>
		<tr>
			<td>아이디</td>
			<td>
				<%-- <%out.println(request.getParameter("id"));%> --%> <%=request.getParameter("id")%>
			</td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><%=request.getParameter("pw")%></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("name")%></td>
		</tr>
		<tr>
			<td>취미</td>

			<!-- String[] hobby=request.getParameterValues("hobby")
			out.println(Arrays.toString(hobby)) -->

			<td>
				<%
					/* 

				String[] hobby = request.getParameterValues("hobby");
				for (int i = 0; i < hobby.length; i++) {
				switch (hobby[i]) 

				*/

				String hobby2 = "";
				out.println("<p> 취미 : ");
				for (int i = 0; i < request.getParameterValues("hobby").length; i++) {

					switch (request.getParameterValues("hobby")[i]) {

					case "read":
						hobby2 = "독서 ";
						break;

					case "cook":
						hobby2 = "요리 ";
						break;

					case "running":
						hobby2 = "러닝 ";
						break;

					case "swimming":
						hobby2 = "수영 ";
						break;
					}

					out.println(hobby2 + " ");

				}
				%>
			</td>
			<%-- <td><%=Arrays.toString(request.getParameterValues("hobby"))%></td> --%>
		</tr>

		<tr>
			<td>전공</td>
			<td>
				<%
					switch (request.getParameter("major")) {
				case "kor":
					out.println("전공은 한국어임");
					break;

				case "eng":
					out.println("전공은 영문학과 임</p>");
					break;

				case "math":
					out.println("전공은  수학과 임</p>");
					break;

				case "design":
					out.println("전공은 디자인과 임</p>");
					break;

				}
				%>
			</td>

			<%-- 	<td><%=request.getParameter("major")%></td> --%>

		</tr>

		<tr>
			<td>주소</td>
			<td>
				<%
					switch (request.getParameter("address")) {
				case "seoul":
					out.println("주소는 서울임</p>");
					break;

				case "gyeonggi":
					out.println("주소는 경기임</p>");
					break;

				case "busan":
					out.println("주소는 부산임</p>");
					break;

				case "incheon":
					out.println("주소는 인천임</p>");
					break;

				}
				%>

			</td>

			<%-- <td><%=request.getParameter("address")%></td> --%>
		</tr>

	</table>


	<%-- <%
		int sum = 0;
	for (int i = 1; i < 10; i++) {
		sum += i;
		out.println(i + " 번째 : " + sum + "<br>");
	}
	%> --%>

</body>
</html>