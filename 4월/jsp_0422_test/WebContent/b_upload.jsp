<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="b_upload_ok.jsp" name="b_upload" method="post" enctype="multipart/form-data">

제목 <input type="text" name="b_title"><br>
작성자 <input type="text" name="b_user"><br>
내용 <br><textarea rows="20" cols="80" name="b_content"></textarea><br>
파일 업로드<input type="file" name="b_file"><br><br>
<input type="submit" value="저장">
<input type="button" onclick="javascript:window.location.href='list.jsp'" value="취소"><br>

</form>

</body>
</html>