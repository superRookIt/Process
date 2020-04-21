// var pw_check = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^*()\-_=+\\\|\[\]{};:\'",.<>\/?]).{3,16}$/;

function delete_check() {

	var check = confirm('삭제하시겠습니까? \n (삭제하시면 데이터가 복구되지 않습니다)');

	if (check == true) {
		alert('삭제를 진행하겠습니다.');
		location.href = 'delete.jsp?id=' + update.id.value;

	} else {
		alert('삭제가 취소되었습니다');
		return false;
	}

}

function update_check() {

	var pw_check = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^*()\-_=+\\\|\[\]{};:\'",.<>\/?]).{3,}$/;

	if (!(pw_check.test(update.pw.value))) {
		alert('비밀번호는 대소문자 및 특수문자와 숫자만 가능합니다')
		update.pw.focus();
		return false;
	}

	if (!(update.pw.value == update.pw_check.value)) {
		alert('비밀번호가 일치하지 않습니다');
		update.pw.focus();
		return false;
	}

	return update.submit();

}

function join_check() {

	var id_check = /^[A-Za-z0-9]{3,}$/;
	var pw_check = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^*()\-_=+\\\|\[\]{};:\'",.<>\/?]).{3,}$/;
	var name_check = /^[가-힣]*$/;

	if (!(id_check.test(join.id.value))) {
		alert('아이디는 대소문자만 입력가능합니다')
		join.id.focus();
		return false;
	}

	if (!(pw_check.test(join.pw.value))) {
		alert('비밀번호는 대소문자 및 특수문자와 숫자만 가능합니다')
		join.pw.focus();
		return false;
	}

	if (!(join.pw.value == join.pw_check.value)) {
		alert('비밀번호가 일치하지 않습니다');
		join.pw.focus();
		return false;
	}

	if (!(name_check.test(join.name.value))) {
		alert('이름은 한글만 입력가능합니다')
		join.name.focus();
		return false;
	}

	return join.submit();

}