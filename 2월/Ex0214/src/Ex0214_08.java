import java.util.Scanner;

public class Ex0214_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		System.out.println("a �Է�");
		a = scan.nextInt();
		System.out.println("b �Է�");
		b = scan.nextInt();
		System.out.println("c �Է�");
		c = scan.nextInt();

		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > c && b > a) {
			System.out.println(b);
		} else if (c > a && c > a) {
			System.out.println(c);
		} else {
			System.out.println("�Ȱ��� ���� ����");
		}

		int result = 0;
		result = a > b && a > c ? a : (b > c && b > a) ? b : (c > b && c > a) ? c : 0;
		System.out.println(result);
		

		// 2���� ���ڸ� �Է� �޴´ٰ� ������

	}// main

}// class
