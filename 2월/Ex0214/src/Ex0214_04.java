import java.util.Scanner;

public class Ex0214_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int a = 0;
		String b = "";
		int num = 0; // ������ȣ
		int count = 0; // Ƚ��
		int ex = 0; // ����Ǯ�� ����

		String[][] quiz = new String[10][2];

		while (true) {

			System.out.println("---------");
			System.out.println("�������α׷�");
			System.out.println("---------");
			System.out.println("1. �����Է�, 2. ����Ǯ��, 0. ���α׷�����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���");
			a = scan.nextInt();

			s_loop: switch (a) {

			case 1:
				System.out.println("�����Է��� �����ϼ̽��ϴ�.");

				// 10�� �ݺ�
				for (int i = 0; i < quiz.length; i++) {
					System.out.println("-------------------.");
					System.out.println("����ܾ �Է����ּ���. >> (����ȭ�� : 99)");
					quiz[i][0] = scan.next();

					if (quiz[i][0].contentEquals("99")) {
						System.out.println("����ȭ������ �̵��մϴ�.");
						break s_loop;
					}

					System.out.println("�ѱ� ���� �Է����ּ���. >> (����ȭ�� : 99)");
					quiz[i][1] = scan.next();

					if (quiz[i][1].contentEquals("99")) {
						System.out.println("����ȭ������ �̵��մϴ�.");
						break s_loop;
					}

					num++;
				} // for i ��

				if (num == 10) {
					System.out.println("10���� ��� �ԷµǾ����ϴ�. ���̻� �Է��� �� �����ϴ�");
					break;
				}

				break;

			case 2:

				System.out.println("����Ǯ�̸� �����ϼ̽��ϴ�.");

				for (int i = ex; i < num; i++) {

					System.out.println(quiz[i][0] + "�� ���� �Է����ּ��� ^^ 99�� ������ ����ȭ��");
					b = scan.next();

					if (b.contentEquals("99")) {
						System.out.println("����ȭ������ �̵��մϴ�.");
						break;
					}

					if (b.equals(quiz[i][1])) {
						System.out.println("�����Դϴ� �����ؿ�");
					} else {

						if (count < 2) {
							System.out.println("�����Դϴ� �Ф� ");
							count++;
							i--; // �ڡڡڡڡ�
							continue;
						}

						System.out.println("3�� �Է¿� �����߳׿� ������ �ٷ� " + quiz[i][1] + "�Դϴ� ^^"); // �ڡڡڡڡ� else�� ���� �ȿ�
						count = 0; // �ڡ� �ڡڡ�else�� ���� �ȿ� !
						ex++;// ����Ǯ�� 1�� �߰�! 2��° ������ ����

					} // else

				} // for i

				break;

			case 0:
				System.out.println("���α׷��� �����մϴ�.�ȳ�~");
				break;

			} // switch

		} // while

	}// main

}// class
