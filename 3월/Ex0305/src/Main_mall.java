import java.util.*;

public class Main_mall {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Login l = new Login();
		Mall_excute ex = new Mall_excute();

		ArrayList<Member> m = new ArrayList<Member>();

		ArrayList<Product> gm = new ArrayList<Product>();

		HashMap map = new HashMap();

		while (true) {
			System.out.println("-------------------");
			System.out.println("1)회원가입 2)회원정보 보기 3)회원검색 4)로그인 5)로그아웃");
			System.out.println("6)상품구매 7)상품구매목록 0)종료");
			int num = scan.nextInt();

			switch (num) {

			case 0:

				System.out.println("종료합니다. ");
				break;

			case 1:

				l.join(m, map);

				break;

			case 2:

				l.print(m);

				break;

			case 3:

				l.search(m);
				break;

			case 4:

				l.log(m, map);
				break;

			case 5:

				l.logout(map);

				break;

			case 6:

				System.out.println("구매할 상품을 선택해주세요");
				System.out.println("1)tv, 2)냉장고, 3)세탁기 ");
				int num1 = scan.nextInt();

				switch (num1) {

				case 1:

					ex.buy(m, new Tv(), gm);

					break;

				case 2:

					ex.buy(m, new Ref(), gm);
					break;

				case 3:

					ex.buy(m, new Wash(), gm);
					break;

				}

				break;

			case 7:

				ex.summary(m, gm);

				break;

			}// switch

		} // while

	}// main

}// class
