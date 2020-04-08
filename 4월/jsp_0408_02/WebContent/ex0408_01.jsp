<%@page import="com.javalec.ex.Student2"%>
<!-- Student2 import 해줘야 함 !!! -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Student2 stu = new Student2(); -->
<jsp:useBean id="stu" class="com.javalec.ex.Student2" scope="page" />
<!-- 클래스 기본 생성자에 public을 붙여줘야 -->
<%--  / 붙이면 </jsp:useBean> 없어짐 --%>

<jsp:useBean id="stu3" class="com.javalec.ex.Student2" scope="page"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<jsp:setProperty name="stu" property="s_number" value="1" />
	<jsp:setProperty name="stu" property="s_name" value="홍길동" />
	<jsp:setProperty name="stu" property="s_age" value="20" />
	<jsp:setProperty name="stu" property="s_grade" value="1" />
	
	<jsp:setProperty property="s_number" name="stu3" value="3"/>
	<jsp:setProperty property="s_name" name="stu3" value="강감찬"/>
	<jsp:setProperty property="s_age" name="stu3" value="22"/>
	<jsp:setProperty property="s_grade" name="stu3" value="3"/>


	<h2>학생 입력 정보</h2>
	학번 :<jsp:getProperty property="s_number" name="stu" /><br> 
	이름 :<jsp:getProperty property="s_name" name="stu" /><br> 
	나이 :<jsp:getProperty property="s_age" name="stu" /><br> 
	학년 :<jsp:getProperty property="s_grade" name="stu" /><br>
	
	-----------------------------------<br>

	<%
		
	Student2 s2 = new Student2();
	/* 컨트롤+스페이스해서 import해줘야 함 */
	
	s2.setS_number(2);
	s2.setS_name("김유신");
	s2.setS_age(21);
	s2.setS_grade(2);

	out.println("학번 : " + s2.getS_number() + "<br>");
	out.println("이름 : " + s2.getS_name() + "<br>");
	out.println("나이 : " + s2.getS_age() + "<br>");
	out.println("학년 : " + s2.getS_grade() + "<br>");
	%>
	
	-----------------------------------<br>
	
	학번 : <jsp:getProperty property="s_number" name="stu3"/><br>
	이름 : <jsp:getProperty property="s_name" name="stu3"/><br>
	나이 : <jsp:getProperty property="s_age" name="stu3"/><br>
	학년 : <jsp:getProperty property="s_grade" name="stu3"/>	
	


</body>
</html>