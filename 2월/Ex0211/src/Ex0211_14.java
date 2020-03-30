import java.util.Scanner;

public class Ex0211_14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		int[] c = new int[10];
		int[] d = { 0, 500, 1000, 3000 };
		
		int[] e = new int[10];
		int[] f = { 0, 10, 100, 1000 };
		
		int tmp = 0;
		int ran = 0;
		int j = 0;

		for (int i = 0; i < 20; i++) {
			ran = (int) (Math.random() * 4);
			tmp = d[0];
			d[0] = d[ran];
			d[ran] = tmp;
		}

		for (int i = 0; i < 20; i++) {
			ran = (int) (Math.random() * 4);
			tmp = f[0];
			f[0] = f[ran];
			f[ran] = tmp;
		}

		for (int i = 0; i < 10; i++) {
			j = (int) (Math.random() * 4);
			c[i] = d[j];

		}

		for (int i = 0; i < 10; i++) {
			j = (int) (Math.random() * 4);
			e[i] = f[j];
		}

		System.out.print("c의 배열 : ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " / ");

		}

		System.out.println();

		System.out.print("e의 배열 : ");
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " / ");
		}

	}

}
