import java.sql.Date;

public class Ex0220_01 {

	public static void main(String[] args) {

		Data d = new Data(); // 객체선언

		d.x = 10;
		d.y = 100;

		d.x = change1(d.x, d.y);// d.x+d.y
		change1_(d);

		d.y = change2(d.x, d.y);
		change2_(d);

		d.y = change3(d.y);
		change3_(d);

		System.out.println("main x: " + d.x);
		System.out.println("main y : " + d.y);

	}// main

	static int change1(int x, int y) {
		x = x + y;
		System.out.println("change : " + x);
		return x;
	}

	static void change1_(Data d) {
		d.x = d.x + d.y;
		System.out.println("change : " + d.x);
	}

	static int change2(int x, int y) {
		y = x - y;
		return y;
	}

	static void change2_(Data d) {
		d.y = d.x - d.y;
	}

	static int change3(int y) {
		y = 2000;
		return y;
	}

	static void change3_(Data d) {
		d.y = 2000;
	}

}// class

class Data { // Ex0220_01클래스 범위 밖 ★★★★★
	int x;
	int y;
}