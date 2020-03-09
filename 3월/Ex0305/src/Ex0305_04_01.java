import java.util.Calendar;

public class Ex0305_04_01 {

	public static void main(String[] args) {

		// ���� �ð�����
		// 2020�� 7�� 24�� �ݿ��� 11:59:59
		// ������� ���� ��� ���ʰ� ���Ҵ��� ����Ͻÿ�.
		// 150�� 12�� 39�� 50�� ���ҽ��ϴ�.

		int[] time_unit = { 24 * 60 * 60, 60 * 60, 60, 1 };
		String[] time_name = { "��", "��", "��", "��" };

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		cal2.set(2020, 7, 24, 13, 59, 59);

		System.out.println("����ð� : " + cal1.getTimeInMillis());
		System.out.println("����D-Day : " + cal2.getTimeInMillis());

		long remain = Math.abs(cal1.getTimeInMillis() - cal2.getTimeInMillis()) / 1000;
		long remain1 = Math.abs(cal1.getTimeInMillis() - cal2.getTimeInMillis());

		System.out.println("remain ��� : " + remain);
		System.out.println("remain1 ��� : " + remain1);

		String result = "";
		for (int i = 0; i < time_unit.length; i++) {
			result += (remain / time_unit[i]) + time_name[i];
			remain = remain % time_unit[i];
		}

		// 1000000��
		// 1000000/86400 -> ��
		// (1000000%86400)/3600 -> ��
		// ((1000000%86400)%3600)/60 -> ��
		// ((1000000%86400)%3600)%60)/1 -> ��

		System.out.println("���� �ð� : " + result);

	}

}