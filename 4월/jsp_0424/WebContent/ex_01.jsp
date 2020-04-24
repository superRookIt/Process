<%@page import="com.javalec.ex.Login"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<%
	
ArrayList<Login> list = new ArrayList<Login>();

Login log = null;

for (int i = 0; i < 5; i++) {

	log = new Login();

	log.setNum(i + 1);
	log.setId("admin" + i); // admin0, admin1 ..... admin4
	log.setPw("abc" + i); // abc0 ... abc4

	list.add(log);

}

request.setAttribute("test", list);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2>function 출력</h2>

<c:set var="test1" value="test"></c:set>
입력된 문자 : ${test1}<br>
대문자 : ${fn:toUpperCase(test1)}<br>

<hr> 

<c:set var="test2" value="          name : 홍    길동                   "></c:set> 
공백문자 포함 : ${test2}<br>
공백문자 제거 : ${fn:trim(test2)}<br>

<hr>
<c:if test="${fn:contains(test2,'동' )==true}">
이름 : ${test2 } / 동이라는 이름이 포함되어 있습니다<br>
</c:if>

<hr>
당신의 이름에는 길이라는 이름이 포함되어있습니다.
${fn:contains(test2,'동')}<br>


	<h2>Arraylist 출력</h2>

	<table border="1">

		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>패스워드</th>
		</tr>

		<c:forEach var="dto" items="${test}">


			<tr>
				<th>${dto.getNum()}</th>
				<th>${dto.getId() }</th>
				<th>${dto.getPw() }</th>
			</tr>


		</c:forEach>
		
	</table>



	<h2>저장된 지역 출력</h2>
	<c:forEach var="item" items="서울, 부산, 경기, 인천, 대전">

           지역 : ${item}<br>

		<!--
    
            지역 : 서울
            지역 : 부산
           지역 : 경기
          지역 : 인천
           지역 : 대전
    
      -->

	</c:forEach>

	<hr>

	<c:set var="sum" value="0"></c:set>
	<c:forEach var="i" begin="0" end="5" step="1">
       ${sum = sum+i}<br>
	</c:forEach>


</body>
</html>