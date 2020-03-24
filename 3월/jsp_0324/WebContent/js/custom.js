/** javascript source file
 * 
 */

function check(){
	
	
	var id_check=/^[a-zA-Z][a-zA-Z0-9]{2,14}$/;
	//첫번째는 무조건 대소문자
	
	var name_check= /^[가-힣]*$/;
	var age_check=/^[0-9]{1,3}$/;
	
	//패스워드 소문자,대문자,숫자,특수문자를 최소 1개이상씩 써야 한다
	var pw_check=(/(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&*()_+|<>?]).{3,10}$/);
	// ? 한개라도 있으면 true
	// . 모든 문자
	
	
	if(join.j_id.value==""){
		alert('아이디를 입력해주세요');
		join.j_id.focus();
		return false;
	}
	
	if(!(id_check.test(join.j_id.value))){
		alert('아이디는 3자리 이상 15자리 이하의 문자와 숫자만 가능합니다 (첫글자는 숫자 불가능)');
		join.j_id.focus();
		return false;
	}
	
	if(join.j_pw.value==""){
		alert('비밀번호를 입력해주세요');
		join.j_pw.focus();
		return false;
	}
	
	if(!(pw_check.test(join.j_pw.value))){
		alert('비밀번호는 소문자, 대문자, 숫자, 특수문자를 최소 1개이상씩 입력해주세요 (길이는 3자리 ~10자리 이하)')
		join.j_pw.focus();
		return false;
	}
	
	if(!(join.j_pw.value==join.j_pw2.value)){
		alert('비밀번호가 일치하지 않습니다. 다시 입력해주세요');
		join.j_pw.focus();
		return false;
	}
	
	if(join.j_name.value==""){
		alert('이름을 입력해주세요');
		join.j_name.focus();
		return false;
	}
	
	if(!(name_check.test(join.j_name.value))){
		// if문 괄호 치는거 신경쓰기!! 잘못돼도 안알려줌...
		alert('한글 1자리 이상 입력이 가능합니다');
		join.j_name.focus();
		return false;
	}
	
	
	if(join.j_age.value==""){
		alert('나이를 입력해주세요');
		join.j_age.focus();
		return false;
	}
	
	if(!(age_check.test(join.j_age.value))){
		// if문 괄호() 치는거 신경쓰기!! 잘못돼도 안알려줌...
		alert('숫자 1자리 이상 3자리 이하만 입력이 가능합니다');
		join.j_age.focus();
		return false;
	}
	
	
	return join.submit(); //form의 action으로 return
	
	
	
}

