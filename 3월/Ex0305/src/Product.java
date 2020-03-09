
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
	int hdr; // hdr 기능?

	Tv() {

		super("TV", 1000);
		this.Screen = 100;
		this.inch = 10;
	}

	public String toString() {
		return "스크린 : " + Screen + " 인치 : " + inch;

	}

}

class Ref extends Product {

	int liter;
	int door;
	int dcool;// 더블 쿨링

	Ref() {

		super("냉장고", 1000);
		this.liter = 100;
		this.door = 2;
	}

	public String toString() {
		return "리터 : " + liter + " 문 : " + 2;

	}

}

class Wash extends Product {

	int size;
	String shape;
	int ster; // 살균

	Wash() {

		super("세탁기", 1000);
		this.size = 100;
		this.shape = "circle";
	}

	public String toString() {
		return "사이즈  : " + size + " 형태 : " + shape;

	}

}
