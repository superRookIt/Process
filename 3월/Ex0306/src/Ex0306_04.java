import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ex0306_04 {

	public static void main(String[] args) {

		HashMap map = new HashMap(); // map

		HashSet set1 = new HashSet(); // set

		ArrayList list = new ArrayList(); // arraylist

		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));

		map.put("myid", "1234");
		map.put("Dream", "d1111");
		map.put("aaa", "aooooo");
		map.put("bbb", "b111111");
		map.put("aaa", "axxxxx"); // �Ȱ����� ������ �� ������ �� ����

		map.entrySet();// map�� set���� �ٲ�

		Iterator it = map.entrySet().iterator(); //

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Dream=d1111
		// aaa=axxxxx ��
		// bbb=b111111
		// myid=1234

		Iterator it1 = list.iterator(); // list�� Iterator ȣȯ �ڡڡ�

	}// main

}// class
