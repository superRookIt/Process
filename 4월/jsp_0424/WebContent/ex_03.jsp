<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@page import="com.javalec.ex.Login"%>
<%@page import="java.util.ArrayList"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


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

	//ArrayList 객체
	request.setAttribute("test", list);
	
	
	Login lo1 = new Login(90,"naver","12345");
	//Class 객체 1개
	request.setAttribute("ldto", lo1);
	
	
	
	//변수 1개
	request.setAttribute("user_id", "admin");
	request.setAttribute("user_pw", "1234");
	request.setAttribute("user_name", "홍길동");
	

	
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
	dispatcher.forward(request, response);
	
	%>
	
	
	
	
</body>
</html>