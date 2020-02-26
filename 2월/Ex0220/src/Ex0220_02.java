
public class Ex0220_02 {

	public static void main(String[] args) {

		Str s = new Str();
		s.x = "abc";
		s.y = "def";

		s.x = merge(s.x, s.y);
		merge_(s);

		// s.x ->abcdef
		System.out.println("s.x + s.y =" + s.x);

	}// main

	// 리턴값
	static String merge(String a, String b) {
		a = a + b;
		return a;
	}

	static void merge_(Str s) {
		s.x = s.x + s.y;
	}

}// class

// Ex0220_02의 범위 밖에서 ★★
class Str { // 클래스 항상 대문자 ★★
	String x;
	String y;
}
