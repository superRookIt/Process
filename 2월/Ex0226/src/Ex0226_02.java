import java.util.Scanner; //java����-> util ����->scanner.class

public class Ex0226_02 extends Object {

	Ex0226_02() {
		super();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // scanner�� Ŭ����

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
		return "x��ǥ :" + x + " / Y��ǥ : " + y;
	}

}

class Point3d extends Point {

	int z;

	Point3d(int x, int y, int z) {
		super(x, y); // �ڡڡ�
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation() {
		return "x��ǥ :" + x + " / Y��ǥ : " + y + " / Z��ǥ : " + z;
	}

}