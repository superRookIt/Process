
public class Card {

	static final int kind_max = 4;
	static final int num_max = 13;

	int number;
	int kind;

	Card(int kind, int number) {
		this.number = number;
		this.kind = kind;

	}//생성자

	public String toString() {

		String[] kinds = { "", "clover", "heart", "diamond", "spade" };
		String numbers = "0123456789XJQK";

		return "[카드 종류 - " + kinds[kind] + " ] [번호 - " + numbers.charAt(number)+" ]";
	}

}
