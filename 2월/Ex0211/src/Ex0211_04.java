import java.util.Scanner;

public class Ex0211_04 {

	public static void main(String[] args) {

		// 5680�� -> 500, 100, 50, 10

		Scanner scan = new Scanner(System.in);
		
		int[] money = new int[3];

		int s_money = 0;

		for (int i = 0; i < money.length; i++) { // �ڡڡ�money[2]�� money.length�� 2�� �����δ� 0,1,2 �̷��� �ε����� 3���ε� !!
			System.out.println((i + 1) + "��° �ݾ��� �Է��ϼ���");
			s_money = scan.nextInt();
			money[i] = s_money;

		}

		int[] coin = { 500, 100, 50, 10 };

		// 3���� �ݾ��� �Է��ؼ� 3���� ����� ����Ͻÿ�.
		// �迭�� ����ؼ�

		System.out.println("-----------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "��° �Է��� �ݾ��� " + money[i] + "�� �Դϴ�");
			for (int j = 0; j < 4; j++) {
				System.out.println(coin[j] + "�� = " + money[i] / coin[j]);
				money[i] %= coin[j]; // money = money % coin[i]; �ڡڡڡڡ�
			}

		}
	}// main

}// class
