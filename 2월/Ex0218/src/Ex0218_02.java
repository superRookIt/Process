
public class Ex0218_02 {

	public static void main(String[] args) {

		System.out.println("ī�� ����  : " + Card.width); // 100
		System.out.println("ī�� ���� : " + Card.height); // 250
		System.out.println("---------------------------"); // 250

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
//		c2.kind = "Spade";
//		c2.number = 5;

		System.out.println("c1 ī�� : " + c1.kind + "/" + c1.number);
		System.out.println("c1 ũ�� : " + c1.width + "/" + c1.height);
		System.out.println("---------------------------"); // 250
		System.out.println("c2 ī�� : " + c2.kind + "/" + c2.number);
		System.out.println("c2 ũ�� : " + c2.width + "/" + c2.height);
		System.out.println("---------------------------"); // 250

		c1.width=50;
		c1.height=80;
		
		System.out.println("c1 ī�� : " + c1.kind + "/" + c1.number);
		System.out.println("c1 ũ�� : " + c1.width + "/" + c1.height);
		System.out.println("---------------------------"); // 250
		System.out.println("c2 ī�� : " + c2.kind + "/" + c2.number);
		System.out.println("c2 ũ�� : " + c2.width + "/" + c2.height);
		System.out.println("---------------------------"); // 250
		
		
	}//main
	
}//class
