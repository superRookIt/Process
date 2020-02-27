
class Ex0226_05 {

	public static void main(String[] args) {
		Date d = new Date();
		d.x = 10;
		System.out.println(d.x);

		Time t = new Time();
		t.t = 10;

	}

}

class Date {
	int x;

}

class Time { // source->generate getters and setters

	protected int t;

	public int getT() { // 읽기만 가능 ^^ SetT가 있어야 쓰기 가능
		return t;
	}

}