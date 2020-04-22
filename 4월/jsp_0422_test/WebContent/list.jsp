<%@page import="com.javalec.ex.BDAO"%>
<%@page import="com.javalec.ex.BDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	
ArrayList list = new ArrayList();

BDAO ba= BDAO.getInstance();

list = ba.getmembers();

%>

	<table border="1">

		<tr>

			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>파일이름</th>

		</tr>
		
		
		<%
			for (int i = 0; i < list.size(); i++) {

			BDTO bt = (BDTO) list.get(i);
		%>

		<tr>

			<td><a href="b_modify.jsp?b_num=<%=bt.getB_num()%>"><%=bt.getB_num() %></a></td>
			<td><%=bt.getB_title()%></td>
			<td><%=bt.getB_content()%></td>
			<td><%=bt.getB_user()%></a></td>
			<!--  <td><a href="b_modify.jsp?b_user=<%=bt.getB_user()%>"><%=bt.getB_user()%></a></td>-->
			<td><a href="upload/<%=bt.getB_file()%>"><%=bt.getB_file()%> 다운로드</a></td>

		</tr>


		<%
			}
		%>


	</table>
	
	<button onclick="javascript:window.location.href='b_upload.jsp'">글쓰기</button>


</body>
</html>