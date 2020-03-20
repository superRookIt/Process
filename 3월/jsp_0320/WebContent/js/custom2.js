/*
 * new -> javascript source file
 */

function check() {

		if (form.id.value == "") {
			alert('아이디를 입력하세요');
			form.id.focus();
			return false; /* 꼭 넣어줘야 멈춤 없으면 그냥 다음으로 넘어감  */
		}

		if (form.id.value == "admin") {
			if (form.pw.value == "12345") {
				alert("로그인에 성공하였습니다")
				location.href="login_ok.html"
			} else if (form.pw.value == "") {
				alert("비밀번호를 입력해주세요.")
				form.pw.focus();
				return false;
			} else {
				alert("비밀번호를 잘못 입력하셨습니다.")
				form.pw.focus();
				return false;
			}

		} else {
			alert('아이디를 잘못 입력하셨습니다')
			form.id.focus();
			return false;
		}
		
		return form.submit(); 

	}


/*var id = prompt('아이디를 입력해주세요.');
var pw;

if (id == 'admin') {
	pw = prompt('비밀번호를 입력해주세요.');
	if (pw =='12345') {
		alert('로그인 되었습니다');
		location.href = "login_ok.html";
	} else {
		alert('패스워드가 틀렸습니다');
		location.href = "login_error.html";
	}

} else {
	alert('아이디가 일치하지 않습니다');
	location.href = "login_error.html";
}
*/

