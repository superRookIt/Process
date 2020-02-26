import java.util.Scanner;

public class Ex0213_06 {

	public static void main(String[] args) {

		// 학생성적처리 프로그램
		// 1. 학생점수추가 2. 학생점수수정 3. 학생점수삭제 0. 종료
		// 1-> 국어점수입력

		// 이름 국어 영어 합계 평균
		// 3명 입력

		Scanner scan = new Scanner(System.in);

		// ★★학생입력
		int stu = 0;
		System.out.println("몇명의 학생을 입력하시겠습니까?. >>");
		stu = scan.nextInt();

		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

		String[] name = new String[stu]; // 이름
		int[][] score = new int[stu][4]; // 점수
		double[] avg = new double[stu]; // 평균
		int[] rank = new int[stu]; // 등수
		int rank_count = 1; // 등수 카운트 ★★ 1부터 시작

		// 이름, 점수, 평균 입력
		for (int i = 0; i < score.length; i++) {
			System.out.println("이름을 입력해주세요");
			name[i] = scan.next();
			// name[i].trim(); // ★★ trim() 앞뒤의 공백을 없애줌
			// String -> charAt(), subString, length, touppercase, equal(),
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println((i + 1) + "번째 " + subject[j + 1] + " 점수를 입력하세요. >>");// subject[j+1]
				score[i][j] = scan.nextInt();

				// 유효성검사
				if (!(score[i][j] >= 0 && score[i][j] <= 100)) {
					System.out.println("1~99까지 입력해주세요");
					j--; // ★
					continue; // ★
				}

				score[i][score[i].length - 1] += score[i][j];
				// 합계 = 합계 + 추가점수

			} // for j

			avg[i] = score[i][score[i].length - 1] / 3;

		} // for i

		// ★★ 등수계산 ★★
		for (int i = 0; i < score.length; i++) {
			rank_count = 1;
			for (int j = 0; j < score.length; j++) { //
				if (score[i][score[i].length - 1] < score[j][score[i].length - 1]) { // 200, 190, 180 //
					rank_count++;
				}

				// score[i][2]<score[j][2] 크면 +1
				// score[i][2]<score[j][2]
				// score[i][2]<score[j][2]

			} // for j

			rank[i] = rank_count;
		} // for i

		// 제목출력
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}

		System.out.println();

		// 이름, 점수, 평균출력
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			} // for j

			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.println();

		} // for i

	}// MAIN

}// CLASS
