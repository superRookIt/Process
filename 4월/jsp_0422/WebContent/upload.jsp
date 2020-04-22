<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="upload_ok.jsp" name="upload" method="post" enctype="multipart/form-data">
번호 <input type="text" name="num"><br>
제목 <input type="text" name="title"><br>
내용 <input type="text" name="content"><br>
작성자 <input type="text" name="user"><br>
파일 업로드1 <input type="file" name="file"><br>
파일 업로드2 <input type="file" name="file2"><br>
<input type="submit" value="저장"><br>


</form>




</body>
</html>