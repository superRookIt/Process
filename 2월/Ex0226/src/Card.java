
public class Card {

	static final int Kind_max = 4;// 카드 무늬 개수
	static final int Num_max = 13;// 무늬별 카드 수

	static final int Spade = 4;
	static final int Diamond = 3;
	static final int Heart = 2;
	static final int Clover = 1;

	int kind;
	int number;

	Card() {
		this(1, Clover);
//		super(); ★★★, 매개변수가 있는 생성자에서 super();를 이미 선언했음
	}

	Card(int kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	public String toString() { // ★★ toString 안해주면 @주소값 나옴, 오버라이딩
		String[] kinds = { "", "Clover", "Heart", "Diamond", "Spade" };
		String numbers = "0123456789XJQK";

		return "" + kinds[kind] + " " + numbers.charAt(number);
	}
}
