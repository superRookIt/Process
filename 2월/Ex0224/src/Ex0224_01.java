import java.util.Scanner;

public class Ex0224_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] stu_title = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		Student[] stu = new Student[3]; // �л�10�� ��ü�迭
		int[] score = new int[3]; // �����޴� �迭
		int kor = 0;
		int eng = 0;
		int math = 0;
		int stu_count = 0;

		while (true) {
			System.out.println("1. �л������Է�");
			System.out.println("2. �л��������");
			System.out.println("3. �л���������");
			System.out.println("4. �л�����Է�");
			System.out.println("5. ����");

			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>> ");
			int s_num = scan.nextInt();

			switch (s_num) {

			case 1: // �л������Է�
				stu_count = stu_input(stu, score, stu_title, stu_count);
				System.out.println("�л������Է� �Ϸ�");
				System.out.println("--------------------------------");

				break;

			case 2: // �л��������
				stu_print(stu, stu_title, stu_count);
				System.out.println("�л�������� �Ϸ�");
				System.out.println("--------------------------------");

				break;

			case 3: // �л���������
				stu_modify(stu);
				System.out.println("�л��������� �Ϸ�");
				System.out.println("--------------------------------");

				break;

			case 4:

				break;
			case 5:

				break;

			default:
				break;
			}// switch

		} // while

	} // main

	static int stu_input(Student[] stu, int[] score, String[] stu_title, int stu_count) {
		// �޼ҵ� �и�/����� �л��� �ԷµǾ����� Ȯ���ؼ� ����� �غ�����.
		Scanner scan = new Scanner(System.in);
		loop1: while (true) {
			// ���� �Էºκ�
			for (int i = stu_count; i < stu.length; i++) {
				System.out.println("�̸��� �Է��ϼ���.>>(99:����ȭ��)");
				String name = scan.nextLine();
				if (name.equals("99")) {
					break loop1;
				}
				// �����Էºκ�
				for (int j = 0; j < 3; j++) {
					System.out.println(stu_title[j + 2] + " ���� �Է��ϼ���.>>");
					score[j] = scan.nextInt();
					scan.nextLine();
				}
				stu_count++;
				stu[i] = new Student(name, score[0], score[1], score[2]);
				// 10��
				if (stu_count == 3) {
					break loop1;
				}
			}
		} // while
		return stu_count;

	} // stu_input �޼ҵ�

	static void stu_print(Student[] stu, String[] stu_title, int stu_count) {
		System.out.println("�Էµ� �л� : " + stu_count);
		System.out.println(stu_title[0] + "\t" + stu_title[1] + "\t" + stu_title[2] + "\t" + stu_title[3] + "\t"
				+ stu_title[4] + "\t" + stu_title[5] + "\t" + stu_title[6] + "\t" + stu_title[7]);
		for (int i = 0; i < stu_count; i++) {
			System.out.println(stu[i].hak_num + "\t" + stu[i].name + "\t" + stu[i].kor + "\t" + stu[i].eng + "\t"
					+ stu[i].math + "\t" + stu[i].total + "\t" + stu[i].avg + "\t" + stu[i].rank);

		}
	}

	// �л���������
	static void stu_modify(Student[] stu) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����ϰ� ���� �л��̸��� �Է��ϼ���.");
		String s_name = scan.nextLine();
		for (int i = 0; i < stu.length; i++) {
			if (s_name.equals(stu[i].name)) {
				System.out.println(s_name + " �˻��Ǿ����ϴ�.");
				System.out.println("1.������� 2.������� 3.���м��� 4.�̸����� 0.����ȭ��");
				System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
				int s_num1 = scan.nextInt();

				switch (s_num1) {
				case 1:
					sw_modify(stu, i, "����");

					break;

				case 2:
					sw_modify(stu, i, "����");

					break;

				case 3:
					sw_modify(stu, i, "����");

					break;

				case 4:
					System.out.println("���� �̸� :" + stu[i].name);
					System.out.println("���� �̸��� �Է��ϼ���.>>");
					stu[i].name = scan.nextLine();
					break;

				}

			} else {
				System.out.println("�̸� ����ġ. �ٽð˻�>>");
			}
		}

	}// stu_modify �޼ҵ�

	static void sw_modify(Student[] stu, int i, String subject) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����" + subject + "���� :" + stu[i].kor);
		System.out.println("����" + subject + "������ �Է��ϼ���.>>");
		if (subject.equals("����")) {
			stu[i].kor = scan.nextInt();
		} else if (subject.equals("����")) {
			stu[i].eng = scan.nextInt();
		} else {
			stu[i].math = scan.nextInt();
		}
		stu[i].modify();
	}

} // class