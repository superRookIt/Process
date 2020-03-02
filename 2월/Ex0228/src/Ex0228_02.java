
public class Ex0228_02 {

	public static void main(String[] args) {

//		Tv t = new Tv();
//		Computer c = new Computer();
		Buyer b = new Buyer();
//
//		b.buy(t);
//		b.buy(c);

		b.buy(new Tv());
//		System.out.println("Tv 1대 구매 ");
		b.buy(new Computer());
//		System.out.println("컴퓨터 1대 구매 ");
		b.summary();

	}// main 메소드

}// 클래스

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
			System.out.println("금액이 부족합니다");
			System.out.println("금액을 충전하세요");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item[i] = p; // ★★★★★
		i++;
	}

	// 출력
	void summary() {
		for (int j = 0; j < i; j++) { // ★★★★★★★★★★★ (j<i) !! 이것때문에 엄청 헤맴 ㅡㅡ
			if (item[j] == null) {
				System.out.println("구매 물품이 없습니다");
			}

			System.out.println(item[j].name + "");
			sum = sum + item[j].price;
		}

		System.out.println("총 구매 개수 : " + i);
		System.out.println("총 구매 금액 : " + sum);
		System.out.println("총 보유 금액 : " + money);

	}

}

class Tv extends Product {

	Tv() {
		super("Tv", 1000, (int) (1000 * 0.1)); // ★★★★★
//		name = "Tv";
//		price = 1000;
//		bonusPoint = (int) (price * 0.1);
	}

}

class Computer extends Product {

	Computer() {
		name = "컴퓨터";
		price = 900;
		bonusPoint = (int) (price / 10);

	}

}
