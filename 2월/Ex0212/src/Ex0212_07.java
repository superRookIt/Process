import java.util.Scanner;

public class Ex0212_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ð�� 1�����, 2�����, ��, ���(�Ҽ��� 1°�ڸ�)
		// 200������ �ֹ̼�, �⺸��, ������
		// 3�� 200���̻��̸� �ٽ� �Է�
		// [��ð��]

		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];
		String[] sub = { " ", "1�����", "2�����", "�հ�", "����", "���" };
		int[][] shoot = new int[3][4];
		double[] avg = new double[3]; // ����� float�̳� ����� ����

		for (int i = 0; i < name.length; i++) {
			System.out.println("�̸��� �Է����ּ���");
			name[i] = scan.next();
			for (int j = 0; j < shoot[i].length - 2; j++) {
				System.out.println("������ �Է����ּ���");
				shoot[i][j] = scan.nextInt();

				// �հ��Է� score[i][3]
				shoot[i][shoot[i].length - 2] += shoot[i][j];
			}
			// �������� �Է�
			if (shoot[i][0] > shoot[i][1]) {
				shoot[i][shoot[i].length - 1] = shoot[i][0];
			} else {
				shoot[i][shoot[i].length - 1] = shoot[i][1];
			}

			// ����Է� �հ�/2������
			avg[i] = shoot[i][shoot[i].length - 1] / 2.0;

		} // for i

		for (int p = 0; p < sub.length; p++) {
			System.out.print(sub[p] + "\t");
		}
		System.out.println();

		for (int p = 0; p < name.length; p++) {
			System.out.print(name[p] + "\t");
			for (int j = 0; j < shoot[p].length; j++) {
				System.out.print(shoot[p][j] + "\t");
			}
			System.out.print(avg[p] + "\t");
			System.out.println();
		}

	}

}
