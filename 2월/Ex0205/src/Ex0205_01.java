import java.util.Scanner;

public class Ex0205_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // scan �̸� �ٲ㵵 ��
		int dan = 0;
        int select = 0;
		Loop1 : while (true) { // �ܸ� ���, �ܺ��� ��� �����ϼ���.
			
			System.out.println("������ ������� ����");
			System.out.println("1 ) ���� �����ܸ� ���");
			System.out.println("2 ) ���� �����ܺ��� ���");
			System.out.println("���ϴ� �޴��� �����ϼ��� (���� : 0)");
			
			select = scan.nextInt();
			
			if(select == 0) {
				System.out.println("�ý����� �����մϴ�.");
				break Loop1;
			                }

			if(!(select == 1 && select <=2)) {
				System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
			    System.out.println();
			                                   }
			
			while(true) { // 1�� ����������
				System.out.println("�ܸ� ����ϴ� ���� �����߽��ϴ�.");
				System.out.println("���ϴ� ���� �Է��ϼ���.(�����̵� :0)");
				dan = scan.nextInt();
			
			if(dan==0) {
				System.out.println("������������ �̵��մϴ�");
				System.out.println("------------------");
				break;
			              }
			
			if (dan < 1 && dan > 9) {
				System.out.println("1���� 9������ ���ڸ� �Է��ϼ���");
				continue; // 1~9���� ���� �ƴϸ� �ٽ� while ����
			                          }
			
			
		
		int i = 0;
		int j = 0;

		for (i = dan; i <= dan; i++) {
			for (j = 1; j <= 9; j++) {
				if(j==5 || j==7) { // j%2==0, j%3==0 (2�� ����� 3�� ���)
					continue;
				}
				System.out.println(i + " * " + j + " = " + i * j); // [j�� �ݺ���] j�� 9�� ���� �ٽ� i�� �Ѿ
			} // j��
			System.out.println("----------"); // [i�� �ݺ��� ����]
               
		
		} // i��
		}  
		break;
		} // while 
        
	}

	} // main




