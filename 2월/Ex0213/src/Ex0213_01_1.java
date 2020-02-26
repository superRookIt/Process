import java.util.Scanner;

public class Ex0213_01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int) (Math.random() * 100) + 1; // 1~100까지 1개
		int[] input = new int[20]; // 입력하는 숫자
		int count = 0;

		Scanner scan = new Scanner(System.in);

		while (count < 20) {
			System.out.println("숫자1개를 입력하세요.");
			input[count] = scan.nextInt(); // 0 -> 10
			if (random > input[count]) {
				System.out.println("숫자가 작습니다." + input[count] + "보다 큰수를 입력하세요.");
			} else if (random == input[count]) {
				System.out.println("빙고!");
				break;
			} else {
				System.out.println("숫자가 큽니다." + input[count] + "보다 작은 수를 입력하세요.");
			}
			count++;
			// 마지막 20번째는 -1을 해주고 반복문을 빠져나옴
			if ((count == 20)) {
				count--;
				break;
			}
		}
		System.out.print("횟수 :" + "\t");
		for (int i = 0; i <= count; i++) {
			System.out.print((i + 1) + "\t");
		}
		System.out.println();
		System.out.print("입력한 숫자 :" + "\t");
		for (int i = 0; i <= count; i++) {
			System.out.print(input[i] + "\t");
		}
		System.out.println();
		if (random == input[count]) {
			System.out.println((count + 1) + "번째 " + input[count] + " 맞췄습니다.");
		} else {
			System.out.println("20번째에서도 맞추지 못했습니다.");
			System.out.println("정답은 " + random + " 입니다.");
		}

		// 1~100까지 숫자 1개를 랜덤으로 뽑습니다.
		// (int)(Math.random()*100)+1
		// 무한 돌려서, 숫자를 맞추는 게임
		// 입력한 숫자가 랜덤숫자 1개보다 높은 숫자가 큽니다. 다시입력
		// 작으면 작습니다. 다시입력
		// 맞으면 빙고~!
		// 정답은 예) 5번입니다.

		// 옵션>
		// 자신이 입력한 숫자를 모두 출력을 해주세요.
		// 최대 20번까지 하겠습니다.

	}

}
