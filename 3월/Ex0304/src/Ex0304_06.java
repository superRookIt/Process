import java.util.*; // ��

public class Ex0304_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Member> m = new ArrayList<Member>();

//		String id ->�빮�� 1�� �̻�, 5�ڸ� �̻�, �ߺ�üũ
//		String pw ->Ư������ 1�� �̻�, 8�ڸ� �̻�
//		String name
//		String s_number  �ֹι�ȣ 14�ڸ����� �Է�
//		String email -> @ . �ִ��� üũ
//		String tel
//		int gender -> ������ ���ڷθ� ���� : 0 �Ǵ� ���� : 1

		while (true) {

			System.out.println("-----------------");
			System.out.println("1) ȸ���Է� 2)ȸ�����");
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

		System.out.println("ȸ�������� �Է��մϴ� ");

		System.out.println("ID�� �Է����ּ��� (�Է����� : 99) ");
		String id = scan.next();

		if (id.equals("99")) {
			System.out.println("�����մϴ�");
			return; // break�� �ȸ��� ! �ڡڡ�
		}

		if (id.length() < 5) {
			System.out.println("id�� 5�ڸ� �̻� �Է����ּ���");
			return;
		}

		for (int i = 0; i < id.length(); i++) {

			if (65 <= id.charAt(i) - 0 && id.charAt(i) - 0 <= 90) {
				count++;
			}

		} // for i (�빮��)

		if (count == 0) {
			System.out.println("�빮�ڸ� �ݵ�� 1�� �̻� �Է����ּ���");
			return;
		}

		count = 0;

		for (int i = 0; i < m.size(); i++) {

			Member m1 = (Member) m.get(i);
			if ((m1.id).equals(id)) {
				System.out.println("���̵� �ߺ��Դϴ�");
				break;
			}

		}

		System.out.println("��й�ȣ�� �Է����ּ���");
		String pass = scan.next();

		if (pass.length() < 8) {
			System.out.println("��й�ȣ�� �ٽ� �Է����ּ���");
			return;
		}

		for (int i = 0; i < pass.length(); i++) {

			if (!('A' <= pass.charAt(i) && pass.charAt(i) <= 'Z' || 'a' <= pass.charAt(i) && pass.charAt(i) <= 'z'
					|| '0' <= pass.charAt(i) && pass.charAt(i) <= '9')) {
				count++;
			}

		} // for i (Ư������)

		if (count == 0) {
			System.out.println("Ư������ 1���� �ݵ�� ������ �ּ���");
			return;
		}

		count = 0;

		System.out.println("�̸��� �Է����ּ���");
		String name = scan.next();

		System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ���");
		String ju = scan.next();
		if (!(ju.length() == 14)) {
			System.out.println("�ֹε�Ϲ�ȣ 14�ڸ��� �Է����ּ���");
			return;
		}

		System.out.println("E-MAIL�ּҸ� �Է����ּ���");
		String mail = scan.next();
		if (!(mail.contains("@") || mail.contains("."))) {
			System.out.println("�����ּҸ� �ٽ� �Է����ּ���");
			return;
		}

		System.out.println("��ȭ�� �Է����ּ���");
		String tel = scan.next();

		System.out.println("������ �Է����ּ��� (���� : 0, ���� : 1)");
		int gen = scan.nextInt();
		if (!(gen == 0 || gen == 1)) {
			System.out.println("0 �Ǵ� 1���� �Է����ּ���");
			return;
		}

		m.add(new Member(id, pass, name, ju, mail, tel, gen));

//		System.out.println((Member) m.get(0)); toString ���� ��µ� !!! �ڡڡڡڡ� 

	}

	static void print(ArrayList<Member> m) {

		System.out.println("ȸ�������� ����մϴ�");
		System.out.print("���̵�" + "\t" + "��й�ȣ" + "\t" + "�̸�" + "\t" + "�ֹε�Ϲ�ȣ" + "\t" + "�̸���" + "\t" + "\t" + "��ȭ��ȣ"
				+ "\t" + "\t" + "����" + "\t");
		System.out.println();

		for (int i = 0; i < m.size(); i++) {

			String s = "";
			Member m1 = (Member) m.get(i);

			if (m1.gender == 0) {
				s = "����";
			} else {
				s = "����";
			}

			System.out.println(m1.id + "\t" + m1.pw + "\t" + m1.name + "\t" + m1.s_number + "\t" + m1.email + "\t"
					+ m1.tel + "\t" + s);

			System.out.println();

		}

	}

}// class
