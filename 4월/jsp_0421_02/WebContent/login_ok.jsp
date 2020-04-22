<%@page import="com.javalec.ex.MT"%>
<%@page import="com.javalec.ex.MA"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	
//form request에서 넘어온 거 한글로 인코딩처리
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
String pw = request.getParameter("pw");

//MemberDao mdao = new MemberDao();
MA ma = MA.getInstance();

int check = ma.userCheck(id, pw); 
//리턴값 1,0,-1
%>

<!DOCTYPE html>
<html>
<head>

<%
	if (check == -1) {
%>

<script type="text/javascript">
	alert("아이디가 존재하지 않습니다. 다시 입력하세요.");
	history.back();
</script>


<%
	} else if (check == 0) {
%>

<script type="text/javascript">
	alert("패스워드가 일치하지 않습니다. 다시 입력하세요.");
	history.back();
</script>


<%
	} else {

	MT mt = ma.getMember(id);

	session.setAttribute("id", id);
	session.setAttribute("pw", pw);
	session.setAttribute("name", mt.getName());
	session.setAttribute("authUser", id);
	response.sendRedirect("main.jsp");

}
%>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript" src="js/custom.js"></script>

</body>
</html>