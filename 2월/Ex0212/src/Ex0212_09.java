import java.util.Scanner;

public class Ex0212_09 {

	public static void main(String[] args) {

		// ����ó�����α׷�
		// �̸�(String) ����,����,����,�հ�(Int) ���(double)
		// ��ȣ �̸� ���� ��¥ ��ȸ�� ->�Է��߰�

		String[] name = new String[3];
		int[][] score = new int[3][4];
		// [0,0][0,1][0,2] - ���� / [0,3] - �հ�
		double[] avg = new double[3];
		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���" };

		Scanner scan = new Scanner(System.in);

		// name�̶� score�� ���� �ٸ��� ���ε��� �����

		// �Է���
		for (int i = 0; i < name.length; i++) { // score.length
			// �̸��Է�
			System.out.println(i + 1 + "�� �л��� �̸��� �Է� ���ּ���");
			name[i] = scan.next();
			// �����Է�
			for (int j = 0; j < score[i].length - 1; j++) { // score[i].length
				System.out.println(subject[j + 1] + "������ �Է����ּ���.");
				score[i][j] = scan.nextInt();

				// �հ��Է�
				// score[i][3]=score[i][3]+score[i][j];
				score[i][score[i].length - 1] += score[i][j];

			} // for j

			avg[i] = score[i][score[i].length - 1] / (score[i].length - 1); // �հ�/3 = ���
			// avg[i] = score[i][3]/3; // �հ�/3 = ���

		} // for i

		// ���

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}

		System.out.println();// Ÿ��Ʋ ��� ����� ����Ű

		for (int i = 0; i < score.length; i++) { // int ->[3] [4]
			System.out.print(name[i] + "\t");
			// �������
			for (int j = 0; j < score[i].length; j++) { // int [3] ->[4]
				System.out.print(score[i][j] + "\t");
			} // for j

			// ������
			System.out.print(avg[i] + "\n");
		} // for i

	}// main
}// class
