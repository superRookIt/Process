import java.util.Scanner;

public class Ex0205_06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		int count = 0; // �´� ���� üũ
		int num1 = (int)(Math.random()*10); //0~9 ���� ����
		int num2 = (int)(Math.random()*10); //0~9 ���� ����
		int num3 = (int)(Math.random()*10); //0~9 ���� ����
		int num4 = (int)(Math.random()*10); //0~9 ���� ����
		int num5 = (int)(Math.random()*10); //0~9 ���� ����
		
		// �Է°�
	    
		System.out.println("5�ڸ� ���ڸ� �Է��ϼ���");
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
		
		System.out.println("���� ��  : "+num1+num2+num3+num4+num5);
		System.out.println("�Է��� �� : "+input);
		System.out.println("���� �� �Է� : "+count);
		
		switch (count) {
		case 0:
			System.out.println("��� : 0��");
			break;
		case 1:
			System.out.println("��� : 1����");
			break;
		case 2:
			System.out.println("��� : 10����");
			break;
		case 3: case 4: case 5 :
			System.out.println("��� : 100����");
			break;
		
		}
		
		
		
		
		
		
		

	} // main

}// class
