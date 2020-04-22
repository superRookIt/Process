<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script type="text/javascript" src="js/custom.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<script>

function openDaumZipAddress() {
	
	new daum.Postcode({
		oncomplete : function(data) {
		
			jQuery("#address1").val(data.zonecode);
			jQuery("#address2").val(data.address);
			jQuery("#address3").focus;
			
		}
	}).open();

}

</script>
<title>회원가입</title>
</head>
<body>


<form action="join_ok.jsp" name="join" method="post">

<label for="id"> 아이디 </label> : <input type="text" name="id" id="id"><br>
<label for="pw"> 패스워드 </label> : <input type="password" name="pw" id="pw"><br>
<label for="pw_check"> 패스워드 확인 </label><input type="password" name="pw_check" id="pw_check"><br>
<label for="name"> 이름 </label> : <input type="text" name="name" id="name"><br>
<label for="email"> 이메일 </label> : <input type="email" name="email" id=""><br>
<label for="address"> 지번 </label> : <input type="text" name="address1" id="address1" readonly><br>
<label for="address"> 주소명 </label> : <input type="text" name="address2" id="address2" readonly>
<input type="button" onclick="openDaumZipAddress();" value="우편번호 찾기"><br>
<label for="address"> 상세주소 </label> : <input type="text" name="address3" id="address3"><br>


<input type="button" onclick="join_check()" value="회원가입완료">
<input type="button" onclick="javascript:location.href='login.jsp'" value="로그인으로 돌아가기">

</form>



</body>
</html>