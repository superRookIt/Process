import java.util.Scanner;

public class Ex0214_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = 0;
		String[] name = new String[10];
		int[][] sub = new int[10][4]; // 국어,영어,수학
		String[] list = { "이름", "국어", "영어", "수학", "합계", " 평균", "등수" }; // "국어", "영어", "수학", "합계"
		int[] rank = new int[10];
		int count = 1;
		double[] avg = new double[10];
		int stu_num = 0, s_num = 0; // ★★
		String yn = "";
		String stu_name = "";

		while (true) {

			System.out.println("------------------");
			System.out.println("    성적처리프로그램    ");
			System.out.println("------------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 등수처리");
			System.out.println("4. 학생성적검색");
			System.out.println("0. 시스템종료");
			System.out.println("------------------");
			System.out.println("원하는 번호를 입력하세요");
			a = scan.nextInt();

			switch (a) {

			case 1:

				System.out.println("성적입력을 선택하셨습니다");

				for (int i = stu_num; i < name.length; i++) {
					System.out.println("이름을 입력해주세요 >> 종료 99");
					name[i] = scan.next();

					if (name[i].equals("99")) {
						System.out.println("이전화면으로 이동합니다");
						name[i] = "";
						break;
					}

					for (int j = 0; j < sub[i].length - 1; j++) {
						System.out.println(name[i] + "의 " + (list[j + 1]) + " 성적을 입력해주세요");
						sub[i][j] = scan.nextInt();

						sub[i][sub[i].length - 1] += sub[i][j];

					} // for j

					avg[i] = sub[i][sub[i].length - 1] / 3;
					stu_num++; // ★★★★★ 입력된 학생수

				} // for i

				break;

			case 2:

				System.out.println("성적출력을 선택하셨습니다");

				for (int i = 0; i < list.length; i++) {
					System.out.print(list[i] + "\t");
				}

				System.out.println();

				for (int i = 0; i < name.length; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < sub[i].length; j++) {
						System.out.print(sub[i][j] + "\t");

					} // for j

					System.out.print(avg[i] + "\t");
					System.out.print(rank[i] + "\t");
					System.out.println();
				}

				System.out.println("다시 출력하시겠습니까? (y/n)");
				yn = scan.next();
				if (yn.equals("N") || (yn.equals("n"))) { // ★★★
					System.out.println("이전화면으로 이동합니다");
					break;
				}

				break;

			case 3:

				System.out.println("등수처리를 선택하셨습니다.");

				for (int i = 0; i < sub.length; i++) {
					count = 1; // ★★★
					for (int j = 0; j < sub.length; j++) {
						if (sub[i][sub[i].length - 1] < sub[j][sub[i].length - 1]) {
							count++;
						}

					} // for j

					rank[i] = count;

				} // for i

				System.out.print("이름" + "\t" + "등수" + "\n");
				for (int i = 0; i < sub.length; i++) {
					System.out.print(name[i] + "\t");
					System.out.print(rank[i] + "\t");
					System.out.println();
				}

				break;

			case 4:

				System.out.println("학생성적검색을 선택하셨습니다.");
				System.out.println("원하는 학생의 이름을 입력하세요. >>");
				stu_name = scan.next();
				// 학생이름으로 학생전체를 검색
				for (int i = 0; i < name.length; i++) {
					if (stu_name.equals(name[i])) {
						s_num = i;
						break;
					}

					s_num = -1; // 없을때 -1로 세팅

				} // for i

				if (!(s_num == -1)) {

					for (int i = 0; i < list.length; i++) {
						System.out.print(list[i] + "\t");
					}

					System.out.println();

					System.out.print(name[s_num] + "\t");

					for (int j = 0; j < sub[s_num].length; j++) {
						System.out.print(sub[s_num][j] + "\t");

					} // for j

					System.out.print(avg[s_num] + "\t");
					System.out.print(rank[s_num] + "\t");
					System.out.println();

					break;

				}

				System.out.println("원하는 학생이 없습니다");
				break;

			case 0:
				System.out.println("시스템을 종료합니다 ^^");
				break;

			}// switch

		} // while

	}// main

}// class
