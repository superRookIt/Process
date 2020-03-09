import java.util.*;

public class Login {

	static Scanner scan = new Scanner(System.in); // Scanner �տ� static ��

	static void join(ArrayList m, HashMap p) {

		System.out.println("ȸ�������� �����մϴ�");

		System.out.println("id�� �Է����ּ���");
		String id = scan.next();

		if (id.length() < 3) {
			System.out.println("3�ڸ� �̻� �Է����ּ���");
			return;
		}

		System.out.println("��й�ȣ�� �Է����ּ���");
		String pw = scan.next();
		System.out.println("�̸��� �Է����ּ���");
		String name = scan.next();
		System.out.println("��ȭ��ȣ�� �Է����ּ���");
		String tel = scan.next();

		m.add(new Member(id, pw, name, tel));
		p.put(id, pw);

		// m2.add(p.put(id, pw)); -> �̰� �� �� (�ٵ� ��� Ȱ���ؾ� ������ �𸣰���)

		System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");

	}

	static void print(ArrayList m) {

		if (m.isEmpty()) {
			System.out.println("������ �����ϴ�");
			return;
		}

		System.out.println("1)�Է¼� ��� 2)���̵�� ��� 3)�̸��� ���");
		int num = scan.nextInt();

		switch (num) {

		case 1:

			System.out.println("�Է¼� ����մϴ�");

			for (int i = 0; i < m.size(); i++) {
				System.out.println(m.get(i));
			}

			break;

		case 2:

			System.out.println("id�� ����մϴ�");

			Collections.sort(m, new Comparator<Member>() {

				@Override
				public int compare(Member m1, Member m2) {
					return m1.id.compareTo(m2.id);
				}

			}); // �ڡڡڡڡ�

			for (int i = 0; i < m.size(); i++) {
				System.out.println(m.get(i));
			}

			break;

		case 3:

			System.out.println("�̸��� ����մϴ�");

			Collections.sort(m, new Comparator<Member>() {

				@Override
				public int compare(Member m1, Member m2) {
					return m1.name.compareTo(m2.name);
				}

			}); // �ڡڡڡڡ�

			for (int i = 0; i < m.size(); i++) {
				System.out.println(m.get(i));
			}

//			// Member m1 = (Member) m.get(i);
//			// System.out.print("id : " + m1.id + " ��й�ȣ : " + m1.ps + " �̸� : " + m1.name +
//			// " ��ȭ��ȣ : " + m1.tel);

			break;

		}// switch

	} // print �޼ҵ�

	static void search(ArrayList m) {

		Scanner scan = new Scanner(System.in);

		System.out.println("ã�� ȸ���� �Է����ּ��� (�ѱ��� �Էµ� ����)");
		String ser = scan.next();

		for (int i = 0; i < m.size(); i++) {

			Member m1 = (Member) m.get(i);

			if (m1.name.contains(ser)) {

				System.out.println(m.get(i)); // �����̳� ���� �ڡڡڡڡ�

//				System.out.println("id : " + m1.id + " ��й�ȣ : " + m1.ps + " �̸� : " + m1.name + " ��ȭ��ȣ : " + m1.tel);

			}

		} // for i

	}// search

	static void log(ArrayList m, HashMap p) {

		System.out.println("id�� ��й�ȣ�� �Է����ּ���");
		System.out.print("id : ");
		String id = scan.next();

		if (!(p.containsKey(id))) {
			System.out.println("��ġ�ϴ� ���̵� �����ϴ� ");
			return;
		}

		System.out.println("��й�ȣ�� �Է����ּ���");
		String pw = scan.next(); // nextLine���� �ϴϱ� ������ ������ �Ѥ�

		if (!(p.get(id).equals(pw))) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			return;
		}

		for (int i = 0; i < m.size(); i++) {

			Member m1 = (Member) m.get(i);

			if (m1.id.equals(id) && m1.ps.equals(pw)) {
				System.out.println(m1.name + "�� �α��� �ϼ̽��ϴ�");
				break;
			}

		} // for i

	} // log

	static void logout(HashMap p) {

		System.out.println("�α׾ƿ� �մϴ�");

		System.out.println("id�� �Է����ּ���");
		String id = scan.next();

		if (!(p.containsKey(id))) {
			System.out.println("��ġ�ϴ� ���̵� �����ϴ� ");
			return;
		}

		p.remove(id, p.get(id)); // map���� �����

	}// logout

}// login class
