<%@page import="com.javalec.ex.MA"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="mt" class="com.javalec.ex.MT"></jsp:useBean>
<jsp:setProperty property="*" name="mt"></jsp:setProperty>


<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/custom.js"></script>

<%
	
String id = mt.getId();

MA ma = MA.getInstance();

int check = ma.updateMember(mt);

if (check == 1) { //수정완료
%>

<script>
	alert('회원정보수정이 완료되었습니다.')
	window.location.href = "main.jsp";
</script>


<%
	} else { //수정에러
%>

<script>
	alert('회원정보수정에 실패하였습니다');
	history.back();
</script>


<%
	}
%>
</head>
<body>

</body>
</html>