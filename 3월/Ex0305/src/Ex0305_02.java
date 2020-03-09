import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0305_02 {

	public static void main(String[] args) {

		// 2020�� 3�� 5�� 10:40:55 ���
		// 2020�� 3�� 5�� �����(Day_OF_WEEK)

		Calendar cal = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("���� �Ͻ� :" + sdf.format(cal.getTime())); // �ڡڡڡڡ�

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); // MONTH�� 0���� ����

		// System.out.println("���� �� : " + month+1); //-> 21�� ����
		// System.out.println("���� �� : " + (month + 1)); // ��ȣ�� ������� �ԡڡڡ�

		int date = cal.get(Calendar.DATE);

		String week = "";

		int week1 = cal.get(Calendar.DAY_OF_WEEK);
		String[] week_ = { "", "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };
		// System.out.println(week1); //-> 5

		switch (week1) {

		case 1:

			week = "�Ͽ���";
			break;

		case 2:

			week = "������";
			break;

		case 3:

			week = "ȭ����";
			break;

		case 4:

			week = "������";
			break;

		case 5:

			week = "�����";
			break;

		case 6:

			week = "�ݿ���";
			break;

		case 7:

			week = "�����";
			break;

		}// swtich

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.println("����ð� : " + year + "�� " + (month + 1) + "�� " + date + "�� " + week);
		System.out.println("����ð� : " + year + "�� " + (month + 1) + "�� " + date + "�� " + week_[week1]);

		Calendar cal2 = Calendar.getInstance();

		cal2.set(Calendar.YEAR, 2020);
		cal2.set(Calendar.MONTH, 2); // MONTH�� 0���� ����, 1���� �Է�
		cal2.set(Calendar.DATE, 14);

		System.out.println("cal2 ��¥ : " + cal2.getTime());
		System.out.println("�Է��� �⵵ : " + cal2.get(Calendar.YEAR));
		System.out.println("�Է��� �� : " + cal2.get(Calendar.MONTH));
		System.out.println("�Է��� �� : " + cal2.get(Calendar.DATE));

	}// main

}// class
