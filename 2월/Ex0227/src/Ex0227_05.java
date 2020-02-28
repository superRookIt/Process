import java.util.Scanner;

public class Ex0227_05 {

	public static void main(String[] args) {

//		Samsungtv[] sam = new Samsungtv[10];

		User user = new User();
		Scanner scan = new Scanner(System.in);
		int s = 0;

		while (true) {
			System.out.println("---------------------");
			System.out.println("1) �ＺTV ����");
			System.out.println("2) ����� ����");
			System.out.println("3) ������ ����");
			System.out.println("4) ���� ������ �ִ� �ݾ� Ȯ��");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���");
			System.out.println("---------------------");
			s = scan.nextInt();

			switch (s) {

			case 1:
				user.buy(new Samsungtv()); // �ڡڡڡڡ�
				break;

			case 2:
				user.buy(new Ref()); // �ڡڡڡڡ�
				break;

			case 3:
				user.buy(new Condi());
				break;

			case 4:
				user.money_now();
				break;

			}// switch

		} // while

	}// main

}// class

class User {

	int money = 10000;
	String name = "ȫ�浿";
	int tv_c = 0;
	int re_c = 0;
	int co_c = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("���� �����մϴ�");
			return; // �ڡڡ�
		}

//		if (p.name == "�����") {
//			re_c++;
//			System.out.println("����� ���� ���� : " + re_c);
//		}
//		if (p.name == "������") {
//			co_c++;
//			System.out.println("������ ���� ���� : " + co_c);
//		}
//		if (p.name == "TV") {
//			tv_c++;
//			System.out.println("TV ���� ���� : " + tv_c);
//		}

		System.out.println(p.name + " 1�븦 �����߽��ϴ�");
		money -= p.price;

		if (p instanceof Samsungtv) {
			tv_c++;
			System.out.println("���� tv ��� :" + tv_c);
		}
		if (p instanceof Ref) {
			re_c++;
			System.out.println("���� ����� ��� :" + re_c);
		}
		if (p instanceof Condi) {
			co_c++;
			System.out.println("���� ������ ��� :" + tv_c);
		}

	}

	void money_now() {
		System.out.println("���� ������ ������ �ִ� �ݾ� " + money);
	}
}