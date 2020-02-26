import java.util.Scanner;

public class Ex0218_05 {

	public static void main(String[] args) {

		// �ζǴ�÷��ȣ class // ȸ��, ��÷��ȣ 6��, ���ʽ���ȣ1��(����)
		// ���� �Է��� ��ȣ class // ��ȣ 6��, ��ġ����, ���, �ݾ�

		// �Է� > ȸ���Է�> ��ȣ 6�ڸ� �Է�
		// ȸ�� �˻��ؼ� -> � ��ġ�ϴ���? ��� �������? �ݾ��� ������?
		// 1�� 10��-6��, 2�� 1��-5��+���ʽ�1��, 3�� 1000����-5��, 4�� 10����-4��, 5�� ����-3��

		// �ݾ� - 1���ϴµ� õ��, ó���� ����

		Scanner scan = new Scanner(System.in);

		int[] lot = new int[45];
		int tmp = 0;

		Lotto[] lo = new Lotto[7];
		Mylotto[] mylo = new Mylotto[7];

		for (int i = 0; i < lo.length; i++) {
			lo[i] = new Lotto();
			mylo[i] = new Mylotto();
		}

		for (int i = 0; i < lot.length; i++) {
			lot[i] = i + 1;
		}

		for (int i = 0; i < 200; i++) {
			int ran = (int) (Math.random() * 45);
			tmp = lot[0];
			lot[0] = lot[ran];
			lot[ran] = tmp;

		}

		for (int i = 0; i < 6; i++) {
			lo[i].lotto = lot[i];

		}

		for (int i = 6; i <= 6; i++) {
			lo[i].bonus = lot[i];

		}

		for (int i = 0; i < 6; i++) {
			System.out.println("��ȣ�� �Է����ּ���");
			mylo[i].num = scan.nextInt();
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; i < 6; j++)
				if (mylo[i].num == lo[j].lotto) {
					mylo[i].same = mylo[i].num;
				}
		}

	}// main

}// class
