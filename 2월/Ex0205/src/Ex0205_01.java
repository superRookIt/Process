import java.util.Scanner;

public class Ex0205_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // scan 이름 바꿔도 됌
		int dan = 0;
        int select = 0;
		Loop1 : while (true) { // 단만 출력, 단부터 출력 선택하세요.
			
			System.out.println("구구단 출력형태 선택");
			System.out.println("1 ) 선택 구구단만 출력");
			System.out.println("2 ) 선택 구구단부터 출력");
			System.out.println("원하는 메뉴를 선택하세요 (종료 : 0)");
			
			select = scan.nextInt();
			
			if(select == 0) {
				System.out.println("시스템을 종료합니다.");
				break Loop1;
			                }

			if(!(select == 1 && select <=2)) {
				System.out.println("숫자를 잘못 입력하였습니다. 다시 입력하세요");
			    System.out.println();
			                                   }
			
			while(true) { // 1번 선택했을때
				System.out.println("단만 출력하는 것을 선택했습니다.");
				System.out.println("원하는 단을 입력하세요.(상위이동 :0)");
				dan = scan.nextInt();
			
			if(dan==0) {
				System.out.println("선택페이지로 이동합니다");
				System.out.println("------------------");
				break;
			              }
			
			if (dan < 1 && dan > 9) {
				System.out.println("1에서 9까지의 숫자를 입력하세요");
				continue; // 1~9까지 수가 아니면 다시 while 실행
			                          }
			
			
		
		int i = 0;
		int j = 0;

		for (i = dan; i <= dan; i++) {
			for (j = 1; j <= 9; j++) {
				if(j==5 || j==7) { // j%2==0, j%3==0 (2의 배수나 3의 배수)
					continue;
				}
				System.out.println(i + " * " + j + " = " + i * j); // [j의 반복문] j는 9번 돌고 다시 i로 넘어감
			} // j문
			System.out.println("----------"); // [i의 반복문 범위]
               
		
		} // i문
		}  
		break;
		} // while 
        
	}

	} // main




