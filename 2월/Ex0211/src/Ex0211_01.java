import java.util.Scanner;

public class Ex0211_01 {

	public static void main(String[] args) {
		// �ζ� ���α׷�

		Scanner scan = new Scanner(System.in);
		int[] num = new int[6];
		int[] com = new int[45];
		int put = 0;
		int tmp = 0;
		int com_index = 0;
		int[] win = new int[6];
		int right = 0;

		while (true) {

			System.out.println("�ζ� ��ȣ ���α׷��Դϴ�");
			System.out.println("���� 6���� �Է����ּ���");

			for (int i = 0; i < 6; i++) {
				num[i] = scan.nextInt();
			}

			for (int i = 0; i < com.length; i++) {
				com[i] = i + 1;
			}

			for (int i = 1; i < 200; i++) {
				com_index = (int) (Math.random() * 45); // ��
				tmp = com[0];
				com[0] = com[com_index];
				com[com_index] = tmp;

			}

			System.out.println("��÷�����??");

			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < 6; j++) {
					if (!(num[i] == com[j])) {
						System.out.println("�ϳ��� ��÷���� �ʾҽ��ϴ� �Ф�");
					}

					else {
						right++;
						System.out.println("��÷�Ǿ����ϴ�");
						win[i] = num[i];
						System.out.println("��÷��ȣ�� : " + win[i]);
					}

				}

			}

			switch (right) {
			case 1:
				System.out.println("��÷���� ���Ͽ����ϴ�");
				break;
			}

		} // while

	}// main

}// class
