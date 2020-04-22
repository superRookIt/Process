<%@page import="com.javalec.ex.MA"%>
<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<!-- MemberDto mdto=new MemberDto(); -->
<jsp:useBean id="mt" class="com.javalec.ex.MT"></jsp:useBean>

<jsp:setProperty property="*" name="mt" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
	
//현재 시간을 자바에서 입력
/* mt.setU_date(new Timestamp(System.currentTimeMillis())); */

MA ma = MA.getInstance(); //싱글톤 패턴

int check = ma.confirm(mt.getId());

if (check == 1) {
%>

<script type="text/javascript">
	alert('아이디가 존재합니다. 다시 입력하세요')
	history.back();
</script>

<%
	} else { //아이디가 없을 경우

	int ch = ma.insert(mt);

	if (ch == 1) {//데이터 저장 완료
%>

<script>
	alert('회원가입이 완료 되었습니다. 로그인 페이지로 이동합니다');
	window.location.href = 'login.jsp';
</script>

<%
	} else { //저장 실패
%>

<script>
	alert('저장 실패! 다시 시도해 주세요.');
	history.back();
</script>


<%
	}

}
%>

</head>
<body>

</body>
</html>