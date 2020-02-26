import java.util.Scanner;

public class Ex0213_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~100까지 숫자 1개를 랜덤으로 뽑습니다.
		// 무한으로 돌려서, 숫자를 맞추는 게임
		// 입력한 숫자가 랜덤수보다
		// 작으면 작습니다
		// 맞으면 빙고
		// 정답은 예)5번입니다

		// 옵션>
		// 자신이 입력한 숫자를 출력
		// 최대 20번

		Scanner scan = new Scanner(System.in);

		int[] ran = new int[100];
		int[] my = new int[1];


		while (true) {

			for (int i = 0; i < ran.length; i++) {
				int rann = (int) (Math.random() * 100)+1;
				ran[i] = rann;
			}
			
			System.out.println("숫자를 입력해주세요");
			System.out.println("^___________^");
			for (int i = 0; i < 1; i++) {
				my[i] = scan.nextInt();
			}

			for (int i = 0; i < 1; i++) {
				if (my[i] > ran[i]) {
					System.out.println("큽니다 빙고 ^^ " + my[i] + " > " + ran[i]);
				} else if (my[i] < ran[i]) {
					System.out.println("작습니다 " + my[i] + " < " + ran[i]);
				} else {
					System.out.println("같습니다 " + my[i] + " = " + ran[i]);
				}

			}

		} // while

	}// main

}// class
