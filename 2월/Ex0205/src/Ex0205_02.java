import java.util.Scanner;

public class Ex0205_02 {
	public static void main(String[] args) {
		
		// [두수의 사칙연산 프로그램]
		// 1)더하기
		// 2)빼기
		// 3)곱하기
		// 4)나누기
		// 원하는 숫자를 입력하세요 (종료.0)
		// 1을 선택하게 되면 두 수를 입력하세요 (상위로 이동:0)
		//    1,2 -> 두 수를 더한 값 :3 (1~9까지만 들어올 수 있음)
		
		Scanner scan = new Scanner(System.in);
		
         int dan = 0;
         int select1 = 0;
         int select2 = 0;
         int select3 = 0;
         int i = 0;
         int j = 0;
		
		while(true){ // 시스템 전체를 두고 하는 것
		System.out.println("원하는 숫자 두개를 입력하세요");
		select1 = scan.nextInt();
		select2 = scan.nextInt();
		System.out.println("1) 더하기");
		System.out.println("2) 빼기");
		System.out.println("3) 곱하기");
		System.out.println("4) 나누기");
		System.out.println("5) 원하는 단 출력");
		System.out.println("0) 종료");
		dan = scan.nextInt();
		
		
		if(dan==0) {
			System.out.println("시스템을 종료합니다");
			break;
		     }
			
		
		if (dan>4 && dan<0) {
			System.out.println("다시 입력해주세요");
			System.out.println();
		         }
	     if (dan ==1) {
	    	System.out.println("더하기를 하겠습니다");
	    	System.out.println(select1+select2);
	    	break;
	     }
		     if (dan==2) {
		    	 System.out.println("빼기를 하겠습니다");
		         System.out.println(select1-select2);
		         break;
		     }
		     
		     if (dan ==3) {
		    	 System.out.println("곱하기를 하겠습니다");
		    	 System.out.println(select1*select2);
		    	 break;
		     }
		     
		     if(dan==4) {
		      System.out.println("나누기를 하겠습니다");
	           System.out.println(select1/select2);
	           break;
		     }
		    	 
		     if(dan==5) {
		    	 System.out.println("단을 출력합니다");
		    	 select3 = scan.nextInt();
		    	 for(i = select3; i==select3; i++) {
		    		 for(j=1; j<=9; j++)
		    		 System.out.println(select3+" * " +j+" = "+select3*j);}
		    	 break;
		    	 }
		    	 
		     
		} //while 문
		
		
	} // main

} // class
