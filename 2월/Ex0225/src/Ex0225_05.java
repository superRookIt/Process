
public class Ex0225_05 {

	public static void main(String[] args) {

//		Card c = new Card(1, 2);
//		System.out.println(c); -> Clover 2

		Deck d = new Deck();

		for (int i = 0; i < d.Card_num; i++) { // ��
			d.pick(i);
			System.out.println(d.pick(i));
		}

		Card c1 = d.pick(10); // c[10], Card[] c= new Card[52]; �ڡڡ�
		System.out.println(c1);

		d.shuffle();

		Card c2 = d.pick(10);
		System.out.println(c2);

	}// main

}// class

class Deck {

	final int Card_num = 52;
	Card[] c = new Card[Card_num];

	// 1~13, �ʱ�ȭ
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
	}// �޼ҵ�, Card�� ���ϰ�

	// ���� �̱�
	Card pick() {
		int index = 0;
		index = (int) (Math.random() * 52); // 0~51�� �迭�� ����

//		return c[index]; 
		return pick(index); // �ڡڡ�
	}// �޼ҵ�, Card�� ���ϰ�

	// ī�� ����
	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int num = (int) (Math.random() * 52);
			Card temp = c[num]; // int�� ��� Card��� ��ü��
			// �ڡڡڡڡ� �ּҰ�(kind, number�� �ִ� ^^) ����!
			c[num] = c[0];
			c[0] = temp;

		}

	}

}

class Card {

	static final int Kind_max = 4;// ī�� ���� ����
	static final int Num_max = 13;// ���̺� ī�� ��

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

//	 ī�� ��ü ��� �ڡڡڡڡ�
	public String toString() { // �ڡ� toString �����ָ� @�ּҰ� ����
		String[] kinds = { "", "Clover", "Heart", "Diamond", "Spade" };
		String numbers = "0123456789XJQK";

		return "" + kinds[kind] + " " + numbers.charAt(number);
	}

}
