import java.util.Scanner;

public class Ex0218_06 {

	public static void main(String[] args) {

		// �ζǹ�ȣ �迭 ����
		// �ζǹ�ȣ 1~45������ �Է�
		// �ζǹ�ȣ �������� ����
		// �Է��ϴ� ��ȣ ��ü 10�� ����
		// �Է� 10�� ����
		// ��ġ ���� üũ, ��� üũ, �ݾ� üũ

		Scanner scan = new Scanner(System.in);

		int same = 0;

		int[] lotto = new int[45]; // index 0~44, �ζǹ�ȣ

		Mylotto[] me = new Mylotto[10];// 10�� �Է°���

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		// ���� ����

		shuffle(lotto);

		for (int i = 0; i < me.length; i++) {
			me[i] = new Mylotto();
			for (int j = 0; j < 6; j++) {
				System.out.println((i + 1) + "��° " + (j + 1) + "�� �ζǹ�ȣ�� �Է��ϼ���");
				me[i].num[j] = scan.nextInt(); // �ڡڡڡڡ�

				// �ζǹ�ȣ�� �Է¹�ȣ ��ġ��
				if (lotto[i] == me[i].num[j]) {
					same++;
				}
			}
			me[i].same = same; // ����

			switch (same) {

			case 0:
				me[i].rank = 7;
				me[i].reward = 0;
				break;

			case 1:
				me[i].rank = 6;
				me[i].reward = 0;
				break;

			case 2:
				me[i].rank = 5;
				me[i].reward = 0;
				break;

			case 3:
				me[i].rank = 4;
				me[i].reward = 10000;
				break;

			case 4:
				me[i].rank = 3;
				me[i].reward = 1000000;
				break;

			case 5:
				me[i].rank = 2;
				me[i].reward = 100000000;
				break;

			case 6:
				me[i].rank = 1;
				me[i].reward = 1000000000;
				break;

			}// switch

		}

		// ���
		System.out.print("�ζǹ�ȣ : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(+lotto[i] + "\t");
		}

//		System.out.println("���ʽ� ��ȣ : " + lotto[6]);

		System.out.println("�Է¹�ȣ 10�� ");
		for (int i = 0; i < me.length; i++) {
			for (int j = 0; i < me[i].num.length; j++) { // �ڡڡ�
				System.out.print("�Է¹�ȣ : " + me[i].num[j] + "\t");
			}

			System.out.print("\t" + me[i].same);
			System.out.print("\t" + me[i].rank);
			System.out.print("\t" + me[i].reward);
			System.out.println();

		}

	}// main

	// ���� �޼���

	static void shuffle(int[] lotto) { // �ڡڡ�
		int temp = 0;
		for (int i = 0; i < 200; i++) {
			int ran = (int) (Math.random() * 45);
			temp = lotto[ran];
			lotto[ran] = lotto[0];
			lotto[0] = temp;
		}

	}

}// class
