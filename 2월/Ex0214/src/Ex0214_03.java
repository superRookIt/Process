import java.util.Scanner;

public class Ex0214_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 영어단어 맞추기 게임
		// 영어 - 한글설명
		// 1. 영어, 한글 데이터 입력 - 미리 입력만듬
		// 2. 영어 출력 후 한글 입력 받음
		// 3. 한글이 맞는지? 확인
		// 결과 출력
		// 다시 문제 출력

		// 데이터 입력

		Scanner scan = new Scanner(System.in);
		String in_str = "";
		int count = 0; // 횟수

		String[][] word = {

				{ "chair", "의자" }, { "computer", "컴퓨터" }, { "array", "배열" }

		};

		for (int i = 0; i < word.length; i++) {

			System.out.println(word[i][0] + "뜻은 무엇일까요?");
			in_str = scan.nextLine();

			// 정답비교
			if (word[i][1].equals(in_str)) { // ★★★★★String은 equals로 비교 !!
				System.out.println("정답입니다. 다음문제 도전");
			} else {

				if (count < 3) {
					System.out.println(count + 1 + "번째 오답입니다. 다시도전!");
					i--; // ★★★★★ 현재문제 다시 출제
					count++; // 횟수 추가
					continue;
				}

				System.out.println("오답입니다. 정답은? " + word[i][1] + "입니다");
				count = 0; // ★★★★★ count 초기화!!!!!(왜 여기에 위치해있는지)

			}

		} // for i

	}// main

}// class
