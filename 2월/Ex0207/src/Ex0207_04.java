import java.util.Scanner;

public class Ex0207_04 {
	public static void main(String[] args) {

		// 로그인
		// 로그인이 5번이상 실패시 프로그램 종료
		// for 1~원하는 숫자까지 합을 구하는 프로그램

		String id = "aaaa";
		String pass = "12345";
		int fail = 1;
		int i = 0;
		int i1 = 0;
		int sum = 0;

		Scanner scan = new Scanner(System.in);

		loop1: while (true) {

			while (true) {

				if (fail > 5) {
					System.out.println("5번 입력에 실패하였습니다 ^^ 종료합니다");
					break loop1;
				}

				System.out.println("id를 입력해주세요");
				String id1 = scan.nextLine(); // next -> 사이띄우기나 엔터키전까지만 끌고 옵니다, nextline -> 무조건 끌고 옴
                                              // abc def = next는  abc , nextline은  abcdef 가져옴
				if (!(id.equals(id1))) {
					System.out.println("id가 일치하지 않습니다. "+fail+"회 오류");
					fail++;
					continue;
				}
				break;
			}

			while (true) {

				if (fail > 5) {
					System.out.println("5번 입력에 실패하였습니다 ^^ 종료합니다");
					break loop1;
				}
				
				System.out.println("password를 입력해주세요. >>");
				String pass_ch = scan.next();

				if (!(pass.equals(pass_ch))) {
					System.out.println("pass가 일치하지 않습니다"+fail+"회 오류");
					fail++;
					continue;
				}
				break;
			}

			System.out.println("1에서 몇까지 더할겁니까?");
			i = scan.nextInt();

			for (i1 = 1; i1 <= i; i1++) {
				sum += i1;
			}

			System.out.println("총 합은 바로 " + sum);
			System.out.printf("1에서 %d까지의 총합 : %d",i,sum);
			
			break;

		} // while

	}// main
}// class
