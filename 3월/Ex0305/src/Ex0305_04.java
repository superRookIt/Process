import java.util.Calendar;

public class Ex0305_04 {
	public static void main(String[] args) {

		int[] time_unit = { 24 * 60 * 60, 60 * 60, 60, 1 };
		String[] time_name = { "일", "시", "분", "초" };

		Calendar tok = Calendar.getInstance();

		Calendar tok2 = Calendar.getInstance();

		tok2.set(2020, 7, 24, 13, 59, 59);

		System.out.println("현재 : " + tok.getTimeInMillis());
		System.out.println("최종 : " + tok2.getTimeInMillis());

		long remain = Math.abs(tok.getTimeInMillis() - tok2.getTimeInMillis()) / 1000;

		System.out.println("결과 : " + remain);

		String result = "";

		for (int i = 0; i < time_unit.length; i++) {
			result += (remain / time_unit[i]) + time_name[i];
			remain = remain % time_unit[i];

		}

		System.out.println("남은 시간 : " + result);

		// 1000000초
		// 1000000/86400 -> 일
		// (1000000%86400)/3600 -> 시
		// ((1000000%86400)%3600)/60 -> 분
		// (((1000000%86400)%3600)%60)/1 -> 초

	}

}
