<%@page import="com.javalec.ex.MA"%>
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
		
	String id = request.getParameter("id");

	MA ma = MA.getInstance();
	int check = ma.deleteMember(id);

	if (check == 1) {
	%>

	<script type="text/javascript">
		alert('삭제가 완료되었습니다.')
		window.location.href = 'main.jsp';
	</script>


	<%
		} else {
	%>
	
	<script type="text/javascript">
	alert('삭제가 되지 않았습니다');
	history.back();
	</script>

	<%
		}
	%>

</body>
</html>