import java.util.Scanner;

public class Ex0207_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �¾ ���� Ȯ���ؼ� 12,1,2 ==> �ܿ� , 3,4,5==>��, 6,7,8 ==>����, 9,10,11 =>�ܿ�
		// �ֹι�ȣ�� �Է¹޾Ƽ�
		// 1. switch������
		// 2. if��

		Scanner scan = new Scanner(System.in);
		String b = ""; // �ֹι�ȣ �Էº���
		String c = ""; // substring 2�ڸ�
		int d = 0; // ���� ��

		System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ���");
		b = scan.nextLine();
		c = b.substring(2, 4); // substring(������, ������)
		d = Integer.parseInt(c); // (���ڷ� ġȯ)

//		switch (d) {
//
//		case 3:
//		case 4:
//		case 5:
//			System.out.println(d+"��");
//			System.out.println("����� ���� �¾����");
//			break;
//
//		case 6:
//		case 7:
//		case 8:
//			System.out.println(d+"��");
//			System.out.println("����� ������ �¾����");
//			break;
//
//		case 9:
//		case 10:
//		case 11:
//			System.out.println(d+"��");
//			System.out.println("����� ������ �¾����");
//			break;
//
//		case 12:
//		case 1:
//		case 2:
//			System.out.println(d+"��");
//			System.out.println("����� �ܿ￡ �¾����");
//			break;

		if (d == 12 || d == 1 || d == 2) {
			System.out.print(d + "��");
			System.out.println("����� �ܿ￡ �¾����");
		}
		if (d == 3 || d == 4 || d == 5) {
			System.out.print(d + "��");
			System.out.println("����� ���� �¾����");
		}
		if (d == 6 || d == 7 || d == 8) {
			System.out.print(d + "��");
			System.out.println("����� ������ �¾����");
		}
		if (d == 9 || d == 10 || d == 11) {
			System.out.print(d + "��");
			System.out.println("����� ������ �¾����");
		}

		// �ڡڡڡڡ� c = b.substring(2,4); // substring(������, ������) �ڡڡڡڡ�

	} // main

} // class
