
public class Card {

	static final int Kind_max = 4;// ī�� ���� ����
	static final int Num_max = 13;// ���̺� ī�� ��

	static final int Spade = 4;
	static final int Diamond = 3;
	static final int Heart = 2;
	static final int Clover = 1;

	int kind;
	int number;

	Card() {
		this(1, Clover);
//		super(); �ڡڡ�, �Ű������� �ִ� �����ڿ��� super();�� �̹� ��������
	}

	Card(int kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	public String toString() { // �ڡ� toString �����ָ� @�ּҰ� ����, �������̵�
		String[] kinds = { "", "Clover", "Heart", "Diamond", "Spade" };
		String numbers = "0123456789XJQK";

		return "" + kinds[kind] + " " + numbers.charAt(number);
	}
}
