import java.util.Scanner;

public class Ex0218_04 {

	static int stu_count = 0; // �ڡڡ�

	public static void main(String[] args) {

		Student[] t = new Student[10]; // �ڡ�
		Scanner scan = new Scanner(System.in);

		String[] sub = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "���" };

		int b = 0;
		int c = 0;
		int count = 1;

		// ù��° ���� �ݺ�
		while (true) {

			Ex0218_04.main_print();// �� �޼ҵ� �и�

			switch (scan.nextInt()) { // ��

			case 0:

				System.out.println("�ý����� �����մϴ�");
				break;

			case 1:

				insert(t); // �л������߰� �޼ҵ� - �޼ҵ� �и�

				break;

			

			}// switch

		} // while

	}// main

	// �ڸ��� ��� �޼ҵ��
	static void main_print() {

		System.out.println();
		System.out.println("[ �л�����ó�����α׷� ]");
		System.out.print("1.�����߰�" + "\t");
		System.out.print("2.��������" + "\t");
		System.out.println("3.��������" + "\t");
		System.out.print("4.�����˻�" + "\t");
		System.out.print("5.���ó��" + "\t");
		System.out.println("0.����" + "\t");
		System.out.println("��ȣ�� �Է��ϼ���");

	}

	static void insert(Student[] t) { // �ڡڡڡڡ� �迭�� �޾ƾ� ^^

		String insert_name = "";
		Scanner scan = new Scanner(System.in); // ��

		System.out.println("���� �߰��� �����߽��ϴ�");
		// �޼ҵ� �и�

		for (int i = stu_count; i < t.length; i++) {
			System.out.println("�̸��� �Է����ּ���. (99:����ȭ��)");
			insert_name = scan.next();

			if (insert_name.equals("99")) {// �̶� 99�� ����
				System.out.println("����ȭ������ �̵��մϴ�.>>");
				break;
			}

			t[i] = new Student();

			t[i].num = (Student.first_num += 1); // �ڡ�
			t[i].name = insert_name;
			System.out.println("���������� �Է����ּ���");
			t[i].kor = scan.nextInt();
			System.out.println("���������� �Է����ּ���");
			t[i].eng = scan.nextInt();
			System.out.println("���������� �Է����ּ���");
			t[i].math = scan.nextInt();
			scan.nextLine();
			t[i].total_();
			t[i].avg_();
			Ex0218_04.stu_count++;
			System.out.println(stu_count + "��° �л� - �й� : " + t[i].num + " �̸� : " + t[i].name);

		}

	}

}// class
