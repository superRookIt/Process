import java.util.Scanner;

public class Ex0210_01 {
	public static void main(String[] args) {

		// int[] score = new int[5]; // �� 5���� ������ �������.

		// ���������� ������ �ѹ� ��������

		int select = 0;
		int user = 0; // �ڽ��� ������ ����������
		int com = 0; // ��ǻ�Ͱ� ������ ����������
		int count1 = 0; // ����Ƚ��
		int win = 0;
		int lose = 0;
		int draw = 0;
		int count = 0;

		String[] confirm = new String[10]; // ����Ȯ��

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("-------------------------");
			System.out.println("�������������� / ����Ȯ�����α׷�");
			System.out.println("------------------------");
			System.out.println("1. �������������� / 2. ����Ȯ�����α׷�");
			System.out.println("��ȣ�� �������ּ���. (���� :0)>>");

			select = scan.nextInt();
			if (select == 0) {
				break;
			}

			switch (select) {

			case 1:
				System.out.println("���������� start");

				System.out.println("�ݺ� Ƚ���� �Է��ϼ��� ");
				count = scan.nextInt();

				for (int i = 1; i <= count; i++) {
					System.out.println("���� 1, ���� 2, �� 3 �߿� �ϳ��� �����ϼ���");
					user = scan.nextInt();

					if (user < 1 || user > 3) {
						System.out.println("��� ���ڸ� �߸� �־����ϴ�(1-3������)");
						i--; // �ڡڡڡڡ�
						continue;
					}

					com = (int) (Math.random() * 3) + 1;
					System.out.println(i + "��° �� ���ڴ�?");
					// 1-3 = -2(����) 1-1 =0 (���º�) 1-2 -1(�й�)
					// 2-1 = 1(����) 2-2 =0 (���º�) 2-3 -1(�й�)
					// 3-2 = 1(����) 3-3 =0 (���º�) 3-1 2(�й�)

					switch (user - com) {
					case -2:
					case 1:
						System.out.println("����ڰ� �¸�");
						win++;
						confirm[i] = "�¸�";
						break;
					case 0:
						System.out.println("�� �� ��");
						draw++;
						confirm[i] = "���º�";
						break;

					case -1:
					case 2:
						System.out.println("��ǻ�Ͱ� �¸�");
						lose++;
						confirm[i] = "�й�";
						break;

					}
				}
			
				
				break;

			case 2:

				System.out.println("����Ȯ��");
				for(int i =0; i<10; i++) {
					System.out.println((i+1)+"���� ���д�?"+confirm[i]);
					
				}
				
				break;

			}
			
			System.out.println("���� Ƚ�� : " + count);
			System.out.println("�¸� Ƚ�� : " + win);
			System.out.println("���º� Ƚ�� : " + draw);
			System.out.println("�й� Ƚ�� : " + lose);
			System.out.printf("��       �� : %.1f %n", (double) win / count * 100);
			
		} // while

		

		// double rate = (double) win / num; // int�� int�� ������ ������ int�� �Ǵϱ� ������ double�̳�
		// float�� �ٲ��ָ� ��
		
		

//		int[] score = new int[100];
//		int[] sum = new int[100];
//
//		for (int i = 0; i < 100; i++) {
//			score[i] = (i + 1);
//			if(i==0) {
//				sum[i] = 0+ score[i];
//			}else {
//				sum[i]=sum[i-1] + score[i];
//				System.out.println(score[i]+"�������� �� : "+sum[i]);
//			}
//		}
		// 1 = 0 + 1
		// 3 = 1 +2
//		
//		int[] total;
//		total = new int[5];
//		total[0]=5;
//		
//		for(int i = 0; i<100; i++) {
//			score[i] = (i+1);
//		}
//				
//		
//		int[] score100 = new int[5];
//		score1[0]=100;
//		score1[1]=90;
//		score1[2]=80;
//		score1[3]=70;
//		score1[4]=60;
//		
//		int[] score2 = 	{100,90,80,70,60};
//		
//		int[] score3 ;
//		score3 = new int[] {100,90,80,70,60};
//			
//				
//		
//		
// int score1 = (int)(Math.random()*6+1);

	} // main

}// class
