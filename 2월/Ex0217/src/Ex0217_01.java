import java.util.Scanner;

public class Ex0217_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		Student[] st = new Student[5];// 5���� �л���ü ����

		String[] sub = { "�̸�", "����", "����", "����", "�հ�", "���" };

		// �̸�, ����, ��� �Է�
		for (int i = 0; i < st.length; i++) {
			st[i] = new Student(); // �ڡڡڡڡ�
			System.out.println("�л� �̸��� �Է����ּ��� >>");
			st[i].name = scan.next();
			System.out.println("���������� �Է����ּ���. ");
			st[i].kor = scan.nextInt();
			System.out.println("���������� �Է����ּ���. ");
			st[i].eng = scan.nextInt();
			System.out.println("���������� �Է����ּ���. ");
			st[i].math = scan.nextInt();
			scan.nextLine(); // �ڡڡ�
			st[i].total();
			st[i].avg();

		}

		System.out.println("����ϰڽ��ϴ�");

		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i] + "\t");
		}

		System.out.println();

		for (int j = 0; j < st.length; j++) {
			System.out.print(st[j].name + "\t");
			System.out.print(st[j].kor + "\t");
			System.out.print(st[j].eng + "\t");
			System.out.print(st[j].math + "\t");
			System.out.print(st[j].total + "\t");
			System.out.print(st[j].avg + "\t");

			System.out.println();

		} // for i

	}// main

}// class
