import java.util.Scanner;

public class Ex0212_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 16������ 2���� ��ȯ
		
		//���� �ҹ��� �޾Ƽ� �����빮�� ��ȯ�ϴ� ���α׷��� ��������
		
		Scanner scan = new Scanner(System.in);
		
			String in_str = "";
			String result = "";
			String result1 ="";
			char ch = ' '; // �ڡ�
			int len = 0;

		while (true) {

			result="";
			System.out.println("���ڸ� �Է��ϼ���. >>");
			in_str = scan.next();
			
			for (int i = 0; i < in_str.length(); i++) {
				ch = in_str.charAt(i);

				if (ch >= 'a' && ch <= 'z') {
					result = result + (char) (ch - 32) + ""; // char->string(���ڿ�)�� �ٲ�
				} else {
					result = result + (char) (ch + 32) + "";
				}
			}

			System.out.println("����� : " + result); //
			
		} //while
			
			
//			result = in_str.toUpperCase(); // �ڡڡڡڡ� ��� �� �빮�ڷ� ġȯ
//			result1 = in_str.toLowerCase(); // �ڡڡڡڡ� ��� �� �ҹ��ڷ� ġȯ
//			len = in_str.length();
//		    ch = in_str.charAt(0);
//
//			if (ch >= 'a' && ch <= 'z') {
//				ch = (char) (ch - 32);
//			} else {
//				ch = (char) (ch + 32);
//			}

//			System.out.println("�빮�� "+result);
//			System.out.println("�ҹ���"+result1);
//			System.out.println("���ڿ� ���� : "+len);
//		
		

//		char[] hex = { '7', 'c', 'a', 'f', 'e' }; // a=10, b=11 ~~
//		String result = "";
//
//		String[] binary = { 
//				"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", 
//				"1000", "1001", "1010","1011", "1100", "1101", "1101", "1111" }; // 0~15
//
//		for (int i = 0; i < hex.length; i++) {
//			if (hex[i] > '0' && hex[i] <= '9') {
//				result += binary[hex[i] - '0']+" "; //result = result + binary
//			}
//			else {
//				if(hex[i]>='A' && hex[i]<='Z') {
//				hex[i] = (char)(hex[i]+32);	// A->a, F->f
//				
//				//if(hex[i]>='a' && hex[i]<='a') {
//				//hex[i] = (char)(hex[i]-32);	// A->a, F->f
//				
//				}
//				
//				result += binary[hex[i] - 'a'+10]+" "; // 99-97+10=12
//			 }
//		}
//
//		System.out.println("hex : "+new String(hex));
//		System.out.println("result : "+result);
//		
//		
		
	}//main
}//class
