import java.util.Scanner;

public class Ex0211_13 {

	public static void main(String[] args) {

		// 5,5 -> 0이나 1 -> 1 당첨 0 꽝
		// 10번까지 당첨 몇번 꽝 몇번

		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int d = 0;
		int q = 0;
		int count = 0;

		int[][] a = new int[5][5];
		String[][] b = new String[5][5];

		while (count < 9) {
			System.out.println("----------------------");
			System.out.println("      좌표게임 시작              ");
			System.out.println("----------------------");

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = (int) (Math.random() * 2);
				}

			}

			System.out.print("\t0\t1\t2\t3\t4\n");
			for (int i = 0; i < a.length; i++) {
				System.out.print(i + "\t");
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(b[i][j] + "\t");
				}
				System.out.println();

			}

			System.out.println(count+1 + "번째 게임입니다");
			System.out.println("x좌표를 입력해주세요. >> 종료 99");
			x = scan.nextInt();
			if (x == 99) {
				System.out.println("종료합니다");
				break;
			}
			if (x < 1 || x > 4) {
				System.out.println("잘못입력하셨습니다");
				continue;
			}
			System.out.println("y좌표를 입력해주세요. >> 종료 99");
			y = scan.nextInt();
			if (y == 99) {
				System.out.println("종료합니다");
				break;
			}
			if (y < 1 || y > 4) {
				System.out.println("잘못입력하셨습니다");
				continue;
			}

			if (!(b[x][y] == null)) {
				System.out.println("중복입니다 ㅠㅠ");
				continue;
			}

			if (a[x][y] == 1) {
				b[x][y] = "당첨";
				System.out.println("당첨입니다 축하합니다");
				d++;
			} else {
				b[x][y] = "꽝";
				System.out.println("꽝입니다 ㅠㅠ ");
				q++;
			}

			count++;
			
		} // while

		System.out.println("당첨횟수 : " + d + "번" + "// 꽝 횟수" + q + "번 ");

	}// main
}// class
