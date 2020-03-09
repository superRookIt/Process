import java.util.*;

public class Ex0306_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] hak = { 1001, 1002, 1003 }; // dummy data, scan으로 계속 받으면서 하면 힘드니까
		String[] name = { "홍길동", "이순신", "김유신" };
		int[] total = { 299, 288, 300 };

		ArrayList<Student> list = new ArrayList<Student>();

		for (int i = 0; i < hak.length; i++) {
			list.add(new Student(hak[i], name[i], total[i]));
		}

//		System.out.println(list);

		while (true) {

			System.out.println("1) 학번정렬 2)이름정렬 3)총점정렬");
			int num = scan.nextInt();

			switch (num) {

			case 2:

				System.out.println("이름정렬");

				// Collections.sort(list);
				// -> list에 hak, name, total 3개가 있어서 에러남

				Collections.sort(list, new Comparator<Student>() {

					@Override
					public int compare(Student s1, Student s2) {
						return s1.name.compareTo(s2.name);
					}

				});

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

				break;

			case 1:

				System.out.println("학번정렬");

				Collections.sort(list, new Comparator<Student>() {

					public int compare(Student s1, Student s2) {
						if (s1.hak < s2.hak) {
							return -1;
						} else if (s1.hak > s2.hak) {
							return 1;
						} else {
							return 0;
						}

					}

				});

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

				break;

			case 3:

				System.out.println("총점정렬");

				Collections.sort(list, new Comparator<Student>() {

					@Override
					public int compare(Student s1, Student s2) {
						if (s1.total > s2.total) {
							return -1;
						} else if (s1.total < s2.total) {
							return 1;
						} else {
							return 0;
						}
					}

				});

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

				break;

			}// switch

		} // while

	}// main

}// class
