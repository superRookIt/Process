import java.util.Scanner;

public class Ex0205_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for���� ����ؼ� �հ�
		// 5�� ����� �����ؼ� ������ ���� ���ϴ� ���α׷�
		// �Է��� 2�� -> 2���� 40���� -> 5�� ��� ���� �հ�
		// �� ��� ���ϱ⸦ �ߴ����� �Բ� ���

		int i = 0; // ���ϴ� Ƚ��
		int sum = 0; // ���ϴ� �հ�
		int num1 = 0;
		int num2 = 0;

		Scanner scan = new Scanner(System.in);
		
		while(true) {  //num1�� num2���� Ŭ�� �ٽ� �Է��� �޴� �ݺ���
			
			System.out.println("���Ϸ��� �ϴ� ������ ���ڸ� 2�� �Է��ϼ��� (���� : 99)");
			num1 = scan.nextInt();
			
			if(num2==99) {
				break;
			}
			
			System.out.println("���Ϸ��� �ϴ� ������ ���ڸ� 1�� �� �Է��ϼ��� (99�� ������ ����)");
			num2 = scan.nextInt();
			
			if(num2==99) {
				break;
			}

			if (num1 > num2) { 
				System.out.println(num1 + "�� ���ں��� ū ���� �ٽ� �Է��Ͻÿ�");
			int temp = num2;
			num2 = num1; 
			num1 = temp; 
			}

			for (i = 1; i <= num2; i++) {
			              sum += i;
				}

			System.out.println(num1+"���� "+num2+"���� �� : "+sum); // for���� 1�� �������ϱ� 1�� ����
			System.out.println("�� �հ��? " + sum);
			
			
		}//while
		

	}// main

}// class
