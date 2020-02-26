import java.util.Scanner;

public class Ex0217_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		Student[] st = new Student[5];// 5명의 학생객체 선언

		String[] sub = { "이름", "국어", "영어", "수학", "합계", "평균" };

		// 이름, 점수, 평균 입력
		for (int i = 0; i < st.length; i++) {
			st[i] = new Student(); // ★★★★★
			System.out.println("학생 이름을 입력해주세요 >>");
			st[i].name = scan.next();
			System.out.println("국어점수를 입력해주세요. ");
			st[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력해주세요. ");
			st[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력해주세요. ");
			st[i].math = scan.nextInt();
			scan.nextLine(); // ★★★
			st[i].total();
			st[i].avg();

		}

		System.out.println("출력하겠습니다");

		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i] + "\t");
		}

		System.out.println();

		for (int j = 0; j < st.length; j++) {
			System.out.print(st[j].name + "\t");
			System.out.print(st[j].kor + "\t");
			System.out.print(st[j].eng + "\t");
			System.out.print(st[j].math + "\t");
			System.out.print(st[j].total + "\t");
			System.out.print(st[j].avg + "\t");

			System.out.println();

		} // for i

	}// main

}// class
