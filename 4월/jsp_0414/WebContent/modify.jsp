<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%! Connection c=null;

Statement s=null;

ResultSet r= null;

String id,pw,name,phone1,phone2,phone3,gender;

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>

form{width: 1000px; margin:10px auto;}
input{margin:15px auto;}

</style>
<title>회원가입</title>
</head>
<body>

	<%
		
	id = (String) session.getAttribute("authUser");
	
	/*  String user_pw = (String) session.getAttribute("user_pw");  */

	String sql = "select * from member2 where id ='" + id + "'";
	
	Class.forName("oracle.jdbc.driver.OracleDriver");

	c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcle", "ora_user", "1234");

	s = c.createStatement();

	r = s.executeQuery(sql);
	
	
	try{
		
		if(r !=null){
			while(r.next()){
				
				pw=r.getString("pw");
				name=r.getString("name");
				phone1=r.getString("phone1");
				phone2=r.getString("phone2");
				phone3=r.getString("phone3");
				gender=r.getString("gender");
				
			}
			
		}else{
			
			//정보가 없을 때
			
		}
		
		
	}catch(Exception e){
		
		e.printStackTrace();
		
	}finally{
		
		try{
			
			if(r !=null) r.close();
			if(s !=null) s.close();
			if(c !=null) c.close();
			
		}
		
		catch(Exception e2){
			e2.printStackTrace();
		}
		
	}

	
	%>
	
<form action="Modify_ok" name="join" method="get">
<h2>회원가입</h2>
아이디 : <%= id %><br>
비밀번호 : <input type="password" name="pw"> *비밀번호를 입력해주세요 <br>
이름 : <input type="text" name="name" value=<%= name %>><br>


<% switch(phone1) {

case "010": %>
	
	전화번호 : <select name="phone1">
	<option value="010" selected>010</option>
	<option value="011">011</option>
	<option value="016">016</option>
	<option value="017">017</option>
	<option value="018">018</option>
	<option value="019">019</option>
	</select>
	
	<% 
	break;
	
case "016": %>

전화번호 : <select name="phone1">
	<option value="010" selected>010</option>
	<option value="011">011</option>
	<option value="016" selected>016</option>
	<option value="017">017</option>
	<option value="018">018</option>
	<option value="019">019</option>
	</select>

	<% 
	break;
	
case "017":%>

전화번호 : <select name="phone1">
	<option value="010">010</option>
	<option value="011">011</option>
	<option value="016">016</option>
	<option value="017" selected>017</option>
	<option value="018">018</option>
	<option value="019">019</option>
	</select>
	
	<% break;
	
case "018":%>



	
	<%break;
	
case "019":%>



	
	<%break;
	
	case "011":%>
	
	
	
	
		<%break;

}%>


<input type="text" name="phone2" value=<%=phone2 %>>
<input type="text" name="phone3" value=<%=phone3 %>><br>


<%

if(gender.equals("남자")){ %>

<!-- checked -->
성별 : <input type="radio" name="gender" value="남자" id="man" checked><label for="man">남자</label>
 <input type="radio" name="gender" value="여자" id="woman"><label for="woman">여자</label><br> 
	
<% }

else{ %>
	
	성별 : <input type="radio" name="gender" value="남자" id="man"><label for="man">남자</label> 
	<input type="radio" name="gender" value="여자" id="woman" checked><label for="woman">여자</label><br>
	
<% 
    }

%>

<!-- 
성별 : <input type="radio" name="gender" value="남자" id="man"><label for="man">남자</label>
<input type="radio" name="gender" value="여자" id="woman"><label for="woman">여자</label><br> -->

<input type="submit" value="회원정보수정">
<input type="reset" value="취소">

</form>

</body>
</html>