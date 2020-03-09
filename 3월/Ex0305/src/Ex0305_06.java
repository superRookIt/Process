import java.util.*;

public class Ex0305_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();

		ArrayList list2 = new ArrayList();

		Student stu1 = new Student(1, "홍길동", 300);
		Student stu2 = new Student(2, "이순신", 299);
		Student stu3 = new Student(3, "김유신", 280);
		Student stu4 = new Student(4, "유관순", 270);
		Student stu5 = new Student(5, "강감찬", 260);

		list2.add(stu3);
		list2.add(stu1);
		list2.add(stu2);
		list2.add(stu4);
		list2.add(stu5);

		Collections.sort(list2);
		// 강감찬, 김유신, 유관순, 이순신, 홍길동
		// 300,299,280,270,260
		// 1,2,3,4,5

		Collections.reverse(list2);
		// 홍길동, 이순신, 유관순, 김유신, 강감찬

		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}

		System.out.println("-------------------------");

		list.add(new Integer(5));
		// 8가지의 기본형 타입을 객체로 만든 걸 레퍼 클래스
		// integer는 int 타입인 '객체'
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		list.add(3);
		// 오토박싱 : int 3을 객체로 알아서 변환시켜줌

		list.add(3, new Integer(7)); // 3번째 자리에 7을 넣음 (0,1,2,3 실제론 4번째)
//		list.remove(2); // 2번째가 지워짐 (0,1,2 실제론 3번째)

//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}

//		list.clear();

		for (int i = list.size() - 1; i >= 0; i--) { // ★★★★★
			list.remove(i);
		}

		// list.add(stu1); -> Student@15db9742

//		Collections.sort(list); // [0, 1, 2, 3, 3, 4, 5]
//		Collections.reverse(list);// [5, 4, 3, 3, 2, 1, 0]

		System.out.println(list); //

	}// main

}// class
