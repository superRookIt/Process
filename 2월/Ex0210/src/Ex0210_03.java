import java.util.Scanner;

public class Ex0210_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		int[] ball = new int[45]; // 45���� �迭����

		for (int i = 0; i < ball.length; i++) { // 1~45������ ���ڰ� ��
			ball[i] = i + 1;
		}

		// ball 2���� 3�� ��

		int temp = 0; // �� ���� �ٲٴµ� ����� �ӽú���
		int ball_index = 0; // ������ ���� �� ������ ����
		int[] num = new int[2]; // �ڡڡ�
		int success = 0; // �Ȱ��� ���ڰ� �ִ��� Ȯ���ϴ� ����
		int[] win_num = new int[2]; // �ζ� ��÷�� ��ȣ

		

		while (true) {
			for (int i = 0; i < 2; i++) { // 2���� �ζǹ�ȣ �Է� ����
				System.out.println("1~45������ ���ڸ� �Է��ϼ���. >>");
				num[i] = scan.nextInt();
				if (!(num[i] >= 1 || num[i] <= 45)) {
					System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�.");
					i--;
					continue;
				}
			}

			break;
		}

		// �ڷζǹ�ȣ �ڸ� ��ȯ��
		for (int i = 0; i < 200; i++) {
			ball_index = (int) (Math.random() * 45); // 0~44������ �迭 index ����
			temp = ball[0];
			ball[0] = ball[ball_index];
			ball[ball_index] = temp;

//30

//temp = 1
//ball[0] = 31(ball[30])
//ball[31] = 1
//
//-> 
//
//40
//
//temp = 31
//ball[0] = 41(ball[40])
//ball[41] = 31

		}

		// �Է¹�ȣ�� �ζǹ�ȣ Ȯ��
		for (int i = 0; i < num.length; i++) { // num[i] 0,1 ���� ���������� ����
			for (int j = 0; i < 6; j++) {
				if (num[i] == ball[j]) {
					success++;
					win_num[i] = num[i];
				}
			}

		}

		System.out.println();

		// ��÷�Ǿ����� Ȯ��
		if (success == 0) {
			System.out.println("��÷���� �ʾҽ��ϴ�");
		} else {
			for (int i = 0; i < win_num.length; i++) {
				System.out.println("��÷�Ǿ����ϴ�.");
				if (!(win_num[i] == 0)) {
					System.out.println("��÷��ȣ : " + win_num[i]);
				} // if
			} // for
		}

		// �ζǹ�ȣ ���
		System.out.println("�ζǹ�ȣ��?");
		for (int i = 0; i < 6; i++) {
			System.out.println(ball[i] + "");
		}

	}// main

}// class
