import java.util.Scanner;

public class Ex0227_04_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int se = 0;
		Ca c = null;
		Fire f = new Fire();
		Ambul a = new Ambul();
		Tru t = new Tru();

		while (true) {
			System.out.println("���� ī ���α׷�");
			System.out.println("1. �ҹ���  2. �ں深��  3. Ʈ�� ");
			System.out.println("4. �⺻��  5. �������  6. ���� ");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� >>");
			se = scan.nextInt();

			switch (se) {
			case 6:
				System.out.println("�����մϴ�");
				break;

			case 1:

				System.out.println("�ҹ��� ����");
				f.water();
				c = f;
				break;

			case 2:

				System.out.println("�ں深�� ����");
				a.siren();
				c = a;
				break;

			case 3:

				System.out.println("Ʈ�� ����");
				t.stuff();
				c = t;
				break;

			case 4:

				System.out.println("�⺻���� ���� ");
				c.drive();
				break;

			case 5:
				// �ڡڡڡڡ�(�߿�!!)
				System.out.println("���� ������ ��?");
				if (c instanceof Fire) {
					System.out.println("�ҹ����� �ٽ� ����");
					f = (Fire) c;
					f.water();
				} else if (c instanceof Ambul) {
					System.out.println("�ں深���� �ٽ� ����");
					a = (Ambul) c;
					a.siren();
				} else if (c instanceof Tru) {
					System.out.println("Ʈ������ �ٽ� ����");
					t = (Tru) c;
					t.stuff();
				}

			}// switch

		} // while

	}// class

}// main

class Ca {

	void drive() {
		System.out.println("������ ������ ���");
	}

}

class Fire extends Ca {
	void water() {
		System.out.println("���� �߻�");

	}
}

class Ambul extends Ca {
	void siren() {
		System.out.println("���̷��� �︳�ϴ�");
	}
}

class Tru extends Ca {
	void stuff() {
		System.out.println("������ �ű�ϴ�");
	}
}
