import java.text.SimpleDateFormat;
import java.util.*;

public class Mall_excute { // ��ɾ�

	static Scanner scan = new Scanner(System.in);

	static Calendar cal = Calendar.getInstance();

	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	static void buy(ArrayList m, Product p, ArrayList gm) {

		System.out.println("ID�� �Է����ּ���");

		String id = scan.next();

		for (int i = 0; i < m.size(); i++) {

			Member m1 = (Member) m.get(i);

			if (m1.id.equals(id)) {

				if (m1.money < p.price) {
					System.out.println("�ܾ��� �����մϴ�");
					return;
				}

				m1.money -= p.price;
				m1.point += p.bonus;

				gm.add(p); // gm�迭�� ���Ÿ�� ����
				int e = gm.indexOf(p);
				m1.serial = e + 1;

				System.out.println(m1.name + " ���� !" + p.name + " ���Ÿ� �߽��ϴ�.");
				System.out.println(p.toString());
				System.out.println("���Žð� : " + sdf.format(cal.getTime()));

			}

		}

	}

	static void summary(ArrayList m, ArrayList gm) {

		System.out.println("ID�� �Է����ּ���");
		String id = scan.next();

		for (int j = 0; j < m.size(); j++) {

			Member m1 = (Member) m.get(j);

			if (m1.id.equals(id)) {

				if (gm.isEmpty()) {
					// �ڡڡڡڡ� (cart�� �� �������� �ƴ��� isEmpty())
					return;
				}

				if (!(m1.serial == 0)) {

					Product p1 = (Product) gm.get(m1.serial);

					m1.sum += p1.price;
					m1.list += p1.name + " ";

				}

				System.out.println("�� " + m1.name + "���� ���̵� : " + m1.id);
				System.out.println("�� " + m1.name + "���� �ܾ� : " + m1.money);
				System.out.println("�� " + m1.name + "���� ����Ʈ : " + m1.point);

				System.out.println("�����Ͻ� ��� : " + m1.list);
				System.out.println("�� ���� �ݾ� : " + m1.sum);

				m1.serial = 0;

			}

		}

	}

}// class
