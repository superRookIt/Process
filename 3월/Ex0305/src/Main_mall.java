import java.util.*;

public class Main_mall {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Login l = new Login();
		Mall_excute ex = new Mall_excute();

		ArrayList<Member> m = new ArrayList<Member>();

		ArrayList<Product> gm = new ArrayList<Product>();

		HashMap map = new HashMap();

		while (true) {
			System.out.println("-------------------");
			System.out.println("1)ȸ������ 2)ȸ������ ���� 3)ȸ���˻� 4)�α��� 5)�α׾ƿ�");
			System.out.println("6)��ǰ���� 7)��ǰ���Ÿ�� 0)����");
			int num = scan.nextInt();

			switch (num) {

			case 0:

				System.out.println("�����մϴ�. ");
				break;

			case 1:

				l.join(m, map);

				break;

			case 2:

				l.print(m);

				break;

			case 3:

				l.search(m);
				break;

			case 4:

				l.log(m, map);
				break;

			case 5:

				l.logout(map);

				break;

			case 6:

				System.out.println("������ ��ǰ�� �������ּ���");
				System.out.println("1)tv, 2)�����, 3)��Ź�� ");
				int num1 = scan.nextInt();

				switch (num1) {

				case 1:

					ex.buy(m, new Tv(), gm);

					break;

				case 2:

					ex.buy(m, new Ref(), gm);
					break;

				case 3:

					ex.buy(m, new Wash(), gm);
					break;

				}

				break;

			case 7:

				ex.summary(m, gm);

				break;

			}// switch

		} // while

	}// main

}// class
