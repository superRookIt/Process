import java.util.Vector;

public class Ex0302_01 {

	public static void main(String[] args) {

		Buyer user = new Buyer(); // 구매자 1명 생성

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

	// Vector cart = new Vector(); -> <> 생략 가능

	Vector<Product> cart = new Vector<Product>();
	// ★★★★★ (vector< >에는 object가 들어감!!)
	// Vector<Product> -> Product의 형태만 받는다는 뜻!
	// Vector도 import 해줘야 함 !! Scanner처럼

	// Product[] cart = new Product[10]; // 배열구조
	String list = "";

	// 구매 메소드
	void buy(Product p) {

		if (money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}

		money -= p.price;
		bonus += p.bonus;

		cart.add(p);// ★★★★★ !! 0, 1, 2...
//		cart[i++] = p;

		System.out.println(p.name + " 구매를 했습니다.");

	}

	void summary() {

		int sum = 0;

		System.out.print("구매목록 :  ");
		for (int j = 0; j < cart.size(); j++) {
			// j < i, //cart.size -> 카트 배열에 몇개 들어있는지 ★★★★★

			if (cart.isEmpty()) {
				// ★★★★★ (cart가 빈 공백인지 아닌지 isEmpty())
				return;
			}

			Product p = (Product) cart.get(j);
			// ★★★★★ (object에 있기 때문에 Product로 변환) 0, 1 ,2 ,3

//			System.out.print(cart[j].name + "\t");
//			list += cart[j].name + " , ";
			sum += p.price;
			list += p.name + " ";

		} // for j

		System.out.println();
		System.out.println("총 구매 금액 : " + sum);

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
		this.bonus = price * 0.1; // ★
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
//		name = "컴퓨터";
//		price = 1000;
		super("컴퓨터", 1000); // ★
	}

}

class Audio extends Product {

	Audio() {
//		name = "오디오";
//		price = 500;
		super("오디오", 500);
	}
}
