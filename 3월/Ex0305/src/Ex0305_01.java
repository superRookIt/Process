import java.text.ParseException;
import java.text.SimpleDateFormat; // �ڡڡ�
import java.util.Calendar;
import java.util.Date; // �ڡڡ�

public class Ex0305_01 {
	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();

		Calendar today2 = Calendar.getInstance();

		long bet = 0L;

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println("���˾��� �Ͻ���� : " + today.getTime());
		System.out.println("�����ִ� �Ͻ���� : " + format1.format(today.getTime()));

		System.out.println("����ð��� �и�������� ��� : " + today.getTimeInMillis());

		today2.set(Calendar.YEAR, 2021);
		today2.set(Calendar.MONTH, 02);
		today2.set(Calendar.DATE, 14);
		today2.set(Calendar.HOUR, 11);
		today2.set(Calendar.MINUTE, 59);
		today2.set(Calendar.SECOND, 59);

		int year = today.get(Calendar.YEAR);
		System.out.println("���� �⵵ : " + year);

		int month = today.get(Calendar.MONTH); // MONTH�� 0���� ����
//		System.out.println("���� �� : " + month+1); //-> 21�� ���� 
		System.out.println("���� �� : " + (month + 1)); // ��ȣ�� ������� �ԡڡڡ�

		int date = today.get(Calendar.DATE);
		System.out.println("���� �� : " + date);

		System.out.println("--------------------------");

		int year2 = today2.get(Calendar.YEAR);
		System.out.println("today2 �⵵ : " + year);

		int month2 = today2.get(Calendar.MONTH); // MONTH�� 0���� ����
		System.out.println("today2 �� : " + (month2 + 1)); // ��ȣ�� ������� �ԡڡڡ�

		int date2 = today2.get(Calendar.DATE);
		System.out.println("today2 �� : " + date);

		System.out.println("today2 �и����� : " + today2.getTimeInMillis());

		String d_day = "2020-03-14 11:59:59";

		try { // ctrl shift o �ϸ� import���� (Date �� )
			Date enddate = format1.parse(d_day); // parse��, try-catch�� �˾Ƽ� ����
			System.out.println("�����Է� �Ͻ� : " + enddate.getTime());
			bet = (today.getTimeInMillis() - enddate.getTime());
			System.out.println("long Ÿ�� ���� : " + bet);
			System.out.println("����ð��� �����Է½ð� ���� : " + (today.getTimeInMillis() - enddate.getTime()));
			System.out.println("����ð��� �����Է½ð� ���� (abs) : " + Math.abs((today.getTimeInMillis() - enddate.getTime())));
			// math.abs ���밪 �ڡڡ�

		} catch (ParseException e) {
			e.printStackTrace(); // printStackTrace � ������ ������ �˷��ִ�
		}

//		System.out.println(enddate.getTime()); enddate ���������� try-catch�� ����� ����

	}// main

}// class
