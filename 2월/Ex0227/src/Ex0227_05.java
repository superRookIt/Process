import java.util.Scanner;

public class Ex0227_05 {

	public static void main(String[] args) {

//		Samsungtv[] sam = new Samsungtv[10];

		User user = new User();
		Scanner scan = new Scanner(System.in);
		int s = 0;

		while (true) {
			System.out.println("---------------------");
			System.out.println("1) 삼성TV 구매");
			System.out.println("2) 냉장고 구매");
			System.out.println("3) 에어콘 구매");
			System.out.println("4) 현재 가지고 있는 금액 확인");
			System.out.println("원하는 번호를 입력하세요");
			System.out.println("---------------------");
			s = scan.nextInt();

			switch (s) {

			case 1:
				user.buy(new Samsungtv()); // ★★★★★
				break;

			case 2:
				user.buy(new Ref()); // ★★★★★
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
	String name = "홍길동";
	int tv_c = 0;
	int re_c = 0;
	int co_c = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("돈이 부족합니다");
			return; // ★★★
		}

//		if (p.name == "냉장고") {
//			re_c++;
//			System.out.println("냉장고 구매 개수 : " + re_c);
//		}
//		if (p.name == "에어컨") {
//			co_c++;
//			System.out.println("에어컨 구매 개수 : " + co_c);
//		}
//		if (p.name == "TV") {
//			tv_c++;
//			System.out.println("TV 구매 개수 : " + tv_c);
//		}

		System.out.println(p.name + " 1대를 구매했습니다");
		money -= p.price;

		if (p instanceof Samsungtv) {
			tv_c++;
			System.out.println("현재 tv 대수 :" + tv_c);
		}
		if (p instanceof Ref) {
			re_c++;
			System.out.println("현재 냉장고 대수 :" + re_c);
		}
		if (p instanceof Condi) {
			co_c++;
			System.out.println("현재 에어컨 대수 :" + tv_c);
		}

	}

	void money_now() {
		System.out.println("현재 유저가 가지고 있는 금액 " + money);
	}
}