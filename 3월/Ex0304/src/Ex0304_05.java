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
		System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ���");
		String ju = scan.next();
		int len = ju.length();

//		for (int i = 0; i < len; i++) {
//
//			if (!('0' <= ju.charAt(i) && ju.charAt(i) <= '9')) {
//				break;
//			}
//
//		} // for i

		if ((len != 14)) { // �ֹε�Ϲ�ȣ length 14�ڸ� (0���� �����ϴ°� �ƴ�!) �ڡڡ�
			System.out.println("13�ڸ��� �Է����ּ���");
			return;
		}

		char c = ju.charAt(7);
		if (c == '1' || c == '3') {
			System.out.println("�����Դϴ�");
		} else if (c == '2' || c == '4') { // char�� '' ���� ����ǥ!!
			System.out.println("�����Դϴ�");
		}

	}

	static void two() {

		Scanner scan = new Scanner(System.in);
		System.out.println("�й��� �Է����ּ���");
		String hak = scan.next();
		char h = hak.charAt(0);
		if (h == 'c' || h == 'C') {
			System.out.println("��ǻ���а� �Դϴ�");
		} else if (h == 'E' || h == 'e') {
			System.out.println("�����а� �Դϴ�");
		} else if (h == 'K' || h == 'k') {
			System.out.println("�����а� �Դϴ�");
		}

	}

	static void three() {

		Scanner scan = new Scanner(System.in);
		System.out.println("�װ��縦 �Է����ּ���");
		String air = scan.next();
		String check = air.substring(0, 2);
		if (check.equals("KE") || check.equals("ke")) {
			System.out.println("�����װ� �Դϴ�");
		} else if (check.equals("OZ") || check.equals("oz")) {
			System.out.println("�ƽþƳ��װ� �Դϴ�");
		} else if (check.equals("AF") || check.equals("af")) {
			System.out.println("�����������װ� �Դϴ�");
		}

	}

	static void four() { // contain �޼ҵ�

		Scanner scan = new Scanner(System.in);
		System.out.println("�̸����� �Է����ּ���");
		String email = scan.next();
		if (email.contains("@") == false || email.contains(".") == false) { // ��
			System.out.println("�ٽ� �Է����ּ���");
			return;
		}

	}

	// 1. Ư������ �ּ� 1�� �̻� 2. �빮�� �ּ� 1�� �̻� 3. 8�ڸ� �̻�
	// 65 ~ 90 �빮��
	// 97 ~ 122 �ҹ���
	static void five() {

		Scanner scan = new Scanner(System.in);
//		String sp = "~!@#$%^&*()";
		int count = 0;
		System.out.println("��й�ȣ�� �Է����ּ���");
		String pass = scan.next();

		if (pass.length() < 8) {
			System.out.println("8�ڸ� �̻� �Է����ּ���");
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

		} // for i (Ư������)

		if (count == 0) {
			System.out.println("Ư�����ڰ� ���Ե��� �ʾҽ��ϴ� �ٽ� �Է��� �ּ���");
			return;
		}

		count = 0;

		for (int i = 0; i < pass.length(); i++) {

			if (65 <= (char) pass.charAt(i) - 0 && (char) pass.charAt(i) - 0 <= 90) {
				// 0�� ����� ��!! '0'�� �ƴ϶� !! �ڡڡڡڡ�
				count++;
				break;
			}

		} // for i (�빮��)

		if (count == 0) {
			System.out.println("�빮�ڰ� ���Ե��� �ʾҽ��ϴ� �ٽ� �Է��� �ּ���");
			return;
		}

		count = 0;

	}

	static void six() { // split �޼ҵ�

		Scanner scan = new Scanner(System.in);

		System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ���");
		String ju = scan.next();
		String[] lit = ju.split("-");

		for (int i = 0; i < lit.length; i++) {
			System.out.print(lit[i] + "\t");

		}

		System.out.println();

		System.out.println("��ȭ��ȣ�� �Է����ּ���");
		String call = scan.next();
		String[] lit1 = call.split("-"); // String[] split

		System.out.println();

		for (int i = 0; i < lit1.length; i++) {
			System.out.print(lit1[i] + "\t");

		}

	}

	static void seven() { // trim

		Scanner scan = new Scanner(System.in);
		System.out.println("��й�ȣ�� �Է����ּ���");
		String pass = scan.nextLine(); // nextLine���� ����� ���� ������ ���ڵ� �ν� !! �ڡڡڡڡ�
		String pass1 = pass.trim(); // trim
		String pass2 = pass1.replaceAll(" ", ""); // replaceAll
		System.out.println("��й�ȣ�� " + pass2 + "�Դϴ�");

	}

}// class
