
public class Deck {

	final int card_num = 52;
	Card[] c = new Card[card_num]; // 배열은 0~51, 숫자는 1~52

	Deck() {
		for (int i = 0; i < Card.kind_max; i++) {
			for (int j = 0; j < Card.num_max; j++) {
				c[(i * 13) + j] = new Card(i + 1, j + 1);
			} // for j
		} // for i

	}// Deck 기본 생성자

	Card pick(int index) {
		return c[index];
	}

	void shuffle() {

		for (int i = 0; i < 1000; i++) {
			int tmp = (int) (Math.random() * 52);
			Card temp = c[tmp]; //  Card 클래스의 참조변수로 ★★★
			c[tmp] = c[0];
			c[0] = temp;
		}

	}

}
