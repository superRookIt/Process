import java.util.Scanner;

public class Ex0211_13 {

	public static void main(String[] args) {

		// 5,5 -> 0�̳� 1 -> 1 ��÷ 0 ��
		// 10������ ��÷ ��� �� ���

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
			System.out.println("      ��ǥ���� ����              ");
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

			System.out.println(count+1 + "��° �����Դϴ�");
			System.out.println("x��ǥ�� �Է����ּ���. >> ���� 99");
			x = scan.nextInt();
			if (x == 99) {
				System.out.println("�����մϴ�");
				break;
			}
			if (x < 1 || x > 4) {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				continue;
			}
			System.out.println("y��ǥ�� �Է����ּ���. >> ���� 99");
			y = scan.nextInt();
			if (y == 99) {
				System.out.println("�����մϴ�");
				break;
			}
			if (y < 1 || y > 4) {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				continue;
			}

			if (!(b[x][y] == null)) {
				System.out.println("�ߺ��Դϴ� �Ф�");
				continue;
			}

			if (a[x][y] == 1) {
				b[x][y] = "��÷";
				System.out.println("��÷�Դϴ� �����մϴ�");
				d++;
			} else {
				b[x][y] = "��";
				System.out.println("���Դϴ� �Ф� ");
				q++;
			}

			count++;
			
		} // while

		System.out.println("��÷Ƚ�� : " + d + "��" + "// �� Ƚ��" + q + "�� ");

	}// main
}// class
