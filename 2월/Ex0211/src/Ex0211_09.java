import java.util.Scanner;

public class Ex0211_09 {

	public static void main(String[] args) {

		// [3][3]
		// 국어, 영어, 수학
		// 100 78 99
		// 87 85 100
		// 75 100 89

//		int[][] test = new int[3][3];

		int[][] test1 = { { 100, 78, 99 }, { 87, 85, 100 }, { 75, 100, 89 } };

		Scanner scan = new Scanner(System.in);

		//입력
		int[][] test2 = new int[3][3];
		for (int i = 0; i < test2.length; i++) {
			for (int j = 0; j < test2[i].length; j++) {
				System.out.println((3*i)+j+1+"번째 점수를 입력하세요");
				test2[i][j] = scan.nextInt();
			}
		}

		//츨력
		System.out.println();
		System.out.println("[점수표]");
		for (int i = 0; i < test2.length; i++) {
			for (int j = 0; j < test2[i].length; j++) {
				System.out.print(test2[i][j] + " "); //print임 printnl 아님
			}
			System.out.println();//엔터(보기 쉽게 줄바꿈)
		}

	}// class

}// main
