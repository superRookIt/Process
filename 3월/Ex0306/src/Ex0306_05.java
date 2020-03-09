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

		map.put("1", "개"); // map.put(key, value)
		map.put("2", "소");
		map.put("3", "말");
		map.put("4", "범");
		map.put("5", "돼지");

		Iterator set1 = set.iterator();

		while (set1.hasNext()) {
			System.out.println(set1.next());
		}

		while (true) {

			System.out.println("id와 password를 입력하세요 >> ");
			System.out.print("id : ");
			String id = scan.nextLine().trim();
			if (!(map.containsKey(id))) {
				System.out.println("일치하는 아이디가 없습니다");
				continue;
			}

			System.out.print("pw : ");
			String pw = scan.nextLine().trim();
			if (!(map.get(id).equals(pw))) {
				System.out.println("비밀번호가 일치하지 않습니다");
				continue;
			} else {
				System.out.println("로그인에 성공하였습니다.");
				break;
			}

		} // while

	}// main

}// class
