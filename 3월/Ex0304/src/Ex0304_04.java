import java.util.Scanner;

public class Ex0304_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Kard k1 = new Kard(1, "�̼���", "���źμ�", "����", 5000000, 120, 10, "02-546-5456");
		Kard k2 = new Kard(2, "ȫ�浿", "�ѹ��μ�", "�븮", 3000000, 60, 5, "054-546-5456");
		Kard k3 = new Kard(3, "����", "�����μ�", "����", 2000000, 36, 3, "032-546-5456");
		// 3���� ������ �Է��ϰ� toString�� �������̵� �ؼ� ����� �غ�����

		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);

	}// main

}// class

class Kard {

	int id_num;
	String name;
	String department; // �μ�
	String positon; // ��å
	int salary; // ����
	int peroid; // �ٹ��Ⱓ
	int v_count; // ����
	String tel; // ��ȭ��ȣ

	Kard() {

	}

	Kard(int id_num, String name, String department, String positon, int salary, int peroid, int v_count, String tel) {
		this.id_num = id_num;
		this.name = name;
		this.department = department;
		this.positon = positon;
		this.salary = salary;
		this.peroid = peroid;
		this.v_count = v_count;
		this.tel = tel;
	}

	public String toString() {
		return "���̵� ��ȣ : " + id_num + "/ �̸� : " + name + "/ �μ� : " + department + "/ ���� : " + salary + "/ �ٹ��Ⱓ : "
				+ peroid + "/ ���� : " + v_count + "/ ��ȭ��ȣ : " + tel;
	}

}
