
public class Ex0303_01 {
	public static void main(String[] args) {

		// ���� 2��, ��ũ 2��, �޵� 2�� -> 200,100���� �̵�

		Dropship d = new Dropship();

		Unit[] group = new Unit[10];

		group[0] = new Marine();
		group[1] = new Marine();
		group[2] = new Tank();
		group[3] = new Tank();
		group[4] = new Medic();
		group[5] = new Medic();

		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				break;
			}
			group[i].move(200, 100);
		}

		// ���� 2��, ��ũ 2��, �޵� 2��, ����� 1��, ���� 4��, �ͷ� 2�� ����
		// ����ʿ� �¿�� �ִ� �Ͱ� �����ϴ� ������ ���� 3, ��ũ 4, �޵�2 -> int trasnsit
		// ����� ������ 7 -> int transit_space = 7, transport()�޼ҵ�
		//

		Unit[] group1 = new Unit[10];

	}// main

}// class

interface tran { // ��ӽʿ� �¿� �� �ִ� ������ �����ϱ� ���� �������̽�

}

class Groundunit extends Unit {

	int transit; // �����Ҵ� ����

	Groundunit(int t) {
		this.transit = t; // �ڡڡ�
	}

	@Override
	void move(int x, int y) {
		System.out.println("��ǥ : " + x + " " + y);
	}

}

class Marine extends Groundunit implements tran {

	Marine() {
		super(3);
	}

	void stimpack() {
	}

}

class Tank extends Groundunit implements tran {

	Tank() {
		super(4);
	}

	void changemode() {
	}

}

class Dropship extends Unit {

	int transit_space; // ����� �� �ִ� ���� 7����
	Groundunit[] ground = new Groundunit[7]; // �¿�� ���� ����
	int i = 0; // �迭 �� ��°�� �� ������

	void transport(tran t) {
		if (t instanceof Groundunit) {
			Groundunit g = (Groundunit) t;
			if ((transit_space += g.transit) <= 7) {
				System.out.println("�¿����ϴ�");
				ground[i] = g;
				i++;
			} else {
				System.out.println("�¿� �� �����ϴ�");
				transit_space -= g.transit;
			} // else
		} // if
	}

	void move(int x, int y) {

	}

	void load() {
	}

	void unload() {
	}

}
