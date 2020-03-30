import java.util.Scanner;

public class Ex0207_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자판기 프로그램 <2020.02.07 프로그램 업데이트>

		String id = "aaa"; // 관리자 아이디
		String pass = "1234"; // 관리자 패스워드
		String check_id ="";
		String check_pass="";

		int coffe_amount = 100; // 커피재고량
		int sugar_amount = 50; // 설탕재고량
		int milk_amount = 70; // 우유재고량

		int total_sale = 0; // 총 판매량
		int total_price = 0; // 총 판매금액
		int order_num = 0; // 커피선택번호
		int input_price = 0; // 투입금액

		final int BLACK_PRICE = 100;
		final int SUGAR_PRICE = 300;
		final int LATTE_PRICE = 200;
		final int MILK_PRICE = 100;
		
		boolean black_check = false;
		boolean sugar_check = false;
		boolean latte_check = false;
		boolean milk_check = false;

		Scanner scan = new Scanner(System.in);

		loop1 : while (true) {

			System.out.println("---------------------------");
			System.out.println("        커피 자판기                           ");
			System.out.println("---------------------------");

			if (black_check == false) {
				System.out.println("1)블랙커피 - 100원");
			}
			System.out.println("2)흑당커피 - 300원");
			System.out.println("3)카페라떼 - 200원");
			System.out.println("4)밀크커피 - 100원");
			System.out.println("9)관리자");
			System.out.println("0)시스템 종료");
			System.out.println("---------------------------");
			System.out.println("마시고 싶은 커피 번호를 입력하세요. >>");
			order_num = scan.nextInt();

			switch (order_num) {

			case 1:
				if (!(coffe_amount > 10)) {
					System.out.println("커피가 부족합니다. 관리자에게 연락해주세요");
					black_check = !(black_check); // false-> true, true->false로
					continue;
				}

				coffe_amount -= 10; // 커피재고량 -10 감소
				total_sale++; // 총 판매량 1개 증가
				total_price += 100; // 총 판매금액 100원 증가
				input_price -= 100; // 투입금액에서 100 감소

				System.out.println("블랙커피 1잔이 나왔습니다. ^^");

				break;

			case 2:
				
				if (!(sugar_amount > 10)) {
					System.out.println("커피가 부족합니다. 관리자에게 연락해주세요");
					sugar_check = !(sugar_check); // false-> true, true->false로
					continue;
				}
				
				break;

			case 3:

				break;

			case 4:

				break;

			case 9:
				
				System.out.println("관리자 id를 입력하세요 ^^");
				check_id = scan.next();
				
				if(!(id.equals(check_id))) {
					System.out.println("id가 일치하지 않습니다 ^^ ");
					continue;
				}

				System.out.println("coffe_amount 량 :" + coffe_amount);
				System.out.println("sugar_amount 량 :" + sugar_amount);
				System.out.println("milk_amount 량 :" + milk_amount);
				System.out.println("total_sale 량 :" + total_sale);
				System.out.println("total_price 금액 :" + total_price);

				break;

			case 0:
				System.out.println("시스템을 종료합니다.");
				break;

			default:
				System.out.println("시스템 에러입니다 ^^");
				break;
				
				

			}// switch

			
			
			
		} // while loop1

	}// main

}// class
