import java.util.Scanner;
import java.util.Vector;

public class Ex0303_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Vector<Student> s = new Vector<Student>();
		int a = 0;
		int b = 0;
//		int n = 0;

		while (true) {

			System.out.println("--------------------------"); // �ڡڡڡڡ� ����
			System.out.println(" [ �л� ���� ���α׷� ] ");
			System.out.println("1) �л������Է� 2)�л������Է� 3)�л��������");
			System.out.println("4) �л�������� 5)�л������˻� 6)�л������˻� 0)����");
			System.out.println("��ȣ�� �Է��� �ּ���");
			int num = scan.nextInt();

			switch (num) {

			case 0:

				System.out.println("���α׷��� �����մϴ�");
				break;

			case 1:

				while (true) {

					System.out.println("�л������� �Է��մϴ� ");
					System.out.println("�̸��� �Է��� �ּ��� (�����Ϸ��� 99��)");
					String name = scan.next();

					if (name.equals("99")) {
						break;
					}

					System.out.println("���� �Է��� �ּ���");
					String major = scan.next();
					System.out.println("�г��� �Է��� �ּ���");
					int grade = scan.nextInt();
					s.add(new Student(name, major, grade));

				} // while

				break;

			case 2:

				System.out.println("�л������� �Է��մϴ�");
				System.out.println("�й��� �Է��� �ּ���");
				int check = scan.nextInt(); // for�� �ȿ� ���� ���� !! �ڡڡ�

				for (int i = 0; i < s.size(); i++) {

					Student s1 = (Student) s.get(i);

					if (check == s1.hak_num) {
						System.out.println("�й� : " + s1.hak_num + " �̸� :" + s1.name + "�� ������ �Է��մϴ�");
						System.out.println("���� ������ �Է����ּ���");
						s1.kor = scan.nextInt();
						System.out.println("���� ������ �Է����ּ���");
						s1.eng = scan.nextInt();
						s1.total();
						s1.avg();
//						n++;
						break;

					}

				} // for i

//				if (n == 0) {
//					System.out.println("��ġ�ϴ� �й��� �����ϴ�");
//					break;
//				}
//
//				n = 0;

				break;

			case 3:

				System.out.println("�л������� ����մϴ�");
				System.out.print("�й�" + "\t" + "�̸�" + "\t" + "�а�" + "\t" + "�г�");
				System.out.println();

				for (int i = 0; i < s.size(); i++) {
					Student s1 = (Student) s.get(i);
					System.out.print(s1.hak_num + "\t" + s1.name + "\t" + s1.major + "\t" + s1.grade);
					System.out.println();
				}

				break;

			case 4:

				System.out.println("�л������� ����մϴ�");
				System.out.print("�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "�հ�" + "\t" + "���");
				System.out.println();

				for (int i = 0; i < s.size(); i++) {
					Student s1 = (Student) s.get(i);
					System.out.print(s1.name + "\t" + s1.kor + "\t" + s1.eng + "\t" + s1.total + "\t" + s1.avg);
					System.out.println();
				}

				break;

			case 5:

				System.out.println("�л������� �˻��մϴ�");
				a = info(s);
				System.out.print("�й�" + "\t" + "�̸�" + "\t" + "�а�" + "\t" + "�г�");
				System.out.println();

				for (int i = a; i <= a; i++) {
					Student s1 = (Student) s.get(a);
					System.out.print(s1.hak_num + "\t" + s1.name + "\t" + s1.major + "\t" + s1.grade);
				}

				break;

			case 6:

				System.out.println("�л������� �˻��մϴ�");
				b = score(s);
				System.out.print("�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "�հ�" + "\t" + "���");
				System.out.println();

				for (int i = b; i <= b; i++) {
					Student s1 = (Student) s.get(b);
					System.out.print(s1.name + "\t" + s1.kor + "\t" + s1.eng + "\t" + s1.total + "\t" + s1.avg);
				}

				break;

			}// switch

		} // while

	}// main

	static int info(Vector s) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		System.out.println("�й��� �Է��ϼ���");
		int check = scan.nextInt();

		for (int i = 0; i < s.size(); i++) {
			Student s1 = (Student) s.get(i);

			if (check == s1.hak_num) {
				a = i;
			}

		} // for i

		return a;
	}

	static int score(Vector s) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		System.out.println("�й��� �Է��ϼ���");
		int check = scan.nextInt();

		for (int i = 0; i < s.size(); i++) {
			Student s1 = (Student) s.get(i);

			if (check == s1.hak_num) {
				a = i;
			}

		} // for i

		return a;

	}

}// class
