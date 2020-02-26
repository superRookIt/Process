import java.util.Scanner;

public class Ex0205_06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		int count = 0; // 맞는 개수 체크
		int num1 = (int)(Math.random()*10); //0~9 랜덤 생성
		int num2 = (int)(Math.random()*10); //0~9 랜덤 생성
		int num3 = (int)(Math.random()*10); //0~9 랜덤 생성
		int num4 = (int)(Math.random()*10); //0~9 랜덤 생성
		int num5 = (int)(Math.random()*10); //0~9 랜덤 생성
		
		// 입력값
	    
		System.out.println("5자리 숫자를 입력하세요");
		String input = scan.nextLine();
		
		if(num1==(input.charAt(0)-'0')) {
			count++;
		}
		if(num2==(input.charAt(1)-'0')) {
			count++;
		}
		if(num3==(input.charAt(2)-'0')) {
			count++;
		}
		if(num4==(input.charAt(3)-'0')) {
			count++;
		}
		if(num5==(input.charAt(4)-'0')) {
			count++;
		}
		
		System.out.println("랜덤 수  : "+num1+num2+num3+num4+num5);
		System.out.println("입력한 값 : "+input);
		System.out.println("같은 수 입력 : "+count);
		
		switch (count) {
		case 0:
			System.out.println("상금 : 0원");
			break;
		case 1:
			System.out.println("상금 : 1만원");
			break;
		case 2:
			System.out.println("상금 : 10만원");
			break;
		case 3: case 4: case 5 :
			System.out.println("상금 : 100만원");
			break;
		
		}
		
		
		
		
		
		
		

	} // main

}// class
