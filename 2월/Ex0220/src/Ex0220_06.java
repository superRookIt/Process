import java.util.Scanner;

public class Ex0220_06 {

	public static void main(String[] args) {

		// 로또 1~45까지 값중 6개의 값을
		// 로또2배열에 넣어보세요

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
			System.out.println("1. 배열출력하기");
			System.out.println("2. 배열섞기");
			System.out.println("3. 배열 합 구하기");
			System.out.println("4. 배열 정렬");
			System.out.println("숫자를 입력하세요");
			num = scan.nextInt();

			switch (num) {

			case 1:
				System.out.println("6개의 배열을 출력합니다. ");
				printArr(lotto2);
				break;

			case 2:
				System.out.println("배열을 섞습니다");
				mix(lotto, lotto2);
				break;

			case 3:
				System.out.println("배열 합을 구합니다");
				sum = sum(lotto2);
				System.out.println("합 : " + sum);
				break;

			case 4:
				System.out.println("배열 정렬");
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

		System.out.println("섞기 완료");
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
			for (int j = 0; j < lotto2.length - 1 - i; j++) { // ★★★★★

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
