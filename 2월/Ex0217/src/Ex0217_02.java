import java.util.Scanner;

public class Ex0217_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String a ="";
		char b=' ';
		
		System.out.println("�빮�ڳ� �ҹ��ڸ� �Է����ּ���");
		a=scan.next();
		
		b=a.charAt(0);
		
		if(b>='a' && b<='z') {
			System.out.println((char)(b-32));
		}else {
			System.out.println((char)(b+32));
		}
				
		
		

	}// main

}// class
