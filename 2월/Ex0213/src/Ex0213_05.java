import java.util.Scanner;

public class Ex0213_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int random = (int) (Math.random() * 100) + 1; // 1~100���� 1��
		int[] input = new int[20];// �Է��ϴ� ����
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int success = 0;
		int cor = 0;

		while (count < 20) {
			System.out.println("���� 1���� �Է��ϼ���. >>");
			input[count] = scan.nextInt();
			if (random > input[count]) {
				System.out.println("���ڰ� �۽��ϴ�." + input[count] + "���� ū ���� �Է��ϼ���.");

			} else if (random == input[count]) {
				System.out.println("����");
				success++;
				cor = input[count];
				break;
			} else {
				System.out.println("���ڰ� Ů�ϴ�." + input[count] + "���� ���� ���� �Է��ϼ���.");
			}

			count++; // �ڡڡڡ�

			if (count == 20) { // �ڡڡڡ� ������ 20��°�� -1�� ���ְ� �ݺ����� ��������!!!
				count--;
				break;
			}

		} // while

		System.out.print("Ƚ�� : " + "\t");
		for (int i = 0; i <= count; i++) { // �ڡڡڡ� <=count
			System.out.print(i + 1 + "\t");
		}

		System.out.println();

		System.out.print("�Է��� ���� : " + "\t");
		for (int i = 0; i <= count; i++) {
			System.out.print(input[i] + "\t");
		}

		System.out.println();

		if (!(success == 0)) {
			System.out.println(count + 1 + "��°�� " + cor + " ������ϴ�");
		} else {
			System.out.println(count + 1 + "�� �ص� �� ���� ����");
		}

	}

}
