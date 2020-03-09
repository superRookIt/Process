import java.text.ParseException;
import java.text.SimpleDateFormat; // ★★★
import java.util.Calendar;
import java.util.Date; // ★★★

public class Ex0305_01 {
	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();

		Calendar today2 = Calendar.getInstance();

		long bet = 0L;

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println("포맷없는 일시출력 : " + today.getTime());
		System.out.println("포맷있는 일시출력 : " + format1.format(today.getTime()));

		System.out.println("현재시간을 밀리세컨드로 출력 : " + today.getTimeInMillis());

		today2.set(Calendar.YEAR, 2021);
		today2.set(Calendar.MONTH, 02);
		today2.set(Calendar.DATE, 14);
		today2.set(Calendar.HOUR, 11);
		today2.set(Calendar.MINUTE, 59);
		today2.set(Calendar.SECOND, 59);

		int year = today.get(Calendar.YEAR);
		System.out.println("현재 년도 : " + year);

		int month = today.get(Calendar.MONTH); // MONTH는 0부터 시작
//		System.out.println("현재 월 : " + month+1); //-> 21로 나옴 
		System.out.println("현재 월 : " + (month + 1)); // 괄호로 묶어줘야 함★★★

		int date = today.get(Calendar.DATE);
		System.out.println("현재 일 : " + date);

		System.out.println("--------------------------");

		int year2 = today2.get(Calendar.YEAR);
		System.out.println("today2 년도 : " + year);

		int month2 = today2.get(Calendar.MONTH); // MONTH는 0부터 시작
		System.out.println("today2 월 : " + (month2 + 1)); // 괄호로 묶어줘야 함★★★

		int date2 = today2.get(Calendar.DATE);
		System.out.println("today2 일 : " + date);

		System.out.println("today2 밀리세컨 : " + today2.getTimeInMillis());

		String d_day = "2020-03-14 11:59:59";

		try { // ctrl shift o 하면 import해줌 (Date 등 )
			Date enddate = format1.parse(d_day); // parse문, try-catch문 알아서 해줌
			System.out.println("직접입력 일시 : " + enddate.getTime());
			bet = (today.getTimeInMillis() - enddate.getTime());
			System.out.println("long 타입 변수 : " + bet);
			System.out.println("현재시간과 직접입력시간 차이 : " + (today.getTimeInMillis() - enddate.getTime()));
			System.out.println("현재시간과 직접입력시간 차이 (abs) : " + Math.abs((today.getTimeInMillis() - enddate.getTime())));
			// math.abs 절대값 ★★★

		} catch (ParseException e) {
			e.printStackTrace(); // printStackTrace 어떤 에러가 났는지 알려주는
		}

//		System.out.println(enddate.getTime()); enddate 지역변수라서 try-catch문 벗어나면 에러

	}// main

}// class
