import java.util.Scanner;

public class Ex0210_01 {
	public static void main(String[] args) {

		// int[] score = new int[5]; // ★ 5개의 변수가 만들어짐.

		// 가위바위보 게임을 한번 만들어보세요

		int select = 0;
		int user = 0; // 자신이 선택한 가위바위보
		int com = 0; // 컴퓨터가 선택한 가위바위보
		int count1 = 0; // 게임횟수
		int win = 0;
		int lose = 0;
		int draw = 0;
		int count = 0;

		String[] confirm = new String[10]; // 승패확인

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("-------------------------");
			System.out.println("가위바위보게임 / 승패확인프로그램");
			System.out.println("------------------------");
			System.out.println("1. 가위바위보게임 / 2. 승패확인프로그램");
			System.out.println("번호를 선택해주세요. (종료 :0)>>");

			select = scan.nextInt();
			if (select == 0) {
				break;
			}

			switch (select) {

			case 1:
				System.out.println("가위바위보 start");

				System.out.println("반복 횟수를 입력하세요 ");
				count = scan.nextInt();

				for (int i = 1; i <= count; i++) {
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
						confirm[i] = "승리";
						break;
					case 0:
						System.out.println("무 승 부");
						draw++;
						confirm[i] = "무승부";
						break;

					case -1:
					case 2:
						System.out.println("컴퓨터가 승리");
						lose++;
						confirm[i] = "패배";
						break;

					}
				}
			
				
				break;

			case 2:

				System.out.println("승패확인");
				for(int i =0; i<10; i++) {
					System.out.println((i+1)+"번쨰 승패는?"+confirm[i]);
					
				}
				
				break;

			}
			
			System.out.println("게임 횟수 : " + count);
			System.out.println("승리 횟수 : " + win);
			System.out.println("무승부 횟수 : " + draw);
			System.out.println("패배 횟수 : " + lose);
			System.out.printf("승       률 : %.1f %n", (double) win / count * 100);
			
		} // while

		

		// double rate = (double) win / num; // int와 int를 나누면 무조건 int가 되니까 한쪽을 double이나
		// float로 바꿔주면 됨
		
		

//		int[] score = new int[100];
//		int[] sum = new int[100];
//
//		for (int i = 0; i < 100; i++) {
//			score[i] = (i + 1);
//			if(i==0) {
//				sum[i] = 0+ score[i];
//			}else {
//				sum[i]=sum[i-1] + score[i];
//				System.out.println(score[i]+"번까지의 합 : "+sum[i]);
//			}
//		}
		// 1 = 0 + 1
		// 3 = 1 +2
//		
//		int[] total;
//		total = new int[5];
//		total[0]=5;
//		
//		for(int i = 0; i<100; i++) {
//			score[i] = (i+1);
//		}
//				
//		
//		int[] score100 = new int[5];
//		score1[0]=100;
//		score1[1]=90;
//		score1[2]=80;
//		score1[3]=70;
//		score1[4]=60;
//		
//		int[] score2 = 	{100,90,80,70,60};
//		
//		int[] score3 ;
//		score3 = new int[] {100,90,80,70,60};
//			
//				
//		
//		
// int score1 = (int)(Math.random()*6+1);

	} // main

}// class
