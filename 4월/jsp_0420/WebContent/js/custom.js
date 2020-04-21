/**
 * 
 */

function login_check() {

	var id_check = /^[A-Za-z]*$/
	var pw_check = /^[A-Za-z!@#$%^&*()_+|<>?1-9]*$/

	if (!(id_check.test(login.id.value))) {
		alert('아이디는 대소문자만 입력가능합니다')
		login.id.focus();
		return false;
	}

	if (!(pw_check.test(login.pw.value))) {
		alert('비밀번호는 대소문자 및 특수문자만 가능합니다')
		login.pw.focus();
		return false;
	}
	
	return login.submit();

}