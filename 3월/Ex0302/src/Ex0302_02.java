
import java.util.ArrayList; //��
import java.util.Scanner;
import java.util.Vector;

public class Ex0302_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		Vector<Student> list = new Vector<Student>(); 
		// <student> ��ü�� ���� �� ����

		ArrayList<Student> list = new ArrayList<Student>();
		// �ڡڡڡڡ� ��Ƽ������ ����x, <student> ��ü�� ���� �� ����

//		Student[] stu = new Student[10]; -> ������ �̷��� 

		String[] name1 = { "ȫ�浿", "�̼���", "������" };
		int[] kor1 = { 100, 90, 80 };
		int[] eng1 = { 80, 70, 60 };

		list.add(new Student(name1[0], kor1[0], eng1[0]));
		list.add(new Student(name1[1], kor1[1], eng1[1]));
		list.add(new Student(name1[2], kor1[2], eng1[2]));

		if (list.isEmpty()) {
			System.out.println("�л��Է��� �����ϴ�.");
		} else {
			for (int i = 0; i < list.size(); i++) {

				Student s = (Student) list.get(i); // ����ȯ �ڡڡڡڡ�
				System.out.print(s.haknum + "\t");
				System.out.print(s.name + "\t");
				System.out.print(s.kor + "\t");
				System.out.print(s.eng + "\t");
				System.out.print(s.total + "\t");
				System.out.print(s.avg + "\t");
				System.out.println();

			} // for i
		}

//		String name = "";
//		int kor = 0;
//		int eng = 0;
//
//		Student s1 = new Student(name1[0], kor1[0], eng1[0]);
//
//		while (true) {
//
//			System.out.println("�̸��� �Է����ּ���");
//			name = scan.nextLine();
//			System.out.println("���������� �Է����ּ���");
//			kor = scan.nextInt();
//			System.out.println("���������� �Է����ּ���");
//			eng = scan.nextInt();
//			scan.nextLine(); // �ڡ�
//			list.add(new Student(name, kor, eng)); // �ڡڡڡڡ� !! ���Ѵ�� ����
//			System.out.println("1�� ���� �߰� �Ǿ����ϴ�.");
//
//		}

	} // main

}// class
