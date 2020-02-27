
public class Deck {

	final int Card_num = 52;
	Card[] c = new Card[Card_num]; // index 0~51

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
	}

	Card pick() {
		int index = 0;
		index = (int) (Math.random() * 52); // 0~51번 배열을 선택
		return pick(index); // ★★★
	}

	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int num = (int) (Math.random() * 52);
			Card temp = c[num]; // 주소값
			c[num] = c[0];
			c[0] = temp;

		}

	}

}
