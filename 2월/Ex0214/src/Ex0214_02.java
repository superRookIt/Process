
public class Ex0214_02 {

	public static void main(String[] args) {

		// 정렬 ~ 1428548419
		// 1. 10개의 배열을 만든다.
		// 2. 각 랜덤으로 0~9까지 숫자를 넣는다.
		// 3. 첫번째와 두번째 비교 자리바꿈, 두번째와 세번째 비교 자리바꿈
		// 4. 연속으로 체크
		// 5. 출력

		int[] arr1 = new int[10];
		int temp = 0; // 임시저장
		boolean check = false; // 자리변경 체크변수

		// 배열에 0~9
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 10);
		}

		System.out.print("처음 배열 : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}

		System.out.println();

		// 첫번째, 두번째 비교후 자리 바꿈
		for (int i = 0; i < arr1.length; i++) {
			check = false;
			for (int j = 0; j < arr1.length - 1 - i; j++) { // ★★★★★ arr1.length -1 - i, 비교는 9번 ★★★★★
				if (arr1[j] > arr1[j + 1]) { // ★
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
					check = true;// if를 거쳤으면 ! ★★
				}

			} // for j

			System.out.print((i + 1) + "번째 정렬 : " + "\t");
			// 한번씩 정렬 출력
			for (int k = 0; k < arr1.length; k++) {
				System.out.print(arr1[k] + "\t");
			}

			System.out.println();

			if (check == false) {
				System.out.println("모든 정렬이 완료되었습니다.");
				break;
			}

		} // for i

		// 출력
		System.out.print("최종 정렬 : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}

	}// main

}// class
