import java.util.Scanner;

public class Ex0210_05 {

	public static void main(String[] args) {

		// ī�� 1~10ī��
		// �ڽ��� �迭 1~10���� ����ī�带 �����.
		// ��ǻ���� �迭 1~10���� ����ī�带 �����.
		// �������� �迭�� ������ ���´�.
		// �ڽ��� ���ϴ� �迭�� ���� ī�带 �����ؼ� �ڽ��� ������ �¸�, ������ ���º�, ������ �й�
		// �·��� ���غ�����.

		// user_card ���� ���������� ����Ʈ
		// �ߺ����� ���� �ߺ��Դϴ� �޽���

		// ī�� 10��

		int[] user_card = new int[10]; // ����ī�� 10��
		int user_select_card = 0; // ������ ������ ī���ȣ
		int[] com_card = new int[10]; // ��ǻ�� ī�� 10��
		int com_index = 0; // ��ī�� �迭 ���� ����
		int temp = 0; // �迭 ������ ���� ����
		int win = 0; // �¸� Ƚ��
		int lost = 0; // ���º� Ƚ��
		int draw = 0; // �й� Ƚ��

		int[] list = new int[10];

		for (int i = 0; i < 10; i++) {
			user_card[i] = i + 1; // 1~10������ �����Է�
			com_card[i] = i + 1; // 1~10������ �����Է�
		}

		// ��ǻ�� ī�带 ���� �ڡڡڡ�
		for (int i = 0; i < 200; i++) {
			com_index = (int) (Math.random() * 10); // com_card �迭 ��ȣ

			temp = com_card[0];
			com_card[0] = com_card[com_index];
			com_card[com_index] = temp;

		}

		Scanner scan = new Scanner(System.in);

		// user_card ��ȣ�Է¹޾Ƽ�, com_card ��
		for (int i = 0; i < 10; i++) {
			System.out.println("1)1 2)2 3)3 4)4 5)5 6)6 7)7 8)8 9)9 10)10");
			System.out.println("ī�带 1~10�� �� ī�� 1���� �̾��ּ��� ");

			user_select_card = scan.nextInt();

//			for (int p = 0; p < 10; p++) 
//				list[p] = user_card[user_select_card - 1];

			// user_card[8]
			if (user_card[user_select_card - 1] - com_card[i] > 0) { // �ڡ�

				System.out.println(i + 1 + "��° : �¸�");
				System.out.println("user_card : " + user_card[user_select_card - 1] + " |  com_card : " + com_card[i]);
				user_card[user_select_card - 1] = 0; // �ڡڡڡ�
				win++;

			} else if (user_card[user_select_card - 1] == com_card[i]) {
				System.out.println(i + 1 + "��° : ���º�");
				System.out.println("user_card : " + user_card[user_select_card - 1] + " |  com_card : " + com_card[i]);
				user_card[user_select_card - 1] = 0;
				draw++;

			} else {
				System.out.println(i + 1 + "��° : �й�");
				System.out.println("user_card : " + user_card[user_select_card - 1] + " |  com_card : " + com_card[i]);
				user_card[user_select_card - 1] = 0;
				lost++;

			}

		} // for��

		for (int i = 0; i < 10; i++) {
			System.out.println(list[i]);
		}
		System.out.printf("�·� : %.1f", (float) win / 10 * 100);

	}// main

} // class
