import java.util.Scanner;

public class Ex0213_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �빮�ڸ� �ԷµǾ�߸� �մϴ�

		Scanner scan = new Scanner(System.in);

		char[] hex = new char[10]; // �� �Է¹��� ���ڸ� ����
		String str = ""; // �Է¹��� ���ڿ�
		System.out.println("10�����Ϸ� ���ڸ� �Է��ϼ���. (ABCEDF)>>");  //16�����ϱ� A~F���� ���������� ^^
		str =scan.next(); //�Է°�
		// str.length
		for (int i = 0; i < str.length(); i++) { // �ڡڡڡ� str.length() <- ()�� ����Ʈ!!!
			hex[i] = str.charAt(i); // �� �Է¹��ڿ� �� ù��° ����
		}

//		char[] hex = {'7','C','A','F','E'};

		String[] binary = { // A=10 B=11 C=12 D=13 E=14 F=15(16����)

				"0000", "0001", "0010", "0011", // 0,1,2,3
				"0100", "0101", "0110", "0111", // 4,5,6,7
				"1000", "1001", "1010", "1011", // 8,9,10(A),11(B)
				"1100", "1101", "1110", "1111" // 12(C),13(D),14(E),15(F)

		};

		String result = ""; // result = result + "0100";

		for (int i = 0; i < str.length(); i++) { // �ڡڡڡ� str.length()
			if (hex[i] >= '0' && hex[i] <= 9) {
				result = result + binary[hex[i] - '0'] + " "; // 0111, hex[0]='7'
			} else {
				result = result + binary[(hex[i] - 'A') + 10] + " "; // 1100
				// 'C'-'A'+10// 67-65 = 2 (�ƽ�Ű�ڵ�)+10=12
			}
		}

		for (int i = 0; i < str.length(); i++) { // �ڡڡڡ� str.length()
			System.out.print(hex[i] + " ");

		}

		System.out.println();
		System.out.println(result);

	}// main
}// class
