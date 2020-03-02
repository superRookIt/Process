
import java.util.ArrayList; //★
import java.util.Scanner;
import java.util.Vector;

public class Ex0302_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		Vector<Student> list = new Vector<Student>(); 
		// <student> 객체만 들어올 수 있음

		ArrayList<Student> list = new ArrayList<Student>();
		// ★★★★★ 멀티스레드 지원x, <student> 객체만 들어올 수 있음

//		Student[] stu = new Student[10]; -> 예전엔 이렇게 

		String[] name1 = { "홍길동", "이순신", "김유신" };
		int[] kor1 = { 100, 90, 80 };
		int[] eng1 = { 80, 70, 60 };

		list.add(new Student(name1[0], kor1[0], eng1[0]));
		list.add(new Student(name1[1], kor1[1], eng1[1]));
		list.add(new Student(name1[2], kor1[2], eng1[2]));

		if (list.isEmpty()) {
			System.out.println("학생입력이 없습니다.");
		} else {
			for (int i = 0; i < list.size(); i++) {

				Student s = (Student) list.get(i); // 형변환 ★★★★★
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
//			System.out.println("이름을 입력해주세요");
//			name = scan.nextLine();
//			System.out.println("국어점수를 입력해주세요");
//			kor = scan.nextInt();
//			System.out.println("영어점수를 입력해주세요");
//			eng = scan.nextInt();
//			scan.nextLine(); // ★★
//			list.add(new Student(name, kor, eng)); // ★★★★★ !! 무한대로 가능
//			System.out.println("1명 성적 추가 되었습니다.");
//
//		}

	} // main

}// class
