import java.util.Scanner;

public class Ex0214_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "";
		char result = ' '; // �ڡڡڡڡ� char�� ''�� �ȵǴϱ� ' '��ĭ ����ֱ�!!
		Scanner scan = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���. >>");

		input = scan.next();

		if ('a' <= input.charAt(0) && 'z' >= input.charAt(0)) { // �ڡڡ�  a<=input<=z
			result = (char) (input.charAt(0) - 32); // �����ϴ� ���� int�� �� a->97 -32=65
		} else if ('A' <= input.charAt(0) && 'Z' >= input.charAt(0)) {
			result = (char) (input.charAt(0) + 32);
		} else {
			System.out.println("�߸� �Է� �߽��ϴ�.");
		}

		System.out.println(result);

	}// main

}// class
