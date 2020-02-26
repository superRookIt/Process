import java.util.Scanner;

public class Ex0212_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 양궁경기 1차경기, 2차경기, 합, 평균(소수점 1째자리)
		// 200점만점 최미선, 기보배, 장혜진
		// 3명 200점이상이면 다시 입력
		// [양궁경기]

		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];
		String[] sub = { " ", "1차경기", "2차경기", "합계", "높은", "평균" };
		int[][] shoot = new int[3][4];
		double[] avg = new double[3]; // 평균은 float이나 더블로 따로

		for (int i = 0; i < name.length; i++) {
			System.out.println("이름을 입력해주세요");
			name[i] = scan.next();
			for (int j = 0; j < shoot[i].length - 2; j++) {
				System.out.println("점수를 입력해주세요");
				shoot[i][j] = scan.nextInt();

				// 합계입력 score[i][3]
				shoot[i][shoot[i].length - 2] += shoot[i][j];
			}
			// 최종점수 입력
			if (shoot[i][0] > shoot[i][1]) {
				shoot[i][shoot[i].length - 1] = shoot[i][0];
			} else {
				shoot[i][shoot[i].length - 1] = shoot[i][1];
			}

			// 평균입력 합계/2개점수
			avg[i] = shoot[i][shoot[i].length - 1] / 2.0;

		} // for i

		for (int p = 0; p < sub.length; p++) {
			System.out.print(sub[p] + "\t");
		}
		System.out.println();

		for (int p = 0; p < name.length; p++) {
			System.out.print(name[p] + "\t");
			for (int j = 0; j < shoot[p].length; j++) {
				System.out.print(shoot[p][j] + "\t");
			}
			System.out.print(avg[p] + "\t");
			System.out.println();
		}

	}

}
