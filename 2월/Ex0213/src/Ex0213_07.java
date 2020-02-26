import java.util.Scanner;

public class Ex0213_07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int stu = 0;
		System.out.println("몇명의 학생수를 입력할까요");
		stu = scan.nextInt();

		String[] name = new String[stu];
		String[] subject = { "이름", "국어", "영어", "합계", "평균", "등수" };
		int[][] score = new int[stu][3];
		double[] avg = new double[stu];
		int[] rank = new int[stu];
		int rank_count = 0;

		for (int i = 0; i < name.length; i++) {
			rank_count = 1;
			System.out.println("이름을 입력해주세요");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println(subject[j + 1] + "점수를 입력해주세요");
				score[i][j] = scan.nextInt();

				score[i][score[i].length - 1] += score[i][j];

				if (score[i][score[i].length - 1] < score[j][score[i].length - 1]) {
					rank_count++;

				}

				rank[i] = rank_count;

			} // for j

			avg[i] = score[i][score[i].length - 1] / 2;

		} // for i

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}

		System.out.println();

		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++)
				System.out.print(score[i][j] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.println(rank[i] + "\t");
		}

	}// main

}// class
