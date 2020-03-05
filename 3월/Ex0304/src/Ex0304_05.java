import java.util.Scanner;

public class Ex0304_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		one();

//		two();
//
//		three();

//		four();

//		five();

//		six();

		seven();

	}// main

	static void one() {

		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록번호를 입력해주세요");
		String ju = scan.next();
		int len = ju.length();

//		for (int i = 0; i < len; i++) {
//
//			if (!('0' <= ju.charAt(i) && ju.charAt(i) <= '9')) {
//				break;
//			}
//
//		} // for i

		if ((len != 14)) { // 주민등록번호 length 14자리 (0부터 시작하는게 아님!) ★★★
			System.out.println("13자리를 입력해주세요");
			return;
		}

		char c = ju.charAt(7);
		if (c == '1' || c == '3') {
			System.out.println("남자입니다");
		} else if (c == '2' || c == '4') { // char는 '' 작은 따옴표!!
			System.out.println("여자입니다");
		}

	}

	static void two() {

		Scanner scan = new Scanner(System.in);
		System.out.println("학번을 입력해주세요");
		String hak = scan.next();
		char h = hak.charAt(0);
		if (h == 'c' || h == 'C') {
			System.out.println("컴퓨터학과 입니다");
		} else if (h == 'E' || h == 'e') {
			System.out.println("영문학과 입니다");
		} else if (h == 'K' || h == 'k') {
			System.out.println("국문학과 입니다");
		}

	}

	static void three() {

		Scanner scan = new Scanner(System.in);
		System.out.println("항공사를 입력해주세요");
		String air = scan.next();
		String check = air.substring(0, 2);
		if (check.equals("KE") || check.equals("ke")) {
			System.out.println("대한항공 입니다");
		} else if (check.equals("OZ") || check.equals("oz")) {
			System.out.println("아시아나항공 입니다");
		} else if (check.equals("AF") || check.equals("af")) {
			System.out.println("에어프랑스항공 입니다");
		}

	}

	static void four() { // contain 메소드

		Scanner scan = new Scanner(System.in);
		System.out.println("이메일을 입력해주세요");
		String email = scan.next();
		if (email.contains("@") == false || email.contains(".") == false) { // ★
			System.out.println("다시 입력해주세요");
			return;
		}

	}

	// 1. 특수문자 최소 1개 이상 2. 대문자 최소 1개 이상 3. 8자리 이상
	// 65 ~ 90 대문자
	// 97 ~ 122 소문자
	static void five() {

		Scanner scan = new Scanner(System.in);
//		String sp = "~!@#$%^&*()";
		int count = 0;
		System.out.println("비밀번호를 입력해주세요");
		String pass = scan.next();

		if (pass.length() < 8) {
			System.out.println("8자리 이상 입력해주세요");
		}

//		for (int i = 0; i < pass.length(); i++) {
//			for (int j = 0; j < sp.length(); j++)
//				if (!(pass.charAt(i) == sp.charAt(j))) {
//					count++;
//				}
//		} // for i

		for (int i = 0; i < pass.length(); i++) {

			if (!('A' <= pass.charAt(i) && pass.charAt(i) <= 'Z' || 'a' <= pass.charAt(i) && pass.charAt(i) <= 'z'
					|| '0' <= pass.charAt(i) && pass.charAt(i) <= '9')) {
				count++;
				break;
			}

		} // for i (특수문자)

		if (count == 0) {
			System.out.println("특수문자가 포함되지 않았습니다 다시 입력해 주세요");
			return;
		}

		count = 0;

		for (int i = 0; i < pass.length(); i++) {

			if (65 <= (char) pass.charAt(i) - 0 && (char) pass.charAt(i) - 0 <= 90) {
				// 0을 빼줘야 함!! '0'이 아니라 !! ★★★★★
				count++;
				break;
			}

		} // for i (대문자)

		if (count == 0) {
			System.out.println("대문자가 포함되지 않았습니다 다시 입력해 주세요");
			return;
		}

		count = 0;

	}

	static void six() { // split 메소드

		Scanner scan = new Scanner(System.in);

		System.out.println("주민등록번호를 입력해주세요");
		String ju = scan.next();
		String[] lit = ju.split("-");

		for (int i = 0; i < lit.length; i++) {
			System.out.print(lit[i] + "\t");

		}

		System.out.println();

		System.out.println("전화번호를 입력해주세요");
		String call = scan.next();
		String[] lit1 = call.split("-"); // String[] split

		System.out.println();

		for (int i = 0; i < lit1.length; i++) {
			System.out.print(lit1[i] + "\t");

		}

	}

	static void seven() { // trim

		Scanner scan = new Scanner(System.in);
		System.out.println("비밀번호를 입력해주세요");
		String pass = scan.nextLine(); // nextLine으로 해줘야 띄어쓰기 이후의 문자도 인식 !! ★★★★★
		String pass1 = pass.trim(); // trim
		String pass2 = pass1.replaceAll(" ", ""); // replaceAll
		System.out.println("비밀번호는 " + pass2 + "입니다");

	}

}// class
