
public class Ex0304_03 extends Object { // �ڡڡ�

	public static void main(String[] args) {

		Card c1 = new Card("Heart", 3);
		Card c2 = new Card("SPADE", 7);

		System.out.println(c1);
		System.out.println(c2);

		// toString ���Ұ�� �̷��� �ؾ�
		System.out.println(c1.kind + " " + c1.number);
		System.out.println(c2.kind + " " + c2.number);

		// .toString�ص� toString �޼ҵ� �ȸ���� �ּҰ� ����!
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

	// �̰� ���ϰ� �׳� c1<Card c1 = new Card>�ϸ� �ּҳ��� �ڡڡ�
	public String toString() {
		return "���� : " + kind + " ���� : " + number;
	}

}
