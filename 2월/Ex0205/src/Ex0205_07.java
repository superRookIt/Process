import java.util.Scanner;

public class Ex0205_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for문을 사용해서 합계
		// 5의 배수만 제외해서 숫자의 합을 구하는 프로그램
		// 입력은 2개 -> 2에서 40까지 -> 5의 배수 제외 합계
		// 총 몇번 더하기를 했는지도 함께 출력

		int i = 0; // 더하는 횟수
		int sum = 0; // 더하는 합계
		int num1 = 0;
		int num2 = 0;

		Scanner scan = new Scanner(System.in);
		
		while(true) {  //num1이 num2보다 클때 다시 입력을 받는 반복문
			
			System.out.println("더하려고 하는 구간의 숫자를 2개 입력하세요 (종료 : 99)");
			num1 = scan.nextInt();
			
			if(num2==99) {
				break;
			}
			
			System.out.println("더하려고 하는 구간의 숫자를 1개 더 입력하세요 (99를 누르면 종료)");
			num2 = scan.nextInt();
			
			if(num2==99) {
				break;
			}

			if (num1 > num2) { 
				System.out.println(num1 + "의 숫자보다 큰 수를 다시 입력하시오");
			int temp = num2;
			num2 = num1; 
			num1 = temp; 
			}

			for (i = 1; i <= num2; i++) {
			              sum += i;
				}

			System.out.println(num1+"부터 "+num2+"까지 합 : "+sum); // for문은 1이 더해지니까 1을 빼줌
			System.out.println("총 합계는? " + sum);
			
			
		}//while
		

	}// main

}// class
