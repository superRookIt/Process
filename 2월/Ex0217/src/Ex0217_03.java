import java.util.Scanner;

public class Ex0217_03 {

	// ���� �޼ҵ� �ۿ��� ���� ���� ���� �Ѥ�...
	int a = 0;

	// �޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String[] title = { "�̸�", "����", "����", "����", "�հ�", "���" };
		String[] name = new String[5];
		int[][] score = new int[5][4];
		double[] avg = new double[5];

		for (int i = 0; i < name.length; i++) {
			System.out.println("�̸� �Է�");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println(title[j + 1] + " �����Է�");
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
