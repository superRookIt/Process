
public class Ex0227_03 {

	public static void main(String[] args) {

	}// main

}// class

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("������ ������ ���");
	}

	void stop() {
		System.out.println("�극��ũ�� ������ ����ϴ�");
	}

}

class FireEngine extends Car {

	void water() {
		System.out.println("���� �߻�");

	}

}

class Ambulance extends Car {

	void siren() {
		System.out.println("���̷��� �︳�ϴ�");
	}

	void move() {
		System.out.println("����� �ű�ϴ�.");
	}

}

class Truck extends Car {

	void stuff() {
		System.out.println("������ �ű�ϴ�");
	}

}