
public class Ex0220_08 {

	public static void main(String[] args) {

		// 1���� �迭 1~25���� �������� 5���� ���ڸ� �迭�� �ְ�
		// �� ��� �ִ밪�� ���Ͻÿ�.

		int[] num = new int[25];
		int[] num1 = new int[5];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		for (int i = 0; i < 200; i++) {
			int ran = (int) (Math.random() * 24);
			int tmp = num[0];
			num[0] = num[ran];
			num[ran] = tmp;
		}

		for (int i = 0; i < num1.length; i++) {
			num1[i] = num[i];
			System.out.printf(num1[i] + "\t");
		}

		for (int i = 0; i < num1.length - 1; i++) { //num length 5, index 0~4
			for (int j = 0; j < num1.length - 1 - i; j++) {
				if (num1[j] > num1[j + 1]) {

					int tmp = num1[j];
					num1[j] = num1[j + 1];
					num1[j + 1] = tmp;

				}
			}
		}

		System.out.println("�ִ밪 :" + num1[4]);

	}// main

}// class
