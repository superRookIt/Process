import java.util.Scanner;

public class Ex0213_06 {

	public static void main(String[] args) {

		// �л�����ó�� ���α׷�
		// 1. �л������߰� 2. �л��������� 3. �л��������� 0. ����
		// 1-> ���������Է�

		// �̸� ���� ���� �հ� ���
		// 3�� �Է�

		Scanner scan = new Scanner(System.in);

		// �ڡ��л��Է�
		int stu = 0;
		System.out.println("����� �л��� �Է��Ͻðڽ��ϱ�?. >>");
		stu = scan.nextInt();

		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���", "���" };

		String[] name = new String[stu]; // �̸�
		int[][] score = new int[stu][4]; // ����
		double[] avg = new double[stu]; // ���
		int[] rank = new int[stu]; // ���
		int rank_count = 1; // ��� ī��Ʈ �ڡ� 1���� ����

		// �̸�, ����, ��� �Է�
		for (int i = 0; i < score.length; i++) {
			System.out.println("�̸��� �Է����ּ���");
			name[i] = scan.next();
			// name[i].trim(); // �ڡ� trim() �յ��� ������ ������
			// String -> charAt(), subString, length, touppercase, equal(),
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println((i + 1) + "��° " + subject[j + 1] + " ������ �Է��ϼ���. >>");// subject[j+1]
				score[i][j] = scan.nextInt();

				// ��ȿ���˻�
				if (!(score[i][j] >= 0 && score[i][j] <= 100)) {
					System.out.println("1~99���� �Է����ּ���");
					j--; // ��
					continue; // ��
				}

				score[i][score[i].length - 1] += score[i][j];
				// �հ� = �հ� + �߰�����

			} // for j

			avg[i] = score[i][score[i].length - 1] / 3;

		} // for i

		// �ڡ� ������ �ڡ�
		for (int i = 0; i < score.length; i++) {
			rank_count = 1;
			for (int j = 0; j < score.length; j++) { //
				if (score[i][score[i].length - 1] < score[j][score[i].length - 1]) { // 200, 190, 180 //
					rank_count++;
				}

				// score[i][2]<score[j][2] ũ�� +1
				// score[i][2]<score[j][2]
				// score[i][2]<score[j][2]

			} // for j

			rank[i] = rank_count;
		} // for i

		// �������
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}

		System.out.println();

		// �̸�, ����, ������
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			} // for j

			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.println();

		} // for i

	}// MAIN

}// CLASS
