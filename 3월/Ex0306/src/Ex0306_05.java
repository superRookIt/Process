import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex0306_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		HashSet set = new HashSet();

		HashMap map = new HashMap();

		set.add(4);
		set.add(6);
		set.add(57);
		set.add(3);
		set.add(2);
		set.add(10);

		map.put("1", "��"); // map.put(key, value)
		map.put("2", "��");
		map.put("3", "��");
		map.put("4", "��");
		map.put("5", "����");

		Iterator set1 = set.iterator();

		while (set1.hasNext()) {
			System.out.println(set1.next());
		}

		while (true) {

			System.out.println("id�� password�� �Է��ϼ��� >> ");
			System.out.print("id : ");
			String id = scan.nextLine().trim();
			if (!(map.containsKey(id))) {
				System.out.println("��ġ�ϴ� ���̵� �����ϴ�");
				continue;
			}

			System.out.print("pw : ");
			String pw = scan.nextLine().trim();
			if (!(map.get(id).equals(pw))) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				continue;
			} else {
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
				break;
			}

		} // while

	}// main

}// class
