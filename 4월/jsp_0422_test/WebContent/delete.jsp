<%@page import="com.javalec.ex.BDAO"%>
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
	
	int num = Integer.parseInt(request.getParameter("b_num"));

	BDAO ba = BDAO.getInstance();
	
	int check = ba.delete(num);

	if (check == 1) {
	%>

	<script type="text/javascript">
		alert('삭제가 완료되었습니다.')
		window.location.href = 'list.jsp';
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