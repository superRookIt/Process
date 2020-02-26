import java.util.Scanner;

public class Ex0214_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("소수점을 입력하세요. 소수점 3자리 이상 입력");
		double a = scan.nextDouble();
		System.out.println(Math.round(a * 1000) / 1000.0); // ★★★★★
		// Math.round(a * 1000) / 1000.0;

		int share = 10 / 8; // 1
		int remain = 10 % 8; // 2

		
		// 'A'->65, 'a'->97 // 32차이
		while (true) {

			String in_str = "";
			char ch = ' '; // ★★★★★ char는 ''가 안되니까 ' '한칸 띄어주기!!

			System.out.println("문자를 입력하세요. >>");
			in_str = scan.next();
			ch = in_str.charAt(0);

			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
			} else {
				ch = (char) (ch + 32);
			}

			System.out.println(ch);

		} // while

	}// main

}// class
