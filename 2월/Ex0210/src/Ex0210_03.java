import java.util.Scanner;

public class Ex0210_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		int[] ball = new int[45]; // 45개의 배열생성

		for (int i = 0; i < ball.length; i++) { // 1~45까지의 숫자가 들어감
			ball[i] = i + 1;
		}

		// ball 2에는 3이 들어감

		int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int ball_index = 0; // 임의의 값을 얻어서 저장할 변수
		int[] num = new int[2]; // ★★★
		int success = 0; // 똑같은 숫자가 있는지 확인하는 변수
		int[] win_num = new int[2]; // 로또 당첨된 번호

		

		while (true) {
			for (int i = 0; i < 2; i++) { // 2개의 로또번호 입력 받음
				System.out.println("1~45까지의 숫자를 입력하세요. >>");
				num[i] = scan.nextInt();
				if (!(num[i] >= 1 || num[i] <= 45)) {
					System.out.println("번호가 잘못 입력되었습니다.");
					i--;
					continue;
				}
			}

			break;
		}

		// ★로또번호 자리 교환★
		for (int i = 0; i < 200; i++) {
			ball_index = (int) (Math.random() * 45); // 0~44까지의 배열 index 생성
			temp = ball[0];
			ball[0] = ball[ball_index];
			ball[ball_index] = temp;

//30

//temp = 1
//ball[0] = 31(ball[30])
//ball[31] = 1
//
//-> 
//
//40
//
//temp = 31
//ball[0] = 41(ball[40])
//ball[41] = 31

		}

		// 입력번호와 로또번호 확인
		for (int i = 0; i < num.length; i++) { // num[i] 0,1 것을 순차적으로 진행
			for (int j = 0; i < 6; j++) {
				if (num[i] == ball[j]) {
					success++;
					win_num[i] = num[i];
				}
			}

		}

		System.out.println();

		// 당첨되었는지 확인
		if (success == 0) {
			System.out.println("당첨되지 않았습니다");
		} else {
			for (int i = 0; i < win_num.length; i++) {
				System.out.println("당첨되었습니다.");
				if (!(win_num[i] == 0)) {
					System.out.println("당첨번호 : " + win_num[i]);
				} // if
			} // for
		}

		// 로또번호 출력
		System.out.println("로또번호는?");
		for (int i = 0; i < 6; i++) {
			System.out.println(ball[i] + "");
		}

	}// main

}// class
