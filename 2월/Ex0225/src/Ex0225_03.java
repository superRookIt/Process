
public class Ex0225_03 {

	public static void main(String[] args) {

		Point1 p = new Point1(50, 100);
		Circle1 c = new Circle1(p, 200);
		c.draw();

	}// main

}// class

class Shape1 {

	String color = "black";

	void draw() {
		System.out.println("색 : " + color);

	}
}

class Point1 {

	int x;
	int y;

	Point1() {

	}

	Point1(int x, int y) {
		this.x = x;
		this.y = y;

	}

	void getxy() {
		System.out.println("x의 값 : " + x + " / y의 값 : " + y);
	}

}

class Circle1 extends Shape1 {

	Point1 p1; // ★★★★★
	int r;

	Circle1(Point1 p1, int r) {
		this.p1 = p1;
		this.r = r;

	}

	void draw() {
		System.out.println("원넓이 ^^");
		System.out.println("x좌표 : " + p1.x + " / y좌표:  " + p1.y + " / 반지름 : " + r + " / 컬러값 : " + color);
	}

}

class Triangle1 extends Shape1 {

	Point1[] p = new Point1[3]; // ★★★★★

	Triangle1(Point1 p1, Point1 p2, Point1 p3) {
		p = new Point1[] { p1, p2, p3 };
	}

	void draw() {
		p[0].getxy();
		p[1].getxy();
		p[2].getxy();
	}

}
