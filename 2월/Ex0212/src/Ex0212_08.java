import java.util.Scanner;

public class Ex0212_08 {

	public static void main(String[] args) {

		// ����ó�� ���α׷�
		// �̸�,
		// ����, ����, ����, �հ�, ���

		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];
		int[][] sub = new int[3][4];
		double[] avg = new double[3];
		String[] sub1 = { "", "����", "����", "����", "�հ�", "���" };

		for (int i = 0; i < sub.length; i++) {
			System.out.println("�̸��� �Է����ּ���");
			name[i] = scan.next();
			for (int j = 0; j < sub[i].length - 1; j++) {
				System.out.println("������ �Է����ּ���");
				sub[i][j] = scan.nextInt();

				sub[i][sub[i].length - 1] += sub[i][j];

			} // for j

			avg[i] = sub[i][sub[i].length - 1] / 3.0;

		} // for i

		for (int i = 0; i < sub1.length; i++) {
			System.out.print(sub1[i] + "\t");
		}

		System.out.println();

		for (int i = 0; i < sub.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < sub[i].length; j++) {
				System.out.print(sub[i][j] + "\t");
			}
			System.out.printf("%.2f", avg[i]);
			System.out.println();
		} // for i

	}// main

}// class
