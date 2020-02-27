
public class Deck {

	final int Card_num = 52;
	Card[] c = new Card[Card_num]; // index 0~51

	Deck() { // kind, number
		for (int i = 0; i < Card.Kind_max; i++) { // �ڡڡڡڡ�
			for (int j = 0; j < Card.Num_max; j++) {
				c[(i * 13) + j] = new Card(i + 1, j + 1); // �ڡڡڡڡ�
			} // for j
		} // for i
	}

	// Card �̱�
	Card pick(int index) { //

		return c[index];
	}

	Card pick() {
		int index = 0;
		index = (int) (Math.random() * 52); // 0~51�� �迭�� ����
		return pick(index); // �ڡڡ�
	}

	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int num = (int) (Math.random() * 52);
			Card temp = c[num]; // �ּҰ�
			c[num] = c[0];
			c[0] = temp;

		}

	}

}
