import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0304_08 {

	public static void main(String[] args) {

		// ��¥
		Calendar today = Calendar.getInstance(); // ���� �ð��� ���� ��

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
		// MM�� ��(Month) , mm�� ��(minute) !!

		System.out.println("���� �⵵ : " + today.get(Calendar.YEAR));
		// -> ���� �Ͻ� : 2020, YEAR �빮��
		System.out.println("���� �� : " + today.get(Calendar.MONTH + 1));
		// -> ���� �� : 2, MONTH�� +1�� ����� �� (MONTH �빮��)
		System.out.println("���� �� : " + today.get(Calendar.DATE));
		// -> ���� �� : 4, DATE �빮��

		System.out.println(format1.format(today.getTime())); // -> 2020/03/04/ 17:21:03

//		System.out.println(today.getTime()) -> Wed Mar 04 17:18:26 KST 2020

	}// main

}// class
