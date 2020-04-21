<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>daum 주소 api</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<script>
	function openDaumZipAddress() {
		
		new daum.Postcode({
			oncomplete : function(data) {
				
				/* 
				jQuery("#postcode1").val(data.postcode1);
				jQuery("#postcode2").val(data.postcode2); 
				*/
				jQuery("#zonecode").val(data.zonecode);
				jQuery("#address").val(data.address);
				jQuery("#address_etc").focus;
				
			}
		}).open();

	}
</script>

</head>
<body>

	<form action="join_ok.jsp" name="join" method="post">
		<!-- 
		<input type="text" id="postcode1" value="" readonly>&nbsp;&nbsp;-
		<input type="text" id="postcode2" value="" readonly>&nbsp;&nbsp;<br> 
		-->
		<input type="text" id="zonecode" value="" readonly>&nbsp;&nbsp; <br>
		<input type="text" id="address" value="" readonly> <br>
		<input type="text" id="address_etc" value="" style="width: 200px"><br>
		<input type="button" onclick="openDaumZipAddress();" value="우편번호 찾기"><br>

	</form>


</body>
</html>