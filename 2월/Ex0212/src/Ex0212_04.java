import java.util.Scanner;

public class Ex0212_04 {

	public static void main(String[] args) {

		// �л����� ������ �Է��ϴ� �迭
		// �̸��� �Է��ϴ� �迭 3��, ������ �Է��ϴ� �迭 [3],[3] - ����,����,����

		// String[] name = new String[3];

		int[][] score = new int[3][4]; // �հ踦 �߰�

		Scanner scan = new Scanner(System.in);

		String[] name = { "ȫ�浿", "�̼���", "������" };
		String[] subject = { "����", "����", "����" };

		// �̸��Է�
		for (int i = 0; i < score.length; i++) {
			System.out.println("�̸��� �Է��ϼ���. >>");
			name[i] = scan.next();
			// �����Է�
			for (int j = 0; j < score[i].length - 1; j++) { // �ڡڡ�score[i].length-1
				System.out.print(subject[j] + "���� ");
				System.out.println("����");
				score[i][j] = scan.nextInt();
			}

			// �հ�
			for (int j = 0; j < score[i].length - 1; j++) {
				score[i][score[i].length - 1] += score[i][j];
				// score[i][score[i].length] = score[i][score[i].length]+score[i][j];
                // [score[i].length] -> 4-1
			}

		}

		// �л��� ����, ����, ���� �հ� �迭
		// �迭 1�� ����

//		int[][] score = {
//				{100, 88, 79}, 
//				{100, 99, 87},
//				{79,88,85}
//		};

		System.out.print("\t" + "����\t" + "����\t" + "����\t" + "�հ�\t \n"); // %n�̳� \n�� �Ȱ���
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}

	}// main
}// class
