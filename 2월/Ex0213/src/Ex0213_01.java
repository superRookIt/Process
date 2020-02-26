import java.util.Scanner;

public class Ex0213_01 {

	public static void main(String[] args) {

		// 로또번호 입력

		int[] lotto = new int[45];
		int tmp = 0;
		int[] num = new int[6];
		int count = 0;
		int success = 0;
		int[] win = new int[6];

		Scanner scan = new Scanner(System.in);

		while (count < 6) {

			for (int i = 0; i < 6; i++) {
				System.out.println("------------------");
				System.out.println(" 로또번호를 입력하세요   ");
				System.out.println("------------------");
				num[i] = scan.nextInt();
			}

			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = i + 1;
			}

			for (int i = 0; i < 200; i++) {
				int ran = (int) (Math.random() * 45);
				tmp = lotto[0];
				lotto[0] = lotto[ran];
				lotto[ran] = tmp;
			}

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (num[i] == lotto[j]) {
						success++;
						win[i] = num[i];
					}
				} // for j
			}

			System.out.print("   로또번호 6개     : " + "\t");
			for (int i = 0; i < 6; i++) {
				System.out.print(lotto[i] + "\t");
			}

			System.out.println();

			System.out.print("내가 입력한 번호 6개 : " + "\t");
			for (int i = 0; i < 6; i++) {
				System.out.print(num[i] + "\t");
			}

			System.out.println();

			if (!(success == 0)) {
		    System.out.print("    당첨 번호        : " + "\t");
				for (int i = 0; i < 6; i++) {
					System.out.print(win[i] + "\t");
				}
			}

			System.out.println();

			count++;
			
		} // while

	}// main

}// class
