import java.util.Scanner;

public class Ex0210_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp = 0;
		int ball_index = 0;
		int[] num = new int[6]; // �ζ� �Է¹�ȣ
		int[] win_num = new int[6]; // �ζ� ��÷�� ��ȣ
		int success = 0; // �Ȱ��� ���ڰ� �ִ� Ȯ���ϴ� ����

		Scanner scan = new Scanner(System.in);

		while (true) { // ���ѹݺ�
			for (int i = 0; i < num.length; i++) { // 2���� �ζǹ�ȣ �Է� ����
				System.out.println("1~45���� �ζǹ�ȣ�� �Է��ϼ���.>>");
				num[i] = scan.nextInt(); // num[0]: ù��° �Է°�, num[1] : �ι�° �Է°� ....
				if (!(num[i] >= 1 || num[i] <= 45)) {
					System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. �ٽ��Է�");
					i--;
					continue;
				} // if
			} // for


			int[] ball = new int[45]; // 45���� �迭����

			for (int i = 0; i < 45; i++) { // 1~45������ ���ڰ� ��
				ball[i] = i + 1;

			} // for

		// �ζǹ�ȣ �ڸ� ��ȯ
		for (int i = 0; i < 200; i++) {
			ball_index = (int) (Math.random() * 45); // 0~44������ �迭 index��ȣ ����

			temp = ball[0];
			ball[0] = ball[ball_index];
			ball[ball_index] = temp;

		} // for

			// �Է¹�ȣ�� �ζǹ�ȣ Ȯ��
			for (int i = 0; i < num.length; i++) { // num[i] 0,1�� ���������� ����
				for (int j = 0; j < 6; j++) {
					if (num[i] == ball[j]) {
						success++; //
						win_num[i] = num[i];
					} // if
				} // for
			}

			// �ζǹ�ȣ ���
			System.out.println(" �ζǹ�ȣ�� ?");
			for (int i = 0; i < 6; i++) {
				System.out.print(ball[i] + " ");
			}
			System.out.println();

			// ��÷�Ǿ����� Ȯ��
			if (success == 0) {
				System.out.println("��÷���� �ʾҽ��ϴ�.");
			} else {
				System.out.println("��÷�Ǿ����ϴ�.");
				// Ƚ���� ���� ��÷ ǥ��
			}

			switch (success) {

			case 1:
				System.out.println("1�� ��÷�Ǿ����ϴ�.");
				System.out.println("����� �����ϴ�");
				break;

			case 2:
				System.out.println("2�� ��÷�Ǿ����ϴ�.");
				System.out.println("����� �����ϴ�");
				break;

			case 3:
				System.out.println("3�� ��÷�Ǿ����ϴ�.");
				System.out.println("����� 5,000���Դϴ�");
				break;

			case 4:
				System.out.println("4�� ��÷�Ǿ����ϴ�.");
				System.out.println("����� 50,000���Դϴ�");
				break;

			case 5:
				System.out.println("5�� ��÷�Ǿ����ϴ�.");
				System.out.println("����� 1,500,000���Դϴ�");
				break;

			case 6:
				System.out.println("6�� ��÷�Ǿ����ϴ�.");
				System.out.println("����� 1,600,000,000���Դϴ�");
				break;
			}// switch

			for (int i = 0; i < win_num.length; i++) {
				if (!(win_num[i] == 0)) {
					System.out.println("��÷��ȣ :" + win_num[i]);

				} // if

			} // for

		
		System.out.println(success + "�� ��÷");
		
		} // while��
	}

}
