import java.util.Scanner;
import java.util.Vector;

public class Ex0228_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int s = 0;
		BUY b = new BUY();

//		TV t = new TV();
//		COM c = new COM();
//		REF r = new REF();
//		AIR a = new AIR();
//		WASH w = new WASH();

		while (true) {

			System.out.println("-------------------------------------");
			System.out.println("���� ���α׷�");
			System.out.println("1.��ǻ�� 2.tv 3.����� 4.��Ź�� 5.������");
			System.out.println("6.���Ź�ǰ, �ݾ� ��� 7.�����ݾ�, ���ʽ�����Ʈ ���");
			System.out.println("8.�����ݾ� ����  9.���� 10.�˻� 0.����");
			System.out.println("��ȣ�� �Է����ּ���. >>>");
			System.out.println("-------------------------------------");
			s = scan.nextInt();

			switch (s) {

			case 0:
				System.out.println("���α׷��� �����մϴ� ^^");
				break;

			case 1:
				b.buy(new COM());
				break;

			case 2:
				b.buy(new TV_());
				break;

			case 3:
				b.buy(new REF());
				break;

			case 4:
				b.buy(new WASH());
				break;

			case 5:
				b.buy(new AIR());
				break;

			case 6:
				b.summary();
				break;

			case 7:
				b.remain();
				break;

			case 8:
				b.fill();
				break;

			case 9:
				System.out.println("������ ������ �����ϼ���");
				System.out.println("1.��ǻ�� 2.tv 3.����� 4.��Ź�� 5.������");
				int select = scan.nextInt();
				switch (select) {
				case 1:
					b.delete("��ǻ��");
					break;

				case 2:
					b.delete("TV");
					break;

				case 3:
					b.delete("�����");
					break;

				case 4:
					b.delete("��Ź��");
					break;

				case 5:
					b.delete("������");
					break;

				}// switch

				break;

			case 10:
				b.search();
				break;

			}// switch

		} // while

	}// main method

}// class

class Pro {

	int price;
	String name;
	int bonusPoint;

	Pro() {

	}// �⺻ ������

	Pro(String name, int price, int bonusPoint) {
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}// �Ű������� �ִ� ������ �̰� �ּ�ó���ص� �������?

}

class BUY {

	int money = 100000;
	int bonusPoint = 0;

	Vector<Pro> cart = new Vector<Pro>();// �ڡڡڡڡ�
//	Pro[] Item = new Pro[50];

	int i = 0;
	int sum = 0;

	int air = 0;
	int wash = 0;
	int ref = 0;
	int tv_ = 0;
	int com = 0;

	Scanner scan = new Scanner(System.in);

	void buy(Pro p) {
		if (money < p.price) {
			System.out.println("�ݾ��� �����մϴ�");
			System.out.println("�ݾ��� �����ϼ���");
			return;
		}
		System.out.println(p.name + "�� �����մϴ�");
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart.add(p); // �ڡڡڡڡ� !!
//		Item[i++] = p; // �ڡڡڡڡ� !!
	}

	// ���
	void summary() {
		int cut = 0;
		System.out.println("���Ź�ǰ, �ݾ� ����մϴ� ^^");
		for (int j = 0; j < cart.size(); j++) { // length->size

			Pro p = (Pro) cart.get(j); // ->j����ŭ ����
			System.out.print(p.name + "\t");
			sum = sum + p.price;
			if (p.price == 0) {
				cut++;
			}
		}

		System.out.println();

		System.out.println("�� ���� ���� : " + (i - cut));
		System.out.println("�� ���� �ݾ� : " + sum);

	}

	void remain() {
		System.out.println("�����ݾ�, ���ʽ�����Ʈ ����մϴ� ^^");
		System.out.println("�� ���� �ݾ� : " + money);
		System.out.println("���ʽ� ����Ʈ : " + bonusPoint);
	}

	void fill() {
		System.out.println("�����ݾ� �����մϴ� ^^");
		System.out.println("�����ϰ� ���� �ݾ��� �Է����ּ���");
		// ī��ȸ�� - card(num,card_num,price)
		// ȸ����ȣ, �ݾ�, true/false
		int a = scan.nextInt();
		money += a;
		System.out.println(a + "���� �����Ǿ����ϴ� ^^");
	}

	void search() {
		for (int j = 0; j < i; j++) { // �ڡڡڡڡڡڡڡڡڡڡ� (j<i) !! �̰͹����� ��û ��� �Ѥ�
			if (Item[j] == null) {
				System.out.println("���� ��ǰ�� �����ϴ�");
				break;
			}

			if (Item[j].name.equals("������")) { // �ڡڡ�
				air++;
			}

			if (Item[j].name.equals("TV")) {
				tv_++;
			}

			if (Item[j].name.equals("�����")) {
				ref++;
			}

			if (Item[j].name.equals("��Ź��")) {
				wash++;
			}

			if (Item[j].name.equals("��ǻ��")) { // Item[j].name == "��ǻ��"
				com++;
			}

		}

		System.out.println("�˻��մϴ�.");
		System.out.println("����� : " + ref);
		System.out.println("TV  : " + tv_);
		System.out.println("��Ź�� : " + wash);
		System.out.println("������ : " + air);
		System.out.println("��ǻ�� : " + com);

	}

	void delete(String name) {

		int num = 0;
		for (int j = 0; j < i; j++) { // �ڡڡڡڡڡڡڡڡڡڡ� (j<i) !! �̰� ������ ��û ��� �Ѥ�
			if (Item[j] == null) {
				System.out.println("���� ��ǰ�� �����ϴ�");
				break;
			}

			if (Item[j].name.contentEquals(name)) {
				Item[j].name = "";
				money += Item[j].price;// ���� �ݾ� �����ǰ� 0���� ����
				bonusPoint -= Item[j].bonusPoint;
				Item[j].price = 0;
				num++;
				sum = 0;
			}
		}
		if (num == 1) {
			System.out.println(name + " 1�� ����Ͽ����ϴ�");
		} else {
			System.out.println("����� ��ǰ�� �����ϴ�");
		}

	}

	void kill() { // my own making ^^
		System.out.println("����ϴ� ^^");
		System.out.println("�����ϰ� ���� ��ȣ�� �������ּ��� ^^");
		for (int j = 0; j < i; j++) { // �ڡڡڡڡڡڡڡڡڡڡ� (j<i) !! �̰Ͷ����� ��û ��� �Ѥ�
			System.out.print((j + 1) + ")" + Item[j].name + "\t");
		}
		int b = scan.nextInt();

		Item[b - 1].name = "";

		sum -= Item[b - 1].price; // ������ sum 0�Ǹ�..

		bonusPoint -= Item[b - 1].bonusPoint;
		money += Item[b - 1].price;
		Item[b - 1].price = 0;

		sum = 0;

		air = 0;
		wash = 0;
		ref = 0;
		tv_ = 0;
		com = 0;

		System.out.println("�ʱ�ȭ�Ϸ�  >>>");
	}

}

class COM extends Pro {

	COM() {
		name = "��ǻ��";
		price = 1000;
		bonusPoint = (int) (price / 10);
	}

}

class TV_ extends Pro {

//	TV_() {
//		super("TV", 1000, (int) (1000 / 10));
//	} -> �̷��� super()�ε� ���� ^^

	TV_() {
		name = "TV";
		price = 800;
		bonusPoint = (int) (price / 10);
	}

}

class REF extends Pro {

	REF() {
		name = "�����";
		price = 800;
		bonusPoint = (int) (price / 10);
	}
}

class WASH extends Pro {

	WASH() {
		name = "��Ź��";
		price = 800;
		bonusPoint = (int) (price / 10);
	}
}

class AIR extends Pro {

	AIR() {
		name = "������";
		price = 800;
		bonusPoint = (int) (price / 10);
	}
}
