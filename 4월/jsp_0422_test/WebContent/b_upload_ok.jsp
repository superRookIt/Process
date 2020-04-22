<%@page import="com.javalec.ex.BDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javalec.ex.BDAO"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<head>


<!-- usebean으로 안됨!! form에서 enctype=multipart/form-data 떄문에.. -->

<%
	String path = request.getRealPath("upload");
int size = 1024 * 1024 * 10; // 1kb*1kb*10 = 1mb*10 -> 총 10m 용량 제한

String b_file = "";
String b_title = "";
String b_user = "";
String b_content = "";

try {

	//request, 파일저장경로, 용량, 인코딩타입, 중복파일명에 대한 정책	(Default-File-Rename-Policy)
	MultipartRequest multi = new MultipartRequest(request, path, size, "utf-8", new DefaultFileRenamePolicy());

	//파일 이름 가져오기
	Enumeration files = multi.getFileNames();

	String name1 = (String) files.nextElement();
	
	
	

	b_file = multi.getFilesystemName(name1);
	//session.setAttribute("id", "user") = (name1, value[file])

	b_title = multi.getParameter("b_title");
	b_user = multi.getParameter("b_user");
	b_content = multi.getParameter("b_content");

	
	
	
	BDTO bt = new BDTO(b_title, b_content, b_user, b_file);

	BDAO ba = BDAO.getInstance();

	//bt데이터 추가메소드 호출
	int check = ba.insert(bt);

	if (check == 1) { //성공
%>

<script type="text/javascript">
	alert('데이터가 성공적으로 추가되었습니다');
	window.location.href = 'list.jsp';
</script>


<%
	} else { //실패
%>

<script type="text/javascript">
	alert('데이터 입력 실패');
	history.back();
</script>



<%
	}

} catch (Exception e) {
	e.printStackTrace();
}
%>











<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


</body>
</html>