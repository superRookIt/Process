import java.util.Scanner;

public class Ex0214_03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 퀴즈프로그램
		// 1. 문제입력
		// 2. 문제풀이
		// 0. 이전화면
// 원하는 번호를 입력하세요.>>

		// 문제를 입력해서 영문,한글 5개를 입력받아서 문제를 풀어보세요

		Scanner scan = new Scanner(System.in);
		int a = 0;
		String b = "";
		String c = "";
		String d = "";
		int count = 0;

		String[][] quiz = new String[5][2];

		while (true) {

			System.out.println("---------");
			System.out.println("퀴즈프로그램");
			System.out.println("---------");
			System.out.println("1. 문제입력, 2. 문제풀이, 0. 프로그램종료");
			System.out.println("원하는 번호를 입력하세요");
			a = scan.nextInt();

			switch (a) {

			case 1:

				for (int i = 0; i < quiz.length; i++) { // quiz.length -> 5
					System.out.println("영어단어를 입력해주세요");
					quiz[i][0] = scan.next();
					System.out.println("한글 뜻을 입력해주세요");
					quiz[i][1] = scan.next();
				}

				break;

			case 2:
				for (int i = 0; i < quiz.length; i++) {

					System.out.println(quiz[i][0] + "의 뜻을 입력해주세요 ^^");
					d = scan.next();

					if (d.equals(quiz[i][1])) {
						System.out.println("정답입니다 축하해요");
					} else {

						if (count < 2) {
							System.out.println("오답입니다 ㅠㅠ ");
							count++;
							i--; // ★★★★★
							continue;
						}

						System.out.println("3번 입력에 실패했네요 정답은 바로 " + quiz[i][1] + "입니다 ^^"); // ★★★★★ else의 범위 안에
						count = 0; // ★★ ★★★else의 범위 안에 !

					} // else

				} // for i

				break;

			case 0:
				System.out.println("프로그램을 종료합니다.안녕~");
				break;

			} // switch

		} // while

	}// main

}// class
