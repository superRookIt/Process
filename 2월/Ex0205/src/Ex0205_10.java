import java.util.Scanner;

public class Ex0205_10 {
	public static void main(String[] args) {

		int select1 = 0; // ��ȣ���ú���
		double num1 = 0; // �Ǽ��� �޴� ����
		Scanner scan = new Scanner(System.in);

		loop1 : while (true) { // ��ü�ݺ�

			System.out.println("[ �Ҽ��� �ڸ��� ó�� ���α׷� ]");
			System.out.println("1)�ݿø�");
			System.out.println("2) �ø�");
			System.out.println("3) ����");
			System.out.println("4) �ݿø� �ڸ��� ����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���(����:99)");
			select1 = scan.nextInt();	
			
			if(select1==99) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			
			if(!(select1 >=1 && select1 <=4)) {
				System.out.println("1~4�� ������ ��ȣ�� �Է��ϼ���");
				continue;
			}
				
			switch (select1) {// ������ ���α׷� �ݺ�
			case 1:
                    while(true) {
                    	System.out.println("�Ǽ��� �Է����ּ���. (�����̵� :0, ����:99)");
                    	num1 =scan.nextDouble();
                    	
                    	if(num1==0) {
                    		continue loop1;
                    	}
                    	if(num1==99) {
                    	       break loop1;
                    	}
                    	System.out.println("�Ǽ� �ݿø� �� : "+Math.round(num1));
                    	
                    }
                  
			case 2:
				  while(true) {
                  	System.out.println("�Ǽ��� �Է����ּ���. (�����̵� :0, ����:99)");
                  	num1 =scan.nextDouble();
                  	
                  	if(num1==0) {
                  		continue loop1;
                  	}
                  	if(num1==99) {
                  	       break loop1;
                  	}
                  	System.out.println("�Ǽ� �ø� �� : "+Math.ceil(num1));
                  }
			
			case 3:
				  while(true) {
                  	System.out.println("�Ǽ��� �Է����ּ���. (�����̵� :0, ����:99)");
                  	num1 =scan.nextDouble();
                  	
                  	if(num1==0) {
                  		continue loop1;
                  	}
                  	
                  	if(num1==99) {
                  	       break loop1;
                  	}
                  	
                  	System.out.println("�Ǽ� ������ �� : "+Math.floor(num1)); // math.floor ������!
                  	
                  }
				
			case 4 :
				
				while(true) {
                  	System.out.println("�Ǽ��� �Է����ּ���. (�����̵� :0, ����:99)");
                  	num1 =scan.nextDouble();
                  	
                  	if(num1==0) {
                  		continue loop1;
                  	}
                  	
                  	if(num1==99) {
                  	       break loop1;
                  	}
                  	
                   System.out.println("�Ҽ� ��°�ڸ����� �ݿø� �Ұǰ���?");
                  	select1 = scan.nextInt(); 
                  	if(!(select1>=1 && select1<=3)) {
                  		System.out.println("�Ҽ��� ����¥�������� �ݿø� �� �� �ֽ��ϴ�.");
                  		continue;
                  	}
                  	
                  	switch (select1) {
                  	case 1:
                  		System.out.println("�Ҽ� ù°¥�� �ݿø� �� : "+Math.round(num1));
                  		break;
                  		
                  	case 2 :
                  		System.out.println("�Ҽ� ��°¥�� �ݿø� �� : "+Math.round(num1*10)/10.0);
                  		break;
                  	case 3 :
                  		System.out.println(("�Ҽ� ��°¥�� �ݿø� �� : "+Math.round(num1*100)/100.0));
                  		break;
                  	}
                  }

			}// switch
				
				
			}//while
		
		
		} // main
	} //class

