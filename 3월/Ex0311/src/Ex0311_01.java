import java.util.*;

public class Ex0311_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean ch = false;

		Excute ex = new Excute();
		ArrayList<Student> stu = new ArrayList<Student>();

		ch = ex.login();

		while (ch == true) {

			System.out.println("-----성적처리프로그램------");
			System.out.println("1. 성적 입력 2. 성적 출력 3. 학생 검색 4. 등수 출력");
			System.out.println("0. 종료");
			int num = scan.nextInt();

			switch (num) {

			case 0:
				System.out.println("프로그램을 종료합니다");
				break;

			case 1:
				ex.insert(stu);
				break;

			case 2:
				ex.print(stu);
				break;

			case 3:
				ex.search(stu);
				break;

			case 4:
				ex.rank(stu);
				break;

			}// switch

		} // while

	}// main

}// class
