import java.util.Scanner;

public class Ex0207_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� 1 ���� 2 �� 3

		String id = "aaa";
		String pass = "1234";
		int user = 0; // �ڽ��� ������ ����������
		int com = 0; // ��ǻ�Ͱ� ������ ����������
		int count1 = 0; // ����Ƚ��
		int win = 0;
		int lose = 0;
		int draw = 0;
		int c = 0;
		int i = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("�ݺ� Ƚ���� �Է��ϼ��� ");
		int count = scan.nextInt();

		loop1:
		while (true) {

			System.out.println("�����ϱ� ���� login ���ּ���");
			System.out.println("���� id�� �Է����ּ���. >>");


				String id_ch = scan.next();
				if (!(id.equals(id_ch))) {
					System.out.println("id�� ��ġ���� �ʽ��ϴ�");
					continue;
				}

				System.out.println("password�� �Է����ּ���. >>");
				String pass_ch = scan.next();
				if (!(pass.equals(pass_ch))) {
					System.out.println("pass�� ��ġ���� �ʽ��ϴ�");
					continue;
				}
			

			for (i = 1; i <= count; i++) {

				System.out.println("���� 1, ���� 2, �� 3 �߿� �ϳ��� �����ϼ���");
				user = scan.nextInt();

				if (user < 1 || user > 3) {
					System.out.println("��� ���ڸ� �߸� �־����ϴ�(1-3������)");
					i--; // �ڡڡڡڡ�
					continue;
				}

				com = (int) (Math.random() * 3) + 1;
				System.out.println(i + "��° �� ���ڴ�?");
				// 1-3 = -2(����) 1-1 =0 (���º�) 1-2 -1(�й�)
				// 2-1 = 1(����) 2-2 =0 (���º�) 2-3 -1(�й�)
				// 3-2 = 1(����) 3-3 =0 (���º�) 3-1 2(�й�)

				switch (user - com) {
				case -2:
				case 1:
					System.out.println("����ڰ� �¸�");
					win++;
					break loop1;
				case 0:
					System.out.println("�� �� ��");
					draw++;
					break loop1;
				case -1:
				case 2:
					System.out.println("��ǻ�Ͱ� �¸�");
					lose++;
					break loop1;

				}// switch

			} // for

		} // while

		System.out.println("���� Ƚ�� : " + count);
		System.out.println("�¸� Ƚ�� : " + win);
		System.out.println("���º� Ƚ�� : " + draw);
		System.out.println("�й� Ƚ�� : " + lose);
		System.out.printf("��       �� : %.1f %n", (double) win / count * 100); //--> 100.0�ϸ� 0�� ���� , win�̳� count�� float�̳� double�� �ٲ��ֱ�.

	} // main
} // class
