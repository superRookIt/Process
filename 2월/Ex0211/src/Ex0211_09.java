import java.util.Scanner;

public class Ex0211_09 {

	public static void main(String[] args) {

		// [3][3]
		// ����, ����, ����
		// 100 78 99
		// 87 85 100
		// 75 100 89

//		int[][] test = new int[3][3];

		int[][] test1 = { { 100, 78, 99 }, { 87, 85, 100 }, { 75, 100, 89 } };

		Scanner scan = new Scanner(System.in);

		//�Է�
		int[][] test2 = new int[3][3];
		for (int i = 0; i < test2.length; i++) {
			for (int j = 0; j < test2[i].length; j++) {
				System.out.println((3*i)+j+1+"��° ������ �Է��ϼ���");
				test2[i][j] = scan.nextInt();
			}
		}

		//����
		System.out.println();
		System.out.println("[����ǥ]");
		for (int i = 0; i < test2.length; i++) {
			for (int j = 0; j < test2[i].length; j++) {
				System.out.print(test2[i][j] + " "); //print�� printnl �ƴ�
			}
			System.out.println();//����(���� ���� �ٹٲ�)
		}

	}// class

}// main
