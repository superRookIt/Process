import java.util.*; // ★

public class Ex0304_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Member> m = new ArrayList<Member>();

//		String id ->대문자 1개 이상, 5자리 이상, 중복체크
//		String pw ->특수문자 1개 이상, 8자리 이상
//		String name
//		String s_number  주민번호 14자리까지 입력
//		String email -> @ . 있는지 체크
//		String tel
//		int gender -> 성별은 숫자로만 남자 : 0 또는 여자 : 1

		while (true) {

			System.out.println("-----------------");
			System.out.println("1) 회원입력 2)회원출력");
			int num = scan.nextInt();

			switch (num) {

			case 1:

				insert(m);

				break;

			case 2:

				print(m);

				break;

			}// switch

		} // while

	}// main

	static void insert(ArrayList<Member> m) {

		Scanner scan = new Scanner(System.in);

		int count = 0;

		System.out.println("회원정보를 입력합니다 ");

		System.out.println("ID를 입력해주세요 (입력종료 : 99) ");
		String id = scan.next();

		if (id.equals("99")) {
			System.out.println("종료합니다");
			return; // break가 안먹힘 ! ★★★
		}

		if (id.length() < 5) {
			System.out.println("id를 5자리 이상 입력해주세요");
			return;
		}

		for (int i = 0; i < id.length(); i++) {

			if (65 <= id.charAt(i) - 0 && id.charAt(i) - 0 <= 90) {
				count++;
			}

		} // for i (대문자)

		if (count == 0) {
			System.out.println("대문자를 반드시 1개 이상 입력해주세요");
			return;
		}

		count = 0;

		for (int i = 0; i < m.size(); i++) {

			Member m1 = (Member) m.get(i);
			if ((m1.id).equals(id)) {
				System.out.println("아이디 중복입니다");
				break;
			}

		}

		System.out.println("비밀번호를 입력해주세요");
		String pass = scan.next();

		if (pass.length() < 8) {
			System.out.println("비밀번호를 다시 입력해주세요");
			return;
		}

		for (int i = 0; i < pass.length(); i++) {

			if (!('A' <= pass.charAt(i) && pass.charAt(i) <= 'Z' || 'a' <= pass.charAt(i) && pass.charAt(i) <= 'z'
					|| '0' <= pass.charAt(i) && pass.charAt(i) <= '9')) {
				count++;
			}

		} // for i (특수문자)

		if (count == 0) {
			System.out.println("특수문자 1개를 반드시 포함해 주세요");
			return;
		}

		count = 0;

		System.out.println("이름을 입력해주세요");
		String name = scan.next();

		System.out.println("주민등록번호를 입력해주세요");
		String ju = scan.next();
		if (!(ju.length() == 14)) {
			System.out.println("주민등록번호 14자리를 입력해주세요");
			return;
		}

		System.out.println("E-MAIL주소를 입력해주세요");
		String mail = scan.next();
		if (!(mail.contains("@") || mail.contains("."))) {
			System.out.println("메일주소를 다시 입력해주세요");
			return;
		}

		System.out.println("전화를 입력해주세요");
		String tel = scan.next();

		System.out.println("성별을 입력해주세요 (남자 : 0, 여자 : 1)");
		int gen = scan.nextInt();
		if (!(gen == 0 || gen == 1)) {
			System.out.println("0 또는 1번만 입력해주세요");
			return;
		}

		m.add(new Member(id, pass, name, ju, mail, tel, gen));

//		System.out.println((Member) m.get(0)); toString 값이 출력됨 !!! ★★★★★ 

	}

	static void print(ArrayList<Member> m) {

		System.out.println("회원정보를 출력합니다");
		System.out.print("아이디" + "\t" + "비밀번호" + "\t" + "이름" + "\t" + "주민등록번호" + "\t" + "이메일" + "\t" + "\t" + "전화번호"
				+ "\t" + "\t" + "성별" + "\t");
		System.out.println();

		for (int i = 0; i < m.size(); i++) {

			String s = "";
			Member m1 = (Member) m.get(i);

			if (m1.gender == 0) {
				s = "남자";
			} else {
				s = "여자";
			}

			System.out.println(m1.id + "\t" + m1.pw + "\t" + m1.name + "\t" + m1.s_number + "\t" + m1.email + "\t"
					+ m1.tel + "\t" + s);

			System.out.println();

		}

	}

}// class
