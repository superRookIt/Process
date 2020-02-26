import java.util.Scanner;

public class Ex0205_10 {
	public static void main(String[] args) {

		int select1 = 0; // 번호선택변수
		double num1 = 0; // 실수를 받는 변수
		Scanner scan = new Scanner(System.in);

		loop1 : while (true) { // 전체반복

			System.out.println("[ 소수점 자리수 처리 프로그램 ]");
			System.out.println("1)반올림");
			System.out.println("2) 올림");
			System.out.println("3) 버림");
			System.out.println("4) 반올림 자리수 선택");
			System.out.println("원하는 번호를 입력하세요(종료:99)");
			select1 = scan.nextInt();	
			
			if(select1==99) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
			if(!(select1 >=1 && select1 <=4)) {
				System.out.println("1~4번 사이의 번호를 입력하세요");
				continue;
			}
				
			switch (select1) {// 각각의 프로그램 반복
			case 1:
                    while(true) {
                    	System.out.println("실수를 입력해주세요. (상위이동 :0, 종료:99)");
                    	num1 =scan.nextDouble();
                    	
                    	if(num1==0) {
                    		continue loop1;
                    	}
                    	if(num1==99) {
                    	       break loop1;
                    	}
                    	System.out.println("실수 반올림 값 : "+Math.round(num1));
                    	
                    }
                  
			case 2:
				  while(true) {
                  	System.out.println("실수를 입력해주세요. (상위이동 :0, 종료:99)");
                  	num1 =scan.nextDouble();
                  	
                  	if(num1==0) {
                  		continue loop1;
                  	}
                  	if(num1==99) {
                  	       break loop1;
                  	}
                  	System.out.println("실수 올림 값 : "+Math.ceil(num1));
                  }
			
			case 3:
				  while(true) {
                  	System.out.println("실수를 입력해주세요. (상위이동 :0, 종료:99)");
                  	num1 =scan.nextDouble();
                  	
                  	if(num1==0) {
                  		continue loop1;
                  	}
                  	
                  	if(num1==99) {
                  	       break loop1;
                  	}
                  	
                  	System.out.println("실수 버림림 값 : "+Math.floor(num1)); // math.floor 버림값!
                  	
                  }
				
			case 4 :
				
				while(true) {
                  	System.out.println("실수를 입력해주세요. (상위이동 :0, 종료:99)");
                  	num1 =scan.nextDouble();
                  	
                  	if(num1==0) {
                  		continue loop1;
                  	}
                  	
                  	if(num1==99) {
                  	       break loop1;
                  	}
                  	
                   System.out.println("소수 몇째자리에서 반올림 할건가요?");
                  	select1 = scan.nextInt(); 
                  	if(!(select1>=1 && select1<=3)) {
                  		System.out.println("소수점 셋재짜리까지만 반올림 할 수 있습니다.");
                  		continue;
                  	}
                  	
                  	switch (select1) {
                  	case 1:
                  		System.out.println("소수 첫째짜리 반올림 값 : "+Math.round(num1));
                  		break;
                  		
                  	case 2 :
                  		System.out.println("소수 둘째짜리 반올림 값 : "+Math.round(num1*10)/10.0);
                  		break;
                  	case 3 :
                  		System.out.println(("소수 둘째짜리 반올림 값 : "+Math.round(num1*100)/100.0));
                  		break;
                  	}
                  }

			}// switch
				
				
			}//while
		
		
		} // main
	} //class

