<%@page import="com.javalec.ex.BDTO"%>
<%@page import="com.javalec.ex.BDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% 

int num = Integer.parseInt(request.getParameter("b_num"));

BDAO ba = BDAO.getInstance();

BDTO bt = ba.getMember(num);
%>


<form action="b_modify_ok.jsp" name="b_upload" method="post" enctype="multipart/form-data">

<input type="hidden" name="b_num" value="<%=bt.getB_num() %>" readonly><br>
제목 <input type="text" name="b_title" value="<%=bt.getB_title()%>"><br>
작성자 <input type="text" name="b_user" value="<%=bt.getB_user()%>"><br>
내용 <br><textarea rows="20" cols="80" name="b_content"><%=bt.getB_content()%></textarea><br>
기존 파일 <input type="text" name="old_file" value="<%=bt.getB_file()%>"><br><br>
파일 업로드<input type="file" name="b_file"><br><br>
<input type="submit" value="수정">
<input type="button" onclick="del_check()" value="삭제">
<input type="button" onclick="javascript:window.location.href='list.jsp'" value="취소"><br>

</form>



<script>

function del_check(){
	
	var check = confirm('삭제하시겠습니까? \n (삭제하시면 데이터가 복구되지 않습니다)');

	if (check == true) {
		alert('삭제를 진행하겠습니다.');
		location.href = 'delete.jsp?b_num=' + <%=bt.getB_num()%>;

	} else {
		alert('삭제가 취소되었습니다');
		return false;
	}
	
}

</script>












</body>
</html>