
public class Ex0211_02 {

	public static void main(String[] args) {

		// 1. 변수선언
		// boolean, char, byte, short, int long float double
		// char '1' - '0' = 숫자로 치환 // 7 + " " = "7" -> 문자로 // Integer.parseInt("7")->숫자로
		// 배열활용
		// 조건문 - if // switch-조건: 숫자(실수x), 문자 //
		// 반복문 - for:구구단, while:무한반복

		int temp = 0;
		int random_int = 0;

		// 배열활용
		int[] ball = new int[45]; // [] 0~44 index

		// 반복문
		for (int i = 0; i < 45; i++) {
			ball[i] = i + 1;
		}

		// ball 섞기
		for (int i = 0; i < 200; i++) {

			random_int = (int) (Math.random() * 45); // 0~44

			temp = ball[0];
			ball[0] = ball[random_int];
			ball[random_int] = temp;

		}

		// 로또번호 6개
		System.out.print("로또번호 6개 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");// ★★★
		}

	}// main

}// class
