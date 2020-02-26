import java.util.Scanner;

public class Ex0218_05 {

	public static void main(String[] args) {

		// 로또당첨번호 class // 회차, 당첨번호 6개, 보너스번호1개(랜덤)
		// 내가 입력한 번호 class // 번호 6개, 일치개수, 등수, 금액

		// 입력 > 회차입력> 번호 6자리 입력
		// 회차 검색해서 -> 몇개 일치하는지? 등수 몇등인지? 금액은 얼마인지?
		// 1등 10억-6개, 2등 1억-5개+보너스1개, 3등 1000만원-5개, 4등 10만원-4개, 5등 만원-3개

		// 금액 - 1판하는데 천원, 처음에 만원

		Scanner scan = new Scanner(System.in);

		int[] lot = new int[45];
		int tmp = 0;

		Lotto[] lo = new Lotto[7];
		Mylotto[] mylo = new Mylotto[7];

		for (int i = 0; i < lo.length; i++) {
			lo[i] = new Lotto();
			mylo[i] = new Mylotto();
		}

		for (int i = 0; i < lot.length; i++) {
			lot[i] = i + 1;
		}

		for (int i = 0; i < 200; i++) {
			int ran = (int) (Math.random() * 45);
			tmp = lot[0];
			lot[0] = lot[ran];
			lot[ran] = tmp;

		}

		for (int i = 0; i < 6; i++) {
			lo[i].lotto = lot[i];

		}

		for (int i = 6; i <= 6; i++) {
			lo[i].bonus = lot[i];

		}

		for (int i = 0; i < 6; i++) {
			System.out.println("번호를 입력해주세요");
			mylo[i].num = scan.nextInt();
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; i < 6; j++)
				if (mylo[i].num == lo[j].lotto) {
					mylo[i].same = mylo[i].num;
				}
		}

	}// main

}// class
