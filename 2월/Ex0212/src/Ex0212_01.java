import java.util.Scanner;

public class Ex0212_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] lotto = new int[45]; // ★index 0~44 ★
		int[] a = new int[6];
		int tmp = 0;
		int success = 0;
		int[] win = new int[6];
		int count = 0;

		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호를 입력합니다");
			a[i] = scan.nextInt();
		}

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		for (int i = 0; i < 200; i++) {
			int ran = (int) (Math.random() * 45); // ★
			tmp = lotto[0];
			lotto[0] = lotto[ran]; // ★
			lotto[ran] = tmp; // ★

		}

		System.out.print("로또번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " / ");

		}
	
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (a[i] == lotto[j]) {
					success++;
					win[i] = lotto[i];
				}
			}
		}

		System.out.println();

		switch (success) {

		case 0:
		case 1:
			System.out.println("상금 없습니다");
			break;

		case 2:
			System.out.println("5천원 당첨");
			break;

		case 3:
			System.out.println("10만원 당첨");
			break;

		case 4:
			System.out.println("100만원 당첨");
			break;

		case 5:
			System.out.println("1억원 당첨");
			break;

		case 6:
			System.out.println("10억원 당첨");
			break;

		}// switch

		System.out.printf("내가 입력한 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(a[i] + " / ");
		}

		System.out.println();
		
		System.out.print("당첨 번호 : ");
		for (int i = 0; i < 6; i++) {
			if (!(success == 0)) {
				System.out.print(win[i] + " / ");
			}
		}

	}// main

}// class
