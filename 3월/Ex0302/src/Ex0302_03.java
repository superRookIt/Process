import java.util.*; //�ڡڡ�

//import java.util.ArrayList;
//import java.util.Scanner;

public class Ex0302_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		Stu_info stu = new Stu_info();

		ArrayList<Stu_info> stu1 = new ArrayList<Stu_info>();

		int i = 0;

		String name = "";
		String major = "";
		int grade = 0;
		String tel = "";

		while (i < 3) {
			System.out.println("1) �л������Է� 2)��� 3)�˻�");
			int num = scan.nextInt();

			switch (num) {

			case 1:

				System.out.println("�̸��� �Է��ϼ���. >> (����ȭ�� : 99)");
				name = scan.next();

				if (name.equals("99")) {
					System.out.println("����ȭ������ ���ư��ϴ�.");
					break;
				}

				System.out.println("�а��� �Է��ϼ���");
				major = scan.next();
				System.out.println("�г��� �Է��ϼ���");
				grade = scan.nextInt();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���");
				tel = scan.next();
				// ��ü�� �ֱ�
				stu1.add(new Stu_info(name, major, grade, tel)); // add
				i++;

				break;

			case 2:

				System.out.println("����մϴ�");

				if (stu1.isEmpty()) {
					System.out.println("�����Ͱ� �����ϴ�");
					break;
				}

				for (int j = 0; j < stu1.size(); j++) {

					Stu_info fo = (Stu_info) stu1.get(j); // get
					// �ڡڡڡڡ� (���� ��ƴ�;;), toString ó��
					// System.out.println(stu1.get(1)); -> ������ @�ּҰ��� ���� !!

					System.out.print(fo.hack_num + "\t");
					System.out.print(fo.name + "\t");
					System.out.print(fo.major + "\t");
					System.out.print(fo.grade + "\t");
					System.out.print(fo.tel + "\t");
					System.out.println();
				}

				break;

			case 3:

				System.out.println("�˻��� �̸��� �Է��ϼ���.");
				String name2 = scan.next();

				for (int j = 0; j < stu1.size(); j++) {

					Stu_info info = (Stu_info) stu1.get(j);

					if (name2.equals(info.name)) {
						System.out.println("ã�� �л���");
						System.out.println(info.hack_num + "\t" + info.name + "\t" + info.major + "\t" + info.grade);
					}

				} // for j

				break;

			}// switch

		} // while

	}// main

}// class
