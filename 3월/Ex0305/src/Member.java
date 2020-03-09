
public class Member { // ★★★

	String id;
	String ps;
	String name;
	String tel;
	int money;
	int point;

	int serial;

	int sum;
	String list = "";

	Member() {

	}

	Member(String id, String ps, String name, String tel) {

		this.id = id;
		this.ps = ps;
		this.name = name;
		this.tel = tel;
		this.money = 100000;

	}

	public String toString() {
		return "id : " + id + " , 비밀번호 : " + ps + " , 이름 : " + name + " , 전화번호 : " + tel;

	}

}
