import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0305_02 {

	public static void main(String[] args) {

		// 2020년 3월 5일 10:40:55 출력
		// 2020년 3월 5일 목요일(Day_OF_WEEK)

		Calendar cal = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("현재 일시 :" + sdf.format(cal.getTime())); // ★★★★★

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); // MONTH는 0부터 시작

		// System.out.println("현재 월 : " + month+1); //-> 21로 나옴
		// System.out.println("현재 월 : " + (month + 1)); // 괄호로 묶어줘야 함★★★

		int date = cal.get(Calendar.DATE);

		String week = "";

		int week1 = cal.get(Calendar.DAY_OF_WEEK);
		String[] week_ = { "", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		// System.out.println(week1); //-> 5

		switch (week1) {

		case 1:

			week = "일요일";
			break;

		case 2:

			week = "월요일";
			break;

		case 3:

			week = "화요일";
			break;

		case 4:

			week = "수요일";
			break;

		case 5:

			week = "목요일";
			break;

		case 6:

			week = "금요일";
			break;

		case 7:

			week = "토요일";
			break;

		}// swtich

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.println("현재시간 : " + year + "년 " + (month + 1) + "월 " + date + "일 " + week);
		System.out.println("현재시간 : " + year + "년 " + (month + 1) + "월 " + date + "일 " + week_[week1]);

		Calendar cal2 = Calendar.getInstance();

		cal2.set(Calendar.YEAR, 2020);
		cal2.set(Calendar.MONTH, 2); // MONTH는 0부터 시작, 1빼서 입력
		cal2.set(Calendar.DATE, 14);

		System.out.println("cal2 날짜 : " + cal2.getTime());
		System.out.println("입력한 년도 : " + cal2.get(Calendar.YEAR));
		System.out.println("입력한 월 : " + cal2.get(Calendar.MONTH));
		System.out.println("입력한 날 : " + cal2.get(Calendar.DATE));

	}// main

}// class
