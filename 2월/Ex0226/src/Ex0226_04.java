import java.util.Scanner;

public class Ex0226_04 {

	public static void main(String[] args) {

		// ī����� ���α׷� ^^

		Deck d = new Deck(); // 52���� ī�� �ϼ�
		Scanner scan = new Scanner(System.in);
		Card[] c1 = new Card[7]; // �����1
		Card[] c2 = new Card[7]; // �����2
		int card_count = 0; // �� ����� ī���
		int user_count = 0; // ����ڰ� ������ �ִ� ī�� ��
		d.shuffle();

		while (true) {

			System.out.println("1. ���ӽ���    2. ī���߰�    3. Ŭ�ι�����  4. ����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���");
			int num = scan.nextInt();

			switch (num) {

			case 0:
				System.out.println("�����մϴ�");
				break;

			case 1:

				System.out.println("�����1");
				for (int i = 0; i < 3; i++) {
					c1[i] = d.pick(i);
					System.out.println(c1[i]);
					card_count++;

				}

				System.out.println("----------------------------");

				System.out.println("�����2");
				for (int i = 0; i < 3; i++) {
					c2[i] = d.pick(card_count++);
					System.out.println(c2[i]);
					card_count++;
					user_count++;
				}

//				System.out.println(d.pick(3)); // c[3]=d.pick(3)

				break;

			case 2:

				if (card_count >= 14) {
					System.out.println("��� �����Ǿ����ϴ�.");
					break;
				}

				for (int i = 0; i < 1; i++) {
					c1[user_count] = d.pick(card_count);
					card_count++;
					c2[user_count] = d.pick(card_count);
					card_count++;
				}

				user_count++;

				for (int i = 0; i < user_count; i++) {
					System.out.println(c1[i]);
					System.out.println(c2[i]);
					System.out.println("----------");
				}

				break;

			}// switch

		} // while
	}// main

}// class
