import java.util.Scanner;

public class Ex0211_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] two = new int[5][8];

		int e = 0;

		for (int i = 0; i < two.length; i++) {
			for (int j = 0; j < two[i].length; j++) {
				two[i][j] = ((i * 8) + j + 1) * 2; // 1*2~40*2 �ڡڡڡڡڡڡڡڡڡڡڡڡڡ�

			}

		}

		for (int i = 0; i < two.length; i++) {
			for (int j = 0; j < two[i].length; j++) {
				System.out.print(two[i][j] + " ");
			}
			System.out.println();
		}

	}// main

}// class
