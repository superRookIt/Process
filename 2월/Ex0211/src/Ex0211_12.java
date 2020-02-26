import java.util.Scanner;

public class Ex0211_12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int in_x = 0;
		int in_y = 0;

		int[][] score = new int[3][3];
		String[][] score_in = new String[3][3]; // 내가 입력해서 저장하는 배열

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 2); // 0,1
			}
		}

		while (true) {

			System.out.println("--------------------");
			System.out.println("[ 좌표맞추기 게임 ]");
			System.out.println("--------------------");
			System.out.print("\t0\t1\t2\n"); // \t 탭, \n 엔터키

			for (int i = 0; i < score_in.length; i++) {
				System.out.print(i + "\t");
				for (int j = 0; j < score_in[i].length; j++) {
					System.out.print(score_in[i][j] + "\t");
				}
				System.out.println();
			}

			System.out.println("x좌표를 입력하세요. >> (종료 :99)");
			in_x = scan.nextInt();
			if (in_x == 99) {
				System.out.println("시스템을 종료합니다");
				break;
			}
			System.out.println("y좌표를 입력하세요. >>");
			in_y = scan.nextInt();

			if (!(score_in[in_x][in_y] == "null")) {
				System.out.println("중복입니다");
			}

			if (score[in_x][in_y] == 1) {
				score_in[in_x][in_y] = "당첨";
			} else {
				score_in[in_x][in_y] = "꽝";
			}

		}

		// 좌표 x1
		// 좌표 y2 [1,2]-> 1이 들어가 있으면 score_in[1,2] 당첨 입력
		// 0이 들어가 있으면 score_in[1,2] 꽝 입력

	}

}
