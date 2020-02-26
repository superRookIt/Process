import java.util.Scanner;

public class Ex0210_05 {

	public static void main(String[] args) {

		// 카드 1~10카드
		// 자신의 배열 1~10까지 숫자카드를 만든다.
		// 컴퓨터의 배열 1~10까지 숫자카드를 만든다.
		// 랜덤으로 배열의 순서를 섞는다.
		// 자신이 원하는 배열의 숫자 카드를 제시해서 자신이 높으면 승리, 같으면 무승부, 낮으면 패배
		// 승률을 구해보세요.

		// user_card 낸거 순차적으로 프린트
		// 중복으로 내면 중복입니다 메시지

		// 카드 10장

		int[] user_card = new int[10]; // 유저카드 10장
		int user_select_card = 0; // 유저가 선택한 카드번호
		int[] com_card = new int[10]; // 컴퓨터 카드 10장
		int com_index = 0; // 컴카드 배열 순번 변수
		int temp = 0; // 배열 섞을때 쓰는 변수
		int win = 0; // 승리 횟수
		int lost = 0; // 무승부 횟수
		int draw = 0; // 패배 횟수

		int[] list = new int[10];

		for (int i = 0; i < 10; i++) {
			user_card[i] = i + 1; // 1~10까지의 숫자입력
			com_card[i] = i + 1; // 1~10까지의 숫자입력
		}

		// 컴퓨터 카드를 섞기 ★★★★
		for (int i = 0; i < 200; i++) {
			com_index = (int) (Math.random() * 10); // com_card 배열 번호

			temp = com_card[0];
			com_card[0] = com_card[com_index];
			com_card[com_index] = temp;

		}

		Scanner scan = new Scanner(System.in);

		// user_card 번호입력받아서, com_card 비교
		for (int i = 0; i < 10; i++) {
			System.out.println("1)1 2)2 3)3 4)4 5)5 6)6 7)7 8)8 9)9 10)10");
			System.out.println("카드를 1~10번 중 카드 1개를 뽑아주세요 ");

			user_select_card = scan.nextInt();

//			for (int p = 0; p < 10; p++) 
//				list[p] = user_card[user_select_card - 1];

			// user_card[8]
			if (user_card[user_select_card - 1] - com_card[i] > 0) { // ★★

				System.out.println(i + 1 + "번째 : 승리");
				System.out.println("user_card : " + user_card[user_select_card - 1] + " |  com_card : " + com_card[i]);
				user_card[user_select_card - 1] = 0; // ★★★★
				win++;

			} else if (user_card[user_select_card - 1] == com_card[i]) {
				System.out.println(i + 1 + "번째 : 무승부");
				System.out.println("user_card : " + user_card[user_select_card - 1] + " |  com_card : " + com_card[i]);
				user_card[user_select_card - 1] = 0;
				draw++;

			} else {
				System.out.println(i + 1 + "번째 : 패배");
				System.out.println("user_card : " + user_card[user_select_card - 1] + " |  com_card : " + com_card[i]);
				user_card[user_select_card - 1] = 0;
				lost++;

			}

		} // for문

		for (int i = 0; i < 10; i++) {
			System.out.println(list[i]);
		}
		System.out.printf("승률 : %.1f", (float) win / 10 * 100);

	}// main

} // class
