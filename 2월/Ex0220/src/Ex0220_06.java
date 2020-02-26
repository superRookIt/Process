import java.util.Scanner;

public class Ex0220_06 {

	public static void main(String[] args) {

		// �ζ� 1~45���� ���� 6���� ����
		// �ζ�2�迭�� �־����

		Scanner scan = new Scanner(System.in);

		int[] lotto = new int[45]; // index 0~44
		int[] lotto2 = new int[6];
		int tmp = 0;
		int num = 0;
		int sum = 0;

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		while (true) {

			System.out.println("---------------------");
			System.out.println("1. �迭����ϱ�");
			System.out.println("2. �迭����");
			System.out.println("3. �迭 �� ���ϱ�");
			System.out.println("4. �迭 ����");
			System.out.println("���ڸ� �Է��ϼ���");
			num = scan.nextInt();

			switch (num) {

			case 1:
				System.out.println("6���� �迭�� ����մϴ�. ");
				printArr(lotto2);
				break;

			case 2:
				System.out.println("�迭�� �����ϴ�");
				mix(lotto, lotto2);
				break;

			case 3:
				System.out.println("�迭 ���� ���մϴ�");
				sum = sum(lotto2);
				System.out.println("�� : " + sum);
				break;

			case 4:
				System.out.println("�迭 ����");
				sort(lotto2);
				for (int i = 0; i < lotto2.length; i++) {
					System.out.print(lotto2[i] + "\t");
				}

				System.out.println();
				break;

			}// switch

		} // while

	}// main

	static void printArr(int[] lotto2) {

		for (int i = 0; i < lotto2.length; i++) {
			System.out.print(lotto2[i] + "\t");
		}
		System.out.println();
	}

	static void mix(int[] lotto, int[] lotto2) {
		int tmp = 0;
		for (int i = 0; i < 100; i++) {
			int ran = (int) (Math.random() * 45);
			tmp = lotto[0];
			lotto[0] = lotto[ran];
			lotto[ran] = tmp;
		}

		for (int i = 0; i < lotto2.length; i++) {
			lotto2[i] = lotto[i];
		}

		System.out.println("���� �Ϸ�");
	}

	static int sum(int[] lotto2) {
		int sum = 0;

		for (int i = 0; i < lotto2.length; i++) {
			sum += lotto2[i];
		}

		return sum;
	}

	static void sort(int[] lotto2) { // 10 45 2 19 2 8 ,
		int tmp = 0;
		for (int i = 0; i < lotto2.length - 1; i++) {
			boolean change = false;
			for (int j = 0; j < lotto2.length - 1 - i; j++) { // �ڡڡڡڡ�

				if (lotto2[j] > lotto2[j + 1]) {
					tmp = lotto2[j + 1];
					lotto2[j + 1] = lotto2[j];
					lotto2[j] = tmp;
					change = true;
				} // if

				if (change == false) {
					break;
				}

			} // for j

		} // for i

	}
	

//	static void sort(int[] lotto2) { // 10 45 2 19 2 8  
//		int tmp = 0;
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (lotto2[i] < lotto2[j]) {
//					tmp = lotto2[j];
//					lotto2[j] = lotto2[i];
//					lotto2[i] = tmp;
//				} // if
//			} // for j
//		} // for i	
	

}// class
