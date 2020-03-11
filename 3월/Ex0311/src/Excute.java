import java.util.ArrayList;
import java.util.Scanner;

public class Excute {

	Scanner scan = new Scanner(System.in);

	public boolean login() {

		while (true) {
			System.out.println("아이디를 입력해주세요");
			String id = scan.next();
			if (!(id.equals("admin"))) {
				System.out.println("아이디가 틀렸습니다. 다시 입력해주세요");
				continue;
			}

			System.out.println("비밀번호를 입력해주세요");
			String pw = scan.next();
			if (!(pw.equals("1234"))) {
				System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요");
				continue;
			}

			System.out.println("로그인에 성공하였습니다.");
			return true;

		}

	}

	public void insert(ArrayList stu) {

		System.out.println("성적을 입력합니다");

		System.out.println("이름을 입력해주세요");
		String name = scan.next();
		System.out.println("국어점수를 입력해주세요");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력해주세요");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력해주세요");
		int math = scan.nextInt();

		stu.add(new Student(name, kor, eng, math));

	}

	public void print(ArrayList stu) {

		System.out.println("성적을 출력합니다");

		for (int i = 0; i < stu.size(); i++) {
			Student stu1 = (Student) stu.get(i);
			System.out.print(stu1);
			System.out.println();
		}

	}

	public void search(ArrayList stu) {

		System.out.println("학생검색을 시작합니다");
		String name = scan.next();

		for (int i = 0; i < stu.size(); i++) {
			Student stu1 = (Student) stu.get(i);
			if (stu1.name.contains(name))
				System.out.print(stu1);
			System.out.println();

		} // for i

	}

	public void rank(ArrayList stu) {
		System.out.println("등수를 확인합니다");
		for (int i = 0; i < stu.size(); i++) {
			Student stu1 = (Student) stu.get(i);
			for (int j = 0; j < stu.size(); j++) {
				Student stu2 = (Student) stu.get(j);
				if (stu1.total > stu2.total) {
					stu2.rank++;
				}
			} // for j

		} // for i

		for (int i = 0; i < stu.size(); i++) {
			Student stu1 = (Student) stu.get(i);
			System.out.println("[" + stu1.name + "] 의 등수 : " + stu1.rank);
		}

	}

}
