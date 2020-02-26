import java.util.Scanner;

public class Ex0205_05 {
public static void main(String[] args) {
	//[넓이 계산]
	// 1)사각형 넓이 (가로, 세로)
	// 2) 삼각형 넓이 ([가로, 높이]/2)
	// 3)원 넓이 (파이=3.14)
	
	Scanner scan = new Scanner(System.in);
	int s = 0;
	int a = 0;
	int b = 0;
	
	
	loop1 : while(true) {
		
		System.out.println("[ 넓이 계산 ]");
		System.out.println("1) 사각형 넓이");
		System.out.println("2) 삼각형 넓이");
		System.out.println("3) 원 넓이");
	    System.out.println("원하는 번호를 입력하세요(종료:99)");
		s = scan.nextInt();
		
		if(s==99) {
			System.out.println("프로그램을 종료합니다");
			break;
		}
		
		switch (s) {
		
		case 1 : while(true) {
			System.out.println("사각형의 가로 길이를 입력하세요  (상위이동 :0, 종료:99)");
			a = scan.nextInt();
			
			if(a==0) {
          		continue loop1;
          	}
          	
          	if(a==99) {
          	       break loop1;
          	}
          	
			System.out.println("사각형의 세로 길이를 입력하세요");
			b = scan.nextInt();
			System.out.println("사각형의 넓이 = "+a*b);
		}
			
		case 2 :
			while(true) {
			System.out.println("삼각형의 가로 길이를 입력하세요  (상위이동 :0, 종료:99) ");
			a = scan.nextInt();
			if(a==0) {
          		continue loop1;
          	}
          	
          	if(a==99) {
          	       break loop1;
          	}
          	
			System.out.println("삼각형의 높이 길이를 입력하세요");
			b = scan.nextInt();
			System.out.println("삼각형의 넓이 = "+((a*b)/2));
			}
		case 3 :
		while(true) {
			System.out.println("원지름의 길이를 입력하세요  (상위이동 :0, 종료:99) ");
			a = scan.nextInt();
			
			if(a==0) {
          		continue loop1;
          	}
          	
          	if(a==99) {
          	       break loop1;
          	}
          	
			System.out.println("원지름의 넓이 = "+(double)(a*3.14));
		}
		}
		
	    
	}
	
}//main
}//class
