import java.util.Scanner;

public class Ex0205_05 {
public static void main(String[] args) {
	//[���� ���]
	// 1)�簢�� ���� (����, ����)
	// 2) �ﰢ�� ���� ([����, ����]/2)
	// 3)�� ���� (����=3.14)
	
	Scanner scan = new Scanner(System.in);
	int s = 0;
	int a = 0;
	int b = 0;
	
	
	loop1 : while(true) {
		
		System.out.println("[ ���� ��� ]");
		System.out.println("1) �簢�� ����");
		System.out.println("2) �ﰢ�� ����");
		System.out.println("3) �� ����");
	    System.out.println("���ϴ� ��ȣ�� �Է��ϼ���(����:99)");
		s = scan.nextInt();
		
		if(s==99) {
			System.out.println("���α׷��� �����մϴ�");
			break;
		}
		
		switch (s) {
		
		case 1 : while(true) {
			System.out.println("�簢���� ���� ���̸� �Է��ϼ���  (�����̵� :0, ����:99)");
			a = scan.nextInt();
			
			if(a==0) {
          		continue loop1;
          	}
          	
          	if(a==99) {
          	       break loop1;
          	}
          	
			System.out.println("�簢���� ���� ���̸� �Է��ϼ���");
			b = scan.nextInt();
			System.out.println("�簢���� ���� = "+a*b);
		}
			
		case 2 :
			while(true) {
			System.out.println("�ﰢ���� ���� ���̸� �Է��ϼ���  (�����̵� :0, ����:99) ");
			a = scan.nextInt();
			if(a==0) {
          		continue loop1;
          	}
          	
          	if(a==99) {
          	       break loop1;
          	}
          	
			System.out.println("�ﰢ���� ���� ���̸� �Է��ϼ���");
			b = scan.nextInt();
			System.out.println("�ﰢ���� ���� = "+((a*b)/2));
			}
		case 3 :
		while(true) {
			System.out.println("�������� ���̸� �Է��ϼ���  (�����̵� :0, ����:99) ");
			a = scan.nextInt();
			
			if(a==0) {
          		continue loop1;
          	}
          	
          	if(a==99) {
          	       break loop1;
          	}
          	
			System.out.println("�������� ���� = "+(double)(a*3.14));
		}
		}
		
	    
	}
	
}//main
}//class
