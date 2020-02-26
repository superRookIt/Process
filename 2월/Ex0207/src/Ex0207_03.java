import java.util.Scanner;

public class Ex0207_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 가위 1 바위 2 보 3

		String id = "aaa";
		String pass = "1234";
		int user = 0; // 자신이 선택한 가위바위보
		int com = 0; // 컴퓨터가 선택한 가위바위보
		int count1 = 0; // 게임횟수
		int win = 0;
		int lose = 0;
		int draw = 0;
		int c = 0;
		int i = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("반복 횟수를 입력하세요 ");
		int count = scan.nextInt();

		loop1:
		while (true) {

			System.out.println("게임하기 전에 login 해주세요");
			System.out.println("먼저 id를 입력해주세요. >>");


				String id_ch = scan.next();
				if (!(id.equals(id_ch))) {
					System.out.println("id가 일치하지 않습니다");
					continue;
				}

				System.out.println("password를 입력해주세요. >>");
				String pass_ch = scan.next();
				if (!(pass.equals(pass_ch))) {
					System.out.println("pass가 일치하지 않습니다");
					continue;
				}
			

			for (i = 1; i <= count; i++) {

				System.out.println("가위 1, 바위 2, 보 3 중에 하나를 선택하세요");
				user = scan.nextInt();

				if (user < 1 || user > 3) {
					System.out.println("당신 숫자를 잘못 넣었습니다(1-3까지만)");
					i--; // ★★★★★
					continue;
				}

				com = (int) (Math.random() * 3) + 1;
				System.out.println(i + "번째 판 승자는?");
				// 1-3 = -2(승자) 1-1 =0 (무승부) 1-2 -1(패배)
				// 2-1 = 1(승자) 2-2 =0 (무승부) 2-3 -1(패배)
				// 3-2 = 1(승자) 3-3 =0 (무승부) 3-1 2(패배)

				switch (user - com) {
				case -2:
				case 1:
					System.out.println("사용자가 승리");
					win++;
					break loop1;
				case 0:
					System.out.println("무 승 부");
					draw++;
					break loop1;
				case -1:
				case 2:
					System.out.println("컴퓨터가 승리");
					lose++;
					break loop1;

				}// switch

			} // for

		} // while

		System.out.println("게임 횟수 : " + count);
		System.out.println("승리 횟수 : " + win);
		System.out.println("무승부 횟수 : " + draw);
		System.out.println("패배 횟수 : " + lose);
		System.out.printf("승       률 : %.1f %n", (double) win / count * 100); //--> 100.0하면 0이 나옴 , win이나 count를 float이나 double로 바꿔주기.

	} // main
} // class
