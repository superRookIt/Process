import java.util.Scanner;

public class Ex0214_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		System.out.println("a 입력");
		a = scan.nextInt();
		System.out.println("b 입력");
		b = scan.nextInt();
		System.out.println("c 입력");
		c = scan.nextInt();

		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > c && b > a) {
			System.out.println(b);
		} else if (c > a && c > a) {
			System.out.println(c);
		} else {
			System.out.println("똑같은 수가 있음");
		}

		int result = 0;
		result = a > b && a > c ? a : (b > c && b > a) ? b : (c > b && c > a) ? c : 0;
		System.out.println(result);
		

		// 2개의 숫자를 입력 받는다고 했을때

	}// main

}// class
