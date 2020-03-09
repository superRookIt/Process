import java.util.HashSet; // ★
import java.util.Iterator; // ★

public class Ex0306_02 {

	public static void main(String[] args) {

		HashSet set1 = new HashSet(); // HashSet

//		set1.add("1");
//		set1.add("5");
//		set1.add("3");
//		set1.add("4");
//		set1.add("8");
//		set1.add("6");

//		Iterator it = set1.iterator();

//		while (it.hasNext()) {
//			System.out.println(it.next()); // 자동으로 정렬되어서 나옴
//		}

		set1.add(new Integer(1));
		set1.add(new Integer(2));
		set1.add(new Integer(1));
		set1.add(new Integer(4));
		set1.add(new Integer(1));
		set1.add(new Integer(5));

		Iterator it = set1.iterator(); // Iterator 1회용 ★★★

		while (it.hasNext()) {
			System.out.println(it.next()); // 1,2,4,5
			it.remove();
		}

		Iterator it1 = set1.iterator();

		System.out.println("2번째 출력");
		while (it1.hasNext()) {
			System.out.println(it1.next()); // 1,2,4,5
		}

	}// main

}// class
