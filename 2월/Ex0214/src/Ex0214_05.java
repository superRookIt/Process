import java.util.Scanner;

public class Ex0214_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = 0;
		String[] name = new String[10];
		int[][] sub = new int[10][4]; // ����,����,����
		String[] list = { "�̸�", "����", "����", "����", "�հ�", " ���", "���" }; // "����", "����", "����", "�հ�"
		int[] rank = new int[10];
		int count = 1;
		double[] avg = new double[10];
		int stu_num = 0, s_num = 0; // �ڡ�
		String yn = "";
		String stu_name = "";

		while (true) {

			System.out.println("------------------");
			System.out.println("    ����ó�����α׷�    ");
			System.out.println("------------------");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ���ó��");
			System.out.println("4. �л������˻�");
			System.out.println("0. �ý�������");
			System.out.println("------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���");
			a = scan.nextInt();

			switch (a) {

			case 1:

				System.out.println("�����Է��� �����ϼ̽��ϴ�");

				for (int i = stu_num; i < name.length; i++) {
					System.out.println("�̸��� �Է����ּ��� >> ���� 99");
					name[i] = scan.next();

					if (name[i].equals("99")) {
						System.out.println("����ȭ������ �̵��մϴ�");
						name[i] = "";
						break;
					}

					for (int j = 0; j < sub[i].length - 1; j++) {
						System.out.println(name[i] + "�� " + (list[j + 1]) + " ������ �Է����ּ���");
						sub[i][j] = scan.nextInt();

						sub[i][sub[i].length - 1] += sub[i][j];

					} // for j

					avg[i] = sub[i][sub[i].length - 1] / 3;
					stu_num++; // �ڡڡڡڡ� �Էµ� �л���

				} // for i

				break;

			case 2:

				System.out.println("��������� �����ϼ̽��ϴ�");

				for (int i = 0; i < list.length; i++) {
					System.out.print(list[i] + "\t");
				}

				System.out.println();

				for (int i = 0; i < name.length; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < sub[i].length; j++) {
						System.out.print(sub[i][j] + "\t");

					} // for j

					System.out.print(avg[i] + "\t");
					System.out.print(rank[i] + "\t");
					System.out.println();
				}

				System.out.println("�ٽ� ����Ͻðڽ��ϱ�? (y/n)");
				yn = scan.next();
				if (yn.equals("N") || (yn.equals("n"))) { // �ڡڡ�
					System.out.println("����ȭ������ �̵��մϴ�");
					break;
				}

				break;

			case 3:

				System.out.println("���ó���� �����ϼ̽��ϴ�.");

				for (int i = 0; i < sub.length; i++) {
					count = 1; // �ڡڡ�
					for (int j = 0; j < sub.length; j++) {
						if (sub[i][sub[i].length - 1] < sub[j][sub[i].length - 1]) {
							count++;
						}

					} // for j

					rank[i] = count;

				} // for i

				System.out.print("�̸�" + "\t" + "���" + "\n");
				for (int i = 0; i < sub.length; i++) {
					System.out.print(name[i] + "\t");
					System.out.print(rank[i] + "\t");
					System.out.println();
				}

				break;

			case 4:

				System.out.println("�л������˻��� �����ϼ̽��ϴ�.");
				System.out.println("���ϴ� �л��� �̸��� �Է��ϼ���. >>");
				stu_name = scan.next();
				// �л��̸����� �л���ü�� �˻�
				for (int i = 0; i < name.length; i++) {
					if (stu_name.equals(name[i])) {
						s_num = i;
						break;
					}

					s_num = -1; // ������ -1�� ����

				} // for i

				if (!(s_num == -1)) {

					for (int i = 0; i < list.length; i++) {
						System.out.print(list[i] + "\t");
					}

					System.out.println();

					System.out.print(name[s_num] + "\t");

					for (int j = 0; j < sub[s_num].length; j++) {
						System.out.print(sub[s_num][j] + "\t");

					} // for j

					System.out.print(avg[s_num] + "\t");
					System.out.print(rank[s_num] + "\t");
					System.out.println();

					break;

				}

				System.out.println("���ϴ� �л��� �����ϴ�");
				break;

			case 0:
				System.out.println("�ý����� �����մϴ� ^^");
				break;

			}// switch

		} // while

	}// main

}// class
