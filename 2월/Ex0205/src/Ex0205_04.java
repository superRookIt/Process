import java.util.Scanner;

public class Ex0205_04 {
public static void main(String[] args) {
	
	// 1)�ݿø�
	// 2)�ø�
	// 3)����
	// 4)�ݿø� �ڸ��� ���� (�ݿø��� �ڸ��� �Է� , ��°�ڸ����� �ݿø� ����)
	// 0�� ������ ������ 99�� ������ ����
	
	// ���ϴ� ��ȣ�� �Է��ϼ���.
	
	//1�� ���ý�
	//�Ҽ��� ����� �Ǽ��� �Է��ϼ���.
	//3.1454 -> 3, 4.523 -> 5 (�ݿø�)
	
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
		
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���. (99�� ������ ����)");
		System.out.println("1)�ݿø�");
		System.out.println("2)�ø�");
		System.out.println("3)����");
		System.out.println("4)�ݿø� ����");
		select = scan.nextInt();
		
		if(select==99) {
			break;
		}
		
		if(select == 1) {
			System.out.println("���ڸ� �Է��ϼ���");
			num=scan.nextDouble();
			num1 = (int)(Math.round(num));		
			System.out.println(num1);
			break;
		}
		
		if(select==2) {
			System.out.println("���ڸ� �Է��ϼ���");
			num=scan.nextDouble();
			num1 = (int)(Math.ceil(num));
			System.out.println(num1);
			break;
		}
		
		if(select==3) {
			System.out.println("���ڸ� �Է��ϼ���");
			num=scan.nextDouble();
			num1 = (int) num;
			System.out.println(num1);
			break;
		}
		
		if(select==4) {
			System.out.println("�ݿø��� �ڸ����� �Է��ϼ���");
		    num2=scan.nextInt();
		    System.out.println("�ݿø��� ���ڸ� �Է��ϼ���");
		    num=scan.nextDouble();
		    num1 = (Math.round(num));
		    System.out.println(num1);
		    break;
		    		
		}
	
		
	}//while��
	





	
	
	
	
}
}
