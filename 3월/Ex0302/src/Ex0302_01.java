import java.util.Vector;

public class Ex0302_01 {

	public static void main(String[] args) {

		Buyer user = new Buyer(); // ������ 1�� ����

		user.buy(new TV());
		user.buy(new Com());
		user.buy(new Audio());

		user.summary();

	}// main

}// class

class Buyer {

	int money = 10000;
	int bonus = 0;
	int i = 0;

	// Vector cart = new Vector(); -> <> ���� ����

	Vector<Product> cart = new Vector<Product>();
	// �ڡڡڡڡ� (vector< >���� object�� ��!!)
	// Vector<Product> -> Product�� ���¸� �޴´ٴ� ��!
	// Vector�� import ����� �� !! Scanneró��

	// Product[] cart = new Product[10]; // �迭����
	String list = "";

	// ���� �޼ҵ�
	void buy(Product p) {

		if (money < p.price) {
			System.out.println("�ܾ��� �����մϴ�");
			return;
		}

		money -= p.price;
		bonus += p.bonus;

		cart.add(p);// �ڡڡڡڡ� !! 0, 1, 2...
//		cart[i++] = p;

		System.out.println(p.name + " ���Ÿ� �߽��ϴ�.");

	}

	void summary() {

		int sum = 0;

		System.out.print("���Ÿ�� :  ");
		for (int j = 0; j < cart.size(); j++) {
			// j < i, //cart.size -> īƮ �迭�� � ����ִ��� �ڡڡڡڡ�

			if (cart.isEmpty()) {
				// �ڡڡڡڡ� (cart�� �� �������� �ƴ��� isEmpty())
				return;
			}

			Product p = (Product) cart.get(j);
			// �ڡڡڡڡ� (object�� �ֱ� ������ Product�� ��ȯ) 0, 1 ,2 ,3

//			System.out.print(cart[j].name + "\t");
//			list += cart[j].name + " , ";
			sum += p.price;
			list += p.name + " ";

		} // for j

		System.out.println();
		System.out.println("�� ���� �ݾ� : " + sum);

	}

}

class Product {

	String name;
	int price;
	double bonus;

	Product() {

	}

	Product(String name, int price) {
		this.name = name;
		this.price = price;
		this.bonus = price * 0.1; // ��
	}

}

class TV extends Product {

	TV() {
		name = "TV";
		price = 800;
		// super("TV",1000)
	}

}

class Com extends Product {

	Com() {
//		name = "��ǻ��";
//		price = 1000;
		super("��ǻ��", 1000); // ��
	}

}

class Audio extends Product {

	Audio() {
//		name = "�����";
//		price = 500;
		super("�����", 500);
	}
}
