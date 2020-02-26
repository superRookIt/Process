import java.util.Scanner;

public class Ex0225_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		Circle c = new Circle();
//		c.draw();

//		Point p1 = new Point(150, 30);
//		Circle c1 = new Circle(p1, 200);
//		c1.draw();
//		Point p2 = new Point();
//		Circle c2 = new Circle(p2, 50);
//		c2.draw();
//		Point p3 = new Point(300, 300);
//		Circle c3 = new Circle(p3, 70);
//		c3.draw();

//		int[] num = new int[3]; // //x,y,������
//		Circle[] cc = new Circle[3];
//		Point[] pp = new Point[3];
//		String[] print = { "x��ǥ", "y��ǥ", "������" };
//
//		for (int j = 0; j < num.length; j++) {
//			for (int i = 0; i < num.length; i++) {
//				System.out.println(print[i] + "���� �Է��ϼ���");
//				num[i] = scan.nextInt();
//			}
//
//			pp[j] = new Point(num[0], num[1]);
//			cc[j] = new Circle(pp[0], num[2]);
//
//		}
//
//		for (int i = 0; i < num.length; i++) {
//			cc[i].draw();
//		}



		// 20,20 / 40,100/ 30,10

		Point[] p = new Point[3];
		Point[] p_ = new Point[] { new Point(20, 20), new Point(40, 100), new Point(30, 10) };

		p[0] = new Point(20, 20);
		p[1] = new Point(40, 100);
		p[2] = new Point(30, 10);

		Point p1 = new Point(20, 20);
		Point p2 = new Point(40, 100);
		Point p3 = new Point(30, 10);

		Triangle t1 = new Triangle(p[0], p[1], p[2]);
		t1.draw();

//		Point[] pp = new Point[] { new Point(100, 100), new Point(200, 200), new Point(300, 300) };

//		int[] r = { 50, 60, 70 };
//
//
//		for (int i = 0; i < cc.length; i++) {
//			cc[i] = new Circle(pp[i], r[i]);
//			cc[i].draw();
//		}

//		cc[0] = new Circle(pp[0], 50);
//		cc[1] = new Circle(pp[1], 60);
//		cc[2] = new Circle(pp[2], 70);

//		cc[0].draw();
//		cc[1].draw();
//		cc[2].draw();

	}// main

}// class

//���� �׸��� Ŭ����
class Shape {

	String color = "black";

	void draw() {
		System.out.println("���� ����ϴ�.");
		System.out.println("���� ���� : " + color);
	}

}

//��ǥ�� Ŭ����
class Point {
	int x;
	int y;

	Point() {
		this(0, 0); // point(0,0)
	} // �⺻ ������

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getXY() {
		return "(" + "x�� ��ǥ : " + x + ", y�� ��ǥ : " + y + " ) ";
	}
	// �޼ҵ�

}

//���� �׸��� Ŭ����
class Circle extends Shape {
	Point center; // Point p
	int r;

	Circle() {
		this(new Point(0, 0),100);
//		center = new Point(0, 0);
//		r = 100;
	}
	// �⺻������

//	Circle c1 = new Circle(p1, 50);

	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	void draw() {
		System.out.println("������ �׸��ϴ�");
		System.out.println("( " + "���� : " + center.x + " , " + center.y + " / ������ : " + r + " / ���� : " + color + " ) ");
	}

}

//�ﰢ�� �׸��� Ŭ����
class Triangle extends Shape {

	Point[] p = new Point[3];

	Triangle() {
		this(new Point(0, 0), new Point(100, 0), new Point(0, 100)); // �ڡڡڡ�
//		p[0] = new Point(0, 0);
//		p[1] = new Point(100, 0);
//		p[2] = new Point(0, 100);

	}

	Triangle(Point[] p) {
		this.p = p;
	}

	Triangle(Point p1, Point p2, Point p3) {
		p = new Point[] { p1, p2, p3 };
	}

	void draw() {
		System.out.println("�ﰢ���� �׸��ϴ� ");
		System.out.println(
				"( ��ǥ1: " + p[0].getXY() + " / ��ǥ2: " + p[1].getXY() + "/ ��ǥ3: " + p[2].getXY() + " / ���� : " + color);
	}

}
