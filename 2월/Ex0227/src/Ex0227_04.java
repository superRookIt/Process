
public class Ex0227_04 {

	public static void main(String[] args) {

		Ambulance a = new Ambulance();
		Car c = null;
		c = a;
		c.drive();

		Ambulance a2 = null;
		a2 = (Ambulance) c;
		a2.siren();

		FireEngine fe = new FireEngine();

		if (fe instanceof FireEngine) {
			System.out.println("�� FireEngine��ü �½��ϴ�");
		}

		if (fe instanceof Car) {
			System.out.println("�� Car��ü �½��ϴ�");
		}

		if (fe instanceof Object) {
			System.out.println("�� Object��ü �½��ϴ�");
		}

	}// main

}// class
