import java.util.Scanner;

public class Ex0217_05 {

	public static void main(String[] args) {
		// ��ȣ ���� ���� �ۼ��� ��ȸ��
		// 1�� �Է��� ��� ���
		// 2�� �Է��� ��� ���

		Scanner scan = new Scanner(System.in);

		Board[] ge = new Board[10];
		String[] sub = { "��ȣ", "����", "����", "�ۼ���", "��ȸ��" };
		int b_num = 0;
		int v_num = 0;

		for (int i = 0; i < ge.length; i++) {
			ge[i] = new Board();
			System.out.println("[ �Խ��� �� ��� ]");
			ge[i].number = b_num + 1; // �ʱ�ȭ ��ȣ - �ڵ���ȣ
			System.out.println("������ �Է��ϼ���. >>");
			ge[i].title = scan.nextLine(); // nextLine()�� ���� �ϰ� �� �ڿ� �͵� �ν��� !! ����������
			// scan.nextLine(); -> next()�� ������ �ؿ� �߰����ֱ�!!
			System.out.println("������ �Է��ϼ���");
			ge[i].message = scan.nextLine();
			// scan.nextLine();
			System.out.println("�ۼ��ڸ� �Է��ϼ���");
			ge[i].writer = scan.nextLine();
			// scan.nextLine();
			ge[i].view = v_num; // ��ȸ�� �ʱ�ȭ!
			b_num++;// �۹�ȣ �ڵ�����

			System.out.println("-----------------");
			System.out.println(" [ �� ����Ʈ ��� ] ");
			System.out.println("-----------------");

			for (int j = 0; j < sub.length; j++) {
				System.out.print(sub[j] + "\t");
			}

			System.out.println(); //

			for (int t = 0; t < b_num; t++) {
				ge[t].print();
				System.out.println();

			}

			System.out.println();

		}

	}// main

}// class
