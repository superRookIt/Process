import java.util.Scanner;

public class Ex0214_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����ܾ� ���߱� ����
		// ���� - �ѱۼ���
		// 1. ����, �ѱ� ������ �Է� - �̸� �Է¸���
		// 2. ���� ��� �� �ѱ� �Է� ����
		// 3. �ѱ��� �´���? Ȯ��
		// ��� ���
		// �ٽ� ���� ���

		// ������ �Է�

		Scanner scan = new Scanner(System.in);
		String in_str = "";
		int count = 0; // Ƚ��

		String[][] word = {

				{ "chair", "����" }, { "computer", "��ǻ��" }, { "array", "�迭" }

		};

		for (int i = 0; i < word.length; i++) {

			System.out.println(word[i][0] + "���� �����ϱ��?");
			in_str = scan.nextLine();

			// �����
			if (word[i][1].equals(in_str)) { // �ڡڡڡڡ�String�� equals�� �� !!
				System.out.println("�����Դϴ�. �������� ����");
			} else {

				if (count < 3) {
					System.out.println(count + 1 + "��° �����Դϴ�. �ٽõ���!");
					i--; // �ڡڡڡڡ� ���繮�� �ٽ� ����
					count++; // Ƚ�� �߰�
					continue;
				}

				System.out.println("�����Դϴ�. ������? " + word[i][1] + "�Դϴ�");
				count = 0; // �ڡڡڡڡ� count �ʱ�ȭ!!!!!(�� ���⿡ ��ġ���ִ���)

			}

		} // for i

	}// main

}// class
