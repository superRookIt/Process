
public class Ex0211_07 {

	public static void main(String[] args) {
		// [3][3]

		int[][] sam = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] three_ = new int[3][3];

		for (int i = 0; i < three_.length; i++) {
			for (int j = 0; j < three_[i].length; j++) {
				three_[i][j] = (i * 3) + j + 1; //★3의 배수
			}

		}

		System.out.println("2차원 배열");
		for (int i = 0; i < three_.length; i++) {
			for (int j = 0; j < three_[i].length; j++) {
				System.out.print(three_[i][j] + "  ");

			}
			System.out.println();
		}

		int[][] three = new int[3][3];

		three[0][0] = 1;
		three[0][1] = 2;
		three[0][2] = 3;
		three[1][0] = 4;
		three[1][1] = 5;
		three[1][2] = 6;
		three[2][0] = 7;
		three[2][1] = 8;
		three[2][2] = 9;

	}

}
