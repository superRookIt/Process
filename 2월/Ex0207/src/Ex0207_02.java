import java.util.Scanner;

public class Ex0207_02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a, b;
		int i = 0;
		int win = 0 ;
		int lose =0;
		int draw =0;

		System.out.println("��� ��� �� �ǰ���?");
		int c = scan.nextInt();

		for (i = 1; i <= c; i++) {

			System.out.println("���� 1, ���� 2, �� 3");
			a = scan.nextInt();
			b = (int) (Math.random() * 3 + 1);

			System.out.println("����� " + a + "�Դϴ�");
			System.out.println("��ǻ�ʹ� " + b + "�Դϴ�");

			switch (a - b) {

			case 2:
			case -1:
				System.out.println("����� �����ϴ�");
				lose++;
				break;

			case 0:
				System.out.println("�����ϴ�");
				draw++;
				break;

			case -2:
			case 1:
				System.out.println("����� �̰���ϴ�");
				win++;

			}

		}
		
		double re = (double)win/c;
		System.out.println("���� Ƚ�� "+c);
		System.out.println("�̱� Ƚ��"+win);
		System.out.println("�й��� Ƚ��"+lose);
		System.out.println("��� Ƚ��"+draw);
		System.out.println("�·�"+re*100);

	} // main
} // class
