import java.util.Scanner;

public class Ex0211_10 {

	public static void main(String[] args) {

		String[][] table = new String[4][5];

		Scanner scan = new Scanner(System.in);

		

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.println();
				System.out.println((5 * i) + j + 1 + "��° ������ �Է����ּ���");
				table[i][j] = scan.next();
			}
			System.out.println();

		}

		System.out.println();

		System.out.println("[�ð�ǥ]");

		System.out.print("��");
		System.out.print("\tȭ");
		System.out.print("\t��");
		System.out.print("\t��");
		System.out.print("\t�� \n");

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (j == 0) {
					System.out.print((i * 1) + j + 1 + ". " + table[i][j] + " ");
				}
				System.out.print(table[i][j] + " "); // �ڡڡ� \t -> tabŰ �ڡڡ�
			}
			System.out.println();
		}

	}

}
