<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- prefix 변수명 -->

<% request.setCharacterEncoding("utf-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2><c:out value="${param.user_id }"></c:out></h2>



<%-- 

<% 

String name=request.getParameter("name");

int kor=Integer.parseInt(getParameter("kor"));
int math=Integer.parseInt(getParameter("math"));
int eng=Integer.parseInt(getParameter("eng"));

int avg = kor+math+eng/3;

%> 

--%>


이름 : ${param.name }<br>
국어점수 : ${param.kor }<br>
영어점수 : ${param.eng }<br>
수학점수 : ${param.math }<br>
평균 : ${(param.kor+param.eng+param.math)/3 }

<c:set var="avg" value="${(param.kor+param.eng+param.math)/3 }"></c:set>

<c:if test="${avg>=90}">
<p>학점은 A입니다</p>
</c:if>

<c:if test="${avg>=80 and avg<=89}">
<p>학점은 B입니다</p>
</c:if>

<c:if test="${avg>=71 and avg<=79}">
<p>학점은 C입니다</p>
</c:if>

<c:if test="${avg<=70}">
<p>학점은 D입니다</p>
</c:if>

<c:if test="${param.name=='홍길동'}">
<p>${param.name }입니다.</p>
</c:if>

<c:if test="${param.name != '홍길동' }">
<p>홍길동이 아닙니다 이름 : ${param.name } 입니다.</p>
</c:if>





</body>
</html>