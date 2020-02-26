import java.util.Scanner;

public class Ex0214_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int a = 0;
		String b = "";
		int num = 0; // 문제번호
		int count = 0; // 횟수
		int ex = 0; // 문제풀이 변수

		String[][] quiz = new String[10][2];

		while (true) {

			System.out.println("---------");
			System.out.println("퀴즈프로그램");
			System.out.println("---------");
			System.out.println("1. 문제입력, 2. 문제풀이, 0. 프로그램종료");
			System.out.println("원하는 번호를 입력하세요");
			a = scan.nextInt();

			s_loop: switch (a) {

			case 1:
				System.out.println("문제입력을 선택하셨습니다.");

				// 10번 반복
				for (int i = 0; i < quiz.length; i++) {
					System.out.println("-------------------.");
					System.out.println("영어단어를 입력해주세요. >> (이전화면 : 99)");
					quiz[i][0] = scan.next();

					if (quiz[i][0].contentEquals("99")) {
						System.out.println("이전화면으로 이동합니다.");
						break s_loop;
					}

					System.out.println("한글 뜻을 입력해주세요. >> (이전화면 : 99)");
					quiz[i][1] = scan.next();

					if (quiz[i][1].contentEquals("99")) {
						System.out.println("이전화면으로 이동합니다.");
						break s_loop;
					}

					num++;
				} // for i 문

				if (num == 10) {
					System.out.println("10개가 모두 입력되었습니다. 더이상 입력할 수 없습니다");
					break;
				}

				break;

			case 2:

				System.out.println("문제풀이를 선택하셨습니다.");

				for (int i = ex; i < num; i++) {

					System.out.println(quiz[i][0] + "의 뜻을 입력해주세요 ^^ 99를 누르면 이전화면");
					b = scan.next();

					if (b.contentEquals("99")) {
						System.out.println("이전화면으로 이동합니다.");
						break;
					}

					if (b.equals(quiz[i][1])) {
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
						ex++;// 문제풀이 1을 추가! 2번째 문제가 출제

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
