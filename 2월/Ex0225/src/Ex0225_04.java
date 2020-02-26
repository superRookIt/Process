
public class Ex0225_04 {

	public static void main(String[] args) {

		Captiontv c1 = new Captiontv();

		Data d1 = new Data();

		System.out.println(d1);

//		d1 = c1; //---> x
//		t1 = c1; //---> o

//		c1.channel = 7;
//		c1.channelup(); // 8
//		c1.channelup(); // 9
//		c1.channeldown(); // 8
//		System.out.println("현재 채널 : " + c1.channel);
//		c1.caption = true;
//		c1.displayCap("hello Java");

	}// main

}// class

class Tv {
	boolean power; // 전원 on-true, off-flase
	int channel;
	int volume;

	void power() {
		power = !power;

	}

	void channelup() {
		if (channel >= 101) {
			channel = 0;
		}

		// 100번 -1번으로 돌아가게 구현
		++channel;
	}

	void channeldown() {
		if (channel <= -1) {
			channel = 101;
		}
		--channel;
	}

}

class Captiontv extends Tv {

//	Tv t1 = new Tv(); ★★★★ 호환관계!
//	int channel = t1.channel; ★★★★★

	boolean caption;

	void displayCap(String text) {

		if (caption == true) {
			System.out.println("caption on");
			System.out.println("text");
		}

	}

}

class Data {

	int x;
	int y;

	Data() {
		x = 10;
		y = 20;
	}

	public String toString() { //★★★ 모든 객체의 상속을 다 해주는 최상위 객체 ->toString

		return "x의 값 : " + x + "" + "/ y의 값 : " + y;
	}

}
