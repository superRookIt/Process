
public class Ex0302_04 {

	public static void main(String[] args) {

//		Marine m1 = new Marine();
//		m1.move(10, 10);

		Unit[] group = new Unit[10];
		group[0] = new Marine(); // 1m 4��
		group[1] = new Tank(); // 1m 6��
		group[2] = new Dropship();// 1m 2��

		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				break;
			}
			group[i].move(1000, 1000);
		}

	}// main

}// class

abstract class Unit { // �߻�Ŭ����

	int x, y;

	abstract void move(int x, int y); // �߻�޼ҵ�

	// {} �߰�ȣ ������ ������ �� ! ^^

	void stop() {
		System.out.println("���� ��ġ���� ����");
	}

}

class Marine extends Unit {

	void move(int x, int y) {
//		double a = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println(x + " " + y + "���� �̵�. �ɸ��� �ð� : ");
		System.out.println("������ �Ÿ� : " + (x + y));
		int time = (x + y) * 4;
		System.out.println((time / 3600) + "��" + (time % 3600) / 60 + "��" + (time % 3600) % 60 + "��"); // �ڡڡڡڡ�
		System.out.println("������ �ð� : " + (x + y) * 4);

	}

	void stimpack() {

	}

}

class Tank extends Unit {

	void move(int x, int y) {
		System.out.println(x + " " + y + "���� �̵�. �ɸ��� �ð� : ");
		System.out.println("������ �Ÿ� : " + (x + y));
		int time = (x + y) * 6;
		System.out.println((time / 3600) + "��" + (time % 3600) / 60 + "��" + (time % 3600) % 60 + "��");
		System.out.println("������ �ð� : " + (x + y) * 6);

	}

	void changemode() {

	}

}

class Dropship extends Unit {

	void move(int x, int y) {
		System.out.println(x + " " + y + "���� �̵�. �ɸ��� �ð� : ");
		System.out.println("������ �Ÿ� : " + (x + y));
		int time = (x + y) * 2;
		System.out.println((time / 3600) + "��" + (time % 3600) / 60 + "��" + (time % 3600) % 60 + "��");
		System.out.println("������ �ð� : " + (x + y) * 2);

	}

	void load() {

	}

	void unload() {

	}

}
