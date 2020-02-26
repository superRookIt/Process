import java.util.Scanner;

public class Ex0205_04 {
public static void main(String[] args) {
	
	// 1)반올림
	// 2)올림
	// 3)버림
	// 4)반올림 자리수 선택 (반올림할 자리수 입력 , 둘째자리에서 반올림 원함)
	// 0번 누르면 상위로 99번 누르면 종료
	
	// 원하는 번호를 입력하세요.
	
	//1번 선택시
	//소수점 계산할 실수를 입력하세요.
	//3.1454 -> 3, 4.523 -> 5 (반올림)
	
	//while
	//switch
	
	double s = Math.round(2.44);
	
	System.out.println(s);
	
	int select = 0;
	double num= 0;
	double num1=0;
	int num2=0;
	Scanner scan = new Scanner(System.in);

	
	while(true) {
		
		System.out.println("원하는 번호를 입력하세요. (99를 누르면 종료)");
		System.out.println("1)반올림");
		System.out.println("2)올림");
		System.out.println("3)버림");
		System.out.println("4)반올림 선택");
		select = scan.nextInt();
		
		if(select==99) {
			break;
		}
		
		if(select == 1) {
			System.out.println("숫자를 입력하세요");
			num=scan.nextDouble();
			num1 = (int)(Math.round(num));		
			System.out.println(num1);
			break;
		}
		
		if(select==2) {
			System.out.println("숫자를 입력하세요");
			num=scan.nextDouble();
			num1 = (int)(Math.ceil(num));
			System.out.println(num1);
			break;
		}
		
		if(select==3) {
			System.out.println("숫자를 입력하세요");
			num=scan.nextDouble();
			num1 = (int) num;
			System.out.println(num1);
			break;
		}
		
		if(select==4) {
			System.out.println("반올림할 자리수를 입력하세요");
		    num2=scan.nextInt();
		    System.out.println("반올림할 숫자를 입력하세요");
		    num=scan.nextDouble();
		    num1 = (Math.round(num));
		    System.out.println(num1);
		    break;
		    		
		}
	
		
	}//while문
	





	
	
	
	
}
}
