
public class Member {

	String id;
	String pw;
	String name;
	String s_number; // 주민번호
	String email;
	String tel;
	int gender; // 성별

	Member() {

	}

	Member(String id, String pw, String name, String s_number, String email, String tel, int gender) {

		this.id = id;
		this.pw = pw;
		this.name = name;
		this.s_number = s_number;
		this.email = email;
		this.tel = tel;
		this.gender = gender;

	}

	public String toString() {
		return "아이디 : " + id + " 패스워드 : " + pw + " 이름 : " + name + " 주민번호 : " + s_number + " 전화번호 : " + tel + " 성별 : "
				+ gender;
	}

}
