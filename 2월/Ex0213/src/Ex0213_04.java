import java.util.Scanner;

public class Ex0213_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~100���� ���� 1���� �������� �̽��ϴ�.
		// �������� ������, ���ڸ� ���ߴ� ����
		// �Է��� ���ڰ� ����������
		// ������ �۽��ϴ�
		// ������ ����
		// ������ ��)5���Դϴ�

		// �ɼ�>
		// �ڽ��� �Է��� ���ڸ� ���
		// �ִ� 20��

		Scanner scan = new Scanner(System.in);

		int[] ran = new int[100];
		int[] my = new int[1];


		while (true) {

			for (int i = 0; i < ran.length; i++) {
				int rann = (int) (Math.random() * 100)+1;
				ran[i] = rann;
			}
			
			System.out.println("���ڸ� �Է����ּ���");
			System.out.println("^___________^");
			for (int i = 0; i < 1; i++) {
				my[i] = scan.nextInt();
			}

			for (int i = 0; i < 1; i++) {
				if (my[i] > ran[i]) {
					System.out.println("Ů�ϴ� ���� ^^ " + my[i] + " > " + ran[i]);
				} else if (my[i] < ran[i]) {
					System.out.println("�۽��ϴ� " + my[i] + " < " + ran[i]);
				} else {
					System.out.println("�����ϴ� " + my[i] + " = " + ran[i]);
				}

			}

		} // while

	}// main

}// class
