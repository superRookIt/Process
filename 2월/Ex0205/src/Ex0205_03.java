import java.util.Scanner;

public class Ex0205_03 {
	public static void main(String[] args) {

		loop1: while (true) { // ��ü �ý���

			Scanner scan = new Scanner(System.in);
			int select1 = 0; // ó�� ���� ����
			int num1 = 0;
			int num2 = 0;

			System.out.println("[��Ģ���� ���α׷�]");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.(���� :0)");
			System.out.println("-------------------");
			System.out.println("1) ���ϱ�");
			System.out.println("2) ����");
			System.out.println("3) ���ϱ�");
			System.out.println("4) ������");

			select1 = scan.nextInt();

			if (select1 == 0) { // 0�϶� ����
				System.out.println("�����մϴ�");
				break;
			}

			if (!(select1 >= 1 && select1 <= 4)) { // 1~4������ ���ڸ� �Է°���
				System.out.println("1~4������ ���ڸ� �Է��ϼ���");
				continue;
			}

			switch (select1) { // ��Ģ���� ����

			case 1:
				loop2: while (true) {
					System.out.println("1) ���ϴ� ������ ���");
					System.out.println("2) ���ϴ� �ܺ��� ���");
					System.out.println("���ϴ� ��ȣ�� �Է��ϼ���. (�����̵�:0, ����:99");
					num1 = scan.nextInt();

					if (num1 == 0) {
						System.out.println("������ �̵��մϴ�");
						continue loop1;
					} else if (num1 == 99) {
						break loop1;
					}

					switch (num1) {
					case 1:

						while (true) {
							System.out.println("���ϴ� �� ���� �Է�. (�����̵�:0, ���� : 99)");
							num2 = scan.nextInt();
							if (num2 == 0) {
								continue loop2;
							} else if (num2 == 99) {
								break loop1;
							}

							for (int i = num2; i <= num2; i++) {
								for (int j = 1; j <= 9; j++) {
									System.out.println(i + " * " + j + "=" + i * j);
								}
							}

							break;

						} // while

					case 2:
						for (int i = num1; i <= num1; i++) {

							for (int j = 1; j <= 9; j++) {
								System.out.println(i + " * " + j + "=" + i * j);
							}

						}

						break;

					}// while loop2

				} // switch

			}

		}

//				for (int i=num1;i<=num1;i++) {
//				for (int j=1;j<=9;j++){
//					System.out.println(i+" * "+j+"="+i*j);
//				                        }	
//				            }
//				      }
//				

//				if(num1==0) {
//					continue loop1 ; // loop1 ���� ��������
//				} 
//				else if(num1==99) {
//				           break loop1;
//				}
//				
//				System.out.println("�Ѱ� �� �Է��ϼ���");
//				num2 = scan.nextInt();
//				System.out.println("�μ��� �� : "+num1 + num2);
//				} // case1

//			case 2: while(true) {
//				System.out.println("���� ���� �� ���� �Է��ϼ��� (�����̵� : 0, �ý������� : 99)");
//				num1 = scan.nextInt();
//				if(num1==0) {
//					continue loop1 ; // loop1 ���� ��������
//				} 
//				else if(num1==99) {
//				           break loop1;
//				}
//				System.out.println("�Ѱ� �� �Է��ϼ���");
//				num2 = scan.nextInt();
//				System.out.println("�� ���� ���� : "+(num1-num2));
//				} // case2
//				
//				} //switch ��
//	
//		} // while
//
//System.out.println("�ý����� �����մϴ�");
//	
//
	}// main
}// class
