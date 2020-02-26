import java.util.Scanner;

public class Ex0211_10 {

	public static void main(String[] args) {

		String[][] table = new String[4][5];

		Scanner scan = new Scanner(System.in);

		

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.println();
				System.out.println((5 * i) + j + 1 + "번째 과목을 입력해주세요");
				table[i][j] = scan.next();
			}
			System.out.println();

		}

		System.out.println();

		System.out.println("[시간표]");

		System.out.print("월");
		System.out.print("\t화");
		System.out.print("\t수");
		System.out.print("\t목");
		System.out.print("\t금 \n");

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (j == 0) {
					System.out.print((i * 1) + j + 1 + ". " + table[i][j] + " ");
				}
				System.out.print(table[i][j] + " "); // ★★★ \t -> tab키 ★★★
			}
			System.out.println();
		}

	}

}
