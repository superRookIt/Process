
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
//		System.out.println("���� ä�� : " + c1.channel);
//		c1.caption = true;
//		c1.displayCap("hello Java");

	}// main

}// class

class Tv {
	boolean power; // ���� on-true, off-flase
	int channel;
	int volume;

	void power() {
		power = !power;

	}

	void channelup() {
		if (channel >= 101) {
			channel = 0;
		}

		// 100�� -1������ ���ư��� ����
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

//	Tv t1 = new Tv(); �ڡڡڡ� ȣȯ����!
//	int channel = t1.channel; �ڡڡڡڡ�

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

	public String toString() { //�ڡڡ� ��� ��ü�� ����� �� ���ִ� �ֻ��� ��ü ->toString

		return "x�� �� : " + x + "" + "/ y�� �� : " + y;
	}

}
