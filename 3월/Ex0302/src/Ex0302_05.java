
public class Ex0302_05 {

	public static void main(String[] args) {

		Marin m = new Marin();
		Tan t = new Tan();
		Scv s = new Scv();
		Drop d = new Drop();

		m.hitpoint -= 10; // 40-10=30
		System.out.println("데미지 후 체력 : " + m.hitpoint);
		t.hitpoint -= 100; // 150-100=50
		System.out.println("데미지 후 체력 : " + t.hitpoint);

		s.repair(t);

		System.out.println("복구 후 체력 : " + t.hitpoint);
		System.out.println("복구 후 체력 : " + m.hitpoint);

	}// main

}// class

class Uni {

	int hitpoint;
	int Max_hp;

	Uni() {

	}

	Uni(int hp) {
		Max_hp = hp;
	}

}

class Groundunit extends Uni {

	Groundunit() {

	}

	Groundunit(int hp) {
		super(hp);
	}

}

class Airunit extends Uni {

	Airunit() {

	}

	Airunit(int hp) {
		super(hp);
	}

}

class Tan extends Groundunit implements Repairable {
	Tan() {
		super(150);
		hitpoint = Max_hp;
	}

}

class Marin extends Groundunit {

	Marin() {
		super(40);
		hitpoint = Max_hp;
	}

}

class Drop extends Airunit implements Repairable {

	Drop() {
		super(100);
		hitpoint = Max_hp;
	}
}

class Scv extends Groundunit implements Repairable {
	Scv() {
		super(60);
		hitpoint = Max_hp;
	}

	void repair(Repairable r) { //interface Repariable 
		Uni u = (Uni) r; // 형변환을 해줘야 함 ★★★★★
		while (u.hitpoint != u.Max_hp) {
			u.hitpoint++;
		}
	}

//	void repair(Tan t) {
//		while (t.hitpoint != t.Max_hp) {
//			t.hitpoint++;
//		}
//	}
//
//	void repair(Drop d) {
//		while (d.hitpoint != d.Max_hp) {
//			d.hitpoint++;
//		}
//	}
//
//	void Scv(Scv s) {
//		while (s.hitpoint != s.Max_hp) {
//			s.hitpoint++;
//		}
//	}

}

interface Repairable {

}
