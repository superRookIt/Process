
public class Ex0303_01 {
	public static void main(String[] args) {

		// 마린 2명, 탱크 2대, 메딕 2명 -> 200,100으로 이동

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

		// 마린 2명, 탱크 2대, 메딕 2명, 드랍십 1대, 벌쳐 4대, 터렛 2대 생성
		// 드랍십에 태울수 있는 것과 차지하는 공간은 마린 3, 탱크 4, 메딕2 -> int trasnsit
		// 드랍십 공간은 7 -> int transit_space = 7, transport()메소드
		//

		Unit[] group1 = new Unit[10];

	}// main

}// class

interface tran { // 드롭십에 태울 수 있는 유닛을 선정하기 위한 인터페이스

}

class Groundunit extends Unit {

	int transit; // 공간할당 변수

	Groundunit(int t) {
		this.transit = t; // ★★★
	}

	@Override
	void move(int x, int y) {
		System.out.println("좌표 : " + x + " " + y);
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

	int transit_space; // 운송할 수 있는 공간 7까지
	Groundunit[] ground = new Groundunit[7]; // 태우는 유닛 저장
	int i = 0; // 배열 몇 번째에 들어갈 것인지

	void transport(tran t) {
		if (t instanceof Groundunit) {
			Groundunit g = (Groundunit) t;
			if ((transit_space += g.transit) <= 7) {
				System.out.println("태웠습니다");
				ground[i] = g;
				i++;
			} else {
				System.out.println("태울 수 없습니다");
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
