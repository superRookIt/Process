import java.util.*;

public class Ex0305_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();

		ArrayList list2 = new ArrayList();

		Student stu1 = new Student(1, "ȫ�浿", 300);
		Student stu2 = new Student(2, "�̼���", 299);
		Student stu3 = new Student(3, "������", 280);
		Student stu4 = new Student(4, "������", 270);
		Student stu5 = new Student(5, "������", 260);

		list2.add(stu3);
		list2.add(stu1);
		list2.add(stu2);
		list2.add(stu4);
		list2.add(stu5);

		Collections.sort(list2);
		// ������, ������, ������, �̼���, ȫ�浿
		// 300,299,280,270,260
		// 1,2,3,4,5

		Collections.reverse(list2);
		// ȫ�浿, �̼���, ������, ������, ������

		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}

		System.out.println("-------------------------");

		list.add(new Integer(5));
		// 8������ �⺻�� Ÿ���� ��ü�� ���� �� ���� Ŭ����
		// integer�� int Ÿ���� '��ü'
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		list.add(3);
		// ����ڽ� : int 3�� ��ü�� �˾Ƽ� ��ȯ������

		list.add(3, new Integer(7)); // 3��° �ڸ��� 7�� ���� (0,1,2,3 ������ 4��°)
//		list.remove(2); // 2��°�� ������ (0,1,2 ������ 3��°)

//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}

//		list.clear();

		for (int i = list.size() - 1; i >= 0; i--) { // �ڡڡڡڡ�
			list.remove(i);
		}

		// list.add(stu1); -> Student@15db9742

//		Collections.sort(list); // [0, 1, 2, 3, 3, 4, 5]
//		Collections.reverse(list);// [5, 4, 3, 3, 2, 1, 0]

		System.out.println(list); //

	}// main

}// class
