import java.util.Scanner; //javaÆú´õ-> util Æú´õ->scanner.class

public class Ex0226_02 extends Object {

	Ex0226_02() {
		super();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // scannerµµ Å¬·¡½º

		Point p1 = new Point(100, 100);
		System.out.println(p1.getLocation());

	}// main

}// class

class Point extends Object {

	int x;
	int y;

	Point() {
		super();
	}

	Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "xÁÂÇ¥ :" + x + " / YÁÂÇ¥ : " + y;
	}

}

class Point3d extends Point {

	int z;

	Point3d(int x, int y, int z) {
		super(x, y); // ¡Ú¡Ú¡Ú
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation() {
		return "xÁÂÇ¥ :" + x + " / YÁÂÇ¥ : " + y + " / ZÁÂÇ¥ : " + z;
	}

}