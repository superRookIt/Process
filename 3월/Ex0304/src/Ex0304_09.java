import java.text.SimpleDateFormat; //��
import java.util.Calendar; //��

public class Ex0304_09 {
	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
		String format_time1 = format1.format(today.getTime());
		System.out.println(today.getTimeInMillis());
		System.out.println();
		System.out.println("���� �Ͻ� : " + format_time1);
		System.out.println("�� ���� �⵵ : " + today.get(Calendar.YEAR));
		System.out.println("��(0~11, 0:1��) : " + (today.get(Calendar.MONTH) + 1)); // �ڡڡ� ��ȣ�� �� ����� ��
		System.out.println("�� ���� �� ° �� : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ° �� : " + today.get(Calendar.WEEK_OF_MONTH));
		// DATE�� DAY_OF_MONTH�� ����.
		System.out.println("�� ���� ��ĥ : " + today.get(Calendar.DATE));
		System.out.println("�� ���� ��ĥ : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� ���� ��ĥ : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("����(1~7, 1:�Ͽ���) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("�� ���� �� ° ���� : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("����_����(0:���� , 1:����) : " + today.get(Calendar.AM_PM));
		System.out.println("�ð�(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("�ð�(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("��(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("��(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("1000���� 1��(0~999) : " + today.get(Calendar.MILLISECOND));

	}

}
