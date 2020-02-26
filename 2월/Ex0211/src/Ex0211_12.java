import java.util.Scanner;

public class Ex0211_12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int in_x = 0;
		int in_y = 0;

		int[][] score = new int[3][3];
		String[][] score_in = new String[3][3]; // ���� �Է��ؼ� �����ϴ� �迭

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 2); // 0,1
			}
		}

		while (true) {

			System.out.println("--------------------");
			System.out.println("[ ��ǥ���߱� ���� ]");
			System.out.println("--------------------");
			System.out.print("\t0\t1\t2\n"); // \t ��, \n ����Ű

			for (int i = 0; i < score_in.length; i++) {
				System.out.print(i + "\t");
				for (int j = 0; j < score_in[i].length; j++) {
					System.out.print(score_in[i][j] + "\t");
				}
				System.out.println();
			}

			System.out.println("x��ǥ�� �Է��ϼ���. >> (���� :99)");
			in_x = scan.nextInt();
			if (in_x == 99) {
				System.out.println("�ý����� �����մϴ�");
				break;
			}
			System.out.println("y��ǥ�� �Է��ϼ���. >>");
			in_y = scan.nextInt();

			if (!(score_in[in_x][in_y] == "null")) {
				System.out.println("�ߺ��Դϴ�");
			}

			if (score[in_x][in_y] == 1) {
				score_in[in_x][in_y] = "��÷";
			} else {
				score_in[in_x][in_y] = "��";
			}

		}

		// ��ǥ x1
		// ��ǥ y2 [1,2]-> 1�� �� ������ score_in[1,2] ��÷ �Է�
		// 0�� �� ������ score_in[1,2] �� �Է�

	}

}
