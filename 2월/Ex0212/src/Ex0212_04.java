import java.util.Scanner;

public class Ex0212_04 {

	public static void main(String[] args) {

		// 학생들의 점수를 입력하는 배열
		// 이름을 입력하는 배열 3개, 점수를 입력하는 배열 [3],[3] - 국어,영어,수학

		// String[] name = new String[3];

		int[][] score = new int[3][4]; // 합계를 추가

		Scanner scan = new Scanner(System.in);

		String[] name = { "홍길동", "이순신", "강감찬" };
		String[] subject = { "국어", "영어", "수학" };

		// 이름입력
		for (int i = 0; i < score.length; i++) {
			System.out.println("이름을 입력하세요. >>");
			name[i] = scan.next();
			// 점수입력
			for (int j = 0; j < score[i].length - 1; j++) { // ★★★score[i].length-1
				System.out.print(subject[j] + "과목 ");
				System.out.println("점수");
				score[i][j] = scan.nextInt();
			}

			// 합계
			for (int j = 0; j < score[i].length - 1; j++) {
				score[i][score[i].length - 1] += score[i][j];
				// score[i][score[i].length] = score[i][score[i].length]+score[i][j];
                // [score[i].length] -> 4-1
			}

		}

		// 학생의 국어, 영어, 수학 합계 배열
		// 배열 1이 증가

//		int[][] score = {
//				{100, 88, 79}, 
//				{100, 99, 87},
//				{79,88,85}
//		};

		System.out.print("\t" + "국어\t" + "영어\t" + "수학\t" + "합계\t \n"); // %n이나 \n은 똑같음
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}

	}// main
}// class
