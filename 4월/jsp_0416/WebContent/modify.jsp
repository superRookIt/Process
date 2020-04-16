<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String authUser = (String) session.getAttribute("authUser");
if (authUser == null) {

	out.println("<script>alert('로그인이 되어 있지 않습니다.');");
	out.println("location.href='login.jsp';</script>");

}
%>

<%!Connection c = null;
	PreparedStatement p = null;
	ResultSet r = null;
	String id, pw, name, email, address, phone, gender, news, sms, sql;
	Timestamp birth; //★
	int check;

	//check 입력이 잘 되었는지%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		try {

		//main.jsp에서 =?id의 id가 파라미터네임
		id = request.getParameter("id");
		sql = "select * from lms_member where id=?";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle", "ora_user", "1234");
		p = c.prepareStatement(sql);
	 	p.setString(1, id);
		r = p.executeQuery();

		while (r.next()) {
			
			id = r.getString("id");
			pw = r.getString("pw");
			name = r.getString("name");
			email = r.getString("email");
			address = r.getString("address");
			phone = r.getString("phone");
			birth = r.getTimestamp("birth"); //★
			gender = r.getString("gender");
			news = r.getString("news");
			sms = r.getString("sms");
			
%>			
<!-- html 부분 추가  -->

<h2>회원정보수정</h2>
<form action="Modify_ok" name="modify" method="post"><br>
아이디 : <input type="text" name="id" value=<%=id %> readonly><br>
<!-- disabled 파라미터값이 안넘어감, readonly는 넘어감 -->
패스워드 : <input type="password" name="pw" value=<%=pw %>><br>
이름 : <input type="text" name="name" value=<%=name %>><br>
이메일 : <input type="email" name="email" value=<%=email %>><!-- input type="email" --><br>
주소 : <input type="text" name="address" value=<%=address %>><br>
휴대전화 : <input type="text" name="phone" value=<%=phone %>><br>
생년월일 : <input type="date" name="birth" value=<%=birth %>><br><!-- input type="date" -->
<p>성별 : </p>
<% 
switch (gender) {

case "남성": %>
	
	<input type="radio" name="gender" value="남자" checked> 남자
	<input type="radio" name="gender" value="여자">여자<br>
	
	<%  break;

case "여성": %>
	
	<input type="radio" name="gender" value="남자"> 남자
    <input type="radio" name="gender" value="여자" checked>여자<br>
	
	
	<% break;
} %>

<p>뉴스레터 수신여부 : </p>

<% 
switch (news) {

case "예": %>
	
	<input type="radio" name="news" value="예" checked>예
    <input type="radio" name="news" value="아니요">아니요<br>
	
	<%  break;

case "아니요": %>
	
	<input type="radio" name="news" value="예">예
    <input type="radio" name="news" value="아니요" checked>아니요<br>
	
	
	<% break;
} %>

<p>SMS 수신여부 : </p>

<% 
switch (sms) {

case "예": %>
	
	<input type="radio" name="sms" value="예" checked>예
    <input type="radio" name="sms" value="아니요">아니요<br>
	
	<%  break;

case "아니요": %>
	
	<input type="radio" name="sms" value="예">예
    <input type="radio" name="sms" value="아니요" checked>아니요<br>
	
	
	<% break;
} %>


<input type="submit" value="수정">
<input type="reset" value="취소"><br>
</form>

	<%	}//while

	}//try
	catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {

			if (r != null) r.close();
			if (c != null) c.close();
			if (p != null) p.close();

		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	%>


</body>
</html>