import java.util.Scanner;

public class Ex0212_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ð�� 1�����, 2�����, ��, ���(�Ҽ��� 1°�ڸ�)
		// 200������ �ֹ̼�, �⺸��, ������
		// 3�� 200���̻��̸� �ٽ� �Է�
		// [��ð��]

		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];
		String[] sub = { " ", "1�����", "2�����", "�հ�", "���" };
		int[][] shoot = new int[3][3];
		double[] avg = new double[3]; // ����� float�̳� ����� ����

		for (int i = 0; i < name.length; i++) {
			System.out.println("�̸��� �Է����ּ���");
			name[i] = scan.next();
			for (int j = 0; j < shoot[i].length - 1; j++) {
				System.out.println("������ �Է����ּ���");
				shoot[i][j] = scan.nextInt();

				// �հ��Է�
				shoot[i][shoot[i].length - 1] += shoot[i][j];
			}
			avg[i] = shoot[i][shoot[i].length - 1] / 2.0;
		}

//		
//		System.out.print("\t" + "1���\t" + "2���\t" + "�հ�\t \n");
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
