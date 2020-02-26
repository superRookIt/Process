import java.util.Scanner;

public class Ex0218_06 {

	public static void main(String[] args) {

		// 로또번호 배열 생성
		// 로또번호 1~45번까지 입력
		// 로또번호 랜덤으로 섞기
		// 입력하는 번호 객체 10개 생성
		// 입력 10개 받음
		// 일치 개수 체크, 등수 체크, 금액 체크

		Scanner scan = new Scanner(System.in);

		int same = 0;

		int[] lotto = new int[45]; // index 0~44, 로또번호

		Mylotto[] me = new Mylotto[10];// 10번 입력가능

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		// 랜덤 섞기

		shuffle(lotto);

		for (int i = 0; i < me.length; i++) {
			me[i] = new Mylotto();
			for (int j = 0; j < 6; j++) {
				System.out.println((i + 1) + "번째 " + (j + 1) + "번 로또번호를 입력하세요");
				me[i].num[j] = scan.nextInt(); // ★★★★★

				// 로또번호와 입력번호 일치비교
				if (lotto[i] == me[i].num[j]) {
					same++;
				}
			}
			me[i].same = same; // 개수

			switch (same) {

			case 0:
				me[i].rank = 7;
				me[i].reward = 0;
				break;

			case 1:
				me[i].rank = 6;
				me[i].reward = 0;
				break;

			case 2:
				me[i].rank = 5;
				me[i].reward = 0;
				break;

			case 3:
				me[i].rank = 4;
				me[i].reward = 10000;
				break;

			case 4:
				me[i].rank = 3;
				me[i].reward = 1000000;
				break;

			case 5:
				me[i].rank = 2;
				me[i].reward = 100000000;
				break;

			case 6:
				me[i].rank = 1;
				me[i].reward = 1000000000;
				break;

			}// switch

		}

		// 출력
		System.out.print("로또번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(+lotto[i] + "\t");
		}

//		System.out.println("보너스 번호 : " + lotto[6]);

		System.out.println("입력번호 10번 ");
		for (int i = 0; i < me.length; i++) {
			for (int j = 0; i < me[i].num.length; j++) { // ★★★
				System.out.print("입력번호 : " + me[i].num[j] + "\t");
			}

			System.out.print("\t" + me[i].same);
			System.out.print("\t" + me[i].rank);
			System.out.print("\t" + me[i].reward);
			System.out.println();

		}

	}// main

	// 섞기 메서드

	static void shuffle(int[] lotto) { // ★★★
		int temp = 0;
		for (int i = 0; i < 200; i++) {
			int ran = (int) (Math.random() * 45);
			temp = lotto[ran];
			lotto[ran] = lotto[0];
			lotto[0] = temp;
		}

	}

}// class
