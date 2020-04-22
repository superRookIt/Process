<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%


String num="";
String title="";
String content="";
String user="";



//저장경로 지정
String path = request.getRealPath("upload");


//파일 사이즈 - 업로드 파일 용량 제한
int size = 1024 * 1024 * 10; // 1kb*1kb*10 = 1mb*10 -> 총 10m 용량 제한


//파일 이름 설정
String file="";

String file2="";



//파일 예전 이름
String originfile="";

String originfile2="";


try{
	
//request, 파일저장경로, 용량, 인코딩타입, 중복파일명에 대한 정책	(Default-File-Rename-Policy)
MultipartRequest multi = new MultipartRequest(request,path,size,"utf-8",new DefaultFileRenamePolicy());



//request.getParameter("num");
num = multi.getParameter("num");

title = multi.getParameter("title");
content = multi.getParameter("content");
user = multi.getParameter("user");


//파일 이름 가져오기
Enumeration files = multi.getFileNames();



String name1 = (String) files.nextElement();

file = multi.getFilesystemName(name1);
//session.setAttribute("id", "user") = (name1, value[file])

originfile = multi.getOriginalFileName(name1);



String name2 = (String) files.nextElement();

file2 = multi.getFilesystemName(name2);

originfile2 = multi.getOriginalFileName(name2);



	
	
}catch(Exception e){
	e.printStackTrace();
}



	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">

<tr>

<th>번호</th>
<th>제목</th>
<th>내용</th>
<th>작성자</th>
<th>파일이름</th>
<th>예전이름</th>
<th>다운로드</th>
<th>파일이름</th>
<th>예전이름</th>
<th>다운로드</th>

</tr>

<tr>

<td><%=num %></td>
<td><%=title %></td>
<td><%=content %></td>
<td><%=user %></td>
<td><%=file %></td>
<td><%=originfile %></td>
<td><a href="upload/<%=file %>">다운로드</a></td>
<td><%=file2 %></td>
<td><%=originfile2 %></td>
<td><a href="upload/<%=file2 %>">다운로드2</a></td>

</tr>



</table>



</body>
</html>