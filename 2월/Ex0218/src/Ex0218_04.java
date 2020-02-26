import java.util.Scanner;

public class Ex0218_04 {

	static int stu_count = 0; // ★★★

	public static void main(String[] args) {

		Student[] t = new Student[10]; // ★★
		Scanner scan = new Scanner(System.in);

		String[] sub = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

		int b = 0;
		int c = 0;
		int count = 1;

		// 첫번째 메인 반복
		while (true) {

			Ex0218_04.main_print();// ★ 메소드 분리

			switch (scan.nextInt()) { // ★

			case 0:

				System.out.println("시스템을 종료합니다");
				break;

			case 1:

				insert(t); // 학생성적추가 메소드 - 메소드 분리

				break;

			

			}// switch

		} // while

	}// main

	// ★메인 출력 메소드★
	static void main_print() {

		System.out.println();
		System.out.println("[ 학생성적처리프로그램 ]");
		System.out.print("1.성적추가" + "\t");
		System.out.print("2.성적수정" + "\t");
		System.out.println("3.성적삭제" + "\t");
		System.out.print("4.성적검색" + "\t");
		System.out.print("5.등수처리" + "\t");
		System.out.println("0.종료" + "\t");
		System.out.println("번호를 입력하세요");

	}

	static void insert(Student[] t) { // ★★★★★ 배열로 받아야 ^^

		String insert_name = "";
		Scanner scan = new Scanner(System.in); // ★

		System.out.println("성적 추가를 선택했습니다");
		// 메소드 분리

		for (int i = stu_count; i < t.length; i++) {
			System.out.println("이름을 입력해주세요. (99:이전화면)");
			insert_name = scan.next();

			if (insert_name.equals("99")) {// 이때 99는 문자
				System.out.println("이전화면으로 이동합니다.>>");
				break;
			}

			t[i] = new Student();

			t[i].num = (Student.first_num += 1); // ★★
			t[i].name = insert_name;
			System.out.println("국어점수를 입력해주세요");
			t[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력해주세요");
			t[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력해주세요");
			t[i].math = scan.nextInt();
			scan.nextLine();
			t[i].total_();
			t[i].avg_();
			Ex0218_04.stu_count++;
			System.out.println(stu_count + "번째 학생 - 학번 : " + t[i].num + " 이름 : " + t[i].name);

		}

	}

}// class
