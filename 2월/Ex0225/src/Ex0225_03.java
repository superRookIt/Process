
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
		System.out.println("�� : " + color);

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
		System.out.println("x�� �� : " + x + " / y�� �� : " + y);
	}

}

class Circle1 extends Shape1 {

	Point1 p1; // �ڡڡڡڡ�
	int r;

	Circle1(Point1 p1, int r) {
		this.p1 = p1;
		this.r = r;

	}

	void draw() {
		System.out.println("������ ^^");
		System.out.println("x��ǥ : " + p1.x + " / y��ǥ:  " + p1.y + " / ������ : " + r + " / �÷��� : " + color);
	}

}

class Triangle1 extends Shape1 {

	Point1[] p = new Point1[3]; // �ڡڡڡڡ�

	Triangle1(Point1 p1, Point1 p2, Point1 p3) {
		p = new Point1[] { p1, p2, p3 };
	}

	void draw() {
		p[0].getxy();
		p[1].getxy();
		p[2].getxy();
	}

}
