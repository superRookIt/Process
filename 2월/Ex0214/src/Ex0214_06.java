import java.util.Scanner;

public class Ex0214_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Ҽ����� �Է��ϼ���. �Ҽ��� 3�ڸ� �̻� �Է�");
		double a = scan.nextDouble();
		System.out.println(Math.round(a * 1000) / 1000.0); // �ڡڡڡڡ�
		// Math.round(a * 1000) / 1000.0;

		int share = 10 / 8; // 1
		int remain = 10 % 8; // 2

		
		// 'A'->65, 'a'->97 // 32����
		while (true) {

			String in_str = "";
			char ch = ' '; // �ڡڡڡڡ� char�� ''�� �ȵǴϱ� ' '��ĭ ����ֱ�!!

			System.out.println("���ڸ� �Է��ϼ���. >>");
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
