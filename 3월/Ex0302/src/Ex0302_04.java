
public class Ex0302_04 {

	public static void main(String[] args) {

//		Marine m1 = new Marine();
//		m1.move(10, 10);

		Unit[] group = new Unit[10];
		group[0] = new Marine(); // 1m 4초
		group[1] = new Tank(); // 1m 6초
		group[2] = new Dropship();// 1m 2초

		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				break;
			}
			group[i].move(1000, 1000);
		}

	}// main

}// class

abstract class Unit { // 추상클래스

	int x, y;

	abstract void move(int x, int y); // 추상메소드

	// {} 중괄호 있으면 구현이 됨 ! ^^

	void stop() {
		System.out.println("현재 위치에서 멈춤");
	}

}

class Marine extends Unit {

	void move(int x, int y) {
//		double a = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println(x + " " + y + "으로 이동. 걸리는 시간 : ");
		System.out.println("움직인 거리 : " + (x + y));
		int time = (x + y) * 4;
		System.out.println((time / 3600) + "시" + (time % 3600) / 60 + "분" + (time % 3600) % 60 + "초"); // ★★★★★
		System.out.println("움직인 시간 : " + (x + y) * 4);

	}

	void stimpack() {

	}

}

class Tank extends Unit {

	void move(int x, int y) {
		System.out.println(x + " " + y + "으로 이동. 걸리는 시간 : ");
		System.out.println("움직인 거리 : " + (x + y));
		int time = (x + y) * 6;
		System.out.println((time / 3600) + "시" + (time % 3600) / 60 + "분" + (time % 3600) % 60 + "초");
		System.out.println("움직인 시간 : " + (x + y) * 6);

	}

	void changemode() {

	}

}

class Dropship extends Unit {

	void move(int x, int y) {
		System.out.println(x + " " + y + "으로 이동. 걸리는 시간 : ");
		System.out.println("움직인 거리 : " + (x + y));
		int time = (x + y) * 2;
		System.out.println((time / 3600) + "시" + (time % 3600) / 60 + "분" + (time % 3600) % 60 + "초");
		System.out.println("움직인 시간 : " + (x + y) * 2);

	}

	void load() {

	}

	void unload() {

	}

}
