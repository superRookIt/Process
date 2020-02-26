import java.util.Scanner;

public class Ex0207_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 블랙커피 : 커피 10
		// 흑당커피 : 커피7 설탕5
		// 카페라떼 : 커피5 우유5
		// 밀크커피 : 커피4 우유 3 설탕 2
		// 재료 없으면 현재 재료가 부족한 상태입니다
		// 커피 100 설탕 50 우유 70 in 자판기
		// 9번 잔량 (관리자 모드)
		// 총 몇잔 팔았는지 (관리자)

		Scanner scan = new Scanner(System.in);

		int coffe = 100;
		int sugar = 50;
		int milk = 70;
		int a = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int cash = 0;

		String id = "aaa";
		String id1 = "";
		String pass = "1234";
		String sold = "";
		String sold1 = "";
		String sold2 = "";
		String sold3 = "";

		loop1: while (true) {

			System.out.println("------------------------------------");
			System.out.println("커피 자판기");
			System.out.println("1. 블랙커피 " + sold + "2.흑당커피 " + sold1 + "3.라떼 " + sold2 + "4.밀크커피 " + sold3);
			System.out.println("99. 관리자모드 ");
			System.out.println("0. 프로그램 종료");
			System.out.println("원하는 숫자를 입력해주세요");

			a = scan.nextInt();

			switch (a) {
			case 1:
				if (coffe < 10) {
					System.out.println("재료가 부족합니다. 관리자에게 문의하세요");
					sold = "(품절)";
				}
				coffe -= 10;
				System.out.println("블랙커피 1잔 완료");
				cash += 100;
				System.out.println();
				c++;
				break;

			case 2:
				if (coffe < 7 || sugar < 5) {
					System.out.println("재료가 부족합니다. 관리자에게 문의하세요");
					sold1 = "(품절)";
				}
				coffe -= 7;
				sugar -= 5;
				System.out.println("흑당커피 1잔 완료");
				cash += 300;
				System.out.println();
				d++;
				break;

			case 3:
				if (coffe < 5 || milk < 5) {
					System.out.println("재료가 부족합니다. 관리자에게 문의하세요");
					sold2 = "(품절)";
				}
				coffe -= 5;
				milk -= 5;
				System.out.println("카페라떼 1잔 완료");
				cash += 200;
				System.out.println();
				e++;
				break;

			case 4:
				if (coffe < 4 || sugar < 3 || milk < 2) {
					System.out.println("재료가 부족합니다. 관리자에게 문의하세요");
					sold3 = "(품절)";
				}
				coffe -= 4;
				sugar -= 3;
				milk -= 2;
				System.out.println("밀크커피 1잔 완료");
				cash += 100;
				System.out.println();
				f++;
				break;

			case 99:

				while (true) {
					System.out.println("id를 입력해주세요. >> ");
					id1 = scan.next(); // ★ nextline()은 안됌 -> 엔터키까지 값으로 인식함
					// next() -> 사이띄우기나 엔터키전까지만 끌고 옵니다, nextline() -> 무조건 끌고 옴 ★ ★ ★ ★ ★
					// ★ abc def = next는 abc , nextline은 abcdef 가져옴
					if (!(id.equals(id1))) {
						System.out.println("id가 일치하지 않습니다. ");
						continue;
					}

					break;
				}

				while (true) {

					System.out.println("password를 입력해주세요. >>");
					String pass_ch = scan.next();

					if (!(pass.equals(pass_ch))) {
						System.out.println("pass가 일치하지 않습니다");
						continue;
					}
					break;
				}

				System.out.println("관리자 모드");
				System.out.println("1. 재고량, 2. 판매량, 3. 재료충전");
				int gwan = scan.nextInt();

				switch (gwan) {

				case 1:
					System.out.println("현재 재고량");
					System.out.println("--------------------------");
					System.out.println("커피 재고 :" + coffe);
					System.out.println("우유 재고 : " + milk);
					System.out.println("설탕 재고 : " + sugar);
					break;

				case 2:

					System.out.println("총 판매량 및 가격");
					System.out.println("--------------------------");
					System.out.println("1. 블랙커피  =" + c + "잔");
					System.out.println("2. 흑당커피  =" + e + "잔");
					System.out.println("3. 카페라떼  =" + e + "잔");
					System.out.println("4. 밀크커피  =" + f + "잔");
					System.out.println("5. 총 가격  =" + cash + "원");
					break;

				case 3:
					System.out.println("충전할 재료를 선택해주세요");
					System.out.println("1. 커피, 2. 설탕, 3.우유");

					int refill = scan.nextInt();

					System.out.println("충전할 양을 적어주세요 ^^");

					int yang = scan.nextInt();

					switch (refill) {

					case 1:
						System.out.println("커피충전완료");
						coffe += yang;
						break;

					case 2:
						System.out.println("설탕충전완료");
						sugar += yang;
						break;

					case 3:
						System.out.println("우유충전완료");
						milk += yang;
						break;

					}

				} // 관리자모드

				break; // case 99

			case 0:
				System.out.println("시스템을 종료합니다");
				break loop1;

			}// switch

		} // while

	} // main

} // class
