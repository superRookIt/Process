import java.util.Scanner;

public class Ex0217_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 시, 분 - int , 초 -float 소수점 첫째자리 59.5
		// 10개의 time을 받습니다
		// 배열을 선언해서 만드세요
		// 알람시간 맞춤 프로그램
		// 13:20:52.1초

		Scanner scan = new Scanner(System.in);
		
		Time[] t = new Time[3]; //★★★★★
		
		for(int i=0; i<t.length;i++) {
		     t[i]= new Time(); //★★★★★ 
		     System.out.println("시를 입력하세요. >>");
		     t[i].hour=scan.nextInt();
		     System.out.println("분을 입력하세요. >>");
		     t[i].minute=scan.nextInt();
		     System.out.println("초을 입력하세요. >>");
		     t[i].second=scan.nextFloat();
		     t[i].print();
		}
		

//		int[] hour = new int[2];
//		int[] minute = new int[2];
//		float[] second = new float[2];
//
//		System.out.println("[ 알람시간 설정 프로그램 ]");
//
//		for (int i = 0; i < hour.length; i++) {
//			System.out.print("시간을 입력하세요. >>");
//			hour[i] = scan.nextInt();
//			System.out.println("분을 입력하세요. >>");
//			minute[i] = scan.nextInt();
//			System.out.println("초를 입력하세요. >>");
//			second[i] = scan.nextFloat();
//
//			System.out.printf("알람설정 : %d시 %d분 %.1f초 ", hour[i], minute[i], second[i]);
//
//			System.out.println();
//		}

	}// main

}// class
