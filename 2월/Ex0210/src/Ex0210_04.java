import java.util.Scanner;

public class Ex0210_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp = 0;
		int ball_index = 0;
		int[] num = new int[6]; // 로또 입력번호
		int[] win_num = new int[6]; // 로또 당첨된 번호
		int success = 0; // 똑같은 숫자가 있는 확인하는 변수

		Scanner scan = new Scanner(System.in);

		while (true) { // 무한반복
			for (int i = 0; i < num.length; i++) { // 2개의 로또번호 입력 받음
				System.out.println("1~45까지 로또번호를 입력하세요.>>");
				num[i] = scan.nextInt(); // num[0]: 첫번째 입력값, num[1] : 두번째 입력갑 ....
				if (!(num[i] >= 1 || num[i] <= 45)) {
					System.out.println("번호가 잘못 입력되었습니다. 다시입력");
					i--;
					continue;
				} // if
			} // for


			int[] ball = new int[45]; // 45개의 배열생성

			for (int i = 0; i < 45; i++) { // 1~45까지의 숫자가 들어감
				ball[i] = i + 1;

			} // for

		// 로또번호 자리 교환
		for (int i = 0; i < 200; i++) {
			ball_index = (int) (Math.random() * 45); // 0~44까지의 배열 index번호 생성

			temp = ball[0];
			ball[0] = ball[ball_index];
			ball[ball_index] = temp;

		} // for

			// 입력번호와 로또번호 확인
			for (int i = 0; i < num.length; i++) { // num[i] 0,1을 순차적으로 진행
				for (int j = 0; j < 6; j++) {
					if (num[i] == ball[j]) {
						success++; //
						win_num[i] = num[i];
					} // if
				} // for
			}

			// 로또번호 출력
			System.out.println(" 로또번호는 ?");
			for (int i = 0; i < 6; i++) {
				System.out.print(ball[i] + " ");
			}
			System.out.println();

			// 당첨되었는지 확인
			if (success == 0) {
				System.out.println("당첨되지 않았습니다.");
			} else {
				System.out.println("당첨되었습니다.");
				// 횟수에 따라 당첨 표시
			}

			switch (success) {

			case 1:
				System.out.println("1개 당첨되었습니다.");
				System.out.println("상금은 없습니다");
				break;

			case 2:
				System.out.println("2개 당첨되었습니다.");
				System.out.println("상금은 없습니다");
				break;

			case 3:
				System.out.println("3개 당첨되었습니다.");
				System.out.println("상금은 5,000원입니다");
				break;

			case 4:
				System.out.println("4개 당첨되었습니다.");
				System.out.println("상금은 50,000원입니다");
				break;

			case 5:
				System.out.println("5개 당첨되었습니다.");
				System.out.println("상금은 1,500,000원입니다");
				break;

			case 6:
				System.out.println("6개 당첨되었습니다.");
				System.out.println("상금은 1,600,000,000원입니다");
				break;
			}// switch

			for (int i = 0; i < win_num.length; i++) {
				if (!(win_num[i] == 0)) {
					System.out.println("당첨번호 :" + win_num[i]);

				} // if

			} // for

		
		System.out.println(success + "번 당첨");
		
		} // while문
	}

}
