<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="ex_03_ok.jsp" name="ex03" method="post">


이름 <input type="text" name="name"><br>
아이디 <input type="text" name="id"><br>
비밀번호 <input type="password" name="pw">
<input type="submit" value="전송">


</form> 


<% 

application.setAttribute("appUser_id", "app_admin");

session.setAttribute("sessUser_id", "sess_admin");


//다음 페이지로 넘어가면 사라짐
pageContext.setAttribute("pageUser_id", "page_admin");

//다음 페이지로 넘어가면 사라짐
request.setAttribute("reqUser_id", "req_admin");
//sendrediect로 보내줘야




%>



</body>
</html>