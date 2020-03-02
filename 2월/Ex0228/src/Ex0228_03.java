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
			System.out.println("구매 프로그램");
			System.out.println("1.컴퓨터 2.tv 3.냉장고 4.세탁기 5.에어컨");
			System.out.println("6.구매물품, 금액 출력 7.보유금액, 보너스포인트 출력");
			System.out.println("8.보유금액 충전  9.삭제 10.검색 0.종료");
			System.out.println("번호를 입력해주세요. >>>");
			System.out.println("-------------------------------------");
			s = scan.nextInt();

			switch (s) {

			case 0:
				System.out.println("프로그램을 종료합니다 ^^");
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
				System.out.println("삭제할 물건을 선택하세요");
				System.out.println("1.컴퓨터 2.tv 3.냉장고 4.세탁기 5.에어컨");
				int select = scan.nextInt();
				switch (select) {
				case 1:
					b.delete("컴퓨터");
					break;

				case 2:
					b.delete("TV");
					break;

				case 3:
					b.delete("냉장고");
					break;

				case 4:
					b.delete("세탁기");
					break;

				case 5:
					b.delete("에어콘");
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

	}// 기본 생성자

	Pro(String name, int price, int bonusPoint) {
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}// 매개변수가 있는 생성자 이거 주석처리해도 상관없네?

}

class BUY {

	int money = 100000;
	int bonusPoint = 0;

	Vector<Pro> cart = new Vector<Pro>();// ★★★★★
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
			System.out.println("금액이 부족합니다");
			System.out.println("금액을 충전하세요");
			return;
		}
		System.out.println(p.name + "을 구매합니다");
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart.add(p); // ★★★★★ !!
//		Item[i++] = p; // ★★★★★ !!
	}

	// 출력
	void summary() {
		int cut = 0;
		System.out.println("구매물품, 금액 출력합니다 ^^");
		for (int j = 0; j < cart.size(); j++) { // length->size

			Pro p = (Pro) cart.get(j); // ->j번만큼 도는
			System.out.print(p.name + "\t");
			sum = sum + p.price;
			if (p.price == 0) {
				cut++;
			}
		}

		System.out.println();

		System.out.println("총 구매 개수 : " + (i - cut));
		System.out.println("총 구매 금액 : " + sum);

	}

	void remain() {
		System.out.println("보유금액, 보너스포인트 출력합니다 ^^");
		System.out.println("총 보유 금액 : " + money);
		System.out.println("보너스 포인트 : " + bonusPoint);
	}

	void fill() {
		System.out.println("보유금액 충전합니다 ^^");
		System.out.println("충전하고 싶은 금액을 입력해주세요");
		// 카드회사 - card(num,card_num,price)
		// 회원번호, 금액, true/false
		int a = scan.nextInt();
		money += a;
		System.out.println(a + "원이 충전되었습니다 ^^");
	}

	void search() {
		for (int j = 0; j < i; j++) { // ★★★★★★★★★★★ (j<i) !! 이것문에때 엄청 헤맴 ㅡㅡ
			if (Item[j] == null) {
				System.out.println("구매 물품이 없습니다");
				break;
			}

			if (Item[j].name.equals("에어콘")) { // ★★★
				air++;
			}

			if (Item[j].name.equals("TV")) {
				tv_++;
			}

			if (Item[j].name.equals("냉장고")) {
				ref++;
			}

			if (Item[j].name.equals("세탁기")) {
				wash++;
			}

			if (Item[j].name.equals("컴퓨터")) { // Item[j].name == "컴퓨터"
				com++;
			}

		}

		System.out.println("검색합니다.");
		System.out.println("냉장고 : " + ref);
		System.out.println("TV  : " + tv_);
		System.out.println("세탁기 : " + wash);
		System.out.println("에어콘 : " + air);
		System.out.println("컴퓨터 : " + com);

	}

	void delete(String name) {

		int num = 0;
		for (int j = 0; j < i; j++) { // ★★★★★★★★★★★ (j<i) !! 이것 때문에 엄청 헤맴 ㅡㅡ
			if (Item[j] == null) {
				System.out.println("구매 물품이 없습니다");
				break;
			}

			if (Item[j].name.contentEquals(name)) {
				Item[j].name = "";
				money += Item[j].price;// 먼저 금액 충전되고 0으로 리셋
				bonusPoint -= Item[j].bonusPoint;
				Item[j].price = 0;
				num++;
				sum = 0;
			}
		}
		if (num == 1) {
			System.out.println(name + " 1대 취소하였습니다");
		} else {
			System.out.println("취소할 제품이 없습니다");
		}

	}

	void kill() { // my own making ^^
		System.out.println("지웁니다 ^^");
		System.out.println("삭제하고 싶은 번호를 선택해주세요 ^^");
		for (int j = 0; j < i; j++) { // ★★★★★★★★★★★ (j<i) !! 이것때문에 엄청 헤맴 ㅡㅡ
			System.out.print((j + 1) + ")" + Item[j].name + "\t");
		}
		int b = scan.nextInt();

		Item[b - 1].name = "";

		sum -= Item[b - 1].price; // 어차피 sum 0되면..

		bonusPoint -= Item[b - 1].bonusPoint;
		money += Item[b - 1].price;
		Item[b - 1].price = 0;

		sum = 0;

		air = 0;
		wash = 0;
		ref = 0;
		tv_ = 0;
		com = 0;

		System.out.println("초기화완료  >>>");
	}

}

class COM extends Pro {

	COM() {
		name = "컴퓨터";
		price = 1000;
		bonusPoint = (int) (price / 10);
	}

}

class TV_ extends Pro {

//	TV_() {
//		super("TV", 1000, (int) (1000 / 10));
//	} -> 이렇게 super()로도 가능 ^^

	TV_() {
		name = "TV";
		price = 800;
		bonusPoint = (int) (price / 10);
	}

}

class REF extends Pro {

	REF() {
		name = "냉장고";
		price = 800;
		bonusPoint = (int) (price / 10);
	}
}

class WASH extends Pro {

	WASH() {
		name = "세탁기";
		price = 800;
		bonusPoint = (int) (price / 10);
	}
}

class AIR extends Pro {

	AIR() {
		name = "에어콘";
		price = 800;
		bonusPoint = (int) (price / 10);
	}
}
