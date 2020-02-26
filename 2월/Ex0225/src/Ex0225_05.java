
public class Ex0225_05 {

	public static void main(String[] args) {

//		Card c = new Card(1, 2);
//		System.out.println(c); -> Clover 2

		Deck d = new Deck();

		for (int i = 0; i < d.Card_num; i++) { // ★
			d.pick(i);
			System.out.println(d.pick(i));
		}

		Card c1 = d.pick(10); // c[10], Card[] c= new Card[52]; ★★★
		System.out.println(c1);

		d.shuffle();

		Card c2 = d.pick(10);
		System.out.println(c2);

	}// main

}// class

class Deck {

	final int Card_num = 52;
	Card[] c = new Card[Card_num];

	// 1~13, 초기화
	Deck() { // kind, number
		for (int i = 0; i < Card.Kind_max; i++) { // ★★★★★
			for (int j = 0; j < Card.Num_max; j++) {
				c[(i * 13) + j] = new Card(i + 1, j + 1); // ★★★★★
			} // for j
		} // for i
	}

	// Card 뽑기
	Card pick(int index) { //

		return c[index];
	}// 메소드, Card가 리턴값

	// 랜덤 뽑기
	Card pick() {
		int index = 0;
		index = (int) (Math.random() * 52); // 0~51번 배열을 선택

//		return c[index]; 
		return pick(index); // ★★★
	}// 메소드, Card가 리턴값

	// 카드 섞기
	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int num = (int) (Math.random() * 52);
			Card temp = c[num]; // int가 대신 Card라는 객체로
			// ★★★★★ 주소값(kind, number가 있는 ^^) 저장!
			c[num] = c[0];
			c[0] = temp;

		}

	}

}

class Card {

	static final int Kind_max = 4;// 카드 무늬 개수
	static final int Num_max = 13;// 무늬별 카드 수

	static final int Spade = 4;
	static final int Diamond = 3;
	static final int Heart = 2;
	static final int Clover = 1;

	int kind; // 1=clover 2=heart 3=diamond 4=spade
	int number;// 1,2,3,4....9,x(10),j,q,k(13)

	// int a = Spade; a=4

	Card() {

	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

//	 카드 객체 찍기 ★★★★★
	public String toString() { // ★★ toString 안해주면 @주소값 나옴
		String[] kinds = { "", "Clover", "Heart", "Diamond", "Spade" };
		String numbers = "0123456789XJQK";

		return "" + kinds[kind] + " " + numbers.charAt(number);
	}

}
