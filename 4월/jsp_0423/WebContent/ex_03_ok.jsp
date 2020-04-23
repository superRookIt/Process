<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%request.setCharacterEncoding("utf-8"); %>
<!-- 위쪽에 써줘야 -->



<jsp:useBean id="ldto" class="com.javalec.ex.MemberInfo" scope="page"></jsp:useBean>

<jsp:setProperty property="*" name="ldto"/>
<!-- form의 name이랑 class의 변수들 이름 같아야 적용됨 -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<h2>EL 태그 사용</h2>
이름 : ${ldto.name}<br>
아이디 : ${ldto.id}<br>
패스워드 : ${ldto.pw }<br>


<%-- 

useBean 안쓸때는 param

이름 : ${param.name}<br>
아이디 : ${param.id}<br>
패스워드 : ${paran.pw }<br>

 --%>
-----------------------------------<br>


<h2>스크립트 </h2>

<% String name=request.getParameter("name"); %>
<% String id=request.getParameter("id"); %>
<% String pw=request.getParameter("pw"); %>

이름 : <%=name %><br>
아이디 :  <%=id %><br>
패스워드 :  <%=pw %><br>

-----------------------------------<br>



<h2>get메소드 </h2>
<%=ldto.getId() %><br>
<%=ldto.getName() %><br>
<%=ldto.getPw() %><br>

-----------------------------------<br>



<h2>내장 객체</h2>

applicationScope : ${applicationScope.appUser_id }<br>
sessionScope : ${sessionScope.sessUser_id }<br>
pageScope : ${pageScope.pageUser_id}<br>
requestScope : ${requestScope.reqUser_id}


</body>
</html>