
public class Product {

	String name;
	int price;
	String color;
	double bonus;

	Product() {

	}

	Product(String name, int price) {

		this.name = name;
		this.price = price;
		this.bonus = price * 0.1;

	}

}

class Tv extends Product {

	String kind;
	int Screen;
	int inch;
	int hdr; // hdr ���?

	Tv() {

		super("TV", 1000);
		this.Screen = 100;
		this.inch = 10;
	}

	public String toString() {
		return "��ũ�� : " + Screen + " ��ġ : " + inch;

	}

}

class Ref extends Product {

	int liter;
	int door;
	int dcool;// ���� ��

	Ref() {

		super("�����", 1000);
		this.liter = 100;
		this.door = 2;
	}

	public String toString() {
		return "���� : " + liter + " �� : " + 2;

	}

}

class Wash extends Product {

	int size;
	String shape;
	int ster; // ���

	Wash() {

		super("��Ź��", 1000);
		this.size = 100;
		this.shape = "circle";
	}

	public String toString() {
		return "������  : " + size + " ���� : " + shape;

	}

}
