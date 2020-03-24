/*
 *  javascript source file
 */

function check() {

	var name_check = /^[가-힣]*$/;

	if (!(name_check.test(join.j_name.value))) {
		alert('한글 1자리 이상 입력');
		join.j_name.focus();
		return false;
	}

	var age_check = /^[0-9]{1,1}$/;
	var age1_check = /^[0-9]{2,2}$/;
	var age2_check = /^[0-9]{3,3}$/;
	var age3_check = /^[0-9]{4,4}$/;

	if (!(age_check.test(join.j1.value))) {
		alert('숫자 1자리');
		join.j1.focus();
		return false;
	}

	if (!(age1_check.test(join.j2.value))) {
		alert('숫자 2자리');
		join.j2.focus();
		return false;
	}

	if (!(age2_check.test(join.j3.value))) {
		alert('숫자 3자리');
		join.j3.focus();
		return false;
	}

	if (!(age3_check.test(join.j4.value))) {
		alert('숫자 4자리');
		join.j4.focus();
		return false;
	}

	function add(a, b, c, d) {
		return a + b + c + d;
	}

	function multi(a, b, c, d) {
		return a * b * c * d;
	}

	var num1 = join.j1.value;
	var num2 = join.j2.value;
	var num3 = join.j3.value;
	var num4 = join.j4.value;

	var total = add(num1-0, num2-0, num3-0, num4-0);
	//0을 빼주니까 계산이 되네 ^^
	var total2 = multi(num1, num2, num3, num4);

	document.write("숫자 4개의 합 : " + total + "<br>");
	document.write("숫자 4개의 곱 : " + total2);

}
