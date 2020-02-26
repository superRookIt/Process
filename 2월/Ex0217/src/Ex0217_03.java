import java.util.Scanner;

public class Ex0217_03 {

	// 메인 메소드 밖에서 변수 선언 가능 ㅡㅡ...
	int a = 0;

	// 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
		String[] name = new String[5];
		int[][] score = new int[5][4];
		double[] avg = new double[5];

		for (int i = 0; i < name.length; i++) {
			System.out.println("이름 입력");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println(title[j + 1] + " 점수입력");
				score[i][j] = scan.nextInt();

				score[i][score[i].length-1] += score[i][j];

			}

			avg[i] = score[i][score[i].length-1] / 3;

		}

		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		
		System.out.println();

		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(avg[i] + "\t");

			System.out.println();
		}

//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		Tv2 tt1 = new Tv2();
//
//		t2 = t1;
//
//		t1.channel = 10;
//
//		System.out.println(t1.channel);
//
//		Tv2 tv2 = new Tv2();
//		tv2.volume = 10;
//
//		tv2.volumeDown();
//		System.out.println(tv2.volume);

	}// main

}// class
