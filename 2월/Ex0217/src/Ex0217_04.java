import java.util.Scanner;

public class Ex0217_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��, �� - int , �� -float �Ҽ��� ù°�ڸ� 59.5
		// 10���� time�� �޽��ϴ�
		// �迭�� �����ؼ� ���弼��
		// �˶��ð� ���� ���α׷�
		// 13:20:52.1��

		Scanner scan = new Scanner(System.in);
		
		Time[] t = new Time[3]; //�ڡڡڡڡ�
		
		for(int i=0; i<t.length;i++) {
		     t[i]= new Time(); //�ڡڡڡڡ� 
		     System.out.println("�ø� �Է��ϼ���. >>");
		     t[i].hour=scan.nextInt();
		     System.out.println("���� �Է��ϼ���. >>");
		     t[i].minute=scan.nextInt();
		     System.out.println("���� �Է��ϼ���. >>");
		     t[i].second=scan.nextFloat();
		     t[i].print();
		}
		

//		int[] hour = new int[2];
//		int[] minute = new int[2];
//		float[] second = new float[2];
//
//		System.out.println("[ �˶��ð� ���� ���α׷� ]");
//
//		for (int i = 0; i < hour.length; i++) {
//			System.out.print("�ð��� �Է��ϼ���. >>");
//			hour[i] = scan.nextInt();
//			System.out.println("���� �Է��ϼ���. >>");
//			minute[i] = scan.nextInt();
//			System.out.println("�ʸ� �Է��ϼ���. >>");
//			second[i] = scan.nextFloat();
//
//			System.out.printf("�˶����� : %d�� %d�� %.1f�� ", hour[i], minute[i], second[i]);
//
//			System.out.println();
//		}

	}// main

}// class
