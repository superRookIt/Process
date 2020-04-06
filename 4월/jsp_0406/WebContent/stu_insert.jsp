
<%@page import="jsp_0406.Student"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1{margin:0 auto; text-align: center;}
table{width:900px; margin:0 auto;border:1px solid black;border-collapse: collapse;}
th{width:100px;border:1px solid black;text-align: center;background: yellow;font-weight: bold;}
td{width:100px;border:1px solid black;text-align: center;}
#button{width:210px; margin:0 auto;}
a{text-decoration: none;}
</style>

<meta charset="UTF-8">
<title>학생 입력 저장</title>
</head>
<body>
	<%!ArrayList<Student> list = new ArrayList<Student>();%>

	<%-- 회원추가 --%>

	<%
	request.setCharacterEncoding("utf-8");
		

	String s_num1 = request.getParameter("s_num");
	String s_name1 = request.getParameter("s_name");
	int s_kor1 = Integer.parseInt(request.getParameter("s_kor"));
	int s_eng1 = Integer.parseInt(request.getParameter("s_eng"));
	int s_math1 = Integer.parseInt(request.getParameter("s_math"));

	/* Student stu = new Student(s_num1, s_name1, s_kor1, s_eng1, s_math1); */

	list.add(new Student(s_num1, s_name1, s_kor1, s_eng1, s_math1));
	%>


	<%--회원 정보 출력 --%>

<h1>학생 정보 출력</h1><br>
	<table>
		<tr>
			<th>학번</th>
			<th>이름</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>합계</th>
			<th>평균</th>
			<th>등수</th>
		</tr>

		<%
			for (int i = 0; i < list.size(); i++) {
			Student stu1 = (Student) list.get(i);
		%>

		<tr>
			<td><%=stu1.getS_num()%></td>
			<td><%=stu1.getS_name()%></td>
			<td><%=stu1.getS_kor()%></td>
			<td><%=stu1.getS_eng()%></td>
			<td><%=stu1.getS_math()%></td>
			<td><%=stu1.getS_total()%></td>
			<td><%=stu1.getS_avg()%></td>
			<td><%=stu1.getRank()%></td>
			
			<%-- <td><a href="stu_modi.jsp?s_num=<%=stu1.getS_num()%>&s_name=<%=stu1.getS_kor()%>&s_kor=<%=stu1.getS_kor()%>&s_eng=<%=stu1.getS_eng()%>&s_math=<%=stu1.getS_math()%>"></a></td>
			 --%>
			
			
			
		</tr>

		<%
			}
		%>

	</table><br>
<div id="button">
	<button>
		<a href="stu_inform.html">회원정보추가</a>
	</button>
	<button><a href="stu_list.html">처음 화면으로</a></button>
</div>



</body>
</html>