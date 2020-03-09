import java.util.Calendar;

public class Ex0305_04_01 {

	public static void main(String[] args) {

		// 현재 시간에서
		// 2020년 7월 24일 금요일 11:59:59
		// 현재까지 몇일 몇분 몇초가 남았는지 계산하시오.
		// 150일 12시 39분 50초 남았습니다.

		int[] time_unit = { 24 * 60 * 60, 60 * 60, 60, 1 };
		String[] time_name = { "일", "시", "분", "초" };

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		cal2.set(2020, 7, 24, 13, 59, 59);

		System.out.println("현재시간 : " + cal1.getTimeInMillis());
		System.out.println("최종D-Day : " + cal2.getTimeInMillis());

		long remain = Math.abs(cal1.getTimeInMillis() - cal2.getTimeInMillis()) / 1000;
		long remain1 = Math.abs(cal1.getTimeInMillis() - cal2.getTimeInMillis());

		System.out.println("remain 결과 : " + remain);
		System.out.println("remain1 결과 : " + remain1);

		String result = "";
		for (int i = 0; i < time_unit.length; i++) {
			result += (remain / time_unit[i]) + time_name[i];
			remain = remain % time_unit[i];
		}

		// 1000000초
		// 1000000/86400 -> 일
		// (1000000%86400)/3600 -> 시
		// ((1000000%86400)%3600)/60 -> 분
		// ((1000000%86400)%3600)%60)/1 -> 초

		System.out.println("남은 시간 : " + result);

	}

}