import java.util.Scanner;

public class Ex0214_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] sub = { "�̸�", "����", "����", "����", "�հ�", "���", "���" };

		System.out.println("�л����� �Է����ּ���");
		int stu = 0;
		stu = scan.nextInt();

		String[] name = new String[stu];

		int[][] score = new int[stu][4];

		double[] avg = new double[stu];

		int[] rank = new int[stu];
		int count = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.println("�̸��� �Է����ּ���");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println(i + 1 + "��°  " + sub[j + 1] + "������ �Է����ּ���");
				score[i][j] = scan.nextInt();

				score[i][score[i].length - 1] += score[i][j]; // �ڡڡڡڡ� score[i](�򰥸�)

			} // for j

			avg[i] = score[i][score[i].length - 1] / 3; // �ڡڡڡڡ� score[i](�򰥸�)

		} // for i

		for (int i = 0; i < score.length; i++) {
			count = 1;
			for (int j = 0; j < score.length; j++) { // �ڡڡڡڡ� score
				if (score[i][score[i].length - 1] < score[j][score[i].length - 1]) {
					count++;
				}
			} // for j
			rank[i] = count;
		} // for i

		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i] + "\t");
		}

		System.out.println();

		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf(score[i][j] + "\t");

			} // int j

			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");

			System.out.println();

		} // int i

	}// main

}// class
