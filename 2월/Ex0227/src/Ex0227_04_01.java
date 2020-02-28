import java.util.Scanner;

public class Ex0227_04_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int se = 0;
		Ca c = null;
		Fire f = new Fire();
		Ambul a = new Ambul();
		Tru t = new Tru();

		while (true) {
			System.out.println("변신 카 프로그램");
			System.out.println("1. 소방차  2. 앰뷸런스  3. 트럭 ");
			System.out.println("4. 기본차  5. 원래대로  6. 종료 ");
			System.out.println("원하는 번호를 입력하세요 >>");
			se = scan.nextInt();

			switch (se) {
			case 6:
				System.out.println("종료합니다");
				break;

			case 1:

				System.out.println("소방차 생성");
				f.water();
				c = f;
				break;

			case 2:

				System.out.println("앰뷸런스 생성");
				a.siren();
				c = a;
				break;

			case 3:

				System.out.println("트럭 생성");
				t.stuff();
				c = t;
				break;

			case 4:

				System.out.println("기본차로 변신 ");
				c.drive();
				break;

			case 5:
				// ★★★★★(중요!!)
				System.out.println("원래 생성된 차?");
				if (c instanceof Fire) {
					System.out.println("소방차로 다시 변신");
					f = (Fire) c;
					f.water();
				} else if (c instanceof Ambul) {
					System.out.println("앰뷸런스로 다시 변신");
					a = (Ambul) c;
					a.siren();
				} else if (c instanceof Tru) {
					System.out.println("트럭으로 다시 변신");
					t = (Tru) c;
					t.stuff();
				}

			}// switch

		} // while

	}// class

}// main

class Ca {

	void drive() {
		System.out.println("엑셀을 밟으면 출발");
	}

}

class Fire extends Ca {
	void water() {
		System.out.println("물이 발사");

	}
}

class Ambul extends Ca {
	void siren() {
		System.out.println("사이렌이 울립니다");
	}
}

class Tru extends Ca {
	void stuff() {
		System.out.println("물건을 옮깁니다");
	}
}
