import java.util.Scanner;

public class Ex0224_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] stu_title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		Student[] stu = new Student[3]; // 학생10명 객체배열
		int[] score = new int[3]; // 점수받는 배열
		int kor = 0;
		int eng = 0;
		int math = 0;
		int stu_count = 0;

		while (true) {
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생등수입력");
			System.out.println("5. 종료");

			System.out.println("원하는 번호를 입력하세요.>> ");
			int s_num = scan.nextInt();

			switch (s_num) {

			case 1: // 학생성적입력
				stu_count = stu_input(stu, score, stu_title, stu_count);
				System.out.println("학생성적입력 완료");
				System.out.println("--------------------------------");

				break;

			case 2: // 학생성적출력
				stu_print(stu, stu_title, stu_count);
				System.out.println("학생성적출력 완료");
				System.out.println("--------------------------------");

				break;

			case 3: // 학생성적수정
				stu_modify(stu);
				System.out.println("학생성적수정 완료");
				System.out.println("--------------------------------");

				break;

			case 4:

				break;
			case 5:

				break;

			default:
				break;
			}// switch

		} // while

	} // main

	static int stu_input(Student[] stu, int[] score, String[] stu_title, int stu_count) {
		// 메소드 분리/몇명의 학생이 입력되었는지 확인해서 출력을 해보세요.
		Scanner scan = new Scanner(System.in);
		loop1: while (true) {
			// 성적 입력부분
			for (int i = stu_count; i < stu.length; i++) {
				System.out.println("이름을 입력하세요.>>(99:이전화면)");
				String name = scan.nextLine();
				if (name.equals("99")) {
					break loop1;
				}
				// 점수입력부분
				for (int j = 0; j < 3; j++) {
					System.out.println(stu_title[j + 2] + " 값을 입력하세요.>>");
					score[j] = scan.nextInt();
					scan.nextLine();
				}
				stu_count++;
				stu[i] = new Student(name, score[0], score[1], score[2]);
				// 10명
				if (stu_count == 3) {
					break loop1;
				}
			}
		} // while
		return stu_count;

	} // stu_input 메소드

	static void stu_print(Student[] stu, String[] stu_title, int stu_count) {
		System.out.println("입력된 학생 : " + stu_count);
		System.out.println(stu_title[0] + "\t" + stu_title[1] + "\t" + stu_title[2] + "\t" + stu_title[3] + "\t"
				+ stu_title[4] + "\t" + stu_title[5] + "\t" + stu_title[6] + "\t" + stu_title[7]);
		for (int i = 0; i < stu_count; i++) {
			System.out.println(stu[i].hak_num + "\t" + stu[i].name + "\t" + stu[i].kor + "\t" + stu[i].eng + "\t"
					+ stu[i].math + "\t" + stu[i].total + "\t" + stu[i].avg + "\t" + stu[i].rank);

		}
	}

	// 학생성적수정
	static void stu_modify(Student[] stu) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정하고 싶은 학생이름을 입력하세요.");
		String s_name = scan.nextLine();
		for (int i = 0; i < stu.length; i++) {
			if (s_name.equals(stu[i].name)) {
				System.out.println(s_name + " 검색되었습니다.");
				System.out.println("1.국어수정 2.영어수정 3.수학수정 4.이름수정 0.이전화면");
				System.out.println("원하는 번호를 입력하세요.>>");
				int s_num1 = scan.nextInt();

				switch (s_num1) {
				case 1:
					sw_modify(stu, i, "국어");

					break;

				case 2:
					sw_modify(stu, i, "영어");

					break;

				case 3:
					sw_modify(stu, i, "수학");

					break;

				case 4:
					System.out.println("현재 이름 :" + stu[i].name);
					System.out.println("변경 이름을 입력하세요.>>");
					stu[i].name = scan.nextLine();
					break;

				}

			} else {
				System.out.println("이름 불일치. 다시검색>>");
			}
		}

	}// stu_modify 메소드

	static void sw_modify(Student[] stu, int i, String subject) {
		Scanner scan = new Scanner(System.in);
		System.out.println("현재" + subject + "점수 :" + stu[i].kor);
		System.out.println("변경" + subject + "점수를 입력하세요.>>");
		if (subject.equals("국어")) {
			stu[i].kor = scan.nextInt();
		} else if (subject.equals("영어")) {
			stu[i].eng = scan.nextInt();
		} else {
			stu[i].math = scan.nextInt();
		}
		stu[i].modify();
	}

} // class