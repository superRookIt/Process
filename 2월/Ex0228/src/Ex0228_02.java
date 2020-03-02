
public class Ex0228_02 {

	public static void main(String[] args) {

//		Tv t = new Tv();
//		Computer c = new Computer();
		Buyer b = new Buyer();
//
//		b.buy(t);
//		b.buy(c);

		b.buy(new Tv());
//		System.out.println("Tv 1�� ���� ");
		b.buy(new Computer());
//		System.out.println("��ǻ�� 1�� ���� ");
		b.summary();

	}// main �޼ҵ�

}// Ŭ����

class Product {

	int price;
	String name;
	int bonusPoint;

	Product() {

	}

	Product(String name, int price, int bonusPoint) {
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;

	}

}

class Buyer {

	int money = 100000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;
	int sum = 0;

//	Tv[] tv_item = new Tv[10];
//	Computer[] com_item = new Computer[10];

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ݾ��� �����մϴ�");
			System.out.println("�ݾ��� �����ϼ���");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item[i] = p; // �ڡڡڡڡ�
		i++;
	}

	// ���
	void summary() {
		for (int j = 0; j < i; j++) { // �ڡڡڡڡڡڡڡڡڡڡ� (j<i) !! �̰Ͷ����� ��û ��� �Ѥ�
			if (item[j] == null) {
				System.out.println("���� ��ǰ�� �����ϴ�");
			}

			System.out.println(item[j].name + "");
			sum = sum + item[j].price;
		}

		System.out.println("�� ���� ���� : " + i);
		System.out.println("�� ���� �ݾ� : " + sum);
		System.out.println("�� ���� �ݾ� : " + money);

	}

}

class Tv extends Product {

	Tv() {
		super("Tv", 1000, (int) (1000 * 0.1)); // �ڡڡڡڡ�
//		name = "Tv";
//		price = 1000;
//		bonusPoint = (int) (price * 0.1);
	}

}

class Computer extends Product {

	Computer() {
		name = "��ǻ��";
		price = 900;
		bonusPoint = (int) (price / 10);

	}

}
