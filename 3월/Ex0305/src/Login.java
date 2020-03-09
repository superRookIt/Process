import java.util.*;

public class Login {

	static Scanner scan = new Scanner(System.in); // Scanner 앞에 static ★

	static void join(ArrayList m, HashMap p) {

		System.out.println("회원가입을 시작합니다");

		System.out.println("id를 입력해주세요");
		String id = scan.next();

		if (id.length() < 3) {
			System.out.println("3자리 이상 입력해주세요");
			return;
		}

		System.out.println("비밀번호를 입력해주세요");
		String pw = scan.next();
		System.out.println("이름을 입력해주세요");
		String name = scan.next();
		System.out.println("전화번호를 입력해주세요");
		String tel = scan.next();

		m.add(new Member(id, pw, name, tel));
		p.put(id, pw);

		// m2.add(p.put(id, pw)); -> 이거 됌 ★ (근데 어떻게 활용해야 될지를 모르겠음)

		System.out.println("회원가입이 완료 되었습니다.");

	}

	static void print(ArrayList m) {

		if (m.isEmpty()) {
			System.out.println("정보가 없습니다");
			return;
		}

		System.out.println("1)입력순 출력 2)아이디순 출력 3)이름순 출력");
		int num = scan.nextInt();

		switch (num) {

		case 1:

			System.out.println("입력순 출력합니다");

			for (int i = 0; i < m.size(); i++) {
				System.out.println(m.get(i));
			}

			break;

		case 2:

			System.out.println("id순 출력합니다");

			Collections.sort(m, new Comparator<Member>() {

				@Override
				public int compare(Member m1, Member m2) {
					return m1.id.compareTo(m2.id);
				}

			}); // ★★★★★

			for (int i = 0; i < m.size(); i++) {
				System.out.println(m.get(i));
			}

			break;

		case 3:

			System.out.println("이름순 출력합니다");

			Collections.sort(m, new Comparator<Member>() {

				@Override
				public int compare(Member m1, Member m2) {
					return m1.name.compareTo(m2.name);
				}

			}); // ★★★★★

			for (int i = 0; i < m.size(); i++) {
				System.out.println(m.get(i));
			}

//			// Member m1 = (Member) m.get(i);
//			// System.out.print("id : " + m1.id + " 비밀번호 : " + m1.ps + " 이름 : " + m1.name +
//			// " 전화번호 : " + m1.tel);

			break;

		}// switch

	} // print 메소드

	static void search(ArrayList m) {

		Scanner scan = new Scanner(System.in);

		System.out.println("찾을 회원을 입력해주세요 (한글자 입력도 가능)");
		String ser = scan.next();

		for (int i = 0; i < m.size(); i++) {

			Member m1 = (Member) m.get(i);

			if (m1.name.contains(ser)) {

				System.out.println(m.get(i)); // 만능이네 ㅋㅋ ★★★★★

//				System.out.println("id : " + m1.id + " 비밀번호 : " + m1.ps + " 이름 : " + m1.name + " 전화번호 : " + m1.tel);

			}

		} // for i

	}// search

	static void log(ArrayList m, HashMap p) {

		System.out.println("id와 비밀번호를 입력해주세요");
		System.out.print("id : ");
		String id = scan.next();

		if (!(p.containsKey(id))) {
			System.out.println("일치하는 아이디가 없습니다 ");
			return;
		}

		System.out.println("비밀번호를 입력해주세요");
		String pw = scan.next(); // nextLine으로 하니까 저절로 내려감 ㅡㅡ

		if (!(p.get(id).equals(pw))) {
			System.out.println("비밀번호가 일치하지 않습니다");
			return;
		}

		for (int i = 0; i < m.size(); i++) {

			Member m1 = (Member) m.get(i);

			if (m1.id.equals(id) && m1.ps.equals(pw)) {
				System.out.println(m1.name + "님 로그인 하셨습니다");
				break;
			}

		} // for i

	} // log

	static void logout(HashMap p) {

		System.out.println("로그아웃 합니다");

		System.out.println("id를 입력해주세요");
		String id = scan.next();

		if (!(p.containsKey(id))) {
			System.out.println("일치하는 아이디가 없습니다 ");
			return;
		}

		p.remove(id, p.get(id)); // map에서 지우기

	}// logout

}// login class
