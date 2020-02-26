import java.util.Scanner;

public class Ex0211_01 {

	public static void main(String[] args) {
		// 로또 프로그램

		Scanner scan = new Scanner(System.in);
		int[] num = new int[6];
		int[] com = new int[45];
		int put = 0;
		int tmp = 0;
		int com_index = 0;
		int[] win = new int[6];
		int right = 0;

		while (true) {

			System.out.println("로또 번호 프로그램입니다");
			System.out.println("숫자 6개를 입력해주세요");

			for (int i = 0; i < 6; i++) {
				num[i] = scan.nextInt();
			}

			for (int i = 0; i < com.length; i++) {
				com[i] = i + 1;
			}

			for (int i = 1; i < 200; i++) {
				com_index = (int) (Math.random() * 45); // ★
				tmp = com[0];
				com[0] = com[com_index];
				com[com_index] = tmp;

			}

			System.out.println("당첨결과는??");

			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < 6; j++) {
					if (!(num[i] == com[j])) {
						System.out.println("하나도 당첨되지 않았습니다 ㅠㅠ");
					}

					else {
						right++;
						System.out.println("당첨되었습니다");
						win[i] = num[i];
						System.out.println("당첨번호는 : " + win[i]);
					}

				}

			}

			switch (right) {
			case 1:
				System.out.println("당첨되지 못하였습니다");
				break;
			}

		} // while

	}// main

}// class
