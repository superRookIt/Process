import java.util.Scanner;

public class Ex0211_04 {

	public static void main(String[] args) {

		// 5680원 -> 500, 100, 50, 10

		Scanner scan = new Scanner(System.in);
		
		int[] money = new int[3];

		int s_money = 0;

		for (int i = 0; i < money.length; i++) { // ★★★money[2]의 money.length가 2임 실제로는 0,1,2 이렇게 인덱스는 3개인데 !!
			System.out.println((i + 1) + "번째 금액을 입력하세요");
			s_money = scan.nextInt();
			money[i] = s_money;

		}

		int[] coin = { 500, 100, 50, 10 };

		// 3번의 금액을 입력해서 3번의 결과를 출력하시오.
		// 배열을 사용해서

		System.out.println("-----------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "번째 입력한 금액은 " + money[i] + "원 입니다");
			for (int j = 0; j < 4; j++) {
				System.out.println(coin[j] + "원 = " + money[i] / coin[j]);
				money[i] %= coin[j]; // money = money % coin[i]; ★★★★★
			}

		}
	}// main

}// class
