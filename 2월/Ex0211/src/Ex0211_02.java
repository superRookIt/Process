
public class Ex0211_02 {

	public static void main(String[] args) {

		// 1. ��������
		// boolean, char, byte, short, int long float double
		// char '1' - '0' = ���ڷ� ġȯ // 7 + " " = "7" -> ���ڷ� // Integer.parseInt("7")->���ڷ�
		// �迭Ȱ��
		// ���ǹ� - if // switch-����: ����(�Ǽ�x), ���� //
		// �ݺ��� - for:������, while:���ѹݺ�

		int temp = 0;
		int random_int = 0;

		// �迭Ȱ��
		int[] ball = new int[45]; // [] 0~44 index

		// �ݺ���
		for (int i = 0; i < 45; i++) {
			ball[i] = i + 1;
		}

		// ball ����
		for (int i = 0; i < 200; i++) {

			random_int = (int) (Math.random() * 45); // 0~44

			temp = ball[0];
			ball[0] = ball[random_int];
			ball[random_int] = temp;

		}

		// �ζǹ�ȣ 6��
		System.out.print("�ζǹ�ȣ 6�� : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");// �ڡڡ�
		}

	}// main

}// class
