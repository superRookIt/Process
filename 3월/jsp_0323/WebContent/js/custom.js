/*
 */

function check() {
	
	var idcheck= /^[a-zA-Z0-9]{4,12}$/;
	var id_char=/[a-zA-Z]$/; //소문자, 대문자
	
 	var id_num=/[0-9]$/; //true, false로 반환
 	var id_spc=/[~!@#$%^&*()_+|<>?]/; //특수문자
 	var id_kor=/[가-힣]$/;
 	var id_all=/[a-zA-Z가-힣0-9]$/;
 	
 	// var id_num1=/^[0-9]/; 첫번째 문자가 숫자인지 아닌지 비교
 	// var id_num2=/[0-9]$/; 마지막 문자가 숫자인지 아닌지 비교
 	
 	/*   / : 정규표현식의 처음을 뜻함. (처음과 마지막에 들어감) */
 	/*   ^ : 문장의 처음을 뜻함    */
 	/*   $ : 문장의 마지막을 뜻함    */
 	
 	/* {} : 문자열 길이를 뜻함 
 	  {2,10} : 2~10까지의 길이
 	  {8,} : 8자리 이상이면 true 반환
 	  [@]{1} : 모든 문자를 비교해서 @가 1개 이상 있어야 함.
 	  
 	   [] : 대괄호 사이의 문자set을 비교 (한단어 한단어씩)
 	    [a-z] 소문자 a~z까지 비교   
 	    [A-Z] 대문자 A~Z까지 비교   
 	    [0~9] 숫자 0~9까지 비교
 	    
 	    /[a-zA-Z]{3,12}$/ //소문자~대문자, 3~12자리까지 정규표현식
 	    
 	    */  
 	
 	if(!(id_kor.test(join.j_name.value))){
		alert('국문만 입력이 가능합니다.');
		join.j_name.vaule="";
		join.j_name.focus();
		return false;
	}else{
		alert('국문만 입력이 되었습니다.')
	}
 	
 	
 	/*if(!(id_num.test(join.j_id.value))){
 		alert('숫자만 입력이 가능합니다.');
 		join.j_id.vaule="";
 		join.j_id.focus();
 		return false;
 	}else{
 		alert('숫자만 입력이 되었습니다.')
 	}*/
 	
 	
 	if(!(id_char.test(join.j_id.value))){
 		alert('문자만 입력이 가능합니다.');
 		join.j_id.vaule="";
 		join.j_id.focus();
 		return false;
 	}else{
 		alert('문자만 입력이 되었습니다.')
 	}
 	
 	
	
	if (join.gender.value == ""){
		alert('성별을 체크해주세요.')
		return false;
	}
	
	if (join.gender.value == "m") {
		alert('남자입니다.');
		location.href = "https://naver.com";
	} else {
		alert('여자입니다.');
		location.href = "https://daum.net";
	}

	
	
	/*	if (login.l_id.value == "") {
		alert('아이디를 입력해주세요');
		login.l_id.focus();
		return false;
	}

	if (login.l_id.value.length < 5) {
		alert('아이디는 5자리 이상 입력해야 합니다.');
		login.l_id.focus();
		return false;
	}
	

	if (login.age.value == "") {
		alert('값을 입력해주세요');
		login.age.focus();
		return false;
	}
	
	if (login.age.value >= 18) {
		alert('성인입니다');
		login.age.focus();
		return false;
	} else if (login.age.value < 18) {
		alert('미성년자 입니다');
		login.age.focus();
		return false;
	} else {
		alert('숫자만 입력가능합니다.');
		login.age.focus();
		return false;
	}
	
	*/
	
}