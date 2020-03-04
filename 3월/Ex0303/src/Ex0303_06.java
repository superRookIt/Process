import java.util.Scanner;
import java.util.Vector;

public class Ex0303_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Vector<Student> s = new Vector<Student>();
		int a = 0;
		int b = 0;
//		int n = 0;

		while (true) {

			System.out.println("--------------------------"); // ★★★★★ 띄어쓰기
			System.out.println(" [ 학생 성적 프로그램 ] ");
			System.out.println("1) 학생정보입력 2)학생성적입력 3)학생정보출력");
			System.out.println("4) 학생성적출력 5)학생정보검색 6)학생성적검색 0)종료");
			System.out.println("번호를 입력해 주세요");
			int num = scan.nextInt();

			switch (num) {

			case 0:

				System.out.println("프로그램을 종료합니다");
				break;

			case 1:

				while (true) {

					System.out.println("학생정보를 입력합니다 ");
					System.out.println("이름을 입력해 주세요 (종료하려면 99번)");
					String name = scan.next();

					if (name.equals("99")) {
						break;
					}

					System.out.println("과을 입력해 주세요");
					String major = scan.next();
					System.out.println("학년을 입력해 주세요");
					int grade = scan.nextInt();
					s.add(new Student(name, major, grade));

				} // while

				break;

			case 2:

				System.out.println("학생성적을 입력합니다");
				System.out.println("학번을 입력해 주세요");
				int check = scan.nextInt(); // for문 안에 넣지 말기 !! ★★★

				for (int i = 0; i < s.size(); i++) {

					Student s1 = (Student) s.get(i);

					if (check == s1.hak_num) {
						System.out.println("학번 : " + s1.hak_num + " 이름 :" + s1.name + "의 점수를 입력합니다");
						System.out.println("국어 점수를 입력해주세요");
						s1.kor = scan.nextInt();
						System.out.println("영어 점수를 입력해주세요");
						s1.eng = scan.nextInt();
						s1.total();
						s1.avg();
//						n++;
						break;

					}

				} // for i

//				if (n == 0) {
//					System.out.println("일치하는 학번이 없습니다");
//					break;
//				}
//
//				n = 0;

				break;

			case 3:

				System.out.println("학생정보를 출력합니다");
				System.out.print("학번" + "\t" + "이름" + "\t" + "학과" + "\t" + "학년");
				System.out.println();

				for (int i = 0; i < s.size(); i++) {
					Student s1 = (Student) s.get(i);
					System.out.print(s1.hak_num + "\t" + s1.name + "\t" + s1.major + "\t" + s1.grade);
					System.out.println();
				}

				break;

			case 4:

				System.out.println("학생성적을 출력합니다");
				System.out.print("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "합계" + "\t" + "평균");
				System.out.println();

				for (int i = 0; i < s.size(); i++) {
					Student s1 = (Student) s.get(i);
					System.out.print(s1.name + "\t" + s1.kor + "\t" + s1.eng + "\t" + s1.total + "\t" + s1.avg);
					System.out.println();
				}

				break;

			case 5:

				System.out.println("학생정보를 검색합니다");
				a = info(s);
				System.out.print("학번" + "\t" + "이름" + "\t" + "학과" + "\t" + "학년");
				System.out.println();

				for (int i = a; i <= a; i++) {
					Student s1 = (Student) s.get(a);
					System.out.print(s1.hak_num + "\t" + s1.name + "\t" + s1.major + "\t" + s1.grade);
				}

				break;

			case 6:

				System.out.println("학생성적을 검색합니다");
				b = score(s);
				System.out.print("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "합계" + "\t" + "평균");
				System.out.println();

				for (int i = b; i <= b; i++) {
					Student s1 = (Student) s.get(b);
					System.out.print(s1.name + "\t" + s1.kor + "\t" + s1.eng + "\t" + s1.total + "\t" + s1.avg);
				}

				break;

			}// switch

		} // while

	}// main

	static int info(Vector s) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		System.out.println("학번을 입력하세요");
		int check = scan.nextInt();

		for (int i = 0; i < s.size(); i++) {
			Student s1 = (Student) s.get(i);

			if (check == s1.hak_num) {
				a = i;
			}

		} // for i

		return a;
	}

	static int score(Vector s) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		System.out.println("학번을 입력하세요");
		int check = scan.nextInt();

		for (int i = 0; i < s.size(); i++) {
			Student s1 = (Student) s.get(i);

			if (check == s1.hak_num) {
				a = i;
			}

		} // for i

		return a;

	}

}// class
