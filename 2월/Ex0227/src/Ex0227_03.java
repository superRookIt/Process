
public class Ex0227_03 {

	public static void main(String[] args) {

	}// main

}// class

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("엑셀을 밟으면 출발");
	}

	void stop() {
		System.out.println("브레이크를 밟으면 멈춥니다");
	}

}

class FireEngine extends Car {

	void water() {
		System.out.println("물이 발사");

	}

}

class Ambulance extends Car {

	void siren() {
		System.out.println("사이렌이 울립니다");
	}

	void move() {
		System.out.println("사람도 옮깁니다.");
	}

}

class Truck extends Car {

	void stuff() {
		System.out.println("물건을 옮깁니다");
	}

}