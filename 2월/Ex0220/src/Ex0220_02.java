
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

	// ���ϰ�
	static String merge(String a, String b) {
		a = a + b;
		return a;
	}

	static void merge_(Str s) {
		s.x = s.x + s.y;
	}

}// class

// Ex0220_02�� ���� �ۿ��� �ڡ�
class Str { // Ŭ���� �׻� �빮�� �ڡ�
	String x;
	String y;
}
