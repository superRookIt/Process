import java.util.Scanner;

public class Ex0213_01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int) (Math.random() * 100) + 1; // 1~100���� 1��
		int[] input = new int[20]; // �Է��ϴ� ����
		int count = 0;

		Scanner scan = new Scanner(System.in);

		while (count < 20) {
			System.out.println("����1���� �Է��ϼ���.");
			input[count] = scan.nextInt(); // 0 -> 10
			if (random > input[count]) {
				System.out.println("���ڰ� �۽��ϴ�." + input[count] + "���� ū���� �Է��ϼ���.");
			} else if (random == input[count]) {
				System.out.println("����!");
				break;
			} else {
				System.out.println("���ڰ� Ů�ϴ�." + input[count] + "���� ���� ���� �Է��ϼ���.");
			}
			count++;
			// ������ 20��°�� -1�� ���ְ� �ݺ����� ��������
			if ((count == 20)) {
				count--;
				break;
			}
		}
		System.out.print("Ƚ�� :" + "\t");
		for (int i = 0; i <= count; i++) {
			System.out.print((i + 1) + "\t");
		}
		System.out.println();
		System.out.print("�Է��� ���� :" + "\t");
		for (int i = 0; i <= count; i++) {
			System.out.print(input[i] + "\t");
		}
		System.out.println();
		if (random == input[count]) {
			System.out.println((count + 1) + "��° " + input[count] + " ������ϴ�.");
		} else {
			System.out.println("20��°������ ������ ���߽��ϴ�.");
			System.out.println("������ " + random + " �Դϴ�.");
		}

		// 1~100���� ���� 1���� �������� �̽��ϴ�.
		// (int)(Math.random()*100)+1
		// ���� ������, ���ڸ� ���ߴ� ����
		// �Է��� ���ڰ� �������� 1������ ���� ���ڰ� Ů�ϴ�. �ٽ��Է�
		// ������ �۽��ϴ�. �ٽ��Է�
		// ������ ����~!
		// ������ ��) 5���Դϴ�.

		// �ɼ�>
		// �ڽ��� �Է��� ���ڸ� ��� ����� ���ּ���.
		// �ִ� 20������ �ϰڽ��ϴ�.

	}

}
