import java.util.Scanner;

public class Ex0207_02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a, b;
		int i = 0;
		int win = 0 ;
		int lose =0;
		int draw =0;

		System.out.println("몇번 대결 할 건가요?");
		int c = scan.nextInt();

		for (i = 1; i <= c; i++) {

			System.out.println("가위 1, 바위 2, 보 3");
			a = scan.nextInt();
			b = (int) (Math.random() * 3 + 1);

			System.out.println("당신은 " + a + "입니다");
			System.out.println("컴퓨터는 " + b + "입니다");

			switch (a - b) {

			case 2:
			case -1:
				System.out.println("당신이 졌습니다");
				lose++;
				break;

			case 0:
				System.out.println("비겼습니다");
				draw++;
				break;

			case -2:
			case 1:
				System.out.println("당신이 이겼습니다");
				win++;

			}

		}
		
		double re = (double)win/c;
		System.out.println("게임 횟수 "+c);
		System.out.println("이긴 횟수"+win);
		System.out.println("패배한 횟수"+lose);
		System.out.println("비긴 횟수"+draw);
		System.out.println("승률"+re*100);

	} // main
} // class
