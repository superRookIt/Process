import java.util.Scanner;

public class Ex0212_05 {

	public static void main(String[] args) {
		// 이름(학생3), 국어, 영어, 수학, 과학, 합계

		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];
		int[][] put = new int[3][5];
		String[] sub = { "국어", "영어", "수학", "과학" };

		for (int i = 0; i < name.length; i++) {
			System.out.println("이름을 입력해주세요");
			name[i] = scan.next();
			for (int j = 0; j < put[i].length - 1; j++) {
				System.out.println(sub[j] + "의 점수를 입력해주세요");
				put[i][j] = scan.nextInt();
			}

			for (int j = 0; j < put[i].length - 1; j++) {
				put[i][put[i].length - 1] += put[i][j];
			}

		}

		System.out.print("\t" + "국어\t" + "영어\t" + "수학\t" + "과학\t" + "합계\t \n");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < put[i].length; j++) {
				System.out.print(put[i][j] + "\t");
			}
			System.out.println();
		}

	}// main
}// class
