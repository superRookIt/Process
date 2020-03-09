import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0305_05 {
	public static void main(String[] args) {

		// 2020�� 3�� 14�� 15�� 39�� 42��
		// 2021�� 4�� 14�� 12�� 59�� 59��
		// ��ĥ ��� ��� ���ʰ� ���Ҵ��� ����Ͻÿ�
		// 2021�� 4�� 14���� ���� �������� ����Ͻÿ�.

		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		// Calendar�� �߻�޼ҵ�� ��ü�� ���� �� ����

		// System.out.println(cal.getTime()); -> Thu Mar 05 13:46:13 KST 2020

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println("sdf : " + sdf.format(cal.getTime())); // 2020-03-05 13:47:41

		cal.set(2020, 2, 14, 15, 39, 42); // month���� 1�� ���� �ֱ� 3���̸� 2 (0�� 1���̴ϱ�) ��
		cal2.set(2021, 3, 14, 12, 59, 59); // month���� 1�� ���� �ֱ� 4���̸� 3 (0�� 1���̴ϱ�) ��

		System.out.println("cal : " + cal.getTime());
		System.out.println("cal2 : " + cal2.getTime());

		System.out.println("cal2 �⵵ : " + cal2.get(Calendar.YEAR));
		System.out.println("cal2 ���� : " + cal2.get(Calendar.DAY_OF_WEEK));

		long remain = Math.abs(cal.getTimeInMillis() - cal2.getTimeInMillis()) / 1000;
		long between = Math.abs((cal.getTimeInMillis() / 1000) - (cal2.getTimeInMillis() / 1000));
		// �� 1000�� ������?? �ڡڡڡڡ� �и������尡 1000���� 1 ^^

		System.out.println("���� �ð��� �ʷ� ȯ�� (Long Ÿ��) : " + (cal.getTimeInMillis() - cal2.getTimeInMillis()) / 1000);

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

		System.out.println(day + "�� " + hour + "�� " + minute + "�� " + second + "�� ");
		System.out.println(a + "�� " + b + "�� " + c + "�� " + d + "�� ");

	}// main

}// class
