
public class Ex0304_03 extends Object { // ★★★

	public static void main(String[] args) {

		Card c1 = new Card("Heart", 3);
		Card c2 = new Card("SPADE", 7);

		System.out.println(c1);
		System.out.println(c2);

		// toString 안할경우 이렇게 해야
		System.out.println(c1.kind + " " + c1.number);
		System.out.println(c2.kind + " " + c2.number);

		// .toString해도 toString 메소드 안만들면 주소값 나옴!
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}// main

}// class

class Card {

	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	// 이거 안하고 그냥 c1<Card c1 = new Card>하면 주소나옴 ★★★
	public String toString() {
		return "종류 : " + kind + " 숫자 : " + number;
	}

}
