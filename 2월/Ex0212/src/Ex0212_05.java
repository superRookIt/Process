import java.util.Scanner;

public class Ex0212_05 {

	public static void main(String[] args) {
		// �̸�(�л�3), ����, ����, ����, ����, �հ�

		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];
		int[][] put = new int[3][5];
		String[] sub = { "����", "����", "����", "����" };

		for (int i = 0; i < name.length; i++) {
			System.out.println("�̸��� �Է����ּ���");
			name[i] = scan.next();
			for (int j = 0; j < put[i].length - 1; j++) {
				System.out.println(sub[j] + "�� ������ �Է����ּ���");
				put[i][j] = scan.nextInt();
			}

			for (int j = 0; j < put[i].length - 1; j++) {
				put[i][put[i].length - 1] += put[i][j];
			}

		}

		System.out.print("\t" + "����\t" + "����\t" + "����\t" + "����\t" + "�հ�\t \n");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < put[i].length; j++) {
				System.out.print(put[i][j] + "\t");
			}
			System.out.println();
		}

	}// main
}// class
