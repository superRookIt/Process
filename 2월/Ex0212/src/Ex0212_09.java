import java.util.Scanner;

public class Ex0212_09 {

	public static void main(String[] args) {

		// 성적처리프로그램
		// 이름(String) 국어,영어,수학,합계(Int) 평균(double)
		// 번호 이름 내용 날짜 조회수 ->입력추가

		String[] name = new String[3];
		int[][] score = new int[3][4];
		// [0,0][0,1][0,2] - 점수 / [0,3] - 합계
		double[] avg = new double[3];
		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균" };

		Scanner scan = new Scanner(System.in);

		// name이랑 score의 값이 다르면 따로따로 빼줘야

		// 입력폼
		for (int i = 0; i < name.length; i++) { // score.length
			// 이름입력
			System.out.println(i + 1 + "번 학생의 이름을 입력 해주세요");
			name[i] = scan.next();
			// 점수입력
			for (int j = 0; j < score[i].length - 1; j++) { // score[i].length
				System.out.println(subject[j + 1] + "점수를 입력해주세요.");
				score[i][j] = scan.nextInt();

				// 합계입력
				// score[i][3]=score[i][3]+score[i][j];
				score[i][score[i].length - 1] += score[i][j];

			} // for j

			avg[i] = score[i][score[i].length - 1] / (score[i].length - 1); // 합계/3 = 평균
			// avg[i] = score[i][3]/3; // 합계/3 = 평균

		} // for i

		// 출력

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}

		System.out.println();// 타이틀 모두 출력후 엔터키

		for (int i = 0; i < score.length; i++) { // int ->[3] [4]
			System.out.print(name[i] + "\t");
			// 점수출력
			for (int j = 0; j < score[i].length; j++) { // int [3] ->[4]
				System.out.print(score[i][j] + "\t");
			} // for j

			// 평균출력
			System.out.print(avg[i] + "\n");
		} // for i

	}// main
}// class
