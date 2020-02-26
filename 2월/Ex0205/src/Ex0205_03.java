import java.util.Scanner;

public class Ex0205_03 {
	public static void main(String[] args) {

		loop1: while (true) { // 전체 시스템

			Scanner scan = new Scanner(System.in);
			int select1 = 0; // 처음 선택 변수
			int num1 = 0;
			int num2 = 0;

			System.out.println("[사칙연산 프로그램]");
			System.out.println("원하는 번호를 입력하세요.(종료 :0)");
			System.out.println("-------------------");
			System.out.println("1) 더하기");
			System.out.println("2) 빼기");
			System.out.println("3) 곱하기");
			System.out.println("4) 나누기");

			select1 = scan.nextInt();

			if (select1 == 0) { // 0일때 종료
				System.out.println("종료합니다");
				break;
			}

			if (!(select1 >= 1 && select1 <= 4)) { // 1~4까지의 숫자만 입력가능
				System.out.println("1~4까지의 숫자를 입력하세요");
				continue;
			}

			switch (select1) { // 사칙연산 선택

			case 1:
				loop2: while (true) {
					System.out.println("1) 원하는 구구단 출력");
					System.out.println("2) 원하는 단부터 출력");
					System.out.println("원하는 번호를 입력하세요. (상위이동:0, 종료:99");
					num1 = scan.nextInt();

					if (num1 == 0) {
						System.out.println("상위로 이동합니다");
						continue loop1;
					} else if (num1 == 99) {
						break loop1;
					}

					switch (num1) {
					case 1:

						while (true) {
							System.out.println("원하는 단 숫자 입력. (상위이동:0, 종료 : 99)");
							num2 = scan.nextInt();
							if (num2 == 0) {
								continue loop2;
							} else if (num2 == 99) {
								break loop1;
							}

							for (int i = num2; i <= num2; i++) {
								for (int j = 1; j <= 9; j++) {
									System.out.println(i + " * " + j + "=" + i * j);
								}
							}

							break;

						} // while

					case 2:
						for (int i = num1; i <= num1; i++) {

							for (int j = 1; j <= 9; j++) {
								System.out.println(i + " * " + j + "=" + i * j);
							}

						}

						break;

					}// while loop2

				} // switch

			}

		}

//				for (int i=num1;i<=num1;i++) {
//				for (int j=1;j<=9;j++){
//					System.out.println(i+" * "+j+"="+i*j);
//				                        }	
//				            }
//				      }
//				

//				if(num1==0) {
//					continue loop1 ; // loop1 으로 빠져나감
//				} 
//				else if(num1==99) {
//				           break loop1;
//				}
//				
//				System.out.println("한개 더 입력하세요");
//				num2 = scan.nextInt();
//				System.out.println("두수의 합 : "+num1 + num2);
//				} // case1

//			case 2: while(true) {
//				System.out.println("뺴고 싶은 두 수를 입력하세요 (상위이동 : 0, 시스템종료 : 99)");
//				num1 = scan.nextInt();
//				if(num1==0) {
//					continue loop1 ; // loop1 으로 빠져나감
//				} 
//				else if(num1==99) {
//				           break loop1;
//				}
//				System.out.println("한개 더 입력하세요");
//				num2 = scan.nextInt();
//				System.out.println("두 수의 빼기 : "+(num1-num2));
//				} // case2
//				
//				} //switch 문
//	
//		} // while
//
//System.out.println("시스템을 종료합니다");
//	
//
	}// main
}// class
