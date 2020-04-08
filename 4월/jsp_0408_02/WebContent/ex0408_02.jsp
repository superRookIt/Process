<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%request.setCharacterEncoding("utf-8");%>
<!-- form method="post" 방식은 인코딩 -->

<jsp:useBean id="stu01" class="com.javalec.ex.Student2" scope="page" />

<jsp:setProperty property="*" name="stu01"  />

<%-- 

<jsp:setProperty property="s_number" name="stu01" />
<jsp:setProperty property="s_name" name="stu01" />
<jsp:setProperty property="s_age" name="stu01" />
<jsp:setProperty property="s_grade" name="stu01" />

--%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>약식 표현</h2> 
<!-- 앞으로 이렇게 씀 -->

학번 : <%=stu01.getS_number() %><br>
이름 : <%=stu01.getS_name() %><br>
나이 : <%=stu01.getS_age() %><br>
학년 : <%=stu01.getS_grade() %><br>

--------------------------------------------<br>

<h2>Bean태그로 데이터 받음</h2>

학번 : <jsp:getProperty property="s_number" name="stu01" /><br>
이름 : <jsp:getProperty property="s_name" name="stu01" /><br>
나이 : <jsp:getProperty property="s_age" name="stu01" /><br>
학년 : <jsp:getProperty property="s_grade" name="stu01" /><br>

--------------------------------------------<br>

<h2> request 값으로 데이터 받음</h2>

	<%
		
	int s_number = Integer.parseInt(request.getParameter("s_number"));
	String s_name = request.getParameter("s_name");
	int s_age = Integer.parseInt(request.getParameter("s_age"));
	int s_grade = Integer.parseInt(request.getParameter("s_grade"));
	
	%>

학번 : <%=s_number %><br>
이름 : <%=s_name %><br>
나이 : <%=s_age %><br>
학년 : <%=s_grade %><br>


</body>
</html>