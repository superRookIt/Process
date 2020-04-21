<%@page import="com.javalec.ex.MemberDto"%>
<%@page import="com.javalec.ex.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/custom.js"></script>
</head>
<body>


<% 
/* String id = (String) session.getAttribute("id");  */
String id= request.getParameter("id");
MemberDao mdao = MemberDao.getInstance();
MemberDto mdto = mdao.getMember(id);

%>

<form action="modify_ok.jsp" name="update" method="post">

<label for="id"> 아이디 </label> : <input type="text" name="id" id="id" value="<%=mdto.getId()%>"><br>
<label for="pw"> 패스워드 </label> : <input type="password" name="pw" id="pw" value="<%=mdto.getPw() %>"><br>
<label for="pw_check"> 패스워드 확인 </label><input type="password" name="pw_check" id="pw_check" value="<%=mdto.getPw() %>"><br>
<label for="name"> 이름 </label> : <input type="text" name="name" id="name" value="<%=mdto.getName()%>"><br>
<label for="email"> 이메일 </label> : <input type="email" name="email" id="email" value="<%=mdto.getEmail()%>"><br>
<label for="address"> 주소 </label> : <input type="text" name="address" id="address" value="<%=mdto.getAddress()%>"><br>

<input type="button" onclick="update_check()" value="회원정보수정">
<input type="button" onclick="delete_check()" value="삭제">
<input type="button" onclick="javascript:history.back();" value="취소">



</form>

</body>
</html>