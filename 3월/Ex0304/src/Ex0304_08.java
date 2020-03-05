import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0304_08 {

	public static void main(String[] args) {

		// 날짜
		Calendar today = Calendar.getInstance(); // 현재 시간을 가져 옴

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
		// MM은 달(Month) , mm은 분(minute) !!

		System.out.println("현재 년도 : " + today.get(Calendar.YEAR));
		// -> 현재 일시 : 2020, YEAR 대문자
		System.out.println("현재 월 : " + today.get(Calendar.MONTH + 1));
		// -> 현재 월 : 2, MONTH는 +1을 해줘야 함 (MONTH 대문자)
		System.out.println("현재 일 : " + today.get(Calendar.DATE));
		// -> 현재 일 : 4, DATE 대문자

		System.out.println(format1.format(today.getTime())); // -> 2020/03/04/ 17:21:03

//		System.out.println(today.getTime()) -> Wed Mar 04 17:18:26 KST 2020

	}// main

}// class
