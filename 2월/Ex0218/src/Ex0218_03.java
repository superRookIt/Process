
public class Ex0218_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d = new Data();
		d.x = 10;
		Data.y = 50;

		System.out.println("1��° d.x : " + d.x);

		// - Ŭ���� �޼ҵ�
		// Ŭ������.������
		// ���� Ŭ���� �������� Ŭ������ ���� ����!
		// Ex0218_03.change(d.x);

		int dx = change(d); // Date�� �ּҰ��� ����

		System.out.println("2��° dx : " + dx);
		System.out.println("2��° d.x : " + d.x);

	}// main

	static int change(Data d) {// void�� ���ϰ� x, int�� ���ϰ� o
		d.x = d.x + 200; // �������� , 210 = 10+200
		return d.x;
	} //

}// class
