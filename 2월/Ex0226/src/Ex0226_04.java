import java.util.Scanner;

public class Ex0226_04 {

	public static void main(String[] args) {

		// 카드게임 프로그램 ^^

		Deck d = new Deck(); // 52장의 카드 완성
		Scanner scan = new Scanner(System.in);
		Card[] c1 = new Card[7]; // 사용자1
		Card[] c2 = new Card[7]; // 사용자2
		int card_count = 0; // 총 배분한 카드수
		int user_count = 0; // 사용자가 가지고 있는 카드 수
		d.shuffle();

		while (true) {

			System.out.println("1. 게임시작    2. 카드추가    3. 클로버개수  4. 종료");
			System.out.println("원하는 번호를 입력하세요");
			int num = scan.nextInt();

			switch (num) {

			case 0:
				System.out.println("종료합니다");
				break;

			case 1:

				System.out.println("사용자1");
				for (int i = 0; i < 3; i++) {
					c1[i] = d.pick(i);
					System.out.println(c1[i]);
					card_count++;

				}

				System.out.println("----------------------------");

				System.out.println("사용자2");
				for (int i = 0; i < 3; i++) {
					c2[i] = d.pick(card_count++);
					System.out.println(c2[i]);
					card_count++;
					user_count++;
				}

//				System.out.println(d.pick(3)); // c[3]=d.pick(3)

				break;

			case 2:

				if (card_count >= 14) {
					System.out.println("모두 배포되었습니다.");
					break;
				}

				for (int i = 0; i < 1; i++) {
					c1[user_count] = d.pick(card_count);
					card_count++;
					c2[user_count] = d.pick(card_count);
					card_count++;
				}

				user_count++;

				for (int i = 0; i < user_count; i++) {
					System.out.println(c1[i]);
					System.out.println(c2[i]);
					System.out.println("----------");
				}

				break;

			}// switch

		} // while
	}// main

}// class
