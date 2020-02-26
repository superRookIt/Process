import java.util.Scanner;

public class Ex0213_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int random = (int) (Math.random() * 100) + 1; // 1~100까지 1개
		int[] input = new int[20];// 입력하는 숫자
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int success = 0;
		int cor = 0;

		while (count < 20) {
			System.out.println("숫자 1개를 입력하세요. >>");
			input[count] = scan.nextInt();
			if (random > input[count]) {
				System.out.println("숫자가 작습니다." + input[count] + "보다 큰 수를 입력하세요.");

			} else if (random == input[count]) {
				System.out.println("빙고");
				success++;
				cor = input[count];
				break;
			} else {
				System.out.println("숫자가 큽니다." + input[count] + "보다 작은 수를 입력하세요.");
			}

			count++; // ★★★★

			if (count == 20) { // ★★★★ 마지막 20번째는 -1을 해주고 반복분을 빠져나옴!!!
				count--;
				break;
			}

		} // while

		System.out.print("횟수 : " + "\t");
		for (int i = 0; i <= count; i++) { // ★★★★ <=count
			System.out.print(i + 1 + "\t");
		}

		System.out.println();

		System.out.print("입력한 숫자 : " + "\t");
		for (int i = 0; i <= count; i++) {
			System.out.print(input[i] + "\t");
		}

		System.out.println();

		if (!(success == 0)) {
			System.out.println(count + 1 + "번째에 " + cor + " 맞췄습니다");
		} else {
			System.out.println(count + 1 + "번 해도 못 맞춤 ㅋㅋ");
		}

	}

}
