import java.util.Scanner;

public class Ex0214_03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �������α׷�
		// 1. �����Է�
		// 2. ����Ǯ��
		// 0. ����ȭ��
// ���ϴ� ��ȣ�� �Է��ϼ���.>>

		// ������ �Է��ؼ� ����,�ѱ� 5���� �Է¹޾Ƽ� ������ Ǯ�����

		Scanner scan = new Scanner(System.in);
		int a = 0;
		String b = "";
		String c = "";
		String d = "";
		int count = 0;

		String[][] quiz = new String[5][2];

		while (true) {

			System.out.println("---------");
			System.out.println("�������α׷�");
			System.out.println("---------");
			System.out.println("1. �����Է�, 2. ����Ǯ��, 0. ���α׷�����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���");
			a = scan.nextInt();

			switch (a) {

			case 1:

				for (int i = 0; i < quiz.length; i++) { // quiz.length -> 5
					System.out.println("����ܾ �Է����ּ���");
					quiz[i][0] = scan.next();
					System.out.println("�ѱ� ���� �Է����ּ���");
					quiz[i][1] = scan.next();
				}

				break;

			case 2:
				for (int i = 0; i < quiz.length; i++) {

					System.out.println(quiz[i][0] + "�� ���� �Է����ּ��� ^^");
					d = scan.next();

					if (d.equals(quiz[i][1])) {
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
