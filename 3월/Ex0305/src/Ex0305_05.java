import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0305_05 {
	public static void main(String[] args) {

		// 2020년 3월 14일 15시 39분 42초
		// 2021년 4월 14일 12시 59분 59초
		// 며칠 몇시 몇분 몇초가 남았는지 계산하시오
		// 2021년 4월 14일은 무슨 요일인지 출력하시오.

		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		// Calendar가 추상메소드라 객체를 만들 수 없음

		// System.out.println(cal.getTime()); -> Thu Mar 05 13:46:13 KST 2020

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println("sdf : " + sdf.format(cal.getTime())); // 2020-03-05 13:47:41

		cal.set(2020, 2, 14, 15, 39, 42); // month에는 1을 빼서 넣기 3월이면 2 (0이 1월이니까) ★
		cal2.set(2021, 3, 14, 12, 59, 59); // month에는 1을 빼서 넣기 4월이면 3 (0이 1월이니까) ★

		System.out.println("cal : " + cal.getTime());
		System.out.println("cal2 : " + cal2.getTime());

		System.out.println("cal2 년도 : " + cal2.get(Calendar.YEAR));
		System.out.println("cal2 요일 : " + cal2.get(Calendar.DAY_OF_WEEK));

		long remain = Math.abs(cal.getTimeInMillis() - cal2.getTimeInMillis()) / 1000;
		long between = Math.abs((cal.getTimeInMillis() / 1000) - (cal2.getTimeInMillis() / 1000));
		// 왜 1000을 나누지?? ★★★★★ 밀리세컨드가 1000분의 1 ^^

		System.out.println("현재 시간을 초로 환산 (Long 타입) : " + (cal.getTimeInMillis() - cal2.getTimeInMillis()) / 1000);

		System.out.println("remain : " + remain);
		System.out.println("between : " + between);

		int l = (int) remain;

		int day = (int) ((between) / (24 * 60 * 60 * 1));
		int hour = (int) (between % (24 * 60 * 60 * 1)) / (60 * 60 * 1);
		int minute = (int) (between % (24 * 60 * 60 * 1)) % (60 * 60 * 1) / 60;
		int second = (int) ((((between % (24 * 60 * 60 * 1)) % (60 * 60 * 1))) % 60) / 1;

		int a = l / 86400;
		int b = (l % 86400) / 3600;
		int c = ((l % 86400) % 3600) / 60;
		int d = (((l % 86400) % 3600) % 60) / 1;

		System.out.println(day + "일 " + hour + "시 " + minute + "분 " + second + "초 ");
		System.out.println(a + "일 " + b + "시 " + c + "분 " + d + "초 ");

	}// main

}// class
