import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex0305_03 { // (실패작)

	public static void main(String[] args) {

		// 2020년 7월 24일 금요일 11:59:59
		// 현재까지 며칠 몇분 몇초가 남았는지 계산하시오
		// ex)150일 12시간 39분.. ㅡ

		Calendar tok = Calendar.getInstance();

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String d_day = "2020-07-24 11:59:59";

		long b = 0;

		try {
			Date enddate = format1.parse(d_day); // parse문 ★
			b = (tok.getTimeInMillis() - enddate.getTime());
			System.out.println("차이 : " + Math.abs((tok.getTimeInMillis() - enddate.getTime())));

		} catch (ParseException e) {
			e.printStackTrace();
		}

		int a = (int) b;

		System.out.println(
				(a / 3110400 + "일 " + (a % 3110400) / 259200 + "시간 " + (((a % 3110400) % 259200) / 86400) + "분"));

	}// main

}// class
