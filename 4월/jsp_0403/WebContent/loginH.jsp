<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
function check(){
	
	if(form.id.value==""){
		alert('아이디를 입력해주세요');
		form.id.focus();
		return false;
	}
	
	if(form.pw.value==""){
		alert('비밀번호를 입력해주세요');
		form.pw.focus();
		return false;
	}
	
	return form.submit();
}

</script>
<title>Insert title here</title>
</head>
<body>

	<%
		if (!(request.getParameter("id")==null)) {
			out.println(request.getParameter("id")+"가 잘못입력되었습니다.<br>다시 한번 확인해 주세요<br>");
	}
	
	
	
	%>

	<form action="login.jsp" name="form"  method="get" >

		아이디 <input type="text" name="id"><br> 
		비밀번호 <input type="password" name="pw"><br> 
		<input type="button" onclick="check()" value="로그인">

	</form>
	
	
	
</body>
</html>