import java.util.Scanner;

public class Ex0207_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��Ŀ�� : Ŀ�� 10
		// ���Ŀ�� : Ŀ��7 ����5
		// ī��� : Ŀ��5 ����5
		// ��ũĿ�� : Ŀ��4 ���� 3 ���� 2
		// ��� ������ ���� ��ᰡ ������ �����Դϴ�
		// Ŀ�� 100 ���� 50 ���� 70 in ���Ǳ�
		// 9�� �ܷ� (������ ���)
		// �� ���� �ȾҴ��� (������)

		Scanner scan = new Scanner(System.in);

		int coffe = 100;
		int sugar = 50;
		int milk = 70;
		int a = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int cash = 0;

		String id = "aaa";
		String id1 = "";
		String pass = "1234";
		String sold = "";
		String sold1 = "";
		String sold2 = "";
		String sold3 = "";

		loop1: while (true) {

			System.out.println("------------------------------------");
			System.out.println("Ŀ�� ���Ǳ�");
			System.out.println("1. ��Ŀ�� " + sold + "2.���Ŀ�� " + sold1 + "3.�� " + sold2 + "4.��ũĿ�� " + sold3);
			System.out.println("99. �����ڸ�� ");
			System.out.println("0. ���α׷� ����");
			System.out.println("���ϴ� ���ڸ� �Է����ּ���");

			a = scan.nextInt();

			switch (a) {
			case 1:
				if (coffe < 10) {
					System.out.println("��ᰡ �����մϴ�. �����ڿ��� �����ϼ���");
					sold = "(ǰ��)";
				}
				coffe -= 10;
				System.out.println("��Ŀ�� 1�� �Ϸ�");
				cash += 100;
				System.out.println();
				c++;
				break;

			case 2:
				if (coffe < 7 || sugar < 5) {
					System.out.println("��ᰡ �����մϴ�. �����ڿ��� �����ϼ���");
					sold1 = "(ǰ��)";
				}
				coffe -= 7;
				sugar -= 5;
				System.out.println("���Ŀ�� 1�� �Ϸ�");
				cash += 300;
				System.out.println();
				d++;
				break;

			case 3:
				if (coffe < 5 || milk < 5) {
					System.out.println("��ᰡ �����մϴ�. �����ڿ��� �����ϼ���");
					sold2 = "(ǰ��)";
				}
				coffe -= 5;
				milk -= 5;
				System.out.println("ī��� 1�� �Ϸ�");
				cash += 200;
				System.out.println();
				e++;
				break;

			case 4:
				if (coffe < 4 || sugar < 3 || milk < 2) {
					System.out.println("��ᰡ �����մϴ�. �����ڿ��� �����ϼ���");
					sold3 = "(ǰ��)";
				}
				coffe -= 4;
				sugar -= 3;
				milk -= 2;
				System.out.println("��ũĿ�� 1�� �Ϸ�");
				cash += 100;
				System.out.println();
				f++;
				break;

			case 99:

				while (true) {
					System.out.println("id�� �Է����ּ���. >> ");
					id1 = scan.next(); // �� nextline()�� �ȉ� -> ����Ű���� ������ �ν���
					// next() -> ���̶��⳪ ����Ű�������� ���� �ɴϴ�, nextline() -> ������ ���� �� �� �� �� �� ��
					// �� abc def = next�� abc , nextline�� abcdef ������
					if (!(id.equals(id1))) {
						System.out.println("id�� ��ġ���� �ʽ��ϴ�. ");
						continue;
					}

					break;
				}

				while (true) {

					System.out.println("password�� �Է����ּ���. >>");
					String pass_ch = scan.next();

					if (!(pass.equals(pass_ch))) {
						System.out.println("pass�� ��ġ���� �ʽ��ϴ�");
						continue;
					}
					break;
				}

				System.out.println("������ ���");
				System.out.println("1. ���, 2. �Ǹŷ�, 3. �������");
				int gwan = scan.nextInt();

				switch (gwan) {

				case 1:
					System.out.println("���� ���");
					System.out.println("--------------------------");
					System.out.println("Ŀ�� ��� :" + coffe);
					System.out.println("���� ��� : " + milk);
					System.out.println("���� ��� : " + sugar);
					break;

				case 2:

					System.out.println("�� �Ǹŷ� �� ����");
					System.out.println("--------------------------");
					System.out.println("1. ��Ŀ��  =" + c + "��");
					System.out.println("2. ���Ŀ��  =" + e + "��");
					System.out.println("3. ī���  =" + e + "��");
					System.out.println("4. ��ũĿ��  =" + f + "��");
					System.out.println("5. �� ����  =" + cash + "��");
					break;

				case 3:
					System.out.println("������ ��Ḧ �������ּ���");
					System.out.println("1. Ŀ��, 2. ����, 3.����");

					int refill = scan.nextInt();

					System.out.println("������ ���� �����ּ��� ^^");

					int yang = scan.nextInt();

					switch (refill) {

					case 1:
						System.out.println("Ŀ�������Ϸ�");
						coffe += yang;
						break;

					case 2:
						System.out.println("���������Ϸ�");
						sugar += yang;
						break;

					case 3:
						System.out.println("���������Ϸ�");
						milk += yang;
						break;

					}

				} // �����ڸ��

				break; // case 99

			case 0:
				System.out.println("�ý����� �����մϴ�");
				break loop1;

			}// switch

		} // while

	} // main

} // class
