import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex0305_03 { // (������)

	public static void main(String[] args) {

		// 2020�� 7�� 24�� �ݿ��� 11:59:59
		// ������� ��ĥ ��� ���ʰ� ���Ҵ��� ����Ͻÿ�
		// ex)150�� 12�ð� 39��.. ��

		Calendar tok = Calendar.getInstance();

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String d_day = "2020-07-24 11:59:59";

		long b = 0;

		try {
			Date enddate = format1.parse(d_day); // parse�� ��
			b = (tok.getTimeInMillis() - enddate.getTime());
			System.out.println("���� : " + Math.abs((tok.getTimeInMillis() - enddate.getTime())));

		} catch (ParseException e) {
			e.printStackTrace();
		}

		int a = (int) b;

		System.out.println(
				(a / 3110400 + "�� " + (a % 3110400) / 259200 + "�ð� " + (((a % 3110400) % 259200) / 86400) + "��"));

	}// main

}// class
