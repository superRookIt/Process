<%@page import="com.javalec.ex.MT"%>
<%@page import="com.javalec.ex.MA"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Timestamp"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>


<!-- 세션이 있는지 확인 -->
<%
	if (session.getAttribute("authUser") == null) {
%>

<script type="text/javascript">
	alert('로그인을 하지 않았습니다. 로그인을 해주세요');
	location.href = 'login.jsp';
</script>

<%-- 
<jsp:forward page="login.jsp"></jsp:forward> 
--%>

<%
	}
%>


<%
	
ArrayList list = new ArrayList();
String id = (String) session.getAttribute("id");
MA mdao = MA.getInstance();
list = mdao.getmembers();

%>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>관리자 페이지</h2>
	<p><%=session.getAttribute("name")%>님 로그인하셨습니다.
	</p>
	<p>
		<a href="logout.jsp">로그아웃</a>
	</p>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
			<th>이름</th>
			<th>이메일</th>
			<th>주소</th>
			<th>가입일</th>
			<th>수정일</th>
		</tr>

		<%
			for (int i = 0; i < list.size(); i++) {

			MT mt = (MT) list.get(i);
		%>

		<tr>
			<td><a href="modify.jsp?id=<%=mt.getId()%>"><%=mt.getId()%></a></td>
			<td><%=mt.getPw()%></td>
			<td><%=mt.getName()%></td>
			<td><%=mt.getEmail()%></td>
			<td><%=mt.getAddress1()%>-<%=mt.getAddress2()%>,<%=mt.getAddress3()%></td>
			<td><%=mt.getB_date()%></td>
			<td><%=mt.getU_date()%></td>
		</tr>

		<%
			}
		%>

	</table>

</body>
</html>