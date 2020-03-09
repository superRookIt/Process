import java.util.Calendar;

public class Ex0305_04 {
	public static void main(String[] args) {

		int[] time_unit = { 24 * 60 * 60, 60 * 60, 60, 1 };
		String[] time_name = { "��", "��", "��", "��" };

		Calendar tok = Calendar.getInstance();

		Calendar tok2 = Calendar.getInstance();

		tok2.set(2020, 7, 24, 13, 59, 59);

		System.out.println("���� : " + tok.getTimeInMillis());
		System.out.println("���� : " + tok2.getTimeInMillis());

		long remain = Math.abs(tok.getTimeInMillis() - tok2.getTimeInMillis()) / 1000;

		System.out.println("��� : " + remain);

		String result = "";

		for (int i = 0; i < time_unit.length; i++) {
			result += (remain / time_unit[i]) + time_name[i];
			remain = remain % time_unit[i];

		}

		System.out.println("���� �ð� : " + result);

		// 1000000��
		// 1000000/86400 -> ��
		// (1000000%86400)/3600 -> ��
		// ((1000000%86400)%3600)/60 -> ��
		// (((1000000%86400)%3600)%60)/1 -> ��

	}

}
