/*
 */

function april1() {
	
	var id_check=/^[a-zA-z]{4,12}$/; 
    /*var pw_check=/^[0-9a-z~!@#$%^&*()_+|<>?]*$/;*/
    var pw_check = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^*()\-_=+\\\|\[\]{};:\'",.<>\/?]).{3,16}$/;
    var age_check=/^[0-9]{1,3}$/;
    var n_check=/^[가-힣]{1,}$/;
    var tel_check=/^[0-9]{8,}$/;
    // ^(?=.*[a-z]) . (1개씩) *(모든문자에서) a-z가 있는지 확인
    // ^(?=.*[A-Z]) . (1개씩) *(모든문자에서) A-Z가 있는지 확인
    
	
 	if(april.a_id.value == ""){
 		alert('아이디를 입력해주세요');
 		april.a_id.focus();
 		return false;
 	}
 	

 	if(!(id_check.test(april.a_id.value))){
		alert('아이디 소문자랑 대문자 4~12자리만 입력 가능.');
		april.a_id.value="";
		april.a_id.focus();
		return false;
 	}
 	
 	if(april.a_pw.value == ""){
 		alert('비밀번호를 입력해주세요');
 		april.a_pw.focus();
 		return false;
 	}
 	
 	
 	if(!(pw_check.test(april.a_pw.value))){
		alert('비밀번호를 제대로 입력해주세요');
		april.a_pw.value="";
		april.a_pw.focus();
		return false;
 	}
 	
 	if(!(april.a_pw.value == april.a_pw2.value)){
 		alert('비밀번호가 일치하지 않습니다');
 		april.a_pw.focus();
		return false;
 	}
 	
 	if(april.a_age.value == ""){
 		alert('나이를 입력해주세요');
 		april.a_age.focus();
 		return false;
 	}
 	
 	if(!(age_check.test(april.a_age.value))){
		alert('나이를 제대로 입력해주세요');
		april.a_age.value="";
		april.a_age.focus();
		return false;
 	}
 	
 	
 	if(april.a_name.value == ""){
 		alert('이름을 입력해주세요');
 		april.a_name.focus();
 		return false;
 	}
 	
 	
 	if(!(n_check.test(april.a_name.value))){
		alert('이름 한글만 가능 1글자 이상.');
		april.a_name.value="";
		april.a_name.focus();
		return false;
 	}
 	
 	
 	if(april.a_tel.value == ""){
 		alert('전화번호를 입력해주세요');
 		april.a_tel.focus();
 		return false;
 	}
 	
 	
 	if(!(tel_check.test(april.a_tel.value))){
		alert('전화번호 숫자만 가능 8자리 이상 입력.');
		april.a_tel.value="";
		april.a_tel.focus();
		return false;
 	}
 	
 	
 	if(april.gender.value==""){
 		alert('성별을 체크해 주세요')
 		april.gender.focus();
 	 	return false;
 	}
 	
// 	var chk = false;
// 	var arrRadio= document.getElementsByname("gender");
// 	//name이 gender인거 
// 	
// 	for(var i=0;i<arrRadio.length;i++){
// 		if(arrRadio[i].checked){
// 			chk=true;
// 		}
// 	}
// 	
// 	if(!chk){
//	     alert('성별 체크를 확인해주세요');
//	     return false;
//	 }
	
 	var chk = false;
 	
 	for(var i=0; i<april.hobby.length;i++){
 		if(april.hobby[i].checked){
 			chk=true;
 		}//체크박스는 배열로 가져올 수 있음!!
 	}
 	
 	if(!chk){
 	     alert('취미 체크를 확인해주세요.');
 	     april.hobby.focus();
 	  return false;
 	 }
 	
 	document.write('성공했어구리');
 	

}