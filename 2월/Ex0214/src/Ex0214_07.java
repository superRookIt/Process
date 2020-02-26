import java.util.Scanner;

public class Ex0214_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "";
		char result = ' '; // ★★★★★ char는 ''가 안되니까 ' '한칸 띄어주기!!
		Scanner scan = new Scanner(System.in);

		System.out.println("문자를 입력하세요. >>");

		input = scan.next();

		if ('a' <= input.charAt(0) && 'z' >= input.charAt(0)) { // ★★★  a<=input<=z
			result = (char) (input.charAt(0) - 32); // 빼기하는 순간 int가 됨 a->97 -32=65
		} else if ('A' <= input.charAt(0) && 'Z' >= input.charAt(0)) {
			result = (char) (input.charAt(0) + 32);
		} else {
			System.out.println("잘못 입력 했습니다.");
		}

		System.out.println(result);

	}// main

}// class
